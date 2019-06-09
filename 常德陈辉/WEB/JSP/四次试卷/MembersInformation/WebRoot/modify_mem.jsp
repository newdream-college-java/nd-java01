<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="pagebil.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>会员信息修改</title>
		<link type="text/css" href="css/modify_mem.css" rel="stylesheet"/>
		<script type="text/javascript" src="js/modify_mem.js"></script>
	</head>
	<body>
		<form action="ModifyMemSerl" method="post" onsubmit="return vip(this)">
			<input type="hidden" value="${mbi.mid}" name="uid">
			<table border=1 align="center" width="40%" class="a">
				<tr>
					<th colspan="2">会员信息</th>
				</tr>
				<tr>
					<th>姓名</th>
					<td>
						<input type="text" value="${mbi.mname}" name="uname" id="name"/>
					</td>
				</tr>
				<tr>
					<th>性别</th>
					<td>
						<input type="radio" value="男" name="usex" ${mbi.mgender=="男"?"checked=checked":""}/>男
						<input type="radio" value="女" name="usex" ${mbi.mgender=="女"?"checked=checked":""}/>女
					</td>
				</tr>
				<tr>
					<th>年龄</th>
					<td>
						<input type="text" value="${mbi.mage}" name="uage" id="age"/>
					</td>
				</tr>
				<tr>
					<th>家庭住址</th>
					<td>
						<input type="text" value="${mbi.maddress}" name="uaddress" id="address"/>
					</td>
				</tr>
				<tr>
					<th>Email</th>
					<td>
						<input type="text" value="${mbi.memail}" name="uemail" id="email"/>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="修  改" />&nbsp;&nbsp;
						<input type="reset" value="重  置" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
