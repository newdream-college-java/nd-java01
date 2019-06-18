package cn.song.dao;

import java.util.List;

import cn.song.entity.Ticket;

public interface TicketDao {
	List<Ticket> showTickets(String startStationName,String endStationName,String fromDate,Integer page,Integer pageSize,String...startStation);
	Ticket showBookTicket(int ticketId);
}
