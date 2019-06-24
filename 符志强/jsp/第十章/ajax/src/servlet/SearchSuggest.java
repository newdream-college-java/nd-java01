package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.UsersDaoImpl;
import entity.Users;

public class SearchSuggest extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("uname");
		System.out.println(uname+"1");
		uname=URLDecoder.decode(uname,"utf-8");
		System.out.println(uname+"2");
		UsersDaoImpl u=new UsersDaoImpl();
//		System.out.println(u+"3");
//		String a=u.list(uname);
//		System.out.println(a+"4");
		System.out.println(u.list(uname));
		out.println(u.list(uname));
	}

}
