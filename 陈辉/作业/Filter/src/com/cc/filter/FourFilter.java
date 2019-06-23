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

public class FourFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("过滤器开始工作......");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		String uname = req.getParameter("uname");
		System.out.println("XXXXXXXXXXXXX" + uname);
		String sex = req.getParameter("sex");
		String[] box = req.getParameterValues("box");
		if (uname == null) {
			uname = "";
		}
		if (sex == null) {
			sex = "";
		}

		for (int i = 0; i < box.length; i++) {
			if (box == null) {
				box[i] = "";
			}

		}
		System.out.println("ZZZZZZZZ"+uname);
		/*
		 * String uname02 = (String) session.getAttribute("uname");
		 * System.out.println("uname====" + uname02);
		 */
		// 放行（很重要）
		chain.doFilter(request, response);
		System.out.println("过滤器结束工作......");
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}
