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

import com.cc.servlet.MyRequest01;

public class EncodeFilter implements Filter {

	public void destroy() {

	}

	/*
	 * ServletRequest:������е�����Э��(ftp https http smtp.....)
	 * HttpServletRequest�����httpЭ�� (get��post)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// HttpServletRequest req = (HttpServletRequest) request;
		// HttpServletResponse res = (HttpServletResponse) response;
		// // 1.�����������
		// 1.һ���Ի�ȡ���еĲ����ļ�
		// new MyRequest01().getParameterValues(name);
		
		// ��֤
		// response.setContentType("text/html;charset=utf-8");
		// String uname = req.getParameter("uname");
		// new MyRequest01().getParameterValues(uname);
		MyRequest01 req = new MyRequest01((HttpServletRequest) request);
		//��֤
		String uname = req.getParameter("uname");
		System.out.println(">>>>>>>" + req.getParameter("uname"));
		// String uname = req.getParameter("uname");
		// ����
		chain.doFilter(req, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {

	}

}
