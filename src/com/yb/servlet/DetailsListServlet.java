package com.yb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.DetailsDaoImpl;
import com.yb.vo.details;

public class DetailsListServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5751018614814225792L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1、编 ?
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		//2、取 ?
		String id=req.getParameter("id");
    	int pcni_id=0;

    	if(id!=null&&id.trim().length()>0){
    		pcni_id=Integer.parseInt(id);
    	}
    	//3、调Dao
    	DetailsDaoImpl dd=new DetailsDaoImpl();
    	List<details> list=dd.list(pcni_id);
    	PrintWriter out=resp.getWriter();
    	//4、转 ?
    	if(list.size()>0){
    		req.setAttribute("Dtlist",list );
    		req.getRequestDispatcher("ddxq.jsp").forward(req, resp);
    	}else{
    		out.write("<script>alert('加载失败');history.go(-1);</script>");
    	}
	}
}

