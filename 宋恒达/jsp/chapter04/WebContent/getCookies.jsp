<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("name")){
				out.print("用户名:"+cookie.getValue());
			}else if(cookie.getName().equals("password")){
				out.print("密码:"+cookie.getValue());
			}
 		}
	%>
</body>
</html>