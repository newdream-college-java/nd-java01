package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.song.dao.TicketDao;
import cn.song.dao.TripOrderDao;
import cn.song.dao.impl.TicketDaoImpl;
import cn.song.dao.impl.TripOrderDaoImpl;
import cn.song.entity.Inssure;
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
			SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Calendar calendar=Calendar.getInstance();
			Date date=calendar.getTime();
			String currentTime=df.format(date);
			long no=calendar.getTimeInMillis();
			Random r=new Random();
			int r1=r.nextInt()*1000;
			int r2=r.nextInt()*1000+1000;
			String orderNo=new String(""+no+r1);
			String insureNo=null;
			Inssure inssure=new Inssure();
			if(isIssur!=null) {
				insureNo=new String(""+no+r2);
				inssure.setInCompany("平安保险");
				inssure.setInPocicyNo(insureNo);
				inssure.setInPolicyStatus("未开始");
			}
			TicketDao ticketDao=new TicketDaoImpl();
			Ticket ticket=null;
			QpTripPeople qt=new QpTripPeople();
			
			if(ticketId!=null) {
				qt.setOrderNo(orderNo);
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
			tripOrder.setToNumber(orderNo);
			tripOrder.setToPrice(ticket.gettNowPrice()*names.length);
			tripOrder.setToStatus(0);
			tripOrder.setToTicketId(ticket.gettId());
			tripOrder.setToTime(currentTime);
			tripOrder.setToUserId(Integer.parseInt(uId));
			tripOrder.setIssureNo(insureNo);
			for(int i=0;i<names.length;i++) {
				TripPeople tripPeople=new TripPeople();
				tripPeople.setIsAdult(0);
				tripPeople.setOrderNo(orderNo);
				tripPeople.setQtCardNo(cardNos[i]);
				tripPeople.setQtpName(names[i]);
				tripPeople.setQtpPhone(phones[i]);
				if(tripPeople.getOrderNo().equals(qt.getOrderNo())&&tripPeople.getQtpName().equals(qt.getQtpName())
						&&tripPeople.getQtCardNo().equals(qt.getQtCardNo())&&tripPeople.getQtpPhone().equals(qt.getQtpPhone())) {
					tripPeople.setStatus(0);
				}else {
					tripPeople.setStatus(1);
				}
				tripPeoples.add(tripPeople);
			}
			PrintWriter out=resp.getWriter();
			TripOrderDao tod=new TripOrderDaoImpl();
			if(tod.bookTicket(inssure, qt, tripPeoples, tripOrder)) {
				req.setAttribute("orderNo", tripOrder.getToNumber());
				req.setAttribute("tripOrder", tripOrder);
				req.setAttribute("ticket", ticket);
				req.getRequestDispatcher("to-pay.jsp").forward(req, resp);
			}else {
				out.print("<script>alert('预定失败');location.href='booking-ticket.jsp'</script>");
			}
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doGet(req, resp);
		}
}
