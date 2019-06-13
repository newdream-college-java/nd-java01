<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="12308全国公路客运预订平台,汽车票预, 汽车票查询,汽车票销售,网上汽车票预订,网上汽车票查询,汽车时刻表" />
	<meta name="description" content="中国道路运输协会与12308共建的一个全国公路客运平台，负责对全国汽车站的联网，实现网络在线即时购票，线下取票服务。同时还提供汽车票查询,汽车时刻表查询,汽车票预订,汽车站查询等。企业电话咨询热线:0755-36637486"/>

	<title>12308全国公路客运预订平台_用户中心_订单详情</title>
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


<script type="text/javascript" src="Scripts/jquery.qrcode.min.js"></script>
<script type="text/javascript" src="Scripts/jquery-barcode-last.min.js"></script>
<script>
    
 $(document).ready(function() {
	$("#dd11").attr("class","active");
    initQrcode("","");
});		

function initQrcode(ticketCode,barCode){
  var html = "";
  if(ticketCode!=null && ticketCode!=""){
    var arr = ticketCode.split(",");
    for(var i =0;i<arr.length;i++){
       html +="<li><div id='ewm_"+i+"'";
       html +=" class='codeImg'><p class='yellow'>旅客凭此二维码上车</p></div></li>";
    }
   }
   if(barCode!=null && barCode!=""){
    var barCodeArr = barCode.split(",");
    for(var i =0;i<barCodeArr.length;i++){
       html +="<li><div id='bar_"+i+"'";
       html +=" class='codeImg'></div></li>";
    }
   }
    $("#codeUl").html(html);
  if(ticketCode!=null && ticketCode!=""){
    var arr = ticketCode.split(",");
    for(var i =0;i<arr.length;i++){
       var id = "#ewm_"+i;
       $(id).qrcode({
	    render: "table", //table方式 
	    width: 140, //宽度 
	    height:140, //高度 
	    text: arr[i] //任意内容 
	 }); 
    }
   }
  if(barCode!=null && barCode!=""){
    var barCodeArr = barCode.split(",");
    for(var i =0;i<barCodeArr.length;i++){
       var id = "#bar_"+i;
        $(id).barcode(barCodeArr[i], "int25", { barWidth: 2, barHeight: 40 });
    }
  }
}

	</script>
</head>
<body>

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
   <div class="b_ucbreadcrumb">
              <input type="hidden" id="barCode" value=""/>
              <input type="hidden" id="ticketCode" value=""/>
				<a href="http://uc.12308.com/user/infoPage.html"> 个人中心</a><em>&gt;</em>
				 <span id="nowNav">我的订单详情</span></div>
				 <!--\breadcrumb--> 
				<div style="width:770px">
					<div class="flowstep">
				 	<ol class="flowstep-1">
				 		<li class="step-1">
				 			<div id="divstep1" class="step-sub">
					 			<div class="step-name">订购车票</div>
					  			<div id="step1" class="step-no">1</div>
					  			<div class="step-time">
					  			</div>
				 			</div>
				 		</li>
				  		<li class="step-2">
				  			<div id="divstep2" class="step-sub">
				  				<div class="step-name">在线支付</div>
				  				<div id="step2" class="step-no">2</div>
				  				<div class="step-time"></div>
			 				</div>
			 			</li>
				  		<li class="step-3">
				  			<div id="divstep3" class="step-sub">
				  				<div class="step-name">车站出票</div>
				  				<div id="step3" class="step-no">3</div>
				  				<div class="step-time"></div>
			 				</div>
			 			</li>
				  		<li class="step-4">
				  			<div id="divstep4" class="step-sub">
				  				<div class="step-name">车站取票</div>
				  				<div id="step4" class="step-no">4</div>
				  				<div class="step-time"></div>
				  			</div>
				  		</li>
				  		<li class="step-5">
				  			<div id="divstep5" class="step-sub">
					  			<div class="step-name">乘车</div>
					  			<div id="step5" class="step-no">5</div>
					  			<div class="step-time"></div>
				  			</div>
				  		</li>
				</ol>
				</div>
				
				<div class="flowstep_main"> 
				<h4><span class="title">基本信息</span></h4>
				<div class="pay-dialog">
				<p class="title">订单编号：<span class="yellow">0020160428255726</span></p>				
				<dl class="trade-detail-imfor">
				    <dt class="imfor-icon">
				    	<img src="Picture/gth.png">
				    </dt>
				    <dd class="imfor-title">订单状态：<span class="red">
          	   		 订单关闭
          	   		 
				    </span></dd>
				       <p class="f12 red"><a href="http://uc.12308.com/order/usercenter/againBook_3957863.html">再次预订</a></p></dd>
				</dl>
				</div>
			
				
				<div class="inner"> 
				<p class="titlep">车票信息</p>
				<table class="user_table detailstable">            
				    <thead> <tr> <th width="25%" class="pr10">线路/时间</th>
				              <th width="20%" class="pr10">票价</th>
				              <th>手续费 </th>
				              <th>订单金额</th>
				              <th>优惠</th>
				              <th>支付金额</th>
				               </tr></thead>
				              <tbody><tr> 
				              <td width="18%" class="pr10">长沙 -- 常德<br/>
				                                  上车点： 长沙市汽车西站 <br/>
				                                  下车点： 常德<br>2016-04-30&nbsp;08:10</td>
				              <td width="15%" class="pr10">全价票：￥64.00 X 1<br>半价票：￥0.00 X 0</td>
				              <td> &nbsp;&nbsp;--  </td>
				              <td> <b class="yellow"> ￥64.0</b> </td>
				              <td><b class="yellow">  ￥0.00</b> </td>
				              <td><b class="yellow">￥0.00</b></td>
				               </tr></tbody>
				          </table>
				<p class="titlep">保险信息</p>
				
				<table class="user_table detailstable">            
				    <thead> <tr> <th width="10%" class="pr10">保险公司</th>
				              <th width="24%">保单号</th>
				              <th width="">投保人 </th>
				              <th width="24%">身份证</th>
				              <th width="">手机号码</th>
				              <th width="10%">状态</th> </tr> </thead>
							    <tr>
				              <td class="pr10">
				                 免费保险                   
				                				              </td>
				              <td>10455031900237268080</td>
				              <td>李大大/1</td>
				              <td>43************5X</td>
				              <td>18684858888</td>
				              <td>
				              失败
				              </td>
				               </tr>
					         <tbody>               
						</tbody>
				          </table>
	
	<div class="info_detail">
			<p class="info" style="width:764px;"><b>1</b><span class="info1">姓名：李大大</span>
			<span class="info2">证件类型： 第二代身份证</span>
			<span class="info3">43************5X</span>
		    <!--<span class="info4">成人（全价票）</span>-->
		</p>
	</div>
				<div class="info_detail">
				<p class="titlep">联系人信息</p>
				<p class="info"><span class="info1">联系人：李大大 </span><span class="info2">手机：18684858888</span>
				<span class="info3">身份证：43010119900605105X</span>
				</p>
				
				</div>
				
				</div>
				</div>
            </div>
<!--right/-->
            </div>
            <!--right-->
        <!--right-->
        </div>
    </div>
</div>
 <!--myend-->
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