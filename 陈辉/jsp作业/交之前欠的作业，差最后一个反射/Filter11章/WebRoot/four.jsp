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

		<title>four.jsp</title>

	</head>

	<body>
		<form action="FourServlet" method="post">
			n用户名：
			<input type="text" name="uname" />
			<br />
			性别:
			<input type="radio" name="sex" value="男" />
			男
			<input type="radio" name="sex" value="女" />
			女
			<br />
			爱好：
			<input type="checkbox" name="box" value="篮球">
			篮球
			<input type="checkbox" name="box" value="旅游">
			旅游
			<input type="checkbox" name="box" value="上网">
			上网
			<br/>
			<input type="submit" value="提交" />
		</form>
		<br>
	</body>
</html>
