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
		System.out.println("开始构造");
	}

	public void destroy() {
		// TODO Auto-generated method stub
		  System.out.println("MyFilter01 过滤器销毁了....");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		  System.out.println("过滤器开始工作......");
	        //放行（很重要）
	       chain.doFilter(request, response);
	        
	       System.out.println("过滤器结束工作......");
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter01 进行初始化....");
		
	}

	
}
