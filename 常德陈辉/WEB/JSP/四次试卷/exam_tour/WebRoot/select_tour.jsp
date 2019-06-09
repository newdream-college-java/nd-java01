<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>查看所有旅游经历</title>
		<link type="text/css" href="css/select_tour.css" rel="stylesheet"/>
	</head>

	<body>
		<table align="center" border=1>
			<tr class="title">
				<th colspan="6">查看所有旅游经历</th>
			</tr>
			<tr class="head">
				<th>编号</th>
				<th>国家/城市</th>
				<th>区域/景点</th>
				<th>旅游时间</th>
				<th>经历记录</th>
				<th>操作</th>
			</tr>
			<c:forEach var="tu" items="${list}">
				<tr >
					<td>${tu.tourid }</td>
					<td>${tu.tourCity }</td>
					<td>${tu.tourPlace }</td>
					<td>${tu.tourTime }</td>
					<td>${tu.tourNote }</td>
					<td class="delete"><a href="DeleteTourSerl?tid=${tu.tourid }">删除</a></td>
				</tr>
			</c:forEach>
			<tr>
				<th colspan="6" align="left" class="bottom"><a href="insert_tour.jsp">创建旅游经历</a></th>
			</tr>
		</table>
	</body>
</html>
