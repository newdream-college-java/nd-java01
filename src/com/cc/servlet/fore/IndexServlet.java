package com.cc.servlet.fore;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.impl.ProductDaoImpl;
import com.cc.entity.Product;

public class IndexServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 编码
        //2.取值
        int page = 1;
        int pageSize = 8;
        //3.调dao
        //3.1 查询商品表
        List<Product> products = new ProductDaoImpl().listByPage(page, pageSize);
      //3.2 查询新闻表
      //3.3 查询分类表
        //4.跳转
        if(products.size()>0) {
            req.setAttribute("pros", products);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
        
        
        
    }
}
