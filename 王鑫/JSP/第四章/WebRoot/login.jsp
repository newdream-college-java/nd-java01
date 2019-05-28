<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登陆</title>
    
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
  	<!--
  		创建一个表单对用户输入的数据进行判断 传输方式为post
  		get：传输数据量小于1024byte,地址栏会出现发送的数据(例如：用户名和密码)
  		post：传递的数据量不受限制，安全性能较高，对信息进行了隐藏，一般在开发中采用post。
  	-->
    <form action="doLogin.jsp" method="post">
    	用户名：<input type="text" name="uname"/>
    	密码：<input type="password" name="pwd"/>
		<input type="submit" value="提交"/>    
    </form>
  </body>
</html>
