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
		System.out.println("filter  ������");
	}

	public void destroy() {
		System.out.println("filter  �ҵ���");

	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("��������ʼ����......");
        //���У�����Ҫ��
        chain.doFilter(request, response);
        
        System.out.println("��������������......");

	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("filter  ���г�ʼ��");
	}

}
