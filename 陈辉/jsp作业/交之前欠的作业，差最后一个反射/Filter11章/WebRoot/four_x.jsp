<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'four_x.jsp' starting page</title>

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
		登录成功
		<br>
		用户名为：${uname}
		<br>
		性别为：${sex}
		<br />
		爱好为：
		<c:forEach var="c" items="${list}">
			<c:out value="${c}"></c:out>
		</c:forEach>



		<!--<c:forEach var="box" items="${paramValues.box}" varStatus="indexStat">
			<c:out value="${box}"></c:out>
			<br />
		</c:forEach>
	-->
	</body>
</html>
