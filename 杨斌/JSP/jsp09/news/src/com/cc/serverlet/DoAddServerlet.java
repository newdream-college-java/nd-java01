package com.cc.serverlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.NewsDaoImp;

public class DoAddServerlet implements Servlet{

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
		req.setCharacterEncoding("utf-8");
		res.setContentType("text/html;charset=utf-8");
		HttpServletResponse resp=(HttpServletResponse) res;
		int ntid=Integer.parseInt(req.getParameter("ntid"));
		String ntitle=req.getParameter("ntitle");
		String nauthor=req.getParameter("nauthor");
		String filePath=req.getParameter("filePath");
		String ncontent=req.getParameter("ncontent");
		String nsummary=req.getParameter("nsummary");
		NewsDaoImp nd=new NewsDaoImp();
		int result=nd.add(ntid, ntitle, nauthor, filePath, ncontent, nsummary);
		req.setAttribute("result", result);
		req.getRequestDispatcher("AddServerletOk").forward(req, resp);
	}
}
