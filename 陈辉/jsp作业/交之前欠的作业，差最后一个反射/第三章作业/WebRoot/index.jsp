<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>index.jsp</title>

</head>

<body>
	
	亲，<%//此时的inde.jsp相当于一个展示的jsp,不是服务器。
	//获取cookie文件带的值//模拟的时候reques是带数据过来的
	Cookie[] cookies = request.getCookies();
	Cookie loginCookie = null;
	//增强for Cookie  类型  cookie变量用来存放找到的值放入，cookies数组，被查找的
	for (Cookie cookie : cookies) {
		if (cookie.getName().equals("uname")) {
			loginCookie = cookie;
		}
	}
	out.print(loginCookie.getValue());
%>欢迎你进入中国银行后台系统！~！！！
	<br>
</body>
</html>
