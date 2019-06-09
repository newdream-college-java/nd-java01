package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;

public class ModifyMemSerl extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//取值
		String qid=request.getParameter("uid");
		String qname=request.getParameter("uname");
		String qsex=request.getParameter("usex");
		String qage=request.getParameter("uage");
		String qaddress=request.getParameter("uaddress");
		String qemail=request.getParameter("uemail");
		Integer id=null;
		Integer age=null;
		if(qid!=null&&qid.trim().length()>0){
			id=Integer.parseInt(qid);
		}
		if(qage!=null&&qage.trim().length()>0){
			age=Integer.parseInt(qage);
		}
//		request.setAttribute("a", qemail);
//		request.getRequestDispatcher("index.jsp").forward(request, response);
		//调dao
		Membersinfo mb=new Membersinfo();
		mb.setMid(id);
		mb.setMaddress(qaddress);
		mb.setMage(age);
		mb.setMemail(qemail);
		mb.setMgender(qsex);
		mb.setMname(qname);
		MembersinfoDao mbd=new MembersinfoDaoImpl();
		int result=mbd.Update(mb);
		//重定义
		PrintWriter out=response.getWriter();
		if(result>0){
			out.print("<script>alert('修改成功');location.href='MemServlet';</script>");
		}else{
			out.print("<script>alert('修改失败');history.go(-1);</script>");
		}
	}

}
