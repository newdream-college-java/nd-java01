package com.cc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.imgl.Stu_infoDaoImgl;
import entity.Stu_info;


public class DoselectServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String params=getServletContext().getInitParameter("params");
		req.setCharacterEncoding(params);
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		String sid=req.getParameter("sid");
		int id=0;
    	if(sid!=null&&sid.trim().length()>0){
    	 	id = Integer.parseInt(sid);
    	}
		Stu_info stuinfo=new Stu_info();
		Stu_infoDaoImgl s=new Stu_infoDaoImgl();
		List<Stu_info> list=s.select(id);
    	if(list.size()>0){
    		req.setAttribute("list",list);
    		//2.跳转
    		req.getRequestDispatcher("OkselectServlet").forward(req, resp);
    	}else{
    		out.print("<script>alert('亲，查询的人不存在; 请重新输入编号！')</script>");
    	}
	}
	public static void main(String[] args) {
		DoselectServlet ds=new DoselectServlet();
	}
}
