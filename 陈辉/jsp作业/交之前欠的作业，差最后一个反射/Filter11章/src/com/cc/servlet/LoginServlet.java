package com.cc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(111111111);
		// 1.����
		resp.setContentType("text/html;charset=utf-8");// servlet��Ӧ���ͻ��˽���ı�������
		req.setCharacterEncoding("utf-8");// �ͻ�������servlet�����������
		// 2.ȡֵ
		String uname = req.getParameter("uname");
		System.out.println(uname);
		// 3.��dao
		// 4.��ת
		
		if (uname.equals("����")) {
			HttpSession session = req.getSession();
			session.setAttribute("uname", uname);
			resp.sendRedirect("saveB.jsp");
		}else{
			System.out.println("��������");
			resp.sendRedirect("encodeA.jsp");
		}
		
	}
}
