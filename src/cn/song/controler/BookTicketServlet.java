package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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

public class BookTicketServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		int page=1;
		int pageSize=10;
//		if(req.getParameter("page")!=null) {
//			page=Integer.parseInt(req.getParameter("page"));
//			if(page<1) {
//				page=1;
//			}
//		}
		String startStationName=req.getParameter("start-city");
		String endStationName=req.getParameter("end-city");
		String fromDate=req.getParameter("fromDate");
		if(startStationName!=null&&endStationName!=null&&fromDate!=null&&startStationName.trim().length()>0&&endStationName.trim().length()>0&&fromDate.trim().length()>0) {
			TicketDao ticketDao=new TicketDaoImpl();
			StationDao stationDao=new StationDaoImpl();
			List<Ticket> ticketList=ticketDao.showTickets(startStationName, endStationName,fromDate,page,pageSize);
			if(ticketList.size()>0) {
//				int pageCount=-1;
//				if(ticketList.size()%10>0) {
//					pageCount=ticketList.size()/10+1;
//				}else {
//					pageCount=ticketList.size()/10;
//				}
//				if(page>pageCount&&pageCount>0) {
//					page=pageCount;
//					ticketList=ticketDao.showTickets(startStationName, endStationName,fromDate,page,pageSize);
//				}
				int startStationId=ticketList.get(0).gettStartStationId();
				int endStationId=ticketList.get(0).gettEndStationId();
				Station startStation=stationDao.station(startStationId);
				Station endStation=stationDao.station(endStationId);
				req.setAttribute("ticketList", ticketList);
				req.setAttribute("startStation", startStation);
				req.setAttribute("endStation", endStation);
				req.setAttribute("page", page);
				req.setAttribute("pageSize", pageSize);
				req.setAttribute("pageCount",1);
				req.getRequestDispatcher("search.jsp").forward(req, resp);
				return;
			}else {
				req.setAttribute("msg", "false");
				req.getRequestDispatcher("search.jsp").forward(req, resp);
				return;
			}
		}
		out.print("<script>alert('请输入正确的时间和地点！');location.href='search.jsp';</script>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
