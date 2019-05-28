<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'getCookies.jsp.jsp' starting page</title>
    
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
    	Cookie[] cookies=request.getCookies();
    	String uname=null;
    	String upwd=null;
    	for(Cookie cookie:cookies){
    		if(cookie.getName().equals("uname")){
    			uname=cookie.getValue();
    		}
    		if(cookie.getName().equals("upwd")){
    			upwd=cookie.getValue();
    		}
    	}
    	out.println("用户名："+uname+"&nbsp&nbsp&nbsp&nbsp密码："+upwd);
     %>
  </body>
</html>
