package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.SpUserDao;
import com.cc.dao.impl.SpUserDaoImpl;
import com.cc.entity.SpUser;

public class LoginSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String rname=request.getParameter("uname");
		String rpwd=request.getParameter("upwd");
		SpUserDao sud=new SpUserDaoImpl();
		Integer pwd=null;
		PrintWriter out = response.getWriter();
		if(rname!=null&&rname.trim().length()>0&&rpwd!=null&&rpwd.trim().length()>0){
			pwd=Integer.parseInt(rpwd);
			SpUser su=sud.list(rname, pwd).get(0);
			if(su!=null){
				request.setAttribute("su", su);
				request.getRequestDispatcher("vip.jsp").forward(request, response);
			}else{
				out.print("<script>alert('用户名和密码不正确');history.go(-1);</script>");
			}
		}else{
			out.print("<script>alert('用户名和密码不能为空');history.go(-1);</script>");
		}
		
	}

}
