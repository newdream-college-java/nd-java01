package com.cc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.impl.NewsDaoImpl;
import com.cc.entity.News;

public class ListNewsSvl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.编码
        //2.取值
        int page = 1;
        int pageSize=2;
        //3.调dao
        List<News> news = new NewsDaoImpl().listNewsByPage(page, pageSize);
        //4.跳转
        req.setAttribute("news", news);
        req.getRequestDispatcher("news.jsp").forward(req,resp);
    }
}
