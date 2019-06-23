package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonData extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		String uname=req.getParameter("una");
		String hobby=req.getParameter("hob");
		String sex=req.getParameter("se");
		String ziliao=req.getParameter("zil");
		
		out.print(uname+"\n");
		out.print(hobby+"\n");
		out.print(sex+"\n");
		out.print(ziliao+"\n");
	}
}
