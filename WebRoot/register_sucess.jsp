<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8" />
    <title>用户注册成功-全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>
    <link href="favicon.ico" type="image/x-icon" />
    <meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
    <meta name="description" content="12308是中国道路运输协会与全国站场工委合作共建平台，提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110."/>
    <link rel="stylesheet" href="Css/loginbase.css">
    <link rel="stylesheet" href="Css/login.css">
</head>
<body class="reg_body">
	<div class="header nobg">
		<div class="header-container">
			<div class="r_logo">
				<a href="http://www.12308.com">12308首页</a>
			</div>
			</div>
		</div>
	</div>
    <!--中间部份-->    
	
	<div class="content">
		<div class="content-container content_reg_bg">
    <!--注册成功-->
		<div class="verifyst_b clearfix" style="display: ;">
        <div class="verifyst_div verifyst_ok">
        <i></i>
        <div class="left">
        <h2>恭喜您，您已成功注册12308会员</h2>
        <p>您的登录帐号为：<b class="plr10">kklwl@126.com</b>,请妥善保管您的帐户资料</p>
        <p>现在您可以进入: <a href="http://uc.12308.com" class="plr10 color4">个人中心</a><span>|</span><a href="http://www.12308.com" class="plr10 color4">12308首页</a></p>
        </div>
       </div>  
        </div>
              <!--验证失败-->
        <div class="verifyst_b clearfix" style="display: none;">
        <div class="verifyst_div verifyst_fail">
        <i></i>
        <div class="left">
        <h2>很抱歉，您的注册失败，请重新注册!</h2>
         <p>现在您可以进入: <a href="http://uc.12308.com/register/registerPage.html" class="plr10 color4">重新注册</a><span>|</span><a href="" class="plr10 color4">汽车票预订</a><span>|</span><a href="http://www.12308.com" class="plr10 color4">12308首页</a></p>
        </div>
        </div></div>
	</div>

<div class="footer">
		<div class="footer-container">
<div class="copyrights">Copyright © 2010-2014 12308.com，All Rights Reserved湘ICP备12014203号-1</div>
		</div>
	</div>
</body></html>