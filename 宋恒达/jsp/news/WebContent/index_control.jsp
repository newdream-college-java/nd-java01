<%@page import="cn.song.dao.UserDao"%>
<%@page import="cn.song.dao.impl.UserDaoImpl"%>
<%@page import="cn.song.entity.User"%>
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
		String name=request.getParameter("uname");
		String pwd=request.getParameter("upwd");
		UserDaoImpl userDao=new UserDaoImpl();
		User user=new User();
		user.setUname(name);
		user.setUpwd(pwd);
		if(userDao.findUser(user)){
		//	Cookie cookie=new Cookie("name",name);
			session.setAttribute("uname", name);
			session.setAttribute("upwd", pwd);
		//	session.setMaxInactiveInterval(5);
		//	response.addCookie(cookie);
				
			response.sendRedirect("index.jsp");
		}else{
			out.print("<script>alert('登录失败，请重新登录！');location.href='index.jsp';</script>");
		}
	%>
</body>
</html>