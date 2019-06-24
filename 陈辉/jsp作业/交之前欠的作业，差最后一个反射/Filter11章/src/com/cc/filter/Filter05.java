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
		System.out.println("Filter05开始");
		HttpServletRequest request = (HttpServletRequest) req;
		
		// 1.获取输入的文本内容
		String codeStr = request.getParameter("code");
		// 2.获取非法字符黑名单
		if (codeStr != null) {
			String value = ps.getProperty(codeStr);
			// 3.判断输入文本是否存在在黑名单
			if (value != null) {
				// 情况1.如果在就返回和名单对于的值
				req.setAttribute("codeStr", value);
				// 情况2.不在黑名单就放行
			} else {
				req.setAttribute("codeStr", codeStr);
			}
		}
		chain.doFilter(req, res);
		System.out.println("Filter05开始结束");
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("Filter05初始化");
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
