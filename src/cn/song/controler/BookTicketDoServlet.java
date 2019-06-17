package cn.song.controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.TicketDao;
import cn.song.dao.impl.TicketDaoImpl;
import cn.song.entity.Ticket;
/**
 * 预订响应
 * @author mob
 *
 */
public class BookTicketDoServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String startStationName=req.getParameter("start-city"); 
		String endStationName=req.getParameter("end-city");
		String fromDate=req.getParameter("fromDate");
		if(req.getSession().getAttribute("phone")==null) {
			String url=req.getHeader("Referer");
			url=url+"?start-city="+startStationName+"&end-city="+endStationName+"&fromDate="+fromDate;
			req.setAttribute("url", url);
			req.getRequestDispatcher("login.jsp").forward(req, resp);
			return;
		}else {
			int ticketId=Integer.parseInt(req.getParameter("ticketId"));
			req.setAttribute("ticketId", ticketId);
			TicketDao ticketDao=new TicketDaoImpl();
			Ticket ticket=ticketDao.showBookTicket(ticketId);
			req.setAttribute("ticket", ticket);
			req.getRequestDispatcher("booking-ticket.jsp").forward(req, resp);
			return;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
