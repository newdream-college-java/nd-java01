package com.cc.serverlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.NewsDaoImp;
import com.cc.dao.imp.TopicDaoImp;
import com.cc.entity.News;

public class index_controls extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String curpage=request.getParameter("curPage");
	    int cpage=1;
	    int pageSize=10;
	    if(curpage!=null){
	     	cpage=Integer.parseInt(curpage);
	    }
	    NewsDaoImp nd=new NewsDaoImp();
	    News nes=new News();
	    int count=nd.count(pageSize);
	    List li=nd.list(cpage, pageSize);
	    List<String> alist=new TopicDaoImp().list();
	    if(li.size()>0){
	      request.setAttribute("li", li);
	      request.setAttribute("count",count);
	      request.setAttribute("pageSize",pageSize);
	      request.setAttribute("cpage", cpage);
	      request.setAttribute("alist", alist);
	      request.getRequestDispatcher("index.jsp").forward(request, response);
	    }else{
	    	response.sendRedirect("index_controls.jsp");
	    }
	}

}
