
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>session.jsp</title>
    
	

  </head>
  
  <body>
  <a href="session01.jsp">我要跳到session01.jsp01</a>
    <%
   //Session session=new Session(); 
  //jsp之间的数据传递：
  session.setAttribute("one", "好人");
  session.setAttribute("two", "男人");
  
  //方式一：转发
  //request.setAttribute("three", "女人");
  //request.getRequestDispatcher("session02.jsp").forward(request, response);
  %>
  <br>
  </body>
</html>
