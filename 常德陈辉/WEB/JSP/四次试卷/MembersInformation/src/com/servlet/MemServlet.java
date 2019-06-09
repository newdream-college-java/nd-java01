package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;


public class MemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		MembersinfoDao md=new MembersinfoDaoImpl();
		List<Membersinfo> list=md.list(null);
		request.setAttribute("list", list);
		request.getRequestDispatcher("SelectMem.jsp").forward(request, response);
	}

}
