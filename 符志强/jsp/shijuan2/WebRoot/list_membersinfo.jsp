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
    
    <title>会员信息情况</title>
    
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
 
   <table align="center" width="500" border="1">
   <tr>
   		<td colspan="6" align="center">
   			俱乐部会员信息
   		</td>
   	</tr>
   	<tr>
   		<td>编号</td>
   		<td>姓名</td>
   		<td>性别</td>
   		<td>年龄</td>
   		<td>地址</td>
   		<td>Email</td>
   		<td>操作</td>
   	</tr>
   	<c:forEach var="cx" items="${list}">
   	<tr>
   		<td>${cx.id }</td>
   		<td>${cx.uname }</td>
   		<td>${cx.usex}</td>
   		<td>${cx.uage }</td>
   		<td>${cx.udizhi }</td>
   		<td>${cx.uemail }</td>
   		<td>
			<a href="EditMembersInfoServlet?id=${cx.id}">修改</a>
			<a href="#">删除</a>
		</td>
   	</tr>
   	</c:forEach>
   </table>

  </body>
</html>
