package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HandsetDao;
import com.dao.impl.HandsetDaoImpl;
import com.entity.Handset;

public class QueryHandSetServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 编码
		resp.setContentType("text/html;charset=utf-8");
		// 取值
		// 调dao
		HandsetDao hd=new HandsetDaoImpl();
		List<Handset> list = hd.list(null);
		req.setAttribute("list", list);
		// 转发
		req.getRequestDispatcher("select_hand.jsp").forward(req, resp);
	}

}
