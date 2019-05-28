<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>练习二</title>

	</head>

	<body>
		<form action="doLogin.jsp" method="post">
			用户名：<input type="text" name="uname"/>
			密码:<input type="password" name="pwd"/>
			<input type="submit" value="登入">
		</form>
	</body>
</html>
