<%@ page language="java" import="java.util.*,java.sql.*,student.entity.*" pageEncoding="utf-8"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'insert.jsp' starting page</title>
    
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
    	Connection conn=null;
    	PreparedStatement pst=null;
    	ResultSet rs=null;
    	try{
    		//ArrayList<Student> list=new ArrayList<Student>();
	    	Class.forName("com.mysql.jdbc.Driver");
	    	String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
	    	conn=DriverManager.getConnection(url,"root","chenhui");
	    	String sql="select * from student";
	    	pst=conn.prepareStatement(sql);
	    	rs=pst.executeQuery();
	    	Student stu=null;
	    	out.print("<table border=1>");
	    	out.print("<tr>");
	    	out.print("<td>");
	    	out.print("id");
	    	out.print("</td>");
	    	out.print("<td>");
	    	out.print("name");
	    	out.print("</td>");
	    	out.print("</tr>");
	    	while(rs.next()){
	    		stu=new Student();
	    		stu.setId(rs.getInt("Id"));
	    		stu.setName(rs.getString("name"));
	    		//list.add(stu);
	    		out.print("<tr>");
	    		out.print("<td>");
	    		out.print(stu.getId());
	    		out.print("</td>");
	    		out.print("<td>");
	    		out.print(stu.getName());
	    		out.print("</td>");
	    		out.print("</tr>");	
    		}
    		out.print("<br/>");
    		//out.print(list);
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		rs.close();
    		pst.close();
    		conn.close();
    	}
    
     %>
  </body>
</html>
