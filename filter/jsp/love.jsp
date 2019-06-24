<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'love.jsp' starting page</title>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <form action="Servlet" method="post">
	  用户名：<input type="text" name="name"/> <br/>
	  性别：<input type="radio" name="sex" value="男"/>&nbsp;<input type="radio" name="sex" value="女"/>
	  爱好：吃<input type="checkbox" name="hobby" value="吃"/>&nbsp;喝<input type="checkbox" name="hobby" value="喝"/>
	  &nbsp;玩<input type="checkbox" name="hobby" value="玩"/>&nbsp;乐<input type="checkbox" name="hobby" value="了"/><br/>
	  个人资料：<textarea name="information" rows="" cols=""></textarea>
	  <input type="submit" /> 
  </form>
  </body>
</html>
