package com.cc.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cc.dao.imp.NewsDaoImp;
import com.cc.dao.imp.TopicDaoImp;

public class news_Add extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			request.setCharacterEncoding("utf-8");
			PrintWriter out=response.getWriter();
			String tname=request.getParameter("ntid");
		  	String ntitle=request.getParameter("ntitle");
		  	String nauthor=request.getParameter("nauthor");
		  	String ncontent=request.getParameter("ncontent");
		  	String nsummary=request.getParameter("nsummary");
		  	String filePath=request.getParameter("filePath");
		  	TopicDaoImp td=new TopicDaoImp();
		  	NewsDaoImp nd=new NewsDaoImp();
//		  	int id=Integer.parseInt(tname);
//			int line=nd.add(id, ntitle, nauthor,filePath, ncontent, nsummary);
//			String  message = line>0?"新增成功":"新增失败";
//			out.print("<script>javascript:alert('"+message+"');location.href='news_add.jsp'</script>");
		  	System.out.println(ncontent);
	}


}
