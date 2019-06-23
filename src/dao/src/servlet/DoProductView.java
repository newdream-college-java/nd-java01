package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.ProductViewDaoImpl;

public class DoProductView extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		//1.����
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//������ҳ��ת����ҳ��õ����ݵı���
		//2.ȡֵ
        //���id��index.jspҳ�洫��79��?��ı�����
        String id=req.getParameter("id");
        
        int productViewId =Integer.parseInt(id);
     
        
        //3.��Dao
        ProductViewDaoImpl pvdi =new ProductViewDaoImpl();
        List arrlist=new ArrayList();
        arrlist=pvdi.showProductVew(productViewId);
        req.setAttribute("arrlist", arrlist);
        //4.ת����Product-view.jsp
        req.getRequestDispatcher("product-view.jsp").forward(req, res);
        
	}
}
