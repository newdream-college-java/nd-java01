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
	     System.out.println("EncodServlet��ʼ����");
         //1.����
         
         //2.ȡֵ
         String userName = req.getParameter("uname");
         //userName = new String(userName.getBytes("iso-8859-1"),"utf-8");
         System.out.println("��ȡ�ı�ֵΪ��"+userName);
         
         //3.��dao
         
         //4.��ת
         
	}
}
