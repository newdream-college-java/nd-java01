<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>注册</title>
<link type="text/css" href="Content/css.css" rel="stylesheet" />
<script type="text/javascript" src="Scripts/jquery.js"></script>
<script type="text/javascript" src="Scripts/js.js"></script>
</head>

<body style=" background:#FFF;">
 <div class="loginLogo">
  <div class="logoMid">
   <h1 class="logo" style="height:71px;padding-top:10px;"><a href="index.jsp"><img src="Picture/loginlogo.jpg" width="241" height="71" /></a></h1>
   <div class="loginReg">
    还没有会员账号?&nbsp;<a href="login.jsp">登录</a>
   </div><!--loginReg/-->
  </div><!--logoMid/-->
 </div><!--loginLogo/-->
 <div class="loginBox">
  <img src="Picture/chengnuo.jpg" width="295" height="393" class="chengnuo" />
  <form action="#.jsp" method="get" class="reg">
   <div class="regList">
    <label><span class="red">*</span> 账户名</label>
    <input type="text" /> <span style="color:#999;">请输入邮箱/用户名/手机号</span>
   </div><!--regList/-->
   <div class="regList">
    <label><span class="red">*</span> 请设置密码</label>
    <input type="password" />
   </div><!--regList/-->
   <div class="regList">
    <label><span class="password">*</span> 请确认密码</label>
    <input type="text" />
   </div><!--regList/-->
   <div class="regList">
    <label><span class="red">*</span> 验证码</label>
    <input type="text" class="yanzheng" /><img src="Picture/yanzheng.jpg" width="103" height="38" />
   </div><!--regList/-->
   <div class="xieyi">
    <input type="checkbox" /> 我已经阅读并同意<a href="#">《17用户注册协议》</a>
   </div><!--xieyi/-->
   <div class="reg">
    <input type="image" src="images/reg.jpg" width="284" height="34" />
   </div><!--reg/-->
  </form><!--reg/-->
  <div class="clears"></div>
 </div><!--loginBox/-->
</body>
</html>

