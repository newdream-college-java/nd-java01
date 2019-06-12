<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>登录</title>
		<link type="text/css" href="Content/css.css" rel="stylesheet" />
		<script type="text/javascript" src="Scripts/jquery.js">
</script>
		<script type="text/javascript" src="Scripts/js.js">
</script>
	</head>

	<body style="background: #FFF;">
		<div class="loginLogo">
			<div class="logoMid">
				<h1 class="logo" style="height: 71px; padding-top: 10px;">
					<a href="index.jsp"><img src="Picture/loginlogo.jpg"
							width="241" height="71" />
					</a>
				</h1>
				<div class="loginReg">
					还没有会员账号?&nbsp;
					<a href="reg.jsp">免费注册</a>
				</div>
				<!--loginReg/-->
			</div>
			<!--logoMid/-->
		</div>
		<!--loginLogo/-->
		<div class="loginBox">
			<div class="loginLeft">
				<img src="Picture/logoinimg.jpg" width="716" height="376" />
			</div>
			<!--loginLeft/-->
			<form action="LoginSerl" method="post" class="loginRight">
				<h2>
					会员登录
				</h2>
				<h3>
					用户名
				</h3>
				<input type="text" class="name" name="uname"/>
				<h3>
					密码
				</h3>
				<input type="password" class="pwd" name="upwd"/>
				<div class="zhuangtai">
					<input type="checkbox" checked="checked" />
					下次自动登录
				</div>
				<!--zhuangtai/-->
				<div class="subs">
					<input type="image" src="images/sub.jpg" class="submit" />
				</div>
			</form>
			<!--loginRight/-->
			<div class="clears"></div>
		</div>
		<!--loginBox/-->
	</body>
</html>
