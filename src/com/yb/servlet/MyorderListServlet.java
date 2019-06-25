package com.yb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.MyorderDaoImpl;
import com.yb.vo.Myorder;

public class MyorderListServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -100200309677910785L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1、编 ?
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//2、取 ?
		String uapg=req.getParameter("apg");
		String pcnuid=req.getParameter("pcnuid");
    	int apg=1; 
    	int bpg=3;
    	int id=0;
    	if(uapg!=null){
    		apg=Integer.parseInt(uapg);
    	}
    	if(pcnuid!=null){
    		id=Integer.parseInt(pcnuid);
    	}
    	//3、调Dao
    	MyorderDaoImpl md=new MyorderDaoImpl();
    	List<Myorder> list=md.list(apg,bpg,id);
    	int count=md.count(bpg);
    	PrintWriter out=resp.getWriter();
    	//4、转 ?
    	if(list.size()>0){
    		req.setAttribute("count", count);
    		req.setAttribute("apg",apg);
    		req.setAttribute("Mylist",list );
    		req.getRequestDispatcher("wddd.jsp").forward(req, resp);
    	}else{
    		out.write("<script>alert('加载失败');history.go(-1);</script>");
    	}
	}
}
