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


		<title>登入</title>



	</head>

	<body>
		<%
			//得到addCookie发的数据
			Cookie[] cookies=request.getCookies();
			//String name=cookie[1].getValue();
			//String passwrod=cookie[2].getValue();
			String name=null;
			String password=null;
			for(Cookie cookie:cookies){
				if(cookie.getName().equals("name")){
					name=cookie.getValue();
				}
				if(cookie.getName().equals("password")){
					password=cookie.getValue();
				}
			}
			out.print("用户名："+name+"，"+"密码："+password);
		 %>
	</body>
</html>
