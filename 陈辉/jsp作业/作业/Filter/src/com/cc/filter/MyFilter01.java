package com.cc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter01 implements Filter {
	/*
	 * ������������
	 */
	public MyFilter01() {
		System.out.println("MyFilter01 �������....");
	}

	/*
	 * �����������ٵ�ʱ����ø÷���
	 */
	public void destroy() {
		System.out.println("MyFilter01 ������������....");

	}

	/*
	 * ���й��˷���ķ���
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("��������ʼ����......");
		// ���У�����Ҫ��
		chain.doFilter(request, response);
		System.out.println("��������������......");
	}

	/*
	 * �����������г�ʼ��ʱ�Żᱻ����
	 */
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("MyFilter01 ���г�ʼ��....");

	}

}
