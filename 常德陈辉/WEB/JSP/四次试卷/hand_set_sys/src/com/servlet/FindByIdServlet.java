package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.HandsetDao;
import com.dao.impl.HandsetDaoImpl;

public class FindByIdServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ����
		response.setContentType("text/html;charset=utf-8");
		// ȡֵ
		String Hid=request.getParameter("hid");
		int hid=Integer.parseInt(Hid);
		// ����
		HandsetDao hd=new HandsetDaoImpl();
		int result=hd.delete(hid);
		// ת��
		PrintWriter out=response.getWriter();
		if(result>0){
			out.print("<script>alert('ɾ���ɹ���');location.href='QueryHandSetServlet';</script>");
		}
	}

}
