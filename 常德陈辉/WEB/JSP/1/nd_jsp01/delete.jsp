<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
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
    	try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
	    	conn=DriverManager.getConnection(url,"root","chenhui");
	    	String sql="delete from student where id=?";
	    	pst=conn.prepareStatement(sql);
	    	pst.setInt(1,123);
	    	int result=pst.executeUpdate();
	    	if(result>0){
	    		out.print("删除成功！");
    		}else{
    			out.print("删除失败！");
    		}
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		pst.close();
    		conn.close();
    	}
    
     %>
  </body>
</html>
