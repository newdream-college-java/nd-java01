<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
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
     	for(Cookie cookie:cookies){
     		if(cookie.getName().equals("user")){
     			user=cookie;
     			
     		}   	
     	}
     	if(user!=null){
     		out.print("欢迎你:"+user.getValue());  		
     	}else{
     		out.print("抱歉！您已超时退出，请重新<a href='login.jsp'>登录</a>");  
     	}
      %>
  </body>
</html>