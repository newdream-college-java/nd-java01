package com.yb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yb.dao.impl.PcnuserDaoImpl;
import com.yb.entity.Pcnuser;


public class PcnuserSelectServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4184864236493110839L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String pcnuid=req.getParameter("pcnuid");
		int id=0;
		if(pcnuid!=null){
			id=Integer.parseInt(pcnuid);
		}
		PcnuserDaoImpl pd=new PcnuserDaoImpl();
		List<Pcnuser> list=pd.select(id);
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		if(list.size()>0){
			session.setAttribute("list", list);
			resp.sendRedirect("dd_zl.jsp");
		}else{
			out.write("<script>alert('ÐÞ¸ÄÊ§°Ü ?);history.go(-1);</script>");
		}	
	}
}
