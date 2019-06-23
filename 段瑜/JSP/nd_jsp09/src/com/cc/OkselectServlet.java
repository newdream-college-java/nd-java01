package com.cc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Stu_info;



public class OkselectServlet extends HttpServlet{
	
	public static void main(String[] args) {
		OkselectServlet ok=new OkselectServlet();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpServletResponse resp1 = (HttpServletResponse)resp;
		 PrintWriter out = resp1.getWriter();
		 List<Stu_info> list=(List<Stu_info>)req.getAttribute("list");
	    	for(Stu_info info:list){
	    		System.out.print(info.getSid()+"\t"+info.getSname()+"\t"+info.getSage()+"\t"+info.getSbirthday());
	    	}
	    
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
	      out.write("\t"+list);
	      
		
	}
}
