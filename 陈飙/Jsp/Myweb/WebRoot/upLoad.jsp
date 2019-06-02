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

<title>upLoad.jsp</title>



</head>

<body>
	<form action="upLoad_control.jsp" method="post" enctype="multipart/form-data">
		用户姓名:<input type="text" name="userName"><br> 上传头像1:<input
			name="file" class="opt_input" type="file" /><br> 上次头像2：<input
			name="file" class="opt_input" type="file" /><br> <input
			type="submit" value="提交">

	</form>
</body>
</html>
