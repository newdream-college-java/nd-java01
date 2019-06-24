package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.SearchDao;
import com.cc.dao.impl.SearchDaoImpl;

public class SearchSuggest extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(1111111);
		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.取值
		String se = req.getParameter("se");
		System.out.println("调用dopost成功 se====" + se);
		// 3.掉dao
		SearchDao sd = new SearchDaoImpl();
		
		System.out.println(sd.searchByKeyWord(se));
		
		out.print(sd.searchByKeyWord(se));
		//req.getSession().setAttribute("search", sd.searchByKeyWord(se));
		System.out.println(2222222);
		
	}
}
