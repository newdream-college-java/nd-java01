<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>客服中心_汽车票查询_12308全国汽车票</title>
<link href="favicon.ico" type="image/x-icon" />
<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
<meta name="description" content="12308是提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110." />
<link rel="stylesheet" href="Css/base.css" />
<link rel="stylesheet" href="Css/help.css" />
<link rel="stylesheet" href="Css/validate.css" />
<script src="Scripts/require.js" data-main="http://cdn-resource-alias.12308.com/2015/js/common/help-main.js"></script> 
</head>
<body>
	<!--顶部公用-->
<!--顶部公用-->
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
<style>
.navmenu li.ico em{position: absolute;background:url("Images/ico.gif") no-repeat 0px 15px;height:50px;left: 120px;top: -35px;width:65px;display:block;}
.navmenu li.ico a{color:#ff0;}
.navmenu li.ico a.cur{color:#0096ff;}
.navmenu li.ico a:hover{color:#f90;}
.navmenu li.ico a,.navmenu li.ico span,.navmenu li.ico i{/* transition:all 0.3s ease; */ transition: none;}
</style>
<!--导航菜单-->
 <div class="bodymenu">
    <div class="mainnav"> 
        <ul class="navmenu">
        <li class="nav_0"><a href="http://www.12308.com" title="首页"><i></i>首页<span></span></a></li>
        <li class="nav_1"><a href="http://www.12308.com/index/chepiao.html" id="booking_menu" onclick="javascript:_hmt.push(['_trackEvent', 'index_booking_menu', 'click', 'booking_menu']);" title="汽车票预订"><i></i>汽车票预订<span></span></a></li>
        <li class="nav_2 ico"><a href="http://www.12308.com/huodong/wyindex.html" tts="link_3316" title="全国特价票" target="_blank"><i></i>全国特价票<span></span><em></em></a></li>
        <li class="nav_5"><a href="http://www.12308.com/baoche/index.html" title="我要包车"><i></i>我要包车<span></span></a></li>
        <li class="nav_3"><a href="http://www.12308.com/news/index.html" title="资讯中心"><i></i>资讯中心<span></span></a></li>
        <li class="nav_4"><a href="http://www.12308.com/help/help.html" title="客服中心"><i></i>客服中心<span></span></a></li>
        </ul>
        <div class="navuserbg"></div>
        <ul class="navuser" id="login_content">
	        <li class="mytrip" id="login_menu">
               <a tltle="用户中心 " class="ushow" href="http://uc.12308.com">用户中心<em>图标</em></a>
	           <div style="display: none;" class="ubox" id="login_menubox">		        
		        <ul>
                   <li class=""><a tltle="我的订单 " rel="nofollow" href="http://uc.12308.com/order/usercenter/orderListAll.html">我的订单</a></li>
                    <li class=""><a tltle="我的提问 " rel="nofollow" href="http://uc.12308.com/message/questionList.html">我的提问</a></li>
                    <li class=""><a tltle="个人资料 " rel="nofollow" href="http://uc.12308.com/user/infoPage.html">个人资料</a></li>
		        </ul>
	        </div>
	        </li>
	         	<li class="reg">
	          		<a title="注册" rel="nofollow" href="http://uc.12308.com/register/registerPage.html">注册</a>
	       		 </li>
	        	<li class="out hide" style="display: none;">
	         		 <a title="退出" rel="nofollow">退出</a>
	       	    </li>
	       	   <li class="go">
              	 <span><a title="登录" href="http://uc.12308.com" class="logLin">登录</a></span>
                </li>
	         
        </ul>
        
       <!--有订单显示-->
      <!--  <span class="hasorder"><a href="#">1</a></span> -->
    </div>
 </div>
</div>
	<!--中间部份-->
	<input type="hidden" id="tabIndex" value="3">
	<input type="hidden" value="http://www.12308.com" id="basePath"/>
	<input type="hidden" value="http://cdn-resource-alias.12308.com/2015" id="resourcePath"/>
	<div class="b_pagecontainer">
		<div class="b_pagewrap">
			<!--背景/-->
			<div class="h20"></div>
			<div class="b_page">
				<div class="help-wrap">
					<!--左边/-->
<div class="help-left bgline">
	<div class="help-left_top"></div>
	<div class="b_nar">
		<dl>
			<dt>
				<a><span class="b_nar_arrow on"></span>新手指南</a>
			</dt>
			<dd>
				<a href="/bbm/register_guide.html">第1课（注册会员）</a>
			</dd>
			<dd>
				<a href="/bbm/booking_guide.html">第2课（选择班次）</a>
			</dd>
			<dd>
				<a href="/bbm/submit_guide.html">第3课（提交订单）</a>
			</dd>
			<dd>
				<a href="/bbm/pay_guide.html">第4课（在线支付）</a>
			</dd>
			<dd>
				<a href="/bbm/receive_ticket_guide.html">第5课（取票上车）</a>
			</dd>
		</dl>

		<dl>
			<dt>
				<a><span class="b_nar_arrow on"></span>常见问题</a>
			</dt>
				<dd>
					<a href="/help/help_24.html">车票预订</a>
				</dd>
				<dd>
					<a href="/help/help_25.html">在线支付</a>
				</dd>
				<dd>
					<a href="/help/help_26.html">取票乘车</a>
				</dd>
				<dd>
					<a href="/help/help_27.html">退票改签</a>
				</dd>
				<dd>
					<a href="/help/help_28.html">订单退款</a>
				</dd>
				<dd>
					<a href="/help/help_29.html">账户注册</a>
				</dd>
				<dd>
					<a href="/help/help_30.html">乘车规定</a>
				</dd>
				<dd>
					<a href="/help/help_31.html">其他问题</a>
				</dd>
				<dd>
					<a href="/help/help_32.html">购买保险</a>
				</dd>
		</dl>

		<dl>
			<dt>
				<a><span class="b_nar_arrow on"></span>车票保险</a>
			</dt>
			<dd>
				<a href="/bbm/e_insurance.html">车票电子保险</a>
			</dd>
			<dd>
				<a href="/bbm/pafreeins.html">平安免费保险</a>
			</dd>
			<dd>
				<a href="/bbm/pains.html">平安保险说明</a>
			</dd>
			<dd>
				<a href="/bbm/kmins.html">昆明车票保险</a>
			</dd>
			<dd>
				<a href="/bbm/tpyins.html">太平洋保险说明</a>
			</dd>
		</dl>

		<dl>
			<dt>
				<a><span class="b_nar_arrow on"></span>用户协议</a>
			</dt>
			<dd>
				<a href="/bbm/service_protocol.html">服务协议</a>
			</dd>
			<dd>
				<a href="/bbm/disclaimer.html">免责声明</a>
			</dd>
			<dd>
				<a href="/bbm/private_statement.html">隐私声明</a>
			</dd>
		</dl>

		<dl>
			<dt>
				<a><span class="b_nar_arrow on"></span>关于我们</a>
			</dt>
			<dd>
				<a href="/bbm/intro.html">12308简介</a>
			</dd>
			<dd>
				<a href="/bbm/contact_us.html">联系我们</a>
			</dd>
			<dd>
 				<!-- <a href="javascript:void(0);">商务合作</a> -->
				<a href="/bbm/join_us.html">诚征英才</a>
			</dd>
		</dl>
	</div>
</div>					<!--左边/-->
					<!--右边/-->
						<div class="help-right">
							<ul class="aq_state">
								<li class="active"><a href="http://www.12308.com/help/selfService.html">自助服务</a></li>
								<li><a href="http://www.12308.com/help/personService.html">人工服务</a></li>
								<li><a href="http://www.12308.com/help/travellerList.html">旅客提问</a></li>
								<li><a href="http://www.12308.com/help/complainAndAdvise.html">投诉建议</a></li>
							</ul>
							<div class="aq_content">
<script type="text/javascript">
var travelAsk = {
	submit:function(){
		var question = document.addHelp.question.value;
		if(question==null||$.trim(question)==""){
			$($(".msg-weak")[0]).css("display","block");
			return;
		}else{
			$($(".msg-weak")[0]).css("display","none");
		}
		var desc = document.addHelp.desc.value;
		var code = document.addHelp.code.value;
		if(code==-1){
			$($(".msg-weak")[1]).css("display","block");
			return;
		}else{
			$($(".msg-weak")[1]).css("display","none");
		}
		var nick = document.addHelp.nick.value;
		_obj.overlay.loadingShow();
		$.ajax({
			url : "http://www.12308.com/help/add.html",
			type: 'POST',
			data : {
				question:question,
				desc:desc,
				code:code,
				nick:nick
			},
			success : function(msg) {
				_obj.overlay.loadingHide();
				var jsonData = $.parseJSON(msg);
				if(jsonData.rsCode=="0"){
					var desc = "保存成功,我们会尽快处理您的疑问.";
					var charLength = (desc+"").split("").length;
					_obj.openDialog.show(0,charLength,desc);
					//清空内容
					$("#asktitle_input").val("");
					$("#askinfo_area").val("");
					$(".ask_select").val("-1");
					$("#isanon").attr("checked",false);
				}else{
					var desc = jsonData.rsDesc;
					var charLength = (desc+"").split("").length;
					_obj.openDialog.show(1,charLength,desc);
				}
			},
			error:function(){
				_obj.overlay.loadingHide();
				var desc = "保存失败,请稍后再试.";
				var charLength = (desc+"").split("").length;
				_obj.openDialog.show(1,charLength,desc);
			}
		});
	}
}
</script>
<div class="aq_con_b">
	<div class="askfrom_b">
		<h4>
			<span class="left"><i class="i_ask left"></i>请把您的问题告诉我们</span><span class="c888 right f12">专业客服为您在线解答</span>
		</h4>
		<form action="http://www.12308.com/help/add.html" method="post" name="addHelp">
		<input type="text" placeholder="请详细输入您的问题 ，会有助于你获得满意的解答。" name="question" class="ask_input" id="asktitle_input">
		<div class="msg-info">
			<div class="msg-weak msg-error" style="display: none;">
				<i></i> <label class="valid">提示：请输入内容</label>
			</div>
		</div>
		<div class="h20"></div>
		<h4>
			问题补充<span class="c888 f14"> （选填）</span>
		</h4>
		<textarea placeholder="如问题标题无法详细阐述你的问题，你可以在此补充。" name="desc" class="ask_input ask_text" id="askinfo_area"></textarea>
		<div class="h20"></div>
		<div class="ask_bd">
			<span class="left"> 
				<select name="code" class="ask_select">
						<option value="-1">选择分类</option>
								<option value="1">车次查询</option>
								<option value="2">购票问题</option>
								<option value="3">支付问题</option>
								<option value="4">取票乘车</option>
								<option value="5">保险问题</option>
								<option value="6">退票改签</option>
								<option value="7">退款问题</option>
								<option value="8">其他问题</option>
								<option value="18">出票问题</option>
				</select>
				<div class="msg-info">
					<div class="msg-weak msg-error" style="display: none;">
						<i></i> <label class="valid">提示：请选择分类</label>
					</div>
				</div>
			</span>
			<div class="askbutton right">
				<a title="提交问题" rel="nofollow" href="javascript: travelAsk.submit();" class="btn_blue right">提交问题</a><span class="c888 right"><input type="checkbox" id="isanon" name="nick" value="1"><label>匿名</label></span>
			</div>
		</div>
		</form>
	</div>

	<div class="h40 clearfix"></div>
	<!--以下为热门问题-->
	<div class="hot-mod">
		<h1>
			<b>以下为热门问题</b>
		</h1>
		<div class="info1">
			<ul>
					<li><a href="http://www.12308.com/help/q101020.html">网上支付款 </a></li>
					<li><a href="http://www.12308.com/help/q101019.html">提前一个小时停止网络售票？ </a></li>
					<li><a href="http://www.12308.com/help/q101018.html">退票 </a></li>
					<li><a href="http://www.12308.com/help/q101017.html">取票怎么取 </a></li>
					<li><a href="http://www.12308.com/help/q101015.html">退款 </a></li>
					<li><a href="http://www.12308.com/help/q101014.html">购票问题 </a></li>
			</ul>
		</div>

		<div class="info2">
			<ul>
					<li><a href="http://www.12308.com/help/q101013.html">选择时段 </a></li>
					<li><a href="http://www.12308.com/help/q101012.html">取票联系人写错怎么办 </a></li>
					<li><a href="http://www.12308.com/help/q101011.html">改签 </a></li>
					<li><a href="http://www.12308.com/help/q101010.html">出票失败，钱什么时候退，退到哪？ </a></li>
					<li><a href="http://www.12308.com/help/q101008.html">苏州南站到庙港的大巴 </a></li>
					<li><a href="http://www.12308.com/help/q101007.html">路线查询 </a></li>
			</ul>
		</div>
	</div>
</div>							</div>
						</div>
					<!--右边/-->
				</div>
			</div>
		</div>
	</div>
	<!--公用Foot和友情链接-->
<div class="h40"></div>
<div class="foot-main"><div class="foot-nav clearfix">
<ul>
<li><span class="foot-n1"></span><h2>支付安全</h2><p>在线支付100%认证</p></li>
<li><span class="foot-n2"></span><h2>实时同步</h2><p>全国汽车站联网售票</p></li>
<li><span class="foot-n3"></span><h2>全天服务</h2><p>7*24小时专业客服人员为您服务</p></li>
<li><span class="foot-n4"></span><h2>方便快捷</h2><p>取票自由，车站直接取票上车</p></li>
</ul>
</div></div>
<div class="helpserver">
<div class="main-wrap">

    <div class="helplist">
      <div class="help_l">
      <h2>新手指南</h2>
      <ul>
        <li><a href="http://uc.12308.com/register/registerPage.html" target="_blank">用户注册</a></li>
        <li><a href="http://www.12308.com/bbm/pay_guide.html" target="_blank">在线支付</a></li>
        <li><a href="http://www.12308.com/bbm/receive_ticket_guide.html" target="_blank">取票上车</a></li>
      </ul>
      </div>
      
     
      
      <div class="help_l">
      <h2>购票须知</h2>
      <ul>
        <li><a href="http://www.12308.com//bbm/ckxz.html" rel="nofollow">乘客须知</a></li>
       <!--   <li><a href="http://www.12308.com/help/help_27.html" rel="nofollow">取票须知</a></li>-->
        <li><a href="http://www.12308.com/index/timeList.html" rel="nofollow">售票预售期</a></li>
      </ul>
      </div>
      
       <div class="help_l">
      <h2>常见问题</h2>
      <ul>
        <li><a href="http://www.12308.com/help/help_22.html" target="_blank">班次查询</a></li>
        <li><a href="http://www.12308.com/help/help_27.html" target="_blank">退票问题</a></li>
        <li><a href="http://www.12308.com/help/help_25.html" target="_blank">支付问题</a></li>
      </ul>
      </div>
      
      <div class="help_l">
      <h2>乘车保险</h2>
      <ul>
       <!--  <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">保险须知</a></li>
        <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">车票保险</a></li> -->
        <li><a href="http://www.12308.com//bbm/e_insurance.html" target="_blank">电子保险</a></li>
        <li><a href="http://www.12308.com/bbm/pains.html" target="_blank">保险说明</a></li>
      </ul>
      </div>
      
      <div class="help_l">
      <h2>会员服务</h2>
      <ul>
        <li><a href="http://uc.12308.com/resetPwd/resetPwdByMobilePage.html" rel="nofollow">找回密码</a></li>
        <li><a href="http://www.12308.com/help/complainAndAdvise.html" rel="nofollow">投诉与建议</a></li>
        <li><a href="http://www.12308.com/bbm/contact_us.html">联系客服</a></li>
      </ul>
      </div>
      
      <div class="help_last">
      <div class="help_time"><h2>服务热线</h2><p><span></span><b>0755-82867116</b></p></div>
      <div class="help_weibo"><span></span><a target="_blank" href="http://weibo.com/12308com"><p>关注微博</p></a></div>
      <div class="help_weixin"><span></span><a target="_blank" href="http://app.12308.com/weixin.html"><p>关注微信</p></a></div>
      </div>
    </div>
    <div class="clear"></div>
</div>
</div>
 <!--公用Foot和友情链接-->
<div class="h05"></div>
 <div class="footer">
  <div class="footer-bd">
    <p>
      <em>&copy; 2015 12308.com 版权所有</em>
      <b>|</b>
      <span>粤ICP备14020827号-1</span>
    </p>
    <p>
      <a href="http://www.12308.com/bbm/intro.html" target="_blank" title="关于12308">关于12308</a><b>|</b>
      <a href="http://www.12308.com/bbm/contact_us.html" target="_blank" title="联系我们">联系我们</a><b>|</b>
      <a href="http://www.12308.com/bbm/service_protocol.html" target="_blank" title="服务协议">服务协议</a><b>|</b>
      <a href="http://www.12308.com/bbm/join_us.html" target="_blank" title="诚征英才">诚征英才</a><b>|</b>
      <a href="http://www.12308.com/help/help_0.html" target="_blank" title="常见问题">常见问题</a><b>|</b>
     <!--  <a href="http://www.12308.com./yqlj.html" target="_blank" title="友情链接">友情链接</a><b>|</b> -->
      <a href="http://www.12308.com/help/complainAndAdvise.html" target="_blank" title="用户建议">用户建议</a>   
    </p>
    
  </div>
  
</div><span style=" visibility: hidden;">
<script type="text/javascript">
var _hmt = _hmt || [];
(function() {
  var hm = document.createElement("script");
  hm.src = "//hm.baidu.com/hm.js?7ae99e8c2df45dc624bafedd8216c545";
  var s = document.getElementsByTagName("script")[0]; 
  s.parentNode.insertBefore(hm, s);
})();
</script>
</span></body>
</html>