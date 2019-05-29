<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%
		List<String> lists=new ArrayList<String>();
		if(application.getAttribute("chatInfo")!=null){
			lists=(List<String>)application.getAttribute("chatInfo");
		}
	%>
<body>
	<h2>输入聊天信息：</h2>
	<form action="chat_control.jsp" method="post">
		<table>
			<tr>
				<td><textarea rows="10" cols="50" name="info"></textarea></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="确认"/>
					<input type="reset" value="清空"/>
				</td>
			</tr>
		</table>
		
	</form>
	<h2>已有的聊天信息：</h2>
	<%
		String showInfo="";
		for(String s:lists){
			showInfo=showInfo+s+"\n";
		}
	%>
	<table>
			<tr>
				<td><textarea rows="10" cols="50" name="info"><%=showInfo %></textarea></td>
			</tr>
		</table>
	
</body>
</html>