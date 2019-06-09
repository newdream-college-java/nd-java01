<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>保存旅游经历</title>
		<link type="text/css" href="css/insert_tour.css" rel="stylesheet"/>
		<script type="text/javascript" src="js/insert_tour.js"></script>
	</head>

	<body>
		<form action="AddTourSerl" method="post" onsubmit="return checking(this)">
			<table align="center" width="400px">
				<tr class="title">
					<th colspan="2">保存旅游经历</th>
				</tr>
				<tr>
					<th>国家/城市：</th>
					<td><input type="text" name="ucity" id="city"/></td>
				</tr>
				<tr>
					<th>区域/景点：</th>
					<td><input type="text" name="uplace" id="place"/></td>
				</tr>
				<tr>
					<th>旅游时间：</th>
					<td><input type="text" name="utime" id="time"/></td>
				</tr>
				<tr>
					<th>经历记录：</th>
					<td><textarea name="unote" cols="22" rows="5" id="note"></textarea></td>
				</tr>
				<tr>
					<th><a href="ListTourSerl">查看所有</a></th>
					<td><input type="submit" value="提&nbsp;交"/></td>
				</tr>
			</table>
		</form>
	</body>
</html>
