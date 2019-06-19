package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.TripOrderDao;
import cn.song.dao.impl.TripOrderDaoImpl;

public class PayServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String orderNo=req.getParameter("orderNo");
		String issureNo=req.getParameter("issueNo");
		Integer uid=(Integer) req.getSession().getAttribute("userid");
		int oid=-1;
		TripOrderDao toDao=new TripOrderDaoImpl();
		PrintWriter out=resp.getWriter();
		if(toDao.pay(orderNo, issureNo, uid)) {
			out.print("<script>alert('支付成功，您可以到用户中心查看订单信息!');location.href='infoPageSelectServlet';</script>");
			return;
		}else {
			out.print("<script>alert('支付失败,可能余额不足，请充值后再去用户中心支付订单!');location.href='infoPageSelectServlet';</script>");
			return;
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
