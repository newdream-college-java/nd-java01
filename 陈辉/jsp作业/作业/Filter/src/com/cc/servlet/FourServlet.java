package com.cc.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FourServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(1);
		// 1.±àÂë
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// 2.È¡Öµ
		String uname = req.getParameter("uname");
		String sex = req.getParameter("sex");
		String[] box = req.getParameterValues("box");
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < box.length; i++) {
			list.add(box[i]);
		}
		System.out.println(list);
		// 3.µôdao
		// 4.Ìø×ª
		HttpSession session = req.getSession();
		session.setAttribute("uname", uname);
		session.setAttribute("sex", sex);
		session.setAttribute("list", list);
		req.getRequestDispatcher("four_x.jsp").forward(req, resp);
	}
}
