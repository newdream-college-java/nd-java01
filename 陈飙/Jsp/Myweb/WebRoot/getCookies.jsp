<%@ page language="java" import="java.util.*,javax.servlet.http.Cookie" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>getCookies.jsp</title>



</head>

<body>
	<%
		//1.便利cookie数组对象
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			out.print(cookie.getName()+" "+cookie.getValue()+"<br/>");
			//out.print("密码："+cookie.getValue()+"<br/>");
			
			
		}
		
	%><br>
</body>
</html>
