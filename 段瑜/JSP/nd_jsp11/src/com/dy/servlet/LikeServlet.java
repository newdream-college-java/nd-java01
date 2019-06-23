package com.dy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LikeServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String name=req.getParameter("uname");
		String sex=req.getParameter("sex");
		String like=req.getParameter("like");
		System.out.println("用户名"+name);
		System.out.println("性别"+sex);
		System.out.println("爱好"+like);
	}
}
