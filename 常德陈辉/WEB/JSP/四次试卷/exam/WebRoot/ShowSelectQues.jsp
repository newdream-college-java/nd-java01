<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>查询试题</title>
    <link type="text/css" href="css/showSelectQues.css" rel="stylesheet"/>
  	<script type="text/javascript" src="js/ShowSelectQues.js"></script>
  </head>
  
  <body>
   	<table align="center" width="60%" cellspacing="0xp">
   		<tr>
   			<td colspan="6" align="center" height="40px">
   				科目：<select id="keMu">
   						<option value="-1">--请选择--</option>
   						<option value="1">jsp</option>
   						<option value="2">OOP</option>
   						<option value="3">JavaScript</option>		
   				</select>&nbsp;&nbsp;
   				<button onclick="chaXun()">查询</button>&nbsp;&nbsp;
   				<a href="Que_add.jsp">添加试题</a>
   			</td>
   		</tr>
   		<tr class="head">
   			<th>题干</th>
   			<th>A,选项</th>
   			<th>B,选项</th>
   			<th>C,选项</th>
   			<th>D,选项</th>
   			<th>答案</th>
   		</tr>
   		<c:forEach var="qs" items="${list}">
	   		<tr class="rtext">
	   			<td>${qs.question}</td>
	   			<td>${qs.questionA}</td>
	   			<td>${qs.questionB}</td>
	   			<td>${qs.questionC}</td>
	   			<td>${qs.questionD}</td>
	   			<td>${qs.answer}</td>
	   		</tr>
   		</c:forEach>
   	</table>
  </body>
</html>
