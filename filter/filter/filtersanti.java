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
import javax.servlet.http.HttpServletResponse;

public class filtersanti implements Filter{

	private Properties ps;
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("过滤ll.jsp的过滤器死亡");
	}

	public void doFilter(ServletRequest re, ServletResponse rs,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) re;
        HttpServletResponse response=(HttpServletResponse)rs;
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8"); 
        String name1=request.getParameter("lll");
        System.out.println(name1);
        String value=ps.getProperty(name1);
        if(value!=null){
        	request.setAttribute("lll",value);
        }else{
        	request.setAttribute("lll",name1);
        }
        chain.doFilter(request, response);
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤ll.jsp的过滤器初始化");
		 ServletContext context = filterConfig.getServletContext();
	        InputStream inputStream = context.getResourceAsStream("WEB-INF/lll.properties");
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
