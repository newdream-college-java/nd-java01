<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'request_page.jsp' starting page</title>
	</head>
	<body>
		<form action="request_control.jsp" method="post">
			<table border=1>
				<tr>
					<td>请输入您的兴趣爱好</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" value="篮球" name="like"/>篮球&nbsp;
						<input type="checkbox" value="足球" name="like"/>足球&nbsp;
						<input type="checkbox" value="电影" name="like"/>电影&nbsp;
						<input type="checkbox" value="游戏" name="like"/>游戏&nbsp;
					</td>
				</tr>
				<tr>
					<td align="center">
						<input type="submit" value="提  交"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
