<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'particulars.jsp' starting page</title>
    
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
    <table align="center">
  
    <c:forEach var="z" items="${list}">
    	<tr>
    		<td colspan="2" align="center">${z.name_type }</td>
    	</tr>
    	<tr>
    		<td>参考报价：</td>
    		<td>${z.price}</td>
    	</tr>
    	<tr>
    		<td>网络模式：</td>
    		<td>${z.nerwork_mode}</td>
    	</tr>
    	<tr>
    		<td>网络类型：</td>
    		<td>${z.network_type}</td>
    	</tr>
    	<tr>
    		<td>外观设计：</td>
    		<td>${z.facade}</td>
    	</tr>
    	<tr>
    		<td>主屏尺寸：</td>
    		<td>${z.screeen_size}</td>
    	</tr>
    	<tr>
    		<td>触摸屏：</td>
    		<td>${z.feel_screen}</td>
    	</tr> 
    	<tr>
    		<td></td>
    		<td align="right"><a href="QueryHandSetServlet">返回</a></td>
    	</tr>  
    	</c:forEach> 	
    </table>
  </body>
</html>
