<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>注册</title>
		<link type="text/css" href="Content/css.css" rel="stylesheet" />
		<script type="text/javascript" src="Scripts/jquery.js">
</script>
		<script type="text/javascript" src="Scripts/js.js">
</script>
<!-- 注册修改 -->
<script type="text/javascript" src="Scripts/reg.js"></script>
	</head>
	<script type="text/javascript" ></script>
	<body style="background: #FFF;">
		<div class="loginLogo">
			<div class="logoMid">
				<h1 class="logo" style="height: 71px; padding-top: 10px;">
					<a href="index.jsp"><img src="Picture/loginlogo.jpg"
							width="241" height="71" /> </a>
				</h1>
				<div class="loginReg">
					还没有会员账号?&nbsp;
					<a href="login.jsp">登录</a>
				</div>
				<!--loginReg/-->
			</div>
			<!--logoMid/-->
		</div>
		<!--loginLogo/-->
		<div class="loginBox">
			<img src="Picture/chengnuo.jpg" width="295" height="393"
				class="chengnuo" />
			<form action="SpUserInsertSvl" method="post" class="reg"
				onsubmit="return checkContent()">
				<div class="regList">
					<label>
						<span class="red">*</span> 账户名
					</label>
					<input type="text" name="username" id="username" onblur="check(this)"/>
					<span style="color: #999;" id="errorinfo">请输入邮箱/用户名/手机号</span>
					
				</div>
				<!--regList/-->
				<div class="regList">
					<label>
						<span class="red">*</span> 请设置密码
					</label>
					<input type="password" name="pwd" onblur="checkpwd(this)" id="pwd"/>
				</div>
				<!--regList/-->
				<div class="regList">
					<label>
						<span class="password">*</span> 请确认密码
					</label>
					<input type="text" name="repwd" id="repwd" onblur="checkrepwd(this)"/>
				</div>
				<!--regList/-->
				<div class="regList">
					<label>
						<span class="password">*</span> 真实姓名
					</label>
					<input type="text" name="reusername" id="reusername"/>
				</div>
				<div class="regList">
					<label>
						<span class="password">*</span> 电话号码
					</label>
					<input type="text" name="table" id="table"/>
				</div>
				<div class="regList">
					<label>
						<span class="password">*</span> 邮政编码
					</label>
					<input type="text" name="zip" id="zip"/>
				</div>
				<div class="regList">
					<label>
						<span class="password">*</span> 身份证号码
					</label>
					<input type="text" name="number" id="number"/>
				</div>
				<div class="regList">
					<label>
						<span class="password">*</span> 地址
					</label>
					<input type="text" name="address" id="address"/>
				</div>
				<div class="regList">
					<label>
						<span class="red" >*</span> 验证码
					</label>
					<input type="text" class="yanzheng"  id="yanzheng"/>
					<img src="Picture/yanzheng.jpg" width="103" height="38" />
				</div>
				<!--regList/-->
				<div class="xieyi">
					<input type="checkbox" name="box" value="2" id="box"/>
					我已经阅读并同意
					<a href="#">《17用户注册协议》</a>
				</div>
				<!--xieyi/-->
				<div class="reg">
					<input type="image" src="images/reg.jpg" width="284" height="34" />
				</div>
				<!--reg/--><!-- 注册修改 -->
			</form>
			<!--reg/-->
			<div class="clears"></div>
		</div>
		<!--loginBox/-->
	</body>
</html>

