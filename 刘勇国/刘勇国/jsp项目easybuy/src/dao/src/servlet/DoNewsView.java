package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.NewsViewDaoImpl;
import entity.NewsView;



public class DoNewsView extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.编码
		res.setContentType("text/html;charset=utf-8");
//      HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
        
        //2.得到news-view.jsp的news_id
        String id=req.getParameter("newsId");
        int newsId =Integer.parseInt(id);
        
        //3.调Dao
        NewsViewDaoImpl nvdi =new NewsViewDaoImpl();
        List<NewsView> blist = new ArrayList<NewsView>();
		blist = nvdi.LookUpNewsView(newsId);
		
		//3.1赋值
		req.setAttribute("blist", blist);
		//4.转发
		//将赋值的集合blist发送给news-view.jsp；
		req.getRequestDispatcher("news-view.jsp").forward(req, res);
		
	}
}
