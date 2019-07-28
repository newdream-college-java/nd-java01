package com.cc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TestFilter implements Filter {
	public TestFilter(){
		System.out.println("filter  出生了");
	}

	public void destroy() {
		System.out.println("filter  挂掉了");

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("过滤器开始工作......");
        //放行（很重要）
        chain.doFilter(request, response);
        
        System.out.println("过滤器结束工作......");

	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter  进行初始化");
	}

}
