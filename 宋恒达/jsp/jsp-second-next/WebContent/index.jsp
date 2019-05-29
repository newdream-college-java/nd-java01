<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加学生开始</title>
</head>
<body>
	<form action="do-add" method="post">
			<table>
				<tr>
					<td>姓名：</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>年龄：</td>
					<td><input type="number" name="age"/></td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="提交"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="to-delete">删除学生</a>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="to-update">修改信息</a>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<a href="">查询信息</a>
					</td>
				</tr>
			</table>
	</form>
</body>
</html>