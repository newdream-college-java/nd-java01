<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'question.jsp' starting page</title>
    
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
    <form action="question_control.jsp" method="post">
    	<p align="center">问卷调查</p>
    	<table align="center">
    		<tr>
    			<td>昵称：</td> 	
    			<td><input type="text" name="nname"/></td> 	
    		</tr>
    		<tr>
    			<td>所在城市：</td> 	
    			<td><input type="text" name="city"/></td> 	
    		</tr>
    		<tr>
    			<td>开发语言：</td> 	
    			<td>
    				<input type="checkbox" name="laugh" value="JAVA"/>JAVA
    				<input type="checkbox" name="laugh" value="C"/>C
    				<input type="checkbox" name="laugh" value="C++"/>C++
    				<input type="checkbox" name="laugh" value="PHP"/>PHP
    			</td> 
    			
    		</tr>
    		<tr>
    		<td>
    			<input type="submit" value="提交"/>				
    		</td>
    			</tr>
    	</table>
    </form>
  </body>
</html>
