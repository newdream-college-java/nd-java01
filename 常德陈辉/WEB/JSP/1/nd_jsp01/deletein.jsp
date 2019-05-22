<%@ page language="java" import="java.util.*,student.entity.*,student.dao.impl.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'goinsert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  	<% 
  		request.setCharacterEncoding("utf-8");
  		String sid=request.getParameter("pid");
  		int id=Integer.parseInt(sid);
  		Student stu=new Student();
  		stu.setId(id);
 		StudentDaoImpl student=new StudentDaoImpl();
 		int result=student.delete(stu);
 		if(result>0){
 			response.sendRedirect("deleteok.jsp");
 		}else{
 			out.print("<script>javascript:alert('删除失败！');</script>");
 		}
  	%>
  <body>
    
  </body>
</html>
