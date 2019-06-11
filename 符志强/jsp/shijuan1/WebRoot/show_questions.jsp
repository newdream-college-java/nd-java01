<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'chaxun.jsp' starting page</title>
    
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
  <form action="ListQuesServlet" method="post">
    <table border="1" width="500" align="center">
    	<tr>
    		<td colspan="6" align="center">
    			科目：<select name="xl">
    					<option value="-1">--请选择--</option>
    					<option value="1">JSP</option>
    					<option value="2">OOP</option>
    					<option value="3">Javascript</option>
    				</select>
    				<input type="submit" value="查询" />
    				<a href="">添加试题</a>
    		</td>
    	</tr>
    	<tr>
    		<td>题干</td>
    		<td>A、选项</td>
    		<td>B、选项</td>
    		<td>C、选项</td>
    		<td>D、选项</td>
    		<td>答案</td>
    	</tr>
    	<c:forEach var="xh" items="${list}">
    	<tr>
    		<td>${xh.question}</td>
    		<td>${xh.questionA}</td>
    		<td>${xh.questionB}</td>
    		<td>${xh.questionC}</td>
    		<td>${xh.questionD}</td>
    		<td>${xh.answer}</td>
    	</tr>
    	</c:forEach>
    </table>
   </form>
  </body>
</html>
