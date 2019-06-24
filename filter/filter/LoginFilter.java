package com.cc.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("filter开始运行");
		HttpServletRequest request=(HttpServletRequest) req;
		HttpServletResponse response=(HttpServletResponse) resp;
		//验证
		//System.out.println(111);
		HttpSession session=request.getSession();
		String name=(String) session.getAttribute("name");
		System.out.println(name);
		//HttpSession session=request.getSession();
		//name=(String)session.getAttribute(name);
		//String name=(String)session.getAttribute("name");
		if(name!=null&&name.trim().length()>0){
			chain.doFilter(request, response);
			return;
		}else {
			response.sendRedirect("../login.jsp");
			return;
		}
			
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
