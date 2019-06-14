package com.cc.servlet.fore;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.entity.User;

public class LoginSvl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.获取用户填写的验证码
        String codeStr = req.getParameter("code");
        System.out.println("LogonSvl------code:"+codeStr);
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        //2.获取系统产生的验证码
        String orignCode = (String) req.getSession().getAttribute("code");
        System.out.println("LogonSvl------orignCode:"+orignCode);
        //3.验证验证码是否正确   abc  Abc
        if(codeStr.equalsIgnoreCase(orignCode)) {
           out.print( "<script>alert('验证码正确')</script>");
          //4.查询数据库---user对象
           User user= new User();
           user.setName("二狗子");
           //5.跳转到首页 （显示用户名）
           req.getSession().setAttribute("LogonUser", user);
           
        }else {
            out.print( "<script>alert('验证码不正确')</script>");
        }
    }
}
