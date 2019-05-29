<%@page import="com.song.entity.Student"%>
<%@page import="com.song.dao.impl.StudentDaoImpl"%>
<%@page import="com.song.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>注册中。。。</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		StudentDao studentDao=new StudentDaoImpl();
		Student student=new Student();
		student.setName(name);
		student.setAge(age);
		boolean flag=studentDao.saveStudent(student);
		//boolean flag=false;
		if(flag){
			response.sendRedirect("add-succuss");
		}else{
			out.print("注册失败！");
			out.print("<script>javaScript:alert('注册失败');location.href='index.jsp';</script>");
		}
	%>
</body>
</html>