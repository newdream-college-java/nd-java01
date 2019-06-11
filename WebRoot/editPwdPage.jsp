<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>个人中心_全国汽车票预订平台_长途汽车线路时刻表_修改密码_</title>
	<link href="http://image.12308.com/favicon.ico" type="image/x-icon" rel="icon" />
	<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
	<meta name="description" content="12308是中国道路运输协会与全国站场工委合作共建平台，提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110."/> 
	<link href="http://image.12308.com/favicon.ico" type="image/x-icon" rel="icon" />
	<link rel="stylesheet" href="Css/userbase.css" type="text/css" />
	<link rel="stylesheet" href="Css/uindex.css" type="text/css" />
    <link rel="stylesheet" href="Css/validate.css">	
	<link rel="stylesheet" href="Css/uodetail.css" type="text/css" />
	<script type="text/javascript" src="Scripts/jquery1.7.js"></script>
	<script type="text/javascript" src="Scripts/ys.selectbox.js"></script>
	<script type="text/javascript" src="Scripts/ys.validate.js"></script>
	<script type="text/javascript" src="Scripts/ys.valflag.js"></script>
	<script type="text/javascript" src="Scripts/jquery.validate.rule.js"></script>
	<script type="text/javascript" src="Scripts/jquery.form.js"></script> 
	<script type="text/javascript" src="Scripts/common.js"></script>


	<script type="text/javascript" src="Scripts/usereditpwd.js"></script>
	
		
	<script type="text/javascript">
	
	  $(document).ready(function() {
	  
	    $("#dd22").attr("class","active");

	  });
	</script>
</head>
<div class="q_pagecontainer">
	<div class="q_pagewrap">
<style>
.navmenu li.ico i{background:url("Images/ico.gif") no-repeat 0px 15px;height:50px;left: 120px;top: -35px;width:65px;display:block;}
.navmenu li.ico a{color:#ff0;}
.navmenu li.ico a.cur{color:#0096ff;}
.navmenu li.ico a:hover{color:#f60;}
</style>
<div class="bodyhead">
  <div class="main-wrap">
  <h1 class="logo"><a title="12308全国汽车票网" href="http://www.12308.com">12308全国汽车票网</a></h1>
  <div class="headr">
  <div class="toolkit">
  	 <span class="a_mapp" target="_blank"><i class="to_mapp"></i><span>手机APP</span>
     <div class="to_code_box"><div class="to_code_hd"><span class="arr"></span>
     <div class="code_hd"><p>司机端下载</p><a href="http://qiye.12308.com/download.html" target="_blank"><img src="Picture/driver_code.png" width="94px" height="94px" /></a></div>
     <div class="code_line"></div>
     <div class="code_hd"><p>客户端下载</p><a href="http://app.12308.com/" target="_blank"><img src="Picture/clients_code.png" width="94px" height="94px"/></a></div>
     </div></div></span>
     <a href="http://qiye.12308.com" class="link a_ched" target="_blank"><i class="to_ched"></i><span>车队入驻</span></a>
     <a href="http://weibo.com/12308com" class="link weibo" target="_blank"><i class="to_weibo"></i><span>微博</span></a>
     <a href="http://app.12308.com/weixin.html" class="link weixin" target="_blank">
     <i class="to_weixin"></i><span>微信</span>
     <div class="to_code_box"><div class="to_code_hd"><span class="arr"></span>
     <div class="code_hd"><p>扫描关注微信</p><img src="Picture/weixin_code.png" width="94px" height="94px"/></div>
     </div></div></a>
  </div>
  <div class="handapp"><a title="12308司机端下载" href="http://qiye.12308.com/download.html" target="_blank">12308手机订票</a></div>
 </div>
</div>

<!--导航菜单-->
 <div class="bodymenu">
    <div class="mainnav"> 
        <ul class="navmenu">
						<li class="nav_0">
							<!--class="cur"-->
							<a href="http://www.12308.com" title="首页" target="_blank">首页</a>
						</li>
						<li class="nav_1"><a href="http://www.12308.com/index/chepiao.html" title="汽车票预定" target="_blank">汽车票预定</a>
						</li>
						<li class="nav_2 ico"><a href="http://www.12308.com/huodong/wyindex.html" tts="link_3316" title="全国特价票"><i></i>全国特价票<span></span></a></li>
						<li class="nav_3"><a href="http://www.12308.com/news/index.html" target="_blank" title="资讯中心">资讯中心</a>
						</li>
						<li class="nav_4"><a href="http://www.12308.com/help/help.html" title="客服中心"><i></i>客服中心<span></span></a></li>
						<li class="nav_5"><a href="http://www.12308.com/baoche/index.html" title="我要包车"><i></i>我要包车<span></span></a></li>
					</ul>
					<div class="navuserbg"></div>
        <ul class="navuser" id="login_content">
			<li class="out">
	          <a title="退出" rel="nofollow" href="http://www.12308.com/loginout.jsp">退出</a>
	        </li>
	        <li class="go">
              <span><a class="name" href="#">
								349959253@qq.com
                 	 		</a></span>
            </li>
        </ul>
             
    </div>
 </div>
</div><!--mystart-->
		<div class="q_page">
			<div class="user-wrap">
        <!--left-->
        	<div class="user-left">
					<!--left-->
					<div class="user-left">
						<!--b_editimg-->
						<div class="b_editimg">
							<div class="b_edit">
								<div class="edit" id="changeuUimg">
									<span class="icon"><a href="http://uc.12308.com/user/editPhoto.html">修改头像 </a>
									</span>
								</div>
								<div class="bg"></div>
								<img src="Picture/person.jpg"  class="u_img">
							</div>
					<!--		<div class="b_reset">
                              <a href="http://uc.12308.com/user/infoPage.html" class="edit_info">编辑资料</a>
                              <a id="changePsw" class="reset_psw" href="http://uc.12308.com/user/editPwdPage.html">修改密码</a>
                             </div>-->
						</div>
						<!--\b_editimg-->
						<div id="q_nar" class="q_nar">
							<ul>
								<li id="li10" class="q_nar_order q_li_block"><a href="#"
									target="_top"> <span class="q_nar_arrow"></span> <em
										class="q_nar_ico"></em>我的订单</a>
									<dl>
										<dd>
											<a id="dd11" class="noclass" href="http://uc.12308.com/order/usercenter/orderListAll.html">出行订单</a>
										</dd>
										<dd>
											<a id="dd12" class="noclass" href="http://uc.12308.com/order/usercenter/orderListRentBus.html">包车订单</a>
										</dd>
										<dd>
											<a id="dd13" class="noclass" href="http://uc.12308.com/order/usercenter/refundOrderList.html">退款订单</a>
										</dd>
									</dl></li>

								<li id="li20" class="q_nar_info q_li_block"><a href="#"
									target="_top"> <span class="q_nar_arrow"></span><em
										class="q_nar_ico"></em>我的信息</a>
									<dl>
										<dd>
											<a id="dd21" class="noclass" href="http://uc.12308.com/user/infoPage.html">基本信息</a>
										</dd>
										<dd>
											<a id="dd22" class="noclass" href="http://uc.12308.com/user/editPwdPage.html">修改密码</a>
										</dd>
										<dd>
											<a id="dd23" class="noclass" href="http://uc.12308.com/passenger/listPage.html">常用旅客信息</a>
										</dd>
									</dl>
								</li>
								
								<li id="li30" class="q_nar_wallet q_li_block">
                                  <a href="#" target="_top">
                                   <span class="q_nar_arrow"></span><em class="q_nar_ico"></em>我的钱包</a>
                                    <dl>
                                  <!--     <dd><a id="dd31" class="noclass" href="account.html">账户资金</a></dd>-->
                                      <dd><a id="dd32" class="noclass" href="http://uc.12308.com/order/usercenter/myCouponPage.html">优惠券<i class="i_tixian"></i></a></dd>
                                  <!--    <dd><a id="dd33" class="noclass" href="cashRedPape.html">现金红包</a></dd>-->
                                  </dl></li>


								<li id="li40" class="q_nar_active q_li_block"><a href="#"
									target="_top"> <span class="q_nar_arrow"></span><em
										class="q_nar_ico"></em>我的动态</a>
									<dl>
										<dd>
											<a id="dd41" class="noclass" href="http://uc.12308.com/message/questionList.html">我的提问</a>
										</dd>
									</dl></li>
							</ul>
						</div>
						<div class="user-qimg">
		                 <img src="Picture/wx_code.png" border="0" data-pinit="registered">
		                </div>
					</div>
					<!--/left-->            </div>
        <!--/left-->
        <!--right-->
            <!--right-->
            <div class="user-right">
<!--/right-->
<!--breadcrumb-->
    <div class="b_ucbreadcrumb color4">
    <a href="http://uc.12308.com/user/infoPage.html">个人中心</a><em>&gt;</em>
    <span id="nowNav">修改密码</span> </div>
    <!--\breadcrumb--> 
 <div class="qn_usercenter_in">
      <div class="pub-form">
    	<form id="form">
		<div class="fm-item pbot-15">
          <span class="fm-label"><label for="txt_Name3">输入原始密码</label></span>
   			<input type="password" value="" name="oldPassword" id="oldPassword" class="i-input w240">
              <div class="msg-box">
                    <div id="oldPasswordTip" class="msg-weak msg-attention"><i></i>
                      <label class="valid">请输入原始密码</label>
                    </div>
               </div>
        </div>
		<div class="fm-item pbot-10">
          <span class="fm-label"><label for="txt_Name2">新密码</label></span>
    <div  class="dinbl"><input type="password" value="" name="password" id="password" class="i-input w240">
    <div class="qiangdu"><span id="one" class="strong strong1">弱</span><span id="two" class="strong strong2">中</span><span id="three" class="strong strong3">强</span></div></div>
              <div class="msg-box">
                    <div id="passwordTip" class="msg-weak msg-attention"><i></i>
                      <label class="valid">请输入新密码</label>
                    </div>
               </div>
        </div>
        
        
         <div class="fm-item pbot-15">
          <span class="fm-label"><label for="txt_Name3">再次输入密码</label></span>
   <input type="password" value="" name="confirm_password" id="confirm_password" class="i-input w240">
              <div class="msg-box">
                    <div id="confirm_passwordTip" class="msg-weak msg-attention"><i></i>
                      <label class="valid">请输入用户密码</label>
                    </div>
               </div>
        </div>
     
        <div class="fm-item pbot-15">
              <span class="fm-label"><label for="txt_Name6"></label></span>
             <a  id="btn_submit" class="button_ok" >确 定</a>
             <!--<a id="btn_cancel" class="button_canc" >重置</a>-->
       </div> 

        </form>
</div> 
</div>
<!--right/-->
            </div>
            <!--right-->
            
</div></div></div></div>

<div class="footer">
		<div class="footer-container">
<div class="copyrights">Copyright © 2010-2013 12308.com，All Rights Reserved粤ICP备14020827号</div>
		</div>
	</div>
<span style=" visibility: hidden;">
<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?7ae99e8c2df45dc624bafedd8216c545";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
</span>
</body>
</html>
