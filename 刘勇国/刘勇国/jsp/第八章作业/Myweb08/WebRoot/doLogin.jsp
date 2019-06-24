<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doLogin.jsp' starting page</title>
    
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
    <% String user=request.getParameter("user");
    	String password=request.getParameter("password");  
    	if(user.equals("as")&&password.equals("123")){
    		Cookie cookie=new Cookie("user",user);
    		cookie.setMaxAge(5);
    		response.addCookie(cookie);
    		response.sendRedirect("welcome.jsp");
    	}else{
    		out.print("<script>alert('登录失败')</script>");
    		response.sendRedirect("login.jsp");
    	}
    %>
  </body>
</html>