package com.cc;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ToselectServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		HttpServletResponse resp1 = (HttpServletResponse)resp;
		 PrintWriter out = resp1.getWriter();
	      out.write("<html>\r\n");
	      out.write("  <head>\r\n");
	      out.write("    <base href=\"");
	      out.write("\">\r\n");
	      out.write("    \r\n");
	      out.write("    <title>My JSP 'login.jsp' starting page</title>\r\n");
	      out.write("    \r\n");
	      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
	      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
	      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
	      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
	      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
	      out.write("\t<!--\r\n");
	      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
	      out.write("\t-->\r\n");
	      out.write("\r\n");
	      out.write("  </head>\r\n");
	      out.write("  \r\n");
	      out.write("  <body>\r\n");
	      out.write("    \r\n");
	      out.write("    <form action=\"doselectServlet\" method=\"post\"> \n");
	      out.write("    \t≤È—ØID£∫<input type=\"text\" name=\"sid\" />\r\n<br/>\r\n");
	      out.write("    \t<input type=\"submit\" value=\"≤È—Ø\"/>\r\n");
	      out.write("    </form>\r\n");
	}
}
