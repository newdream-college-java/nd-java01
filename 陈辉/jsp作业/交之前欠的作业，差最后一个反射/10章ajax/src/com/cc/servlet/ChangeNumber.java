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
		// 1.����
		resp.setContentType("text/xml;charset=utf-8");
		out = resp.getWriter();
		// 2.ȡֵ
		String num = req.getParameter("num");
		Integer nums = Integer.parseInt(num);
		System.out.println("����dopost�ɹ� num====" + nums);
		// 3.����
		req.getSession().setAttribute("nums", nums);
		// req.setAttribute(arg0, arg1)
		// 4.��ת
	}
}
