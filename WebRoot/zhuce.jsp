<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>阿拉亲子</title>

<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/jquery.validate.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/validate_expand.js"></script>
<script language="javascript" type="text/javascript" src="Scripts/validate.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	initValidator();
});
</script>
<script language="javascript" type="text/javascript" src="Scripts/index.js"></script>
<link href="Content/regist.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="content">
  <div class="demo">
  <div class="title"><img src="Picture/demo_03.jpg" /><p>账号注册</p>
  <div class="c"></div>
  </div>
	<form id="thisForm" method="post" action="pcnuserSaveServlet">
	<table width="50%">
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>用户名：</td>
			<td>
				<input class="stext" type='text' name="userName" id="userName" value="" onfocus="Names(this)" onblur="nameBlur(this)"/>
				<div class="tipinfo"  id="nickName_prompt">昵称可由大小写字母、数字组成，长度为4-20个字符</div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>密码：</td>
			<td>
				<input class="stext" type="password" name="passWord" id="passWord" value="" onfocus="pwds(this)" onblur="pwdsBlur(this)"/>
				<div class="tipinfo"  id="pwd_prompt">密码为必填项，请设置您的密码</div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>确认密码：</td>
			<td>
				<input class="stext" type='password' name="passWordAgain" id="passWordAgain" value=""  onfocus="passwords(this)" onblur="passwordsBlur(this)"/>
				<div class="tipinfo"  id="repwd_prompt" ></div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>邮箱：</td>
			<td>
				<input class="stext" type='text' name="email" id="email" value=""  onfocus="emailFocus(this)" onblur="emailBlur(this)"/>
				<div class="tipinfo" id="email_prompt">Email的格式，例如：master@newdream.com</div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>手机号码：</td>
			<td>
				<input class="stext" type='text' name="sms" id="sms" value="" onfocus="sms(this)" onblur="smsBlur(this)"/>
				<div class="tipinfo" id="sms_prompt">请输入11位的手机号码</div>
			</td>
		</tr>
		<tr>
			<td class="tdcon"><span style="color:#F00;">*</span>居住地：</td>
			<td>
				<select name="site" style=" width:150px; border-color:#ddd;">
				  <option value ="请选择市区">请选择省份</option>
					<option value ="北京市">北京市 </option>
					<option value ="天津市">天津市 </option>
					<option value ="上海市">上海市 </option>
					<option value ="重庆市">重庆市 </option>
					<option value ="河北省">河北省 </option>
					<option value ="山西省">山西省 </option>
					<option value ="辽宁省">辽宁省 </option>
					<option value ="吉林省">吉林省 </option>
					<option value ="黑龙江省">黑龙江省</option>
					<option value ="江苏省"> 江苏省 </option>
					<option value ="浙江省">浙江省 </option>
					<option value ="安徽省">安徽省 </option>
					<option value ="福建省">福建省 </option>
					<option value ="江西省">江西省 </option>
					<option value ="山东省">山东省 </option>
					<option value ="河南省">河南省 </option>
					<option value ="湖北省">湖北省 </option>
					<option value ="湖南省">湖南省 </option>
					<option value ="广东省">广东省 </option>
					<option value ="海南省">海南省 </option>
					<option value ="四川省">四川省 </option>
					<option value ="贵州省">贵州省 </option>
					<option value ="云南省">云南省 </option>
					<option value ="陕西省">陕西省 </option>
					<option value ="甘肃省">甘肃省 </option>
					<option value ="青海省">青海省 </option>
					<option value ="台湾省">台湾省 </option>
					<option value ="广西壮族自治区">广西壮族自治区</option>
					<option value ="内蒙古自治区"> 内蒙古自治区</option>
					<option value ="西藏自治区"> 西藏自治区</option>
					<option value ="宁夏回族自治区"> 宁夏回族自治区 </option>
					<option value ="新疆维吾尔自治区">新疆维吾尔自治区</option>
					<option value ="香港特别行政区">香港特别行政区</option>
					<option value ="澳门特别行政区">澳门特别行政区</option>
				</select>
				<div class="tipinfo"></div>
			</td>
		</tr>
        <tr>
			<td class="tdcon"><span style="color:#F00;">*</span>QQ：</td>
			<td>
				<input class="stext" type='text' value=""  name="qq" />
				<div class="tipinfo" ></div>
			</td>
		</tr>        
        <tr >
			<td class="tdcon"><span style="color:#F00;">*</span>宝宝性别：</td>
			<td>
				<p >
				  <label style="padding-right:30px;">
				    <input type="radio" name="RadioGroup1" value="1" id="RadioGroup1_0" />
				    小王子</label>
				  <label style="padding-right:30px;">
				    <input type="radio" name="RadioGroup1" value="2" id="RadioGroup1_1" />
				    小公主</label>
				  <br />
			  </p>
<div class="tipinfo"></div>
		  </td>
		</tr>       
        <tr>
			<td class="tdcon"><span style="color:#F00;">*</span>宝宝姓名：</td>
			<td>
				<input class="stext" type='text' value="" name="bbname"/>
				<div class="tipinfo"></div>
			</td>
		</tr>       
           
		<tr>		
            <td style="width:50px;"></td>
			<td id="submit"><input type="submit" value="立即注册" class="Button br" >
            </td>
		</tr>
	</table>
	</form>   
    <div class="erweima">
    <p>已有阿拉亲子论坛账号？ 立即登录</p>
    <img src="Picture/demo_07.jpg" width="170" height="170"/>
    <p>「最新资讯 请关注我们的微信号」</p>
    </div>
</div>
</div>
</body>
</html>
