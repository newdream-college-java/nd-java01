<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Test.jsp' starting page</title>
    
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
  <table width="200px" border="1" height="50px">
  
   <c:forEach var="i" begin="1" end="5" step="1">
   		<c:if test="${i%2==0 }">
   			<tr bgcolor="orange">
   				<td><c:out value="${i }"></c:out></td>
   			</tr>
   		</c:if>
   		<c:if test="${i%2!=0 }">
   			<tr>
   				<td><c:out value="${i }"></c:out></td>
   			</tr>
   		</c:if>
   </c:forEach>
   </table>
  </body>
</html>
