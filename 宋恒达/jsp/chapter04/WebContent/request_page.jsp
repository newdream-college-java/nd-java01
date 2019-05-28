<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="request_control.jsp" method="post">
		<table border="1">
			<tr>
				<td>请输入您的兴趣爱好</td>
			</tr>
			<tr>
				<td>
					<input type="checkbox" value="篮球" name="sport">篮球
					<input type="checkbox" value="足球" name="sport">足球
					<input type="checkbox" value="电影" name="sport">电影
					<input type="checkbox" value="游戏" name="sport">游戏
					<input type="checkbox" value="排球" name="sport">排球
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
</body>
</html>