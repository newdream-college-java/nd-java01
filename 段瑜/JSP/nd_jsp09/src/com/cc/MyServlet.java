package com.cc;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet implements Servlet{
	public MyServlet(){
		
		System.out.println("���������");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("��������");
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("�����Ϣ");
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		System.out.println("��ʼ����");
		
	}
	public static void main(String[] args) {
		MyServlet my=new MyServlet();
	}
}
