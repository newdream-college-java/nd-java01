package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TourDao;
import com.dao.impl.TourDaoImpl;

public class DeleteTourSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����
		response.setContentType("text/html;charset=utf-8");
		//ȡֵ
		String tourid=request.getParameter("tid");
		Integer id=null;
		if(tourid!=null&&tourid.trim().length()>0){
			id=Integer.parseInt(tourid);
		}
		//��dao
		TourDao td=new TourDaoImpl();
		int result=td.delete(id);
		//�ض���
		if(result>0){
			response.sendRedirect("ListTourSerl");
		}else{
			PrintWriter out=response.getWriter();
			out.print("<script>alert('ɾ��ʧ��');history.go(-1);</script>");
		}
	}

}
