package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.Severity;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cc.dao.imp.News_usersDaoImp;

public class index_control extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
		ServletContext application=this.getServletContext();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
	  	String uname=request.getParameter("uname");
	  	String upwd=request.getParameter("upwd");
	  	News_usersDaoImp td=new News_usersDaoImp();
	  	Set<String> loginedUsers=new HashSet<String>();
	  	if(application.getAttribute("loginusers")!=null){
	  		loginedUsers=(Set<String>)application.getAttribute("loginusers");
	  	}
		boolean falg=td.getName(uname,upwd);
		if(falg){
			loginedUsers.add(uname);
			session.setAttribute("uname",uname);
			application.setAttribute("loginusers", loginedUsers);
			response.sendRedirect("index_controls.jsp");
		}else{		
			out.print("<script>javascript:alert('µÇÂ¼Ê§°Ü£¬ÇëÖØÐÂµÇÂ¼');location.href='index.jsp'</script>");
		}

	}

}
