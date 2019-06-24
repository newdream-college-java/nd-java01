package com.cc.ccservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.NewsDao;
import com.cc.dao.imp.NewsDaoImp;

public class CheckUserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//编码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		//取值
		String uname=req.getParameter("uname");//转码
		uname=URLDecoder.decode(uname,"utf-8");//url转码
		System.out.println("调用doget成功，uname======"+uname);
		
		
		//调dao
		NewsDaoImp nd=new NewsDaoImp();
		int a=nd.count1(uname);
		if(a==1){
			out.print(false);
		}else{
			out.print(true);
		}
	}
}