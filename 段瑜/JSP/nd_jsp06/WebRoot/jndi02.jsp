<%@ page language="java" import="java.util.*,javax.naming.*,javax.sql.*,java.sql.*" pageEncoding="utf-8"%>
<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.sym"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jndi02.jsp' starting page</title>
    
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
    	long start=System.currentTimeMillis();
    	//1.上下文对象
    	Context cts=new InitialContext();
    	//2.从上下文中获取数据源（连接池）
    	DataSource ds=(DataSource)cts.lookup("java:comp/env/jdbc/news");
    	out.print(ds+"</br>");
    	//从连接池得到链接
    	for(int i=0;i<100;i++){
    		Connection conn=ds.getConnection();
    		conn.close();
    	}
    	long end=System.currentTimeMillis();
    	out.print("通过链接池获取链接的时间："+(end-start)+"</br>");
    	start=System.currentTimeMillis();
    	Class.forName("com.mysql.jdbc.Driver");
    	 String url = "jdbc:mysql://127.0.0.1:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf8&useSSL=true";
    	 for(int i=0;i<100;i++){
    	 	Connection conn=DriverManager.getConnection(url,"root","z382698.");
    	 	conn.close();
    	 }
    	 end=System.currentTimeMillis();
    	 out.print("通过jdbc获取链接时间："+(end-start)+"</br>");
     %>
  </body>
</html>
