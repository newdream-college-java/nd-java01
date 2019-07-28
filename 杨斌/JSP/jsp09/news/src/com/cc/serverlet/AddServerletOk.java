package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddServerletOk implements Servlet{
	@Override
	public void destroy() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		int result=(Integer)req.getAttribute("result");
		if(result>0){
			out.write("<script>alert('添加成功');location.href=ToAddServerlet</script>");
		}else{
			out.write("<script>alert('添加失败');location.href=ToAddServerlet</script>");
		}		
	}

}
