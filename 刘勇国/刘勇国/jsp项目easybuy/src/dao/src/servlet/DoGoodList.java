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
		//1.����
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//������ҳ��ת����ҳ��õ����ݵı���
       
        //2.ȡֵ
        String page=req.getParameter("curPage");
        
        if(page!=null){
        	curPage=Integer.parseInt(page);
        }else{
        	//System.out.println("pageΪ��");
        }
      
        
        //�����б��ҳչʾ����
        //3��Dao
        GoodListImpl gli=new GoodListDaoImpl() ;    
        List<GoodList> list=gli.listGood(curPage, pageSize); 
        req.setAttribute("curPage", curPage);
        //3.1��ֵ
        req.setAttribute("list", list);
        //4.ת��
        req.getRequestDispatcher("product-list.jsp").forward(req, res);
        
        
	}
}
