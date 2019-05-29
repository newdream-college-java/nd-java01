<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
	td{
		border:1px solid red;
	}
</style>
</head>
<body>
	<% 
		out.print("<table>");
		for(int i=1;i<=9;i++){
			out.print("<tr>");
			for(int j=1;j<=i;j++){
				out.print("<td>");
				out.print(i+"x"+j);
				out.print("</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
	%>
	<a href="add">增加数据</a>
</body>
</html>