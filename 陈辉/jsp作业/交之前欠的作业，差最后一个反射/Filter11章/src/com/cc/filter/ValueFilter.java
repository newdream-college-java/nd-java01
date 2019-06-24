package com.cc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ValueFilter implements Filter {

	public void destroy() {
		System.out.println("Filter结束");
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter服务开始");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		String uname = (String) session.getAttribute("uname");
		System.out.println("jsp传过来的name===" + uname);
		if (uname==null) {
			System.out.println(1);
			res.sendRedirect("encodeA.jsp");
			
		}
		System.out.println("=====" + uname);
		chain.doFilter(req, res);
		// chain.doFilter(req, res);
		System.out.println("Filter服务结束");
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("Filter初始化");
	}

}
