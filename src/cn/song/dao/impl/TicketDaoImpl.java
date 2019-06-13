package cn.song.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import cn.song.dao.BaseDao;
import cn.song.dao.TicketDao;
import cn.song.entity.Ticket;

public class TicketDaoImpl extends BaseDao implements TicketDao{

	@Override
	public List<Ticket> showTickets(String startStationName, String endStationName,String fromDate,int page,int pageSize) {
		// TODO Auto-generated method stub
		List<Ticket> ticketList=new ArrayList<>();
		Ticket ticket=null;
		try {
			getConnection();
			String sql="select * from ticket t,go_car_type g "
					+ "where t.t_start_station_id=(select s_id from station where city=?) "
					+ "and  t.t_end_station_id=(select s_id from station where city=?) "
					+ "and t.go_car_id=g.gc_id and DATE_FORMAT(t.t_start_time,'%Y-%m-%d')=? limit ?,?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, startStationName);
			pst.setString(2, endStationName);
			pst.setString(3, fromDate);
			pst.setInt(4, (page-1)*pageSize);
			pst.setInt(5, pageSize);
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
	
}
