package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.SpUserDao;
import com.cc.dao.impl.SpUserDaoImpl;

public class SpUserSelectNameSvl extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>注册查询名字servlet
		System.out.println(1);
		// 1.编码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.取值
		String username = req.getParameter("username");// 转码
		username = URLDecoder.decode(username,"utf-8");// url转码
		System.out.println("调用doget成功,username=-=====" + username);
		//3.掉dao
		SpUserDao sud=new SpUserDaoImpl();
		if(sud.listName(username).size()>0){
			out.print(false);//成功返回true
		}else{
			out.print(true);//失败返回false;
		}
		//4.跳转
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>注册查询名字servlet
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
