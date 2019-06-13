package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.SpOrderDao;
import com.cc.dao.impl.SpOrderDaoImpl;
import com.cc.entity.SpOrder;
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>收货地址查询servlet
public class SpOrderSelectSvl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.编码
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		PrintWriter out = resp.getWriter();
		// 2.取值
		// 3.掉dao
		SpOrderDao sp = new SpOrderDaoImpl();
		List<SpOrder> list = sp.list();
		// System.out.println(list);
		// 4.跳转
		req.setAttribute("list", list);
		req.getRequestDispatcher("vipAdress.jsp").forward(req, resp);
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>收货地址查询servlet
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
}
