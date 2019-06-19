package cn.song.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.TripOrderDao;
import cn.song.dao.impl.TripOrderDaoImpl;
import cn.song.vo.OrderListVo;

public class OrderListAllServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=utf-8");
			String phone=(String) req.getSession().getAttribute("phone");
			TripOrderDao tripOrder=new TripOrderDaoImpl();
			int page=1;
			if(req.getParameter("page")!=null) {
				page=Integer.parseInt(req.getParameter("page"));
				if(page<1) {
					page=1;
				}
			}
			int pageSize=8;
			List<OrderListVo> orderListVos=tripOrder.getTripOrder(null, null, phone, null,page,pageSize);
			List<OrderListVo> orderListVosAll=tripOrder.getTripOrder(null, null, phone, null,null,null);
			int pageCount=0;
			int size=orderListVosAll.size();
			if(size%pageSize>0) {
				pageCount=size/pageSize+1;
			}else {
				pageCount=size/pageSize;
			}
			if(page>pageCount) {
				page=pageCount;
				orderListVos=tripOrder.getTripOrder(null, null, phone, null,page,pageSize);
			}
			req.setAttribute("orderListVos", orderListVos);
			req.setAttribute("page", page);
			req.setAttribute("pageCount", pageCount);
			req.setAttribute("count", orderListVosAll.size());
			req.getRequestDispatcher("order-iist-all.jsp").forward(req, resp);
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			doGet(req, resp);
		}
}
