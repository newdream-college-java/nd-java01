package com.yb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.PcnuserDaoImpl;
import com.yb.entity.Pcnuser;

public class PcnuserSaveServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4673822447655692062L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		req.setCharacterEncoding("utf-8");
		String userName= req.getParameter("userName");
		String pwd= req.getParameter("passWord");
		String email= req.getParameter("email");
		String sms= req.getParameter("sms");
		String site= req.getParameter("site");
		String qq= req.getParameter("qq");
		String Radio= req.getParameter("RadioGroup1");
		String bbname= req.getParameter("bbname");
		System.out.println(Radio);
		int bbsex = 0;
		if(Radio!=null){			
			bbsex=Integer.parseInt(Radio);
		}
		Pcnuser pu=new Pcnuser();
		pu.setBbname(bbname);
		pu.setBbsex(bbsex);
		pu.setPcnuEmail(email);
		pu.setPcnuName(userName);
		pu.setPcnuNumber(sms);
		pu.setPcnuPassword(pwd);
		pu.setPcnuSite(site);
		pu.setQq(qq);
		PcnuserDaoImpl pd=new PcnuserDaoImpl();
		int result=-1;
		result=pd.save(pu);
		PrintWriter out=resp.getWriter();
		if(result>0){
			resp.sendRedirect("denglu.jsp");
		}else{
			out.write("<script>alert('×¢²áÊ§°Ü ?);location.href='zhuce.jsp';</script>");
		}
	}
}
