<%@page import="com.song.entity.Student"%>
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
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		int id=Integer.parseInt(request.getParameter("id"));
		Student student=new Student();
		student.setName(name);
		student.setAge(age);
		StudentDao studentDao=new StudentDaoImpl();
		boolean flag=studentDao.updateStudent(id, student);
		if(flag){
			response.sendRedirect("update-succuss");
		}else{
			out.print("修改失败！");
			out.print("<script>javaScript:alert('修改失败');location.href='to-update';</script>");
		
		}
	%>
</body>
</html>