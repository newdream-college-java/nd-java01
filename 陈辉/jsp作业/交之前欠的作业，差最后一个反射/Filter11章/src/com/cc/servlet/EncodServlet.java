package com.cc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	     System.out.println("EncodServlet开始服务");
         //1.编码
         
         //2.取值
         String userName = req.getParameter("uname");
         //userName = new String(userName.getBytes("iso-8859-1"),"utf-8");
         System.out.println("获取的表单值为："+userName);
         
         //3.调dao
         
         //4.跳转
         
	}
}
