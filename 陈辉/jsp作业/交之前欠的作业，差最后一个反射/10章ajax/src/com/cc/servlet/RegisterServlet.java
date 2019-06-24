package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.编码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.取值
		String uname = req.getParameter("uname");// 转码
		//uname = new String(uname.getBytes("iso-8859-1"), "utf-8");
		uname = URLDecoder.decode(uname,"utf-8");// url转码
		System.out.println("调用doget成功,uname=-=====" + uname);
		// 3.查询数据库是否改用户

		// 4.根据结果返回相应的响应
		if (uname.equals("二狗")) {//二狗已经注册
			out.print(false);
		} else {
			out.print(true);
		}
	}
}
