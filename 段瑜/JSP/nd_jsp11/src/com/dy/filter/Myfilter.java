package com.dy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class Myfilter implements Filter{
	
	public Myfilter(){
		System.out.println("��ʼ����");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		  System.out.println("MyFilter01 ������������....");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		  System.out.println("��������ʼ����......");
	        //���У�����Ҫ��
	       chain.doFilter(request, response);
	        
	       System.out.println("��������������......");
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter01 ���г�ʼ��....");
		
	}

	
}
