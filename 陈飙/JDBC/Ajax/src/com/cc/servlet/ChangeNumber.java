package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangeNumber extends HttpServlet {
	private PrintWriter out;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.编码
		resp.setContentType("text/xml;charset=utf-8");
		out = resp.getWriter();
		// 2.取值
		String num = req.getParameter("num");
		Integer nums = Integer.parseInt(num);
		System.out.println("调用dopost成功 num====" + nums);
		// 3.掉到
		req.getSession().setAttribute("nums", nums);
		// req.setAttribute(arg0, arg1)
		// 4.跳转
	}
}
