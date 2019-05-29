<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<form action="do-update" method="post">
		<table>
			<tr>
				<td>请输入修改的学生id</td>
				<td><input type="number" name="id"/></td>
			</tr>
			<tr>
				<td>请输入修改后的姓名</td>
				<td><input type="text" name="name"/></td>
			</tr>
			<tr>
				<td>请输入修改后的年龄</td>
				<td><input type="number" name="age"/></td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="提交"/>
				</td>
				<td>
					<a href="index.jsp">首页</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>