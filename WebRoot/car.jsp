<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
   <title>我要包车_汽车票查询_12308全国汽车票</title>
    
<meta charset="utf-8" />
<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
<meta name="description" content="12308是提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:0755-82867116 "/>
<meta name="baidu-site-verification" content="MJbcemLWY8" />
<meta property="qc:admins" content="15532463676123006375" />
<link href="http://cdn-resource.12308.com/2015/image/favicon.ico" type="image/x-icon"  rel="icon"/>
<link href="http://cdn-resource.12308.com/2015/image/favicon.ico" type="image/x-icon"  rel="shortcut icon"/>
    <link rel="stylesheet" href="Css/base.css" />
    <link rel="stylesheet" href="Css/validate.css" />
     <link rel="stylesheet" href="Css/wantcar.css" />
	<script src="Scripts/jquery-1.11.3.min.js"></script>
	<script src="Scripts/layer.js"></script>
	<script type="text/javascript" src="Scripts/47fd904675584084a373204bb8b8fc2d.js"></script>
    <script>
     var startLayer;
     var endLayer;
     function setDesInfo(cityName,alias,lngLat,stopType) {
    	 if(stopType == "s") {
    		 layer.close(startLayer);
    		 $("#startCity").val(cityName);
    		 $("#startPlace").val(alias);
    		 $("#startLongLat").val(lngLat);
    		 getDistance();
    	 } else if(stopType == "e"){
    		 layer.close(endLayer);
    		 $("#endCity").val(cityName);
    		 $("#arrivalPlace").val(alias);
    		 $("#endLongLat").val(lngLat);
    		 getDistance();
    	 } else {
    		 alert("系统异常，请联系客服!")
    	 }
     }
     //计算距离
     function getDistance() {
    	 var startLongLat = $("#startLongLat").val();
    	 if(startLongLat == "") {
    		 $("#distance").empty();
    		 return;
    	 }
    	 var endLongLat = $("#endLongLat").val();
    	 if(endLongLat == "") {
    		 $("#distance").empty();
    		 return;
    	 }
    	 var starts = startLongLat.split(",");
    	 if(starts.length != 2) {
    		 layer.msg("出发地点经纬度不完全,请重新获取出发地点!",{time:1500});
    		 return;
    	 }
    	 var ends = endLongLat.split(",");
    	 if(ends.length != 2 ) {
    		 layer.msg("到达地点经纬度不完全,请重新获取到达地点!",{time:1500});
    		 return;
    	 }
    	 
    	 var start = new BMap.Point(starts[1],starts[0]);
    	 var end = new BMap.Point(ends[1],ends[0]);
    	 var map = new BMap.Map("map-1");
    	 var transit = new BMap.DrivingRoute(map, {renderOptions: {map: map},
    			onSearchComplete: function(results) {
    				if (transit.getStatus() != BMAP_STATUS_SUCCESS){
    					layer.msg("没有通过出发到达点获取到距离，请重新选择上出发到达点!",{time:1500});
    					return;
    				}
    				var plan = results.getPlan(0);
    				var distance = plan.getDistance(true);
    				if(distance.indexOf("米") >=0 ) { //
    					layer.alert("出发地点距离到达地点小于1km,不接受包车服务。请重新选择出发和到达地点，请您谅解！");
    					cleardesInfo();
    					return;
    				}
    				$("#distancespan").html(distance);
    				$("#distance").val(distance);
    			}
    	 });
    	 transit.search(start, end);
     }
     
     //清除所有地址信息 
     function cleardesInfo() {
    	 $("#distance").text("");
    	 $("#startCity").val("");
		 $("#startPlace").val("");
		 $("#startLongLat").val("");
		 $("#endCity").val("");
		 $("#arrivalPlace").val("");
		 $("#endLongLat").val("");
     }
     $(function(){
	   $("#startPlace").on("click",function () {
			startLayer = layer.open({
	                type: 2,
	                title: '地图标注--键导航地址(支持搜索和直接拖拽)',
	                //shadeClose: true,
	                shade: 0.1,
	                skin: 'layui-layer-lan',
	                area: ['800px', '500px'],
	                content: 'http://www.12308.com/baoche/mapdiv.html?type=s' //iframe的url
	            });
	        });
		$("#arrivalPlace").on("click",function () {
			endLayer = layer.open({
	                type: 2,
	                title: '地图标注--键导航地址(支持搜索和直接拖拽)',
	                //shadeClose: true,
	                shade: 0.1,
	                skin: 'layui-layer-lan',
	                area: ['800px', '500px'],
	                content: 'http://www.12308.com/baoche/mapdiv.html?type=e' //iframe的url
	            });
	        });
		 $(".windowopen .close a").click(function(){
		      $("#winBaoche").fadeOut(300);
		 });
     });
     function templately(){
    	 $("#winBaoche").css("display","block");
     }
	</script>
</head>
<body>
<div id="winBaoche" style="display: none">
<div class="main-wrap">
<div class="windowopen">
 <div class="close"><a>关闭</a></div>
 <div class="windowimg">
    <ul>
      <li><!-- 12308暂停接包车订单，将于<label>2月16日</label>开始恢复运营，敬请谅解。 -->
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;值此新春佳节之际，小八祝您阖家欢乐，猴年大吉。因为春节期间，司机师傅回家团聚，车辆休整，我司“我要包车”业务暂停运营，预计<label>2月16日</label>恢复运营，对您造成的不便敬请谅解，期待我们的年后再见吧。<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;客服电话 : 0755-33075425
      </li>
    </ul>
 </div>
</div>
</div>
<div class="windowbg"></div>
</div>

<!--顶部公用-->
<!--顶部公用-->
<div class="bodyhead">
 <div class="main-wrap">
  <h1 class="logo"><a title="12308全国汽车票网" href="index.html">12308全国汽车票网</a></h1>
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
 <!--导航菜单-->
 <div class="bodymenu">
    <div class="mainnav"> 
        <ul class="navmenu">
        <li class="nav_0"><a href="index.html" title="首页"><i></i>首页<span></span></a></li>
        <li class="nav_1"><a href="chepiao.html" id="booking_menu" onclick="javascript:_hmt.push(['_trackEvent', 'index_booking_menu', 'click', 'booking_menu']);" title="汽车票预订"><i></i>汽车票预订<span></span></a></li>
        <li class="nav_2 ico"><a href="http://www.12308.com/huodong/wyindex.html" tts="link_3316" title="全国特价票" target="_blank"><i></i>全国特价票<span></span><em></em></a></li>
        <li class="nav_5"><a href="car.html" title="我要包车"><i></i>我要包车<span></span></a></li>
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
	          		<a title="注册" rel="nofollow" href="register.html">注册</a>
	       		 </li>
	        	<li class="out hide" style="display: none;">
	         		 <a title="退出" rel="nofollow">退出</a>
	       	    </li>
	       	   <li class="go">
              	 <span><a title="登录" href="login.html" class="logLin">登录</a></span>
                </li>
	         
        </ul>
        
       <!--有订单显示-->
      <!--  <span class="hasorder"><a href="#">1</a></span> -->
    </div>
 </div>
</div>
<!--中间部份-->
<div class="banner_n">
        <!--  banner cms start  -->
 <div class="banner_wrap has-dots" style="overflow: hidden; width:100%;height:380px;">
  <ul class="pic_show">    
     <li><a style="background:url(Images/car_banner1.png) no-repeat center bottom;" target="_blank" href="#"></a></li>        
   </ul>
 </div>
</div>
 
 <!--/banner-->
 
 	<input type="hidden" value="http://payment.12308.com" id="payPath"/>
	<input type="hidden" value="http://www.12308.com" id="basePath"/>
	<input type="hidden" value="http://cdn-resource-alias.12308.com/2015" id="resourcePath"/>
	<input type="hidden" value="http://uc.12308.com" id="userCenterPath"/>

<div class="main-wrap">
<div class="h20"></div>
<div class="bw-box">
<h2 class="m_title"><span>当前进度</span></h2>
 <div class="txtCon1">
    <ul>
       <li class="cur">
             <div class="pic"><em class="icon1"></em></div>
              <div class="title">填写线路</div>
       </li>
       <li>
             <div class="pic"><em class="icon2"></em></div>
              <div class="title">去选车</div>
       </li>
       <li>
             <div class="pic"><em class="icon3"></em></div>
              <div class="title">确认订单</div>
       </li>
      
        <li class="last">
             <div class="pic"><em class="icon4"></em></div>
              <div class="title">在线支付</div>
       </li>
     </ul>
 </div>
</div>
<div class="h20"></div>
<div class="bw-box">
<h2 class="m_title"><span>包车信息</span></h2>
 <div class="txtCon2">
 <div class="pub-form2">
     <div class="h30"></div>
         <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input5">联 系 人：</label></span>
             <div class="s-input-box"><input type="text" placeholder="请输入包车联系人" class="i-input" id="userName" name="userName" maxlength="32"></div>
        	 <span class="msg-info">
                  <span class="msg-weak" id="userNameTip"><i></i>
                      <label class="valid" id="userNameLabel">必填,请输入包车联系人</label>
                  </span>
             </span>
        </div>
        
         <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">联系手机：</label></span>
              <div class="s-input-box"><input type="text" placeholder="请输入您的手机号码" class="i-input" id="mobilePhone" name="mobilePhone" maxlength="11"></div>
              <span class="msg-info">
                    <span class="msg-weak" id="mobilePhoneTip"><i></i>
                        <label class="valid" id="mobilePhoneLabel">必填,请输入您的手机号码</label>
                    </span>
               </span>
            </div>  
              
          <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">用车时间：</label></span>
             <div class="input-img">
                        <input name="startTime" type="text" id="startTime" class="i-input cinput" readonly="true" />
                        <i class="date">日期</i>
                        </div>
                        
             <span class="msg-info">
                    <span class="msg-weak" id="startTimeTip"><i></i>
                        <label class="valid" id="startTimeLabel">必填,请选择用车时间</label>
                    </span>
               </span>
               
          </div>  
          
           <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">出发地点：</label></span>
             <div class="input-img">
                        <input name="startPlace" type="text" id="startPlace" class="i-input cinput" placeholder="请输入您的具体地点" />
                        <input id="startCity" type="hidden" />
                        <input id="startLongLat" type="hidden" />
                        <i class="city">地点</i>
                        </div>
                        
             <span class="msg-info">
                    <span class="msg-weak" id="startPlaceTip"><i></i>
                        <label class="valid" id="startPlaceLabel">必选,请选择具体的出发地点</label>
                    </span>
               </span>
               
          </div>  
          
          
           <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">到达地点：</label></span>
             <div class="input-img">
                        <input name="arrivalPlace" type="text" id="arrivalPlace" class="i-input cinput" placeholder="请输入您的具体到达地点"/>
                        <input id="endCity" type="hidden" />
                        <input id="endLongLat" type="hidden" />
                        <i class="city">地点</i>
                        </div>
                        
             <span class="msg-info">
                    <span class="msg-weak" id="arrivalPlaceTip"><i></i>
                        <label class="valid" id="arrivalPlaceLabel">必选,请选择具体的到达地点</label>
                    </span>
               </span>
          </div> 
          
           <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">公 里 数：</label></span>
             <span class="input-txt" id="distancespan"></span>
             <input type ="hidden" id="distance"/>
          </div> 
          
          <div class="fm-li pbot-5">
          <span class="fm-label"><label for="txt_input6">出行人数：</label></span>
            <div class="s-input-box"><input type="text" class="i-input" id="personCount" name="txt_input5" maxlength="6"></div>
                        
             <span class="msg-info">
                    <span class="msg-weak" id="personCountTip"><i></i>
                        <label class="valid" id="personCountLabel">必填,请输入出行人数</label>
                    </span>
               </span>
          </div>
          
          <div class="fm-li pbot-5">
          	 <span class="fm-label">
          	 	<label for="txt_input6">包车类型：</label>
          	  </span>
             <span class="input-txt">
            	 <input type="hidden" id="isBack" value="1"/>
	             <span class="check_box right">
		             <label>
		             	<input id="isBack_0" name="check_box1" class="lo_check" type="radio"><span>往返</span>
		             </label>
	             </span>
	             <span class="check_box right">
	                 <label>
	                 	<input id="isBack_1" name="check_box1" class="lo_check" type="radio" checked="true"><span>单程</span>
	                 </label>
	             </span>  
             </span>
           </div>
           
           <div class="fm-li pbot-5" id="fcBox" style="display: none;">
          	 <span class="fm-label"><label for="txt_input6">返程时间：</label></span>
           	 <div class="input-img">
                 <input name="arrivalTime" type="text" id="arrivalTime" class="i-input cinput" readonly="readonly" />
                 <i class="date">日期</i>
             </div>
             <span class="msg-info">
                <span class="msg-weak" id="arrivalTimeTip"><i></i>
                    <label class="valid" id="arrivalTimeLabel">必填,请选择返程时间</label>
                </span>
             </span>
           </div>
          
           <div class="fm-li pbot-5">
          	 <span class="fm-label">
          		<label for="txt_input6">开具发票：</label>
          	 </span>
             <span class="input-txt">
                 <input type="hidden" id="invoice" value="0"/>
	             <span class="check_box right">
		             <label>
		             	<input id="CheckboxGroup1_0" name="invoice" class="lo_check" type="radio"><span>需要</span>
		             </label>
	             </span>
	             <span class="check_box right">
	                <label>
	                	<input id="CheckboxGroup1_1" name="invoice" class="lo_check" type="radio" checked="true"><span>不需要</span>
	                </label>
	             </span>  
             </span>
           </div> 
          
           <div class="fpiao_box" style="display: none;">
           	    <div class="fm-li pbot-5">
          	 <div class="fm-li_b b_0">
             <span class="fm-label2"><label for="txt_input5">发票抬头：</label></span>
             <div class="s-input-box"><input type="text" placeholder="请输入发票抬头" class="i-input" id="invoiceTitle" name="invoiceTitle" value="" maxlength="30"></div>
             </div>
              <span class="msg-info">
                    <span class="msg-weak" id="invoiceTitleTip"><i></i>
                        <label class="valid" id="invoiceTitleLabel"></label>
                    </span>
               </span>
        	</div>
            
            <div class="fm-li pbot-5">
          	 <div class="fm-li_b b_0">
             <span class="fm-label2"><label for="txt_input5">收件人：</label></span>
             <div class="s-input-box"><input type="text" placeholder="请输入收件人" class="i-input" id="recipients" name="recipients" value="" maxlength="10"></div>
             </div>
              <span class="msg-info">
                    <span class="msg-weak" id="recipientsTip"><i></i>
                        <label class="valid" id="recipientsLabel"></label>
                    </span>
               </span>
        	</div>
            
            <div class="fm-li pbot-5">
          	 <div class="fm-li_b">
             <span class="fm-label2"><label for="txt_input5">快递地址：</label></span>
             <div class="s-input-box">
             <input type="text" placeholder="快递地址" class="i-input" id="address" name="address" value="" maxlength="30">
             </div>
             </div>
              <span class="msg-info">
                    <span class="msg-weak" id="addressTip"><i></i>
                        <label class="valid" id="addressLabel"></label>
                    </span>
               </span>
        	</div>
	        <!-- <div class="s-input-box2"><input type="text" onfocus="javascript:if(this.value=='请输入发票抬头')this.value='';" value="请输入发票抬头" placeholder="请输入发票抬头" class="i-input2" id="invoiceTitle" name="invoiceTitle"  maxlength="30"></div>
	        <div class="s-input-box2"><input type="text" onfocus="javascript:if(this.value=='收件人')this.value='';" value="收件人" placeholder="收件人" class="i-input2" id="recipients" name="recipients"  maxlength="10"></div>
	        <div class="s-input-box2"><input type="text" onfocus="javascript:if(this.value=='快递地址')this.value='';" value="快递地址" placeholder="快递地址" class="i-input2" id="address" name="address"  maxlength="30"></div> -->
           </div>
          
          <div class="h40"></div>
          <div class="fm-li pbot-5">
          <span class="fm-label fm-labelh"><label for="txt_input6"></label></span>
            <div class="s-input-box">
            <a class="btn_red" id="toAddCar">下一步</a>
            <!-- <a class="btn_gray" id="toAddCar2" disabled ="true">下一步</a> -->
            
           <p class="check_box"><label for="check_box"><input checked="true" id="checkrember" name="check_box" class="lo_check" type="checkbox"><span><a href="javascript:void(0);" class="tsl c666" id="agreement-content1">我已阅读并接受<b class="cblue"> 《包车协议》</b></a> </span></label></p>
           <div style="display: none;" id="showContent" class="agreement-content agreement-content1">

<p>深圳市一二三零八旅行社有限公司（以下简称我们）拥有包括但不限于“12308全国汽车票”应用程序、微信公众号、微博等信息服务平台。本电子协议适用于您访问和使用“12308全国汽车票”应用程序、微信公众号等12308全国汽车票信息服务平台（以下简称“12308汽车票平台”）。您在使用12308汽车票提供的各项服务的同时即意味着承诺接受本协议。您通过阅读本协议并点击 “接受”按钮即表示您与我们达成协议，自愿接受本协议的所有内容，并保证遵守本协议条款。请您务必在使用前认真阅读全部协议内容，如有疑问，请向12308汽车票咨询。
<br/><span class="c33">一、12308汽车票平台提供的服务</span>
<br/>我们将根据您在12308汽车票平台提交的用车需求向您提供相匹配的适宜的巴士运输服务公司（以下简称巴士服务商）的服务。我们允许巴士服务商在其投入运营的巴士车身上使用我们所拥有的企业名称、商标、标识，如“12308汽车票”并不意味着我们提供相关的运输服务。巴士服务商是提供用车服务的主体，由巴士服务商与您成立运输协议，向您履行运输义务，承担运输责任。我们免费向您提供12308汽车票平台预约巴士服务，我们保留未来向您收取平台服务费的权利。
<br/><span class="c33">二、用车时间付款及发票</span>
<br/>我们将以您提交的用车需求为准给您匹配相应的报价及巴士运输服务。为了确保您的用车，请您在约定时间内支付用车费用。我们使用第三方电子支付平台处理您使用巴士服务相关的费用支付，请您遵守电子服务商及信用卡/借记卡发卡行的条款和政策约束。我们对电子支付服务或银行发生的错误不承担任何责任。
<br/><span class="c33">三、您的权利及义务</span>
<br/>1、要求提供具有相关道路运输许可资质的巴士运输服务商，巴士运输服务商保证车辆行驶安全和运营手续的合同法性、有效性，并保证为车辆购买保险并在出险后负责办理保险理赔事宜，配备具有相应从业资格的驾驶员；
<br/>2、要求巴士服务商提供良好的乘车环境，确保车辆设备、设施齐全有效、保持车厢清洁、卫生、并采取必要的措施防止在运输过程中发生侵害甲方人身、财产安全的违法行为；
<br/>3、您应向巴士服务商提供真实、准确的个人信息及其他必须的信息；
<br/>4、按照约定的时间地点等待乘车；
<br/>5、不得携带法律法规禁止携带的危险物品乘车，否则巴士服务商有权拒绝您乘坐车辆；
<br/>6、不得从事道路运输经营活动，包括设点销售客票，招揽散客等，不得从事盈利性的客运代理活动；
<br/><span class="c33">四、责任限制</span>
<br/>您通过12308汽车票平台预约的具体巴士运营服务由巴士服务商向您提供，不与我们直接相关，巴士服务商有义务保障服务的合法安全性，并购买相应的保险。我们将在合理范围内保证服务信息准确，但无法保证其中没有任何错误或缺陷。在法律允许的范围内，对于因使用12308汽车票平台导致的损害我们不承担责任，除非损害是由我们故意或重大过失导致的。我们对我们的服务造成的损失承担的全部责任不应超过我们就导致损失的服务收取的服务费的总额。
<br/><span class="c33">五、协议的生效及争议的解决</span>
<br/>1、本协议自您通过12308汽车票平台成功预约巴士服务之时起生效。
<br/>2、有关本协议的争议，应友好协商解决。协商不成的，应提交深圳市一二三零八网络科技有限公司所在地人民法院诉讼解决。
<br/>3、本协议的最终解释权归一二三零八旅行社有限公司所有
</p>   

						</div>
           </div>
          </div>
          </div>
 </div>
</div>

</div>
<!--底部和调用-->
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
  
</div><div id="map-1" style="display:none"></div>
<script src="Scripts/require.js" data-main="http://cdn-resource-alias.12308.com/2015/js/baoche.js"></script> 
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
</span></body>
</html>