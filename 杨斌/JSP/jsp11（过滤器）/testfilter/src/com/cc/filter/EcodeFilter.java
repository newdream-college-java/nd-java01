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

public class EcodeFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)req;
        HttpServletResponse response = (HttpServletResponse)resp;
        if(request.getMethod().equalsIgnoreCase("post")){
            request.setCharacterEncoding("utf-8");
        }else{
        	Enumeration Enumeration = request.getParameterNames();
        	while(Enumeration.hasMoreElements()){
        		String key = (String)Enumeration.nextElement();
        		String[] values = request.getParameterValues(key);
        		for(int i=0;i<values.length;i++){   
        			 values[i]=new String(values[i].getBytes("iso8859-1"),"utf-8");
        		}
        	}
        }
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request, response);
	}
	
		
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
