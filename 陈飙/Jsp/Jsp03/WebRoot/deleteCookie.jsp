<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>=deleteCookie.jsp=</title>
    
	

  </head>
  
  <body>
   <%
   //1.获取客户端带过来的cookie(requets)
   Cookie[] cookies=request.getCookies();
   for(Cookie cookie:cookies){
   	out.print(cookie.getName()+"----"+cookie.getValue()+"<br/>");
    		out.print(cookie.getMaxAge()+"<br/>");
    		out.print(cookie.getPath()+"<br/>");
   }
    %><br>
  </body>
</html>
