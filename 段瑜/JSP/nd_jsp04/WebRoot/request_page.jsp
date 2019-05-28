<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'request_page.jsp' starting page</title>
    
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
    <form action="request_show.jsp" method="post">
    	<table>
    	<tr><td colspan="3">请输入您的兴趣爱好:</td></tr>
    	<tr>
    	<td colspan="3">
    		<input type="checkbox" name="like" value="篮球"/>篮球
    		<input type="checkbox" name="like" value="足球"/>足球
    		<input type="checkbox" name="like" value="电影"/>电影
    		<input type="checkbox" name="like" value="游戏"/>游戏
		</td>
		</tr>
    	<tr><td><input type="submit" value="提交"/></td></tr>
    	</table>
    </form>
  </body>
</html>
