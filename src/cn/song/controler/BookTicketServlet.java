package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.StationDao;
import cn.song.dao.TicketDao;
import cn.song.dao.impl.StationDaoImpl;
import cn.song.dao.impl.TicketDaoImpl;
import cn.song.entity.Station;
import cn.song.entity.Ticket;

public class BookTicketServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		int page = 1;
		int pageSize = 9;
		if (req.getParameter("page") != null) {
			page = Integer.parseInt(req.getParameter("page"));
			if (page < 1) {
				page = 1;
			}
		}
		String startStationName = req.getParameter("start-city");
		String endStationName = req.getParameter("end-city");
		String fromDate = req.getParameter("fromDate");
		req.setAttribute("startStationName", startStationName);
		req.setAttribute("endStationName", endStationName);
		req.setAttribute("fromDate", fromDate);
		if (startStationName != null && endStationName != null && fromDate != null
				&& startStationName.trim().length() > 0 && endStationName.trim().length() > 0
				&& fromDate.trim().length() > 0) {
			TicketDao ticketDao = new TicketDaoImpl();
			StationDao stationDao = new StationDaoImpl();
			String[] strs=req.getParameterValues("stationStart");
			List<Ticket> ticketList=new ArrayList<>();
			List<Ticket> ticketListAll=new ArrayList<>();
			List<Ticket> ticketListAllFor=new ArrayList<>();
			if(strs==null) {
				ticketList = ticketDao.showTickets(startStationName, endStationName, fromDate, page, pageSize,null);
				ticketListAll=ticketDao.showTickets(startStationName, endStationName, fromDate,null,null,null);
			}else {
				ticketListAll=ticketDao.showTickets(startStationName, endStationName, fromDate,null,null,null);
				ticketList = ticketDao.showTickets(startStationName, endStationName, fromDate, page, pageSize,strs);
				ticketListAllFor=ticketDao.showTickets(startStationName, endStationName, fromDate,null,null,strs);
			}
			int pageCount = -1;
			if(ticketListAllFor.size()==0) {
				if (ticketListAll.size() % pageSize > 0) {
					pageCount = ticketListAll.size() / 10 + 1;
		
				} else {
					pageCount = ticketListAll.size() / 10;
				}
				if (page > pageCount && pageCount > 0) {
					page = pageCount;
					ticketList = ticketDao.showTickets(startStationName, endStationName, fromDate, page, pageSize,strs);
				}
			}else {
				if (ticketListAllFor.size() % pageSize > 0) {
					pageCount = ticketListAllFor.size() / 10 + 1;
		
				} else {
					pageCount = ticketListAllFor.size() / 10;
				}
				if (page > pageCount && pageCount > 0) {
					page = pageCount;
					ticketList = ticketDao.showTickets(startStationName, endStationName, fromDate, page, pageSize,strs);
				}
			}
			if (ticketList.size() > 0) {
				List<Station> stations=new ArrayList<>();
				for(Ticket ticket:ticketListAll) {
					Station s=ticket.getstartStation();
					if(strs!=null) {
						for(String str:strs) {
							if(str.equals(s.getsName())) {
								s.setIsSelect("true");
								break;
							}else {
								s.setIsSelect("false");
							}
						}
					}
					stations.add(s);
				}
				Set<Station> sets=new HashSet<>();
				sets.addAll(stations);
				List<Station> lastStations=new ArrayList<>();
				lastStations.addAll(sets);
				int startStationId = ticketList.get(0).gettStartStationId();
				int endStationId = ticketList.get(0).gettEndStationId();
				Station startStation = stationDao.station(startStationId);
				Station endStation = stationDao.station(endStationId);
				req.setAttribute("ticketList", ticketList);
				req.setAttribute("startStation", startStation);
				req.setAttribute("endStation", endStation);
				req.setAttribute("page", page);
				req.setAttribute("pageSize", pageSize);
				req.setAttribute("pageCount", pageCount);
				if(strs!=null) {
					req.setAttribute("stationStart", strs);
				}
				if(ticketListAllFor.size()==0) {
					req.setAttribute("listSize", ticketListAll.size());
				}else {
					req.setAttribute("listSize", ticketListAllFor.size());
				}
				req.setAttribute("stations", lastStations);
				req.getRequestDispatcher("search.jsp").forward(req, resp);
				return;
			}else {
				req.setAttribute("msg", "这两个车站没有直达车次");
				req.getRequestDispatcher("search.jsp").forward(req, resp);
				return;
			}
		}else {
			req.setAttribute("msg", "请输入正确的时间和地点");
			req.getRequestDispatcher("search.jsp").forward(req, resp);
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
