package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.����
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.ȡֵ
		String uname = req.getParameter("uname");// ת��
		//uname = new String(uname.getBytes("iso-8859-1"), "utf-8");
		uname = URLDecoder.decode(uname,"utf-8");// urlת��
		System.out.println("����doget�ɹ�,uname=-=====" + uname);
		// 3.��ѯ���ݿ��Ƿ���û�

		// 4.���ݽ��������Ӧ����Ӧ
		if (uname.equals("����")) {//�����Ѿ�ע��
			out.print(false);
		} else {
			out.print(true);
		}
	}
}
