<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="taglib.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>添加试题</title>
		<script type="text/javascript" src="js/Que_add.js"></script>
	</head>

	<body>
		<form action="QueSerAdd" method="post" onsubmit="return tiJiao(this);">
			<table align="center" border=1 width="60%">
				<tr>
					<th colspan="2">试题信息</th>
				</tr>
				<tr>
					<th>题干：</th>
					<td><textarea rows="2" cols="50" name="question" id="question"></textarea></td>
				</tr>
				<tr>
					<th>选项：</th>
					<td></td>
				</tr>
				<tr>
					<th>A,</th>
					<td><textarea rows="2" cols="50" name="questionA" id="questiona"></textarea></td>
				</tr>
				<tr>
					<th>B,</th>
					<td><textarea rows="2" cols="50" name="questionB" id="questionb"></textarea></td>
				</tr>
				<tr>
					<th>C,</th>
					<td><textarea rows="2" cols="50" name="questionC" id="questionc"></textarea></td>
				</tr>
				<tr>
					<th>D,</th>
					<td><textarea rows="2" cols="50" name="questionD" id="questiond"></textarea></td>
				</tr>
				<tr>
					<th>科&nbsp;&nbsp;&nbsp;&nbsp;目：</th>
					<td>
						<select name="subject">
							<option value="1">JSP</option>
							<option value="2">OOP</option>
							<option value="4">JavaScript</option>
						</select>
					</td>
				</tr>
				<tr>
					<th>正确答案：</th>
					<td><input type="text" size="50" name="answer" id="answer"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="增加"/>&nbsp;&nbsp;&nbsp;
						<input type="reset" value="重置"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
