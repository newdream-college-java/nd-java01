package cn.song.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import cn.song.dao.BaseDao;
import cn.song.dao.StationDao;
import cn.song.dao.TicketDao;
import cn.song.dao.TripOrderDao;
import cn.song.entity.Inssure;
import cn.song.entity.QpTripPeople;
import cn.song.entity.Station;
import cn.song.entity.Ticket;
import cn.song.entity.TripOrder;
import cn.song.entity.TripPeople;
import cn.song.entity.User;
import cn.song.vo.OrderListVo;

public class TripOrderDaoImpl extends BaseDao implements TripOrderDao{
	private StationDao stationDao=new StationDaoImpl();
	private TicketDao ticketDao=new TicketDaoImpl();
	@Override
	public boolean bookTicket(Inssure inssure, QpTripPeople qt, List<TripPeople> tps, TripOrder to) {
		// TODO Auto-generated method stub
		int r1=-1;
		int r2=-1;
		int r3=-1;
		int r4=-1;
		try {
			getConnection();
			conn.setAutoCommit(false);
			String sql="insert into insure values(null,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, inssure.getInPocicyNo());
			pst.setString(2, inssure.getInCompany());
			pst.setString(3, inssure.getInPolicyStatus());
			r1=pst.executeUpdate();
			for(TripPeople tp:tps) {
				sql="insert into take_people values(null,?,?,?,?,?,?)";
				pst=conn.prepareStatement(sql);
				pst.setString(1, tp.getQtpName());
				pst.setString(2, tp.getQtpPhone());
				pst.setInt(3, tp.getIsAdult());
				pst.setInt(4, tp.getStatus());
				pst.setString(5, tp.getQtCardNo());
				pst.setString(6, tp.getOrderNo());
				r2=pst.executeUpdate();
			}
			sql="insert into trip_order values(null,?,?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, to.getToNumber());
			pst.setInt(2, to.getToTicketId());
			pst.setInt(3, to.getIsUseCoupon());
			pst.setInt(4, to.getToCouponPrice());
			pst.setInt(5, to.getToCharge());
			pst.setString(6, to.getToTime());
			pst.setInt(7, to.getToStatus());
			pst.setInt(8, to.getToUserId());
			pst.setInt(9, to.getToNum());
			pst.setInt(10, to.getToPrice());
			pst.setString(11, to.getIssureNo());
			r3=pst.executeUpdate();
			sql="update ticket set t_ticket_number=t_ticket_number-?,t_ticket_book_number=t_ticket_book_number+?"
					+ " where t_id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, tps.size());
			pst.setInt(2, tps.size());
			pst.setInt(3, to.getToTicketId());
			r4=pst.executeUpdate();
			if(r1>0&&r2>0&&r3>0&&r4>0) {
				conn.commit();
				return true;
			}else {
				conn.rollback();
				return false;
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}

	@Override
	public boolean pay(String orderNo, String issureNo,int uid) {
		// TODO Auto-generated method stub
		int r1=-1;
		int r2=-1;
		int r3=-1;
		try {
			String iPolicyStatus="进行中";
			getConnection();
			conn.setAutoCommit(false);
			String sql="update trip_order set to_status=2 where to_number=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, orderNo);
			r1=pst.executeUpdate();
			sql="update insure set i_policy_status=? where i_policy_no=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,iPolicyStatus);
			pst.setString(2, issureNo);
			r2=pst.executeUpdate();
			sql="update user set u_money=u_money-(select to_price from trip_order where to_number=?) where u_id=(select "
					+ "to_u_id from trip_order where to_number=?) and u_money>(select to_price from trip_order where to_number=?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, orderNo);
			pst.setString(2, orderNo);
			pst.setString(3, orderNo);
			r3=pst.executeUpdate();
			if(r1>0&&r2>0&&r3>0) {
				conn.commit();
				return true;
			}else {
				conn.rollback();
				return false;
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}

	@Override
	public List<OrderListVo> getTripOrder(String date, Integer status, String phone, String orderNo,Integer page,Integer pageSize) {
		List<OrderListVo> orderListVos=new ArrayList<OrderListVo>();
		try {
			getConnection();
			StringBuffer sql=new StringBuffer("select * from (select * from ticket t,trip_order t1 "
					+ "where t.t_id=t1.to_ticket_id");
			if(page==null) {
				if(date==null&&status==null&&phone==null&&orderNo==null) {
					pst=conn.prepareStatement(sql.toString());
				}else if(date!=null&&status==null&&phone==null&&orderNo==null) {
					sql.append(" and t1.to_time>?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
				}else if(date==null&&phone==null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setInt(1, status);
				}else if(date==null&&phone!=null&&orderNo==null&&status==null) {
					sql.append(" and t1.to_u_id=(select u_id from user where u_phone=?)) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, phone);
				}else if(date==null&&phone==null&&orderNo!=null&&status==null) {
					sql.append(" and t1.to_number=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, orderNo);
				}else if(date!=null&&phone==null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_time>? and to.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, orderNo);
				}else if(date!=null&&phone!=null&&orderNo==null&&status==null) {
					sql.append(" and t1.to_time>? and t1.to_u_id=(select u_id from user where phone=?)) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, phone);
				}else if(date!=null&&phone==null&&orderNo!=null&&status==null) {
					sql.append(" and t1.to_time>? and to.to_number=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2,orderNo);
				}else if(date==null&&phone!=null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_u_id=(select u_id from user where u_phone=?) and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, phone);
					pst.setInt(2, status);
				}else if(date==null&&phone==null&&orderNo!=null&&status!=null) {
					sql.append(" and t1.to_number=? and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, orderNo);
					pst.setInt(2, status);
				}else if(date!=null&&phone!=null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_time>? and t1.to_u_id=(select u_id from user where phone=?) and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, phone);
					pst.setInt(3, status);
				}else if(date!=null&&phone==null&&orderNo!=null&&status!=null) {
					sql.append(" and t1.to_time>? and t1.to_number=? and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, orderNo);
					pst.setInt(3, status);
				}
			}else {
				if(date==null&&status==null&&phone==null&&orderNo==null) {
					pst=conn.prepareStatement(sql.toString());
				}else if(date!=null&&status==null&&phone==null&&orderNo==null) {
					sql.append(" and t1.to_time>?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setInt(2, (page-1)*pageSize);
					pst.setInt(3, pageSize);
				}else if(date==null&&phone==null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setInt(1, status);
					pst.setInt(2, (page-1)*pageSize);
					pst.setInt(3, pageSize);
				}else if(date==null&&phone!=null&&orderNo==null&&status==null) {
					sql.append(" and t1.to_u_id=(select u_id from user where u_phone=?)) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, phone);
					pst.setInt(2, (page-1)*pageSize);
					pst.setInt(3, pageSize);
				}else if(date==null&&phone==null&&orderNo!=null&&status==null) {
					sql.append(" and t1.to_number=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, orderNo);
					pst.setInt(2, (page-1)*pageSize);
					pst.setInt(3, pageSize);
				}else if(date!=null&&phone==null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_time>? and to.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, orderNo);
					pst.setInt(3, (page-1)*pageSize);
					pst.setInt(4, pageSize);
				}else if(date!=null&&phone!=null&&orderNo==null&&status==null) {
					sql.append(" and t1.to_time>? and t1.to_u_id=(select u_id from user where phone=?)) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, phone);
					pst.setInt(3, (page-1)*pageSize);
					pst.setInt(4, pageSize);
				}else if(date!=null&&phone==null&&orderNo!=null&&status==null) {
					sql.append(" and t1.to_time>? and to.to_number=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2,orderNo);
					pst.setInt(3, (page-1)*pageSize);
					pst.setInt(4, pageSize);
				}else if(date==null&&phone!=null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_u_id=(select u_id from user where u_phone=?) and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, phone);
					pst.setInt(2, status);
					pst.setInt(3, (page-1)*pageSize);
					pst.setInt(4, pageSize);
				}else if(date==null&&phone==null&&orderNo!=null&&status!=null) {
					sql.append(" and t1.to_number=? and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, orderNo);
					pst.setInt(2, status);
					pst.setInt(3, (page-1)*pageSize);
					pst.setInt(4, pageSize);
				}else if(date!=null&&phone!=null&&orderNo==null&&status!=null) {
					sql.append(" and t1.to_time>? and t1.to_u_id=(select u_id from user where phone=?) and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, phone);
					pst.setInt(3, status);
					pst.setInt(4, (page-1)*pageSize);
					pst.setInt(5, pageSize);
				}else if(date!=null&&phone==null&&orderNo!=null&&status!=null) {
					sql.append(" and t1.to_time>? and t1.to_number=? and t1.to_status=?) as d left join insure i on d.tp_insure_no=i.i_policy_no limit ?,?");
					pst=conn.prepareStatement(sql.toString());
					pst.setString(1, date);
					pst.setString(2, orderNo);
					pst.setInt(3, status);
					pst.setInt(4, (page-1)*pageSize);
					pst.setInt(5, pageSize);
				}
			}
			rs=pst.executeQuery();
			while(rs.next()) {
				OrderListVo orderListVo=new OrderListVo();
				Station endStation=stationDao.station(rs.getInt("t_start_station_id"));
				Station startStation=stationDao.station(rs.getInt("t_end_station_id"));
				Ticket ticket=ticketDao.showBookTicket(rs.getInt("t_id"));
				Inssure inssure=new Inssure();
				inssure.setInId(rs.getInt("i_id"));
				inssure.setInCompany(rs.getString("i_company"));
				inssure.setInPocicyNo(rs.getString("i_policy_no"));
				inssure.setInPolicyStatus(rs.getString("i_policy_status"));
				TripOrder tripOrder=new TripOrder();
				tripOrder.setToId(rs.getInt("to_id"));
				tripOrder.setToNumber(rs.getString("to_number"));
				tripOrder.setToTicketId(rs.getInt("to_ticket_id"));
				tripOrder.setIsUseCoupon(rs.getInt("to_isused_coupon"));
				tripOrder.setToCouponPrice(rs.getInt("to_coupon_price"));
				tripOrder.setToCharge(rs.getInt("to_charge"));
				tripOrder.setToTime(rs.getString("to_time"));
				tripOrder.setToStatus(rs.getInt("to_status"));
				tripOrder.setToUserId(rs.getInt("to_u_id"));
				tripOrder.setToNum(rs.getInt("to_order_num"));
				tripOrder.setToPrice(rs.getInt("to_price"));
				tripOrder.setIssureNo(rs.getString("tp_insure_no"));
				orderListVo.setEndStation(endStation);
				orderListVo.setStartStation(startStation);
				orderListVo.setTicket(ticket);
				orderListVo.setInssure(inssure);
				orderListVo.setTripOrder(tripOrder);
				orderListVos.add(orderListVo);
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return orderListVos;
	}

	@Override
	public TripPeople getTripPeople(String tno) {
		// TODO Auto-generated method stub
		TripPeople tripPeople=new TripPeople();
		try {
			getConnection();
			String sql="select * from take_people where tp_go_no=? and tp_collection_status=0";
			pst=conn.prepareStatement(sql);
			pst.setString(1, tno);
			rs=pst.executeQuery();
			if(rs.next()) {
				tripPeople.setQtpPhone(rs.getString("tp_phone"));
				tripPeople.setQtCardNo(rs.getString("tp_card_no"));
				tripPeople.setQtpName(rs.getString("tp_name"));
			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return tripPeople;
	}

}
