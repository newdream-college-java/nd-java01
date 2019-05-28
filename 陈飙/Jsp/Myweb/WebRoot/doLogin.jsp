<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
    <title>doLogin.jsp</title>
    
	

  </head>
  
  <body>
  <%
  //1.编码
  request.setCharacterEncoding("utf-8");
  //2.取值
  String name=request.getParameter("username");
  String pwd=request.getParameter("pwd");
  //3.判断
  if(name.equals("sa")&&pwd.equals("123")){
  	Cookie cookie=new Cookie("uname",name);
  	cookie.setMaxAge(5);
  	response.addCookie(cookie);
  	response.sendRedirect("welcome.jsp");
  }else{
  	out.print("<script>alert('登录失败')</script>");
    		response.sendRedirect("Login.jsp");
  }
  //response.sendRedirect("welcome.jsp");
  //4.跳转
   %> <br>
  </body>
</html>
