<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />	
            <meta http-equiv="X-UA-Compatible" content="IE=Edge">
	    <title>用户登录_全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>
        
		
        <link type="text/css" rel="stylesheet" href="Css/my.css"/>
        
		<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
		<meta name="description" content="12308是中国道路运输协会与全国站场工委合作共建平台，提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:0755-82867116."/>	     
	    <link rel="icon" href="index.html" type="image/x-icon" />
	    
	    <link rel="stylesheet" href="Css/loginbase.css" />
	    <link rel="stylesheet" href="Css/login.css"/>	    
	    
	</head>
<body id="cas" class="fl-theme-iphone">	
<!-- 12308.com Baidu tongji analytics -->


<body>

	<div class="header">
		<div class="header-container">
			<div class="logo">
				<a href="index.html">12308首页</a> <span class="header-title">用户登录</span>
			</div>
			<div class="navigation color3">
				<a href="login.html" class="color4040">登录</a> <span class="c999">|</span> <a href="index.html">首页</a>
				<span class="c999">|</span> <a href="javascript:void(0)" target="_blank"> 帮助中心</a>
			</div>
		</div>
	</div>
	<div class="content">
		<div class="content-container con_p_0">
			<div class="login-banner">
				<img src="Picture/login_banner_new.png" border="0" data-pinit="registered">
			</div>
            <div class="login-body">
			<div class="login-module">
            <div class="loginbox">
				<div class="loginheader">欢迎登录 12308.com</div>
					<div style="color:red;">注意：登录仅支持手机号和邮箱 </div>
				<div class="logincontent">
					<form id="fm1" class="fm-v clearfix" action="/login" method="post">
						
						<input type="hidden" name="redirect" value="">
						<ul>
							<li>
								<input id="username" name="username" tabindex="1" style="color:#a9a9a9;" value="手机号码/邮箱" class="l_input txt" type="text" onfocus="if (this.value==&#39;手机号码/邮箱&#39;) {this.value=&#39;&#39;;this.style.color=&#39;#333&#39;};" onblur="trimvalue(this)" value="" autocomplete="false"/>
							</li>
							<script>
							 function trimvalue(obj){
								  obj.value  =obj.value.replace(/[ ]/g,"");   
								  if(obj.value.length<=0){obj.value='手机号码/邮箱';obj.style.color='#a9a9a9'}
							}        
                               
							</script>
							<li>
								<input id="password" name="password" tabindex="2" style="color:#333;" placeholder="密码" class="l_input paswd" type="password" value="" autocomplete="off"/>
							</li>
							<li class="nopt"><p class="lo_p">
								<input class="lo_check" type="checkbox" value="true" checked="checked" tabindex="4" name="rememberMe" id="rememberMe"><span>自动登录</span><span><a href="http://uc.12308.com/resetPwd/resetPwdByMobilePage.html">忘记密码？</a></span></p>
							</li>
							<li>
								<input type="hidden" name="lt" value="LT-4636697-aVhUp4Ng6PDH2dklnO95HpLhfaV6AB" />
								<input type="hidden" name="execution" value="e2s1" />
								<input type="hidden" name="_eventId" value="submit" />		
								<input class="btn-bg" name="submit" accesskey="l" value="登录" tabindex="3" type="submit" />					
							</li>
                            </ul>
					</form>
					</div>
				</div>
			</div>
			
            <div class="login-bottom">
              
            	<div class="loginbo_box">
            	<span class="c666">您还不是12308会员？仅需1分钟即可</span><span class="right color3"><a href="register.html">免费注册</a></span>
						
            	<!--
		            <span class="left pr_15">使用其他方式登录</span>
		            <span class="cop_link">
		            <a href="https://api.weibo.com/oauth2/authorize?client_id=sinaweibo_key&redirect_uri=http%3A%2F%2Fwww.12308.com%2Flogin%3Foauth_provider%3DSinaWeiboProvider&response_type=code" class="nreg_sina"></a>
		            <a href="https://graph.qq.com/oauth2.0/authorize?client_id=100558817&redirect_uri=http%3A%2F%2Fwww.12308.com%2Flogin%3Foauth_provider%3DQqProvider&response_type=code&state=69ab1d21-9081-4cab-a008-d6bb2ebb00b8&scope=get_user_info" class="nreg_qq"></a>
		            </span>
		        -->    
            	</div>
            </div> 
		</div></div>
		
	</div>
	
	
	
 


		<div class="footer">
			<div class="footer-container">
				<div class="copyrights">Copyright © 2010-2013 12308.com，All Rights Reserved粤ICP备14020827号</div>
			</div>
		</div>
		<script>
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?7ae99e8c2df45dc624bafedd8216c545";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();

 var _sogou_sa_q = _sogou_sa_q || [];
  _sogou_sa_q.push(['_sid', '226089-232537']);
 (function() {
    var _sogou_sa_protocol = (("https:" == document.location.protocol) ? "https://" : "http://");
    var _sogou_sa_src=_sogou_sa_protocol+"hermes.sogou.com/sa.js%3Fsid%3D226089-232537";
    document.write(unescape("%3Cscript src='" + _sogou_sa_src + "' type='text/javascript'%3E%3C/script%3E"));
    })();
</script><!--底部加载手机下载-->
	</body>

</html>