<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>session03.jsp01</title>
    
	
  </head>
  
  <body>
    <h3>1.通过request域传递数据</h3>
    <%=request.getAttribute("three") %><br>
    
    <h3>2.通过session域传递数据</h3>
    <%=session.getAttribute("two") %>
     <%=session.getAttribute("one") %>
  </body>
</html>
