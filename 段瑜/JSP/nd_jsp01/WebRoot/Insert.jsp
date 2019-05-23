<%@ page language="java" import="java.util.*,entity.*,BaseDao.*" pageEncoding="utf-8"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Insert.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <% 
    	Connection conn=BaseDao.getConn();
    	String sql="insert into stu_info values(null,?,?,?)";
    	PreparedStatement pst=conn.prepareStatement(sql);
    	pst.setString(1,"杨斌");
    	pst.setInt(2,22);
    	pst.setString(3,"1997-12-23");
    	int result=pst.executeUpdate();
    	if(result>0){
    		out.println("添加成功");
    	}else{
    		out.println("添加失败");
    	}
    	
    
    %>
  </body>
</html>
