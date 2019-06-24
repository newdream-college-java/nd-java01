<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>session01.jsp1</title>
    
	

  </head>
  
  <body>
  <a href=></a>
  <h3>2.通过session域传递数据</h3>
     <%=session.getAttribute("one")%><br>
      <%=session.getAttribute("two")%><br>
     
      <h3>1.通过request传递数据</h3>
      <%=request.getAttribute("three") %>
      <%
     // session.invalidate();销毁所有的session
     //session.removeAttribute("one");//移除键值
     //session.removeValue("two");//移除值
    // session.setMaxInactiveInterval(1);// 没有啊
     // request.getRequestDispatcher("session03.jsp").forward(request, response);
      //response.sendRedirect("session03.jsp");%>
  </body>
</html>
