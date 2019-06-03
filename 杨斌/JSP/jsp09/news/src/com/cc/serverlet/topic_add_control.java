package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.TopicDaoImp;

public class topic_add_control extends HttpServlet {

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
		response.setContentType("text/html;charset=utf-8");
		HttpServletResponse resp=response;
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("utf-8");
	  	String tname=request.getParameter("tname");
	  	TopicDaoImp td=new TopicDaoImp();
		boolean falg=td.getName(tname);
		if(falg){
			out.print("<script>javascript:alert('主题已经存在，请重新添加');location.href='topic_add.jsp'</script>");
		}else{
			int line=td.save(tname);
			String  message = line>0?"新增主题成功":"新增主题失败";
			out.print("<script>javascript:alert('"+message+"');location.href='topic_add.jsp'</script>");
		}
		
	}

}
