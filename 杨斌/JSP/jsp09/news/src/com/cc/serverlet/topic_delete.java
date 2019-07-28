package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.TopicDaoImp;

public class topic_delete extends HttpServlet {

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
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		int tid=Integer.parseInt(request.getParameter("tid"));
   		TopicDaoImp td=new TopicDaoImp();
   		int result=td.delete(tid);
   		if(result>0){
   			out.print("<script>alert('É¾³ý³É¹¦');location.href='topic_list_control.jsp';</script>");
   		}else{
   			out.print("<script>alert('É¾³ýÊ§°Ü');location.href='topic_list_control.jsp'<script>");
   		}
	}

}
