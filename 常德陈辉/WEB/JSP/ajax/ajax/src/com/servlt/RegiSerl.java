package com.servlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegiSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		String name=request.getParameter("uname");
		//name=new String(name.getBytes("ios-8859-1"),"utf-8");
		name=URLDecoder.decode(name,"utf-8");
		PrintWriter out = response.getWriter();
		if(name.equals("³Â")||name.trim().length()<1){
			out.print(false);
		}else{
			out.print(true);
		}
	}

}
