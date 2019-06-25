package com.yb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.PcnuserDaoImpl;
import com.yb.entity.Pcnuser;


public class PcnuserUpdateServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1111017834908792435L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String sms=req.getParameter("sms");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		String uname=req.getParameter("uname");
		String pcnuid=req.getParameter("pcnuid");
		int id=0;
		if(pcnuid!=null){
			id=Integer.parseInt(pcnuid);
		}
		Pcnuser pu=new Pcnuser();
		pu.setPcnuEmail(email);
		pu.setPcnuNumber(sms);
		pu.setPcnuPassword(pwd);
		pu.setPcnuName(uname);
		pu.setPcnuId(id);
		PcnuserDaoImpl pd=new PcnuserDaoImpl();
		int result=pd.update(pu);
		PrintWriter out=resp.getWriter();
		req.setAttribute("pcnuid", pcnuid);
		if(result>0){
			req.getRequestDispatcher("pcnuserSelectServlet").forward(req, resp);
		}else{
			out.write("<script>alert('会员信息修改失败');history.go(-1);</script>");
		}
	}
}