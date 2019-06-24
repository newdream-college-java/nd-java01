<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

		<title>My JSP 'filter05.jsp' starting page</title>



	</head>

	<body>
		<form action="invalide.jsp" method="post">
        王者1：<input type="text" name="code"/>
        <br/><input type="submit" value="发送"/>
    </form>
		<br>
	</body>
</html>
