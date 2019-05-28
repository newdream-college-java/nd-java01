<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>


		<title>Cookie</title>

	</head>

	<body>
		<%
			//创建cookie保存数据
			Cookie ck1=new Cookie("name","ChenHui");
			Cookie ck2=new Cookie("password","123");
			//将cookie发送客户端
			response.addCookie(ck1);
			response.addCookie(ck2);
			//跳转到getcookies.jsp
			response.sendRedirect("getcookies.jsp");
		%>
	</body>
</html>
