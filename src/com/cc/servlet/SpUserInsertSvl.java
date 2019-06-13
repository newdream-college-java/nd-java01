package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.BaseDao;

public class SpUserInsertSvl extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(1);
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>注册servlet
		PrintWriter out = resp.getWriter();
		// 1.编码
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		// 2.取值
		String username = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		// Integer pwd1=Integer.parseInt(pwd);
		String reusername = req.getParameter("reusername");
		String table = req.getParameter("table");
		// Integer table1=Integer.parseInt(table);
		String zip = req.getParameter("zip");
		String number = req.getParameter("number");
		String address = req.getParameter("address");
		// 3.掉dao
		BaseDao bd = new BaseDao();
		bd.getConn();
		String sql = "INSERT into sp_user VALUES(null,?,?,?,?,?,?,?)";
		Object[] args = { username, pwd, reusername, table, zip, number,
				address };
		// out.print(args);
		// bd.updateDb(sql, args);
		out.println(bd.update(sql, args));
		// 4.跳转
		// out.print("<script><script language='JavaScript'>alert('删除成功!')</script>");
		resp.sendRedirect("login.jsp");
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>注册servlet
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
}
