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
		//1.编码
		res.setContentType("text/html;charset=utf-8");
//        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
		//2.取值
        //这个id从index.jsp页面传来79行?后的变量名
        String id=req.getParameter("id");
        
        int productViewId =Integer.parseInt(id);
     
        
        //3.调Dao
        ProductViewDaoImpl pvdi =new ProductViewDaoImpl();
        List arrlist=new ArrayList();
        arrlist=pvdi.showProductVew(productViewId);
        req.setAttribute("arrlist", arrlist);
        //4.转发给Product-view.jsp
        req.getRequestDispatcher("product-view.jsp").forward(req, res);
        
	}
}
