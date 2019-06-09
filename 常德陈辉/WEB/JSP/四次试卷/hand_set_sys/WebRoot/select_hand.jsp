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
		<title>手机信息</title>
		<link type="text/css" href="css/select_hand.css" rel="stylesheet"/>
	</head>
	
	<body>
		<table border=1 align="center" cellspacing="0px">
			<tr>
				<th colspan="3" class="head">手机信息</th>
			</tr>
			<tr>
				<th>品牌型号</th>
				<th>参考报价</th>
				<th>操作</th>
			</tr>
			<c:forEach var="hd" items="${list}">
				<tr>
					<td>${hd.namet}</td>
					<td>${hd.price}</td>
					<td>
						<a href="SelectHandSel?hid=${hd.hid}">详情</a>&nbsp;&nbsp;
						<a href="javascript:if(confirm('确定要删除吗？')){location.href='FindByIdServlet?hid=${hd.hid}';}else{location.href='QueryHandSetServlet';}">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
