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

import dao.impl.DepartmenStoreDaoImpl;
import dao.impl.DepartmenStoreImp;
import dao.impl.GoodListDaoImpl;
import dao.impl.GoodListImpl;
import dao.impl.NewsInformationDaoImpl;
import dao.impl.PictureMusicDaoImpl;
import entity.DepartmenStore;
import entity.GoodList;
import entity.NewsInformation;
import entity.PictureMusic;

public class DoIndex extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		int curPage =1;
        int pageSize= 8;
        
		//1.编码
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
       
        //2.取值
        String page=req.getParameter("curPage");
        String flage=req.getParameter("flage");
        
        if(page!=null){
        	curPage=Integer.parseInt(page);
        }else{
        	System.out.println("page为空");
        }
      
        
        //新闻列表分页展示功能
        //3调Dao
        
        NewsInformationDaoImpl nidi = new NewsInformationDaoImpl();
        List<NewsInformation> alist =new ArrayList<NewsInformation>();
        //申明一个集合list 接受到从listNEwsInformation返回的list的值
        alist=nidi.listNewsInformation();
        req.setAttribute("newslist", alist);
        
        GoodListImpl gli=new GoodListDaoImpl() ;
      
        List<GoodList> list=gli.listGood(curPage, pageSize);
        //从servlet取名为curPage的键名传出curPage的值给jsp
        req.setAttribute("curPage", curPage);
        //3.1赋值
        req.setAttribute("list", list);
       
        //3.2商品分类
        PictureMusicDaoImpl pmdi =new PictureMusicDaoImpl();
        List<PictureMusic> listPM = new ArrayList<PictureMusic>();
        listPM = pmdi.pictureMusic();
        req.setAttribute("listPM", listPM);
        //3.3
        DepartmenStoreDaoImpl dsdi =new DepartmenStoreDaoImpl();
        ArrayList<DepartmenStore> listDS= new ArrayList<DepartmenStore>();
        listDS =(ArrayList<DepartmenStore>) dsdi.departmenStore();
        req.setAttribute("listDS", listDS);
        //4.转发
        req.getRequestDispatcher("index.jsp").forward(req, res);
        
        
	}
}