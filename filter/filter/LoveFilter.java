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

public class LoveFilter implements Filter{
	public LoveFilter(){
		System.out.println("过滤器出生了");
	}
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("过滤器已经死亡");
	}

	public void doFilter(ServletRequest re, ServletResponse rs,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req=(HttpServletRequest) re;
		HttpServletResponse res=(HttpServletResponse) rs;
		if (req.getMethod().equalsIgnoreCase("post")) {
			req.setCharacterEncoding("utf-8");
			res.setContentType("textml;charset=utf-8");
		} else if (req.getMethod().equalsIgnoreCase("get")) {
			Enumeration<String> ef = req.getParameterNames();
			while (ef.hasMoreElements()) {
				String key = ef.nextElement();
				String[] values = req.getParameterValues(key);
				for (int i = 0; i < values.length; i++) {
					values[i] = new String(values[i].getBytes("iso-8859-1"),
							"utf-8");
				}
			}
		}
		String name = req.getParameter("name");
		//String password = req.getParameter("password");
		String sex = req.getParameter("sex");
		String[] ah = req.getParameterValues("hobby");
		String gr = req.getParameter("information");
		if (name != null & name.trim().length() > 0) {
			if(sex!=null){
				if(ah.length>0){
					if(gr!= null && gr.trim().length() > 0){
						chain.doFilter(req, res);
					}else{
						res.sendRedirect("love.jsp");
					}
				}else{
					res.sendRedirect("love.jsp");
				}
			}else{
				res.sendRedirect("love.jsp");
			}
		} else {
			res.sendRedirect("love.jsp");
		}
		/*if (password != null & password.trim().length() > 0) {

		} else {
			password = null;
		}*/

		if (gr != null & gr.trim().length() > 0) {

		} else {
			gr = null;
		}
		req.setAttribute("name", name);
		//req.setAttribute("password",password );
		req.setAttribute("gr",gr );
//		System.out.println("name：" + name);
//		System.out.println("password：" + password);
//		System.out.println("sex：" + sex);
//		if (ah != null) {
//			for(int i=0;i<ah.length;i++){
//				System.out.println("ah：" + ah[i]);
//			}
//		} else {
//			System.out.println("ah："+ah);
//		}
//		
//		System.out.println("gr：" + gr);
		

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("过滤器初始化");

	}

}
