<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ include file="pagebil.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	<link href="css/selectMem.css" type="text/css" rel="stylesheet"/> 
		<title>会员信息情况</title>
	</head>
	<body>
		<table align="center">
			<tr class="beiJin">
				<th colspan="6">俱乐部会员信息</th>
			</tr>
			<tr class="beiJin">
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>家庭住址</th>
				<th>Email</th>
			</tr>
			<c:forEach var="mb" items="${list}">
			<tr>
				<td><a href="QueryIndSerl?mid=${mb.mid}">${mb.mid}</a></td>
				<td>${mb.mname}</td>
				<td>${mb.mgender }</td>
				<td>${mb.mage }</td>
				<td>${mb.maddress }</td>
				<td>${mb.memail }</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>
