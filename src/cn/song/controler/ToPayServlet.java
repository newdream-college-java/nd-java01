package cn.song.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEWARRAY;

import cn.song.dao.TicketDao;
import cn.song.dao.impl.TicketDaoImpl;
import cn.song.entity.QpTripPeople;
import cn.song.entity.Ticket;
import cn.song.entity.TripOrder;
import cn.song.entity.TripPeople;

public class ToPayServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			String uId=req.getParameter("uId");
			String ticketId=req.getParameter("ticketId");
			String name=req.getParameter("qpUserName");
			String isIssur=req.getParameter("checkboxlink");
			String[] isAdult=req.getParameterValues("isAdult");
			String cardNo=req.getParameter("qpCardNo");
			String phone=req.getParameter("qpphone");
			String[] names=req.getParameterValues("username");
			String[] cardNos=req.getParameterValues("cardNo");
			String[] phones=req.getParameterValues("phone");
			TicketDao ticketDao=new TicketDaoImpl();
			Ticket ticket=null;
			QpTripPeople qt=new QpTripPeople();
			if(ticketId!=null) {
				qt.setOrderId(Integer.parseInt(ticketId));
				ticket=ticketDao.showBookTicket(Integer.parseInt(ticketId));
			}
			qt.setQtpName(name);
			qt.setQtCardNo(cardNo);
			qt.setQtpPhone(phone);
			List<TripPeople> tripPeoples=new ArrayList<>(); 
			TripOrder tripOrder=new TripOrder();
			tripOrder.setIsUseCoupon(0);
			tripOrder.setToCharge(0);
			tripOrder.setToCouponPrice(0);
			tripOrder.setToNum(names.length);
			tripOrder.setToNumber("11111");
			tripOrder.setToPrice(ticket.gettNowPrice()*names.length);
			tripOrder.setToStatus(0);
			tripOrder.setToTicketId(ticket.gettId());
			tripOrder.setToTime("2019-06-19 11:11:11");
			tripOrder.setToUserId(Integer.parseInt(uId));
			for(int i=0;i<names.length;i++) {
				TripPeople tripPeople=new TripPeople();
				tripPeople.setIsAdult(0);
				tripPeople.setQtCardNo(cardNos[i]);
				tripPeople.setQtpName(names[i]);
				tripPeople.setQtpPhone(phones[i]);
				tripPeople.setStatus(1);
				tripPeople.setTpId(1);
			}
			
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doGet(req, resp);
		}
}
