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
		//����
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		//ȡֵ
		String uname=req.getParameter("uname");//ת��
		uname=URLDecoder.decode(uname,"utf-8");//urlת��
		System.out.println("����doget�ɹ���uname======"+uname);
		
		
		//��dao
		NewsDaoImp nd=new NewsDaoImp();
		int a=nd.count1(uname);
		if(a==1){
			out.print(false);
		}else{
			out.print(true);
		}
	}
}