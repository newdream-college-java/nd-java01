<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>doLogin.jsp</title>



</head>

<body>
	<%
		//1.编码
		request.setCharacterEncoding("utf-8");
		//2.取值
		String name = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		//3.掉dao
		//模拟
		if (name.equals("abc") && pwd.equals("123")) {
			//登录成功----将登录人的信息保存cookie//此时是dologin服务器保存信息并响应
			Cookie cookie = new Cookie("uname", name);
			cookie.setMaxAge(60 * 30);//设置cookie30分钟后失效
			response.addCookie(cookie);
		}
		//4.跳转//响应跳转到index.jsp中
		response.sendRedirect("index.jsp");
		//模拟带数据过去转发带数据
		//request.setAttribute("uname", name);
		//request.getRequestDispatcher("index.jsp").forward(request, response);
	%>

	<br>
</body>
</html>
