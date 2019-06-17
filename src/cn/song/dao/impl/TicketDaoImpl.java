package cn.song.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import cn.song.dao.BaseDao;
import cn.song.dao.StationDao;
import cn.song.dao.TicketDao;
import cn.song.entity.Station;
import cn.song.entity.Ticket;

public class TicketDaoImpl extends BaseDao implements TicketDao{
	private StationDao stationDao=new StationDaoImpl();
	@Override
	public List<Ticket> showTickets(String startStationName, String endStationName,String fromDate,Integer page,Integer pageSize,String...startStation) {
		// TODO Auto-generated method stub
		List<Ticket> ticketList=new ArrayList<>();
		Ticket ticket=null;
		try {
			getConnection();
			StringBuffer sql=new StringBuffer("select * from (select * from ticket t,go_car_type g "
					+ "where t.t_start_station_id in (select s_id from station where city=?) "
					+ "and t.t_end_station_id in (select s_id from station where city=?) "
					+ "and t.go_car_id=g.gc_id and DATE_FORMAT(t.t_start_time,'%Y-%m-%d')=?) as d");
			if(page==null&&startStation==null) {
				sql.append(" order by d.t_start_time");
				pst=conn.prepareStatement(sql.toString());
				pst.setString(1, startStationName);
				pst.setString(2, endStationName);
				pst.setString(3, fromDate);
			}else if(startStation==null&&page!=null){
				sql.append(" order by d.t_start_time limit ?,?");
				pst=conn.prepareStatement(sql.toString());
				pst.setString(1, startStationName);
				pst.setString(2, endStationName);
				pst.setString(3, fromDate);
				pst.setInt(4, (page-1)*pageSize);
				pst.setInt(5, pageSize);
			}else if(page==null&&startStation!=null) {
				sql.append(" where d.t_start_station_id in (select distinct s_id from station where s_name in(");
				for(int i=0;i<startStation.length;i++) {
					sql.append("?");
					if(i<startStation.length-1) {
						sql.append(",");
					}
				}
				sql.append(")) order by d.t_start_time");
				pst=conn.prepareStatement(sql.toString());
				pst.setString(1, startStationName);
				pst.setString(2, endStationName);
				pst.setString(3, fromDate);
				for(int i=0;i<startStation.length;i++) {
					pst.setString(3+i+1, startStation[i]);
				}
			}else {
				sql.append(" where d.t_start_station_id in (select distinct s_id from station where s_name in(");
				for(int i=0;i<startStation.length;i++) {
					sql.append("?");
					if(i<startStation.length-1) {
						sql.append(",");
					}
				}
				sql.append(")) order by d.t_start_time limit ?,?");
				pst=conn.prepareStatement(sql.toString());
				pst.setString(1, startStationName);
				pst.setString(2, endStationName);
				pst.setString(3, fromDate);
				for(int i=0;i<startStation.length;i++) {
					pst.setString(3+i+1, startStation[i]);
				}
				pst.setInt(3+startStation.length+1, (page-1)*pageSize);
				pst.setInt(3+startStation.length+2, pageSize);
			}
			rs=pst.executeQuery();
			while(rs.next()) {
				ticket=new Ticket();
				ticket.settId(rs.getInt("t_id"));
				ticket.settName(rs.getString("t_name"));
				ticket.settStartStationId(rs.getInt("t_start_station_id"));
				ticket.settEndStationId(rs.getInt("t_end_station_id"));
				ticket.settStartTime(rs.getString("t_start_time"));
				ticket.settDistance(rs.getInt("t_distance"));
				ticket.settFormerPrice(rs.getInt("t_former_price"));
				ticket.settNowPrice(rs.getInt("t_now_price"));
				ticket.settTicketNumber(rs.getInt("t_ticket_number"));
				ticket.settTicketBookNumber(rs.getInt("t_ticket_book_number"));
				ticket.setGoCarTypeName(rs.getString("gc_name"));
				ticket.settStartStationName(startStationName);
				ticket.settEndStationName(endStationName);
				ticket.setStartStation(stationDao.station(ticket.gettStartStationId()));
				ticket.setEndStation(stationDao.station(ticket.gettEndStationId()));
				ticketList.add(ticket);
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
		return ticketList;
	}
	@Override
	public Ticket showBookTicket(int ticketId) {
		Ticket ticket=new Ticket();
		try {
			getConnection();
			String sql="select * from ticket t,go_car_type g where t.t_id=? and t.go_car_id=g.gc_id";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, ticketId);
			rs=pst.executeQuery();
			if(rs.next()) {
				ticket.settId(rs.getInt("t_id"));
				ticket.settStartStationId(rs.getInt("t_start_station_id"));
				ticket.settEndStationId(rs.getInt("t_end_station_id"));
				ticket.settFormerPrice(rs.getInt("t_former_price"));
				ticket.settNowPrice(rs.getInt("t_now_price"));
				ticket.settStartTime(rs.getString("t_start_time"));
				ticket.settTicketNumber(rs.getInt("t_ticket_number"));
				ticket.settTicketBookNumber(rs.getInt("t_ticket_book_number"));
				ticket.setGoCarTypeName(rs.getString("gc_name"));
				ticket.settDistance(rs.getInt("t_distance"));
				ticket.settName(rs.getString("t_name"));
				Station startStation=stationDao.station(ticket.gettStartStationId());
				Station endStation=stationDao.station(ticket.gettEndStationId());
				ticket.setStartStation(startStation);
				ticket.setEndStation(endStation);
				ticket.settStartStationName(startStation.getCity());
				ticket.settEndStationName(endStation.getCity());
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
		return ticket;
	}
	
}
