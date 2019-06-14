package com.cc.servlet.fore;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cc.dao.impl.ProductDaoImpl;
import com.cc.entity.Product;

public class AddCarSvl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.编码
        //2.取值
        String pidStr = req.getParameter("pid");
        if(pidStr!=null&&pidStr.trim().length()>0) {
          //3.将商品放到session中（调dao）
            int pid = Integer.parseInt(pidStr);
            //3.1根据传过里商品id 查询该商品
            Product product = new ProductDaoImpl().findById(pid);
            //3.2放入购物车：session
            HttpSession session = req.getSession();
            //3.3 将商品放入集合(list(不能自动去重) ,set(自动去重), map(自动去重）)
            Set<Product> set =(Set<Product>) session.getAttribute("car");
            
            if(set!=null) {//不是第1次添加商品到购物车
                boolean flag = true;//假设不存在
                for(Product tmp :set) {
                    if(tmp.equals(product)) {
                        flag = false;
                        tmp.setCount(tmp.getCount()+1);
                    }
                }
                if(flag) {
                    set.add(product);
                }
            }else {//第一次 添加商品到购物车
                set=new HashSet<Product>(5);
                set.add(product);
                session.setAttribute("car", set);
            }
            //session.setAttribute("car", product);
            //4.跳转
            resp.sendRedirect("shopping.jsp");
        }else {
            //TODO  当没有传过来id的时候
        }
        
    }
}
