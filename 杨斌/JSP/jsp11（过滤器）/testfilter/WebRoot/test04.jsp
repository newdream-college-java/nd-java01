<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'test04.jsp' starting page</title>
    
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
    <form action="/testfilter/personData" method="post">
    	<table>
    		<tr>
    			<td>用户名：</td>
    			<td><input type="text" name="uname"/></td>
    		</tr>
    		<tr>
    			<td>性别：</td>
    			<td>
				<input type="radio" name="sex" value="男" checked="checked"/>男
				<input type="radio" name="sex" value="女"/>女
				</td>
    		</tr>
    		<tr>
    			<td>爱好：</td>
    			<td>
    			<input type="checkbox" name="hobby" value="篮球"/>篮球
    			<input type="checkbox" name="hobby" value="唱歌"/>唱歌
    			<input type="checkbox" name="hobby" value="rap"/>rap
    			</td>
    		</tr>
    		<tr>
    			<td>个人资料：</td>
    			<td>
    			<textarea rows="10" cols="50" name="ziliao" placeholder="请输入个人资料："></textarea>
    			</td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="提交"/></td>
    			<td>
    			
    			</td>
    		</tr>
    	</table>
    </form>
  </body>
</html>
