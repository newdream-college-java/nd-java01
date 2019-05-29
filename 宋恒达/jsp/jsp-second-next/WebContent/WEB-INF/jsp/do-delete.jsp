<%@page import="com.song.dao.impl.StudentDaoImpl"%>
<%@page import="com.song.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		int id=Integer.parseInt(request.getParameter("id"));
		StudentDao studentDao=new StudentDaoImpl();
		boolean flag=studentDao.deleteStudent(id);
		if(flag){
			response.sendRedirect("delete-succuss");
		}else{
			out.print("删除失败！");
			out.print("<script>javaScript:alert('删除失败');location.href='to-delete';</script>");
		}
	%>
</body>
</html>