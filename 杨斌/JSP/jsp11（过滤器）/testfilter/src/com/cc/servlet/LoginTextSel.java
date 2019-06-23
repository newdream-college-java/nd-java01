package com.cc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginTextSel extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String uname=req.getParameter("uname");
		String psw=req.getParameter("psw");
		if(uname.equals("admin")&&psw.equals("admin")){
			resp.sendRedirect("dync.jsp");
		}else{
			resp.sendRedirect("error.jsp");
		}
	}
}
