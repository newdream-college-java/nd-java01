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
		request.setCharacterEncoding("utf-8");
		Cookie[] cookies=request.getCookies();
		String name=null;
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("name")){
				name=cookie.getValue();
			}
		}
		if(name!=null){
			out.print("欢迎你："+name);
		}else{
			out.print("抱歉！您已超时退出，请重新返回<a href='login.jsp'>登录</a>");
		}
	%>
</body>
</html>