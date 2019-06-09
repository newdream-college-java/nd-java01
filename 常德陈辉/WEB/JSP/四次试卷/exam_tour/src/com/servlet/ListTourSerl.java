package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.TourDao;
import com.dao.impl.TourDaoImpl;
import com.entity.Tour;

public class ListTourSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//ȡֵ
		//��dao
		TourDao td=new TourDaoImpl();
		List<Tour> list=td.list();
		//ת��
		request.setAttribute("list", list);
		request.getRequestDispatcher("select_tour.jsp").forward(request, response);
		
	}

}
