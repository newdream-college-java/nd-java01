package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.HttpServer;

import dao.impl.GoodListDaoImpl;
import dao.impl.GoodListImpl;
import dao.impl.ProductViewDaoImpl;
import entity.GoodList;

public class DoGoodList extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		int curPage =1;
        int pageSize= 3;
		//1.编码
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
       
        //2.取值
        String page=req.getParameter("curPage");
        
        if(page!=null){
        	curPage=Integer.parseInt(page);
        }else{
        	//System.out.println("page为空");
        }
      
        
        //新闻列表分页展示功能
        //3调Dao
        GoodListImpl gli=new GoodListDaoImpl() ;    
        List<GoodList> list=gli.listGood(curPage, pageSize); 
        req.setAttribute("curPage", curPage);
        //3.1赋值
        req.setAttribute("list", list);
        //4.转发
        req.getRequestDispatcher("product-list.jsp").forward(req, res);
        
        
	}
}
