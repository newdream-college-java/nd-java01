package com.dy.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String uname =  req.getParameter("uname");
		uname =  URLDecoder.decode(uname,"utf-8");
		 if(uname.equals("ฑ๓นท")) {
	            out.print(false);
	        }else {
	            out.print(true);
	        }
	}
}
