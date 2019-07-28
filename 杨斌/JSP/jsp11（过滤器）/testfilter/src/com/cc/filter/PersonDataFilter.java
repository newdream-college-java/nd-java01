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

public class PersonDataFilter implements Filter{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		HttpServletResponse resp=(HttpServletResponse)response;
		
		String uname=null;
		String hobby=null;
		String sex=null;
		String ziliao=null;
		if(req.getParameter("uname")!=null){
			uname=req.getParameter("uname");
		}
		if(req.getParameter("hobby")!=null){
			hobby=req.getParameter("hobby");
		}
		if(req.getParameter("sex")!=null){
			sex=req.getParameter("sex");
		}
		if(req.getParameter("ziliao")!=null){
			ziliao=req.getParameter("ziliao");
		}
		req.setAttribute("una", uname);
		req.setAttribute("hob", hobby);
		req.setAttribute("se", sex);
		req.setAttribute("zil", ziliao);
		chain.doFilter(req,resp);
		req.getRequestDispatcher("/personData").forward(req, resp);
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
