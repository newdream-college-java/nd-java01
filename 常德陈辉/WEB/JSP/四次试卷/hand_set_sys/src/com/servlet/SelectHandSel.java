package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HandsetDao;
import com.dao.impl.HandsetDaoImpl;
import com.entity.Handset;

public class SelectHandSel extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����
		response.setContentType("text/html;charset=utf-8");
		// ȡֵ
		String Hid=request.getParameter("hid");
		int hid=Integer.parseInt(Hid);
		// ��dao
		HandsetDao hd=new HandsetDaoImpl();
		Handset hand= hd.list(hid).get(0);
		request.setAttribute("hand", hand);
		// ת��
		request.getRequestDispatcher("date_hand.jsp").forward(request, response);
	}

}
