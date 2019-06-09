package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TourDao;
import com.dao.impl.TourDaoImpl;
import com.entity.Tour;

public class AddTourSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//ȡֵ
		String city=request.getParameter("ucity");
		String place=request.getParameter("uplace");
		String time=request.getParameter("utime");
		String note=request.getParameter("unote");
		//��dao
		Tour tu=new Tour(city,place,time,note);
		TourDao td=new TourDaoImpl();
		int result = td.insert(tu);
		PrintWriter out = response.getWriter();
		if(result>0){
			out.print("<script>if(confirm('��ӳɹ����Ƿ��ѯ��')){location.href='ListTourSerl';}else{location.href='insert_tour.jsp';}</script>");
		}else{
			out.print("<script>alert('���ʧ��');history.go(-1);</script>");
		}
		
	}

}
