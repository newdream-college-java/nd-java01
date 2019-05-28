<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    
    <title>addCookie.jsp</title>
    
	

  </head>
  
  <body>
    <%
    //1.创建保存
    Cookie cookie=new Cookie("username","Jack");
    Cookie cookie1=new Cookie("pwd","123");
    //2.响应给客服端
    
    
     response.addCookie(cookie);
    response.addCookie(cookie1);
    //3.跳转到getCookies.jsp
    response.sendRedirect("getCookies.jsp");
     %><br>
  </body>
</html>
