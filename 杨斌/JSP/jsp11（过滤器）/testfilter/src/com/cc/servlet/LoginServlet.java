package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//ȡֵ
		String uname=req.getParameter("uname");
		String psw=req.getParameter("psw");
		PrintWriter out=resp.getWriter();
		if(uname.equals("����")){
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			resp.sendRedirect("/testfilter/save/save.jsp");
		}else{
			out.print("<script>javascript:alert('�û���������������д������');history.go(-1)</script>");
		}
	}
}
