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
        
		//1.����
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//������ҳ��ת����ҳ��õ����ݵı���
       
        //2.ȡֵ
        String page=req.getParameter("curPage");
        String flage=req.getParameter("flage");
        
        if(page!=null){
        	curPage=Integer.parseInt(page);
        }else{
        	System.out.println("pageΪ��");
        }
      
        
        //�����б��ҳչʾ����
        //3��Dao
        
        NewsInformationDaoImpl nidi = new NewsInformationDaoImpl();
        List<NewsInformation> alist =new ArrayList<NewsInformation>();
        //����һ������list ���ܵ���listNEwsInformation���ص�list��ֵ
        alist=nidi.listNewsInformation();
        req.setAttribute("newslist", alist);
        
        GoodListImpl gli=new GoodListDaoImpl() ;
      
        List<GoodList> list=gli.listGood(curPage, pageSize);
        //��servletȡ��ΪcurPage�ļ�������curPage��ֵ��jsp
        req.setAttribute("curPage", curPage);
        //3.1��ֵ
        req.setAttribute("list", list);
       
        //3.2��Ʒ����
        PictureMusicDaoImpl pmdi =new PictureMusicDaoImpl();
        List<PictureMusic> listPM = new ArrayList<PictureMusic>();
        listPM = pmdi.pictureMusic();
        req.setAttribute("listPM", listPM);
        //3.3
        DepartmenStoreDaoImpl dsdi =new DepartmenStoreDaoImpl();
        ArrayList<DepartmenStore> listDS= new ArrayList<DepartmenStore>();
        listDS =(ArrayList<DepartmenStore>) dsdi.departmenStore();
        req.setAttribute("listDS", listDS);
        //4.ת��
        req.getRequestDispatcher("index.jsp").forward(req, res);
        
        
	}
}