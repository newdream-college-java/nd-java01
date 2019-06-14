package com.cc.servlet.fore;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.impl.ProductDaoImpl;
import com.cc.entity.Product;

public class AddOrderSvl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //1. 编码
        //2.取值
        String pidStr = req.getParameter("pid");
        int pid = -1;
        if(pidStr!=null&&pidStr.trim().length()>0) {
            pid= Integer.parseInt(pidStr);
        }else {
            //TODO 
        }
        //3.调dao:下单
        
         //4.跳转
        
        
    }
}
