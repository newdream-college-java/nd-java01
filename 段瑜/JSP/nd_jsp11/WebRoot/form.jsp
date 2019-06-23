<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'fromjap.jsp' starting page</title>
    
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
    <form action="LikeServlet" method="post">
    	用户名：<input type="text" name="uname"/></br>
    	性别：<input type="radio" name="sex" value="男">男<input type="radio" name="sex" value="女">女</br>
    	兴趣爱好:<input type="checkbox" name="like" value="游泳"/>游泳
    		<input type="checkbox" name="like" value="爬山"/>爬山
    		<input type="checkbox" name="like" value="玩游戏"/>玩游戏</br>
    		<input type="submit" value="提交"/>
    </form>
  </body>
</html>
