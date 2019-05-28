<%@ page language="java" import="java.util.*,javax.servlet.http.*" pageEncoding="utf-8"%>
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
    	//创建2个Cookie，分别存放用户的账号和密码
    	Cookie uCookie = new Cookie("uname","Jack");
    	Cookie pCookie = new Cookie("pwd","123456");
    	//将创建的2个Cookie加入到总Cookie中
    	response.addCookie(uCookie);
    	response.addCookie(pCookie);
    	
    	//重定向到getCookies.jsp
   	 	response.sendRedirect("getCookies.jsp");
     %>
  </body>
</html>
