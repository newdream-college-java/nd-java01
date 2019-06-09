package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;

public class QueryIndSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����
		response.setContentType("text/html;charset=utf-8");
		//ȡֵ
		String rid = request.getParameter("mid");
		Integer pid=null;
		if(rid!=null&&rid.trim().length()>0){
			pid=Integer.parseInt(rid);
		}
		//��dao
		MembersinfoDao md=new MembersinfoDaoImpl();
		Membersinfo mbi=md.list(pid).get(0);
		request.setAttribute("mbi",mbi);
		//ת��
		request.getRequestDispatcher("modify_mem.jsp").forward(request, response);
	}

}
