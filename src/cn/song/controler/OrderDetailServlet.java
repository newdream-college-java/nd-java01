package cn.song.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.TripOrderDao;
import cn.song.dao.UserDao;
import cn.song.dao.impl.TripOrderDaoImpl;
import cn.song.dao.impl.UserDaoImpl;
import cn.song.entity.TripPeople;
import cn.song.entity.User;
import cn.song.vo.OrderListVo;

public class OrderDetailServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String orderno=req.getParameter("orderno");
		String phone=(String) req.getSession().getAttribute("phone");
		TripOrderDao tripOrderDao=new TripOrderDaoImpl();
		List<OrderListVo> orderListVos=new ArrayList<OrderListVo>();
		orderListVos=tripOrderDao.getTripOrder(null, null, null, orderno, null, null);
		OrderListVo orderListVo=orderListVos.get(0);
		UserDao userDao=new UserDaoImpl();
		User user=userDao.select(phone);
		TripPeople tripPeople=tripOrderDao.getTripPeople(orderListVo.getTripOrder().getToNumber());
		req.setAttribute("orderListVo", orderListVo);
		req.setAttribute("user", user);
		req.setAttribute("tripPeople", tripPeople);
		req.getRequestDispatcher("order-detail.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
