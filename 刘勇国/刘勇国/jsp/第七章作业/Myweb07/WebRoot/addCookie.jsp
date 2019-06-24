<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addCookie.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <%
    //创建2个Cookie
    Cookie cookie1=new Cookie("uname","LiuYang");
    Cookie cookie2=new Cookie("psw","5942353");
    
    //2.将cookie发送客户端
    response.addCookie(cookie1);
    response.addCookie(cookie2);
    //3.跳转到showCookie.jsp
    response.sendRedirect("getCookies.jsp");
     %>
  </body>
</html>