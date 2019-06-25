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


public class PcnuseListServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6808281076713679401L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String codes=request.getParameter("codes");
		HttpSession session = request .getSession();
		String code=(String) session.getAttribute("code");
		PrintWriter out=response.getWriter();
		if(codes.equals(code)){
			String uname=request.getParameter("telphone");
			String pwd=request.getParameter("password");
			PcnuserDaoImpl pd=new PcnuserDaoImpl();
			List<Pcnuser> list=pd.list(uname, pwd);
			if(list.size()>0){
				session.setAttribute("list", list);
				response.sendRedirect("IndexShowServlet");
			}else{
				out.print("<script>javascript:alert('µÇÂ¼Ê§°Ü');history.go(-1)</script>");
			}
		}else{
			out.print("<script>javascript:alert('ÑéÖ¤Âë´íÎó');history.go(-1)</script>");
		}
		
	}
}
