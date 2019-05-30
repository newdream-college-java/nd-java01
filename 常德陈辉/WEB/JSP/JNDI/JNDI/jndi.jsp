<%@ page language="java" import="java.util.*,javax.naming.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'jndi.jsp' starting page</title>
 
  </head>
  
  <body>
  	<%
  		//javax.naming.Context包
  		//初始化Context对象
	    Context ctx=new InitialContext();
	    //java:comp/env/ 前缀
	    //调用lookup()方法
	    String dbName=(String)ctx.lookup("java:comp/env/dbName");
	    out.print(dbName);
     %>
  </body>
</html>
