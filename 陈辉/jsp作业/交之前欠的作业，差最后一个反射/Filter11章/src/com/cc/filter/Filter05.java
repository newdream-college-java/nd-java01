package com.cc.filter;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class Filter05 implements Filter {
	private Properties ps;

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter05��ʼ");
		HttpServletRequest request = (HttpServletRequest) req;
		
		// 1.��ȡ������ı�����
		String codeStr = request.getParameter("code");
		// 2.��ȡ�Ƿ��ַ�������
		if (codeStr != null) {
			String value = ps.getProperty(codeStr);
			// 3.�ж������ı��Ƿ�����ں�����
			if (value != null) {
				// ���1.����ھͷ��غ��������ڵ�ֵ
				req.setAttribute("codeStr", value);
				// ���2.���ں������ͷ���
			} else {
				req.setAttribute("codeStr", codeStr);
			}
		}
		chain.doFilter(req, res);
		System.out.println("Filter05��ʼ����");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter05��ʼ��");
		ServletContext context = filterConfig.getServletContext();
		InputStream inputStream = context.getResourceAsStream("WEB-INF/str.properties");
		ps = new Properties();
		try {
			ps.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
