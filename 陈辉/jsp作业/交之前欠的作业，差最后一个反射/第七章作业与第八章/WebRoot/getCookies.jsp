<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>   
    <title>My JSP 'getCookies.jsp' starting page</title>
    
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
  		Cookie user=null;
  		Cookie password=null;
	  		for(Cookie cookie:cookies){
		  		if(cookie.getName().equals("user")){
		  			user=cookie;
		  		}
		  		if(cookie.getName().equals("psssword")){
		  			password=cookie;
		  		}		  		
	  		}  		
  		%>
  		用户名：<%=user.getValue()%>
  		密码：<%=password.getValue()%>
  </body>
</html>