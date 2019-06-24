package com.cc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(111111111);
		// 1.编码
		resp.setContentType("text/html;charset=utf-8");// servlet响应给客户端解决的编码问题
		req.setCharacterEncoding("utf-8");// 客户端请求到servlet解决编码问题
		// 2.取值
		String uname = req.getParameter("uname");
		System.out.println(uname);
		// 3.掉dao
		// 4.跳转
		
		if (uname.equals("二狗")) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			resp.sendRedirect("saveB.jsp");
		}else{
			System.out.println("输入有误");
			resp.sendRedirect("encodeA.jsp");
		}
		
	}
}
