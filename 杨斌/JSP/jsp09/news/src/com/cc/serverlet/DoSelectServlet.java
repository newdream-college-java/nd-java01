package com.cc.serverlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.NewsDaoImp;

public class DoSelectServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String page=request.getParameter("page");
		String pagesize=request.getParameter("pagesize");
		NewsDaoImp nd=new NewsDaoImp();
		System.out.println(page+pagesize);
	}
}
