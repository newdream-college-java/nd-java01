<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
<meta charset="utf-8" />
<title>12308-全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>
<link rel="shortcut icon" href="http://cdn-resource.12308.com/2015/image/favicon.ico" type="image/x-icon" />
<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
<meta name="description" content="12308是提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110." />
<link rel="stylesheet" href="Css/buy-min-201604.css" />
<!--<link rel="stylesheet" href="Css/common.css" />
<link rel="stylesheet" href="Css/base.css" />
<link rel="stylesheet" href="Css/chepiao.css" />
<link rel="stylesheet" href="Css/mright.css" />
<link rel="stylesheet" href="Css/common.css" /> -->
</head>
<body class="graybg" onselectstart="return false">
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
	<input type="hidden" id="scheduleId" value="917749A516301467D510CEC5791402AF" />
	<input type="hidden" id="ticketLimitNum" value="3" />
	<input type="hidden" id="serviceFee" value="0.0" />
	<input type="hidden" id="errorDesc" value="" />
	<input type="hidden" id="source" value="" />
	<input type="hidden" id="isSupportChildTicket" value="0"/>
	<input type="hidden" id="isSupportHalfTicket" value="0"/>
	<input type="hidden" id="fullPrice" value="64.0"/>
	<input type="hidden" id="halfPrice" value="0.0"/>
	<input type="hidden" id="isHuoDongLine" value=""/>
	<input type="hidden" id="hdTicketPrice" value=""/>
	<!--中间部份-->
	<input type="hidden" value="http://payment.12308.com" id="payPath"/>
	<input type="hidden" value="http://www.12308.com" id="basePath"/>
	<input type="hidden" value="http://cdn-resource-alias.12308.com/2015" id="resourcePath"/>
	<input type="hidden" value="http://uc.12308.com" id="userCenterPath"/>
	<div class="h20"></div>
	<div class="main-wrap">
		<div class="ticketstep">
			<ul class="step1">
				<!--step2,step3-->
				<li class="start"></li>
				<li class="li1"><span class="ico1">确定预订车票车次</span></li>
				<li class="li2"><span class="ico2">核对订单信息</span></li>
				<li class="li3"><span class="ico3">成功提交订单</span></li>
				<li class="end"></li>
			</ul>
		</div>
		<div class="ticketorder">
			<div class="tickettitle ticket_h1">
				<h1>
					<em>&nbsp;</em>长沙（长沙市汽车西站）- 常德
				</h1>
				&nbsp;<a href="http://www.12308.com/index/search.html" class="color4">[返回修改车次]</a>
			</div>
			<!--购买的车票信息-->
			<div class="lineitem buyticket">
				<table width="100%">
					<tr>
						<th class="first">车型/车次</th>
						<th class="second">出发/到达</th>
						<th class="third">发车时间</th>
						<th>里程</th>
						<th class="fifth">票价</th>
						<th>保险/张</th>
						<th>服务费/张</th>
						<th>车票数量</th>
						<th>总价</th>
					</tr>
					<tr>
						<td class="first"><p class="th_o">高档空调  </p>
							<p class="th_t">X0601</p></td>
						<td class="second"><span class="start">起</span>
							<p class="green">
								<a href="javascript:void(0);" id="buy_startCityName">长沙市汽车西站</a>
							</p> <span class="end">到</span>
							<p class="yellow">
								<a href="javascript:void(0);" id="buy_endCityName">常德</a>
							</p></td>
						<td class="third"><span id="buy_startDate">2016-05-02</span> 07:30</td>
						<td>185 km</td>
						<td class="fifth" id="priceView"><p>成人（全价票）<span class="allprice">¥<b class="ticketPrice">64.0</b>x1</span></p></td>
						<td>
								<span class="sprice">¥<span class="baoxianPrice">0.0</span></span>
							
						</td>
						<td><span class="sprice">¥<span class="servicePrice">0.0</span></span></td>
						<td><span class="ticketNum">1</span></td>
						<td>
								<span class="allprice">¥<b class="countPrice">64.0</b></span>
						</td>
					</tr>
				</table>
			</div>
			<div class="h05"></div>
			<!--乘客保险信息 -->
			<div class="ticket_h1">
				<h1>添加乘车人</h1>
			</div>
			<div class="safe_bd">
				<!--乘客保险信息 -->

				<div class="ticketbox">
					<div class="checkbox clearfix">
						<ul>
							<li class="cur"><span>常用联系人：</span></li> 
									<li><label class="passengerInfo"><input name="" type="checkbox" index="0" datacode="43010119900605105X" datatel="18684858888" value="李大大">李大大</label></li>
						</ul>
					</div>
					<div class="h15"></div>

					<div class="item" id="passageItem">

						<ul>
							<li class="first"><span>1</span></li>
							<li class="second2 s_w130"><label class="left"><em>*</em>姓名：</label>
								<div class="e_error_notice left" style="display:none;">
									<div class="inner">
										<div class="orange_layer">
											<div class="jt_layer">
												<cite class="bot"></cite><cite class="top"></cite>
											</div>
											<div class="content">不能为空</div>
										</div>
									</div>
								</div> <input type="text" class="txtinput w130" value="" methodname="userName" name="" maxLength="15"></li>
							<li class="s_w180"><label class="left"><em>*</em>身份证：</label>
								<div class="e_error_notice left" style="display:none;">
									<div class="inner">
										<div class="orange_layer">
											<div class="jt_layer">
												<cite class="bot"></cite><cite class="top"></cite>
											</div>
											<div class="content">不能为空</div>
										</div>
									</div>
								</div> <input type="text" class="txtinput w180" value="" methodname="cardNo" name="" maxLength="18"></li>
								<li class="s_select">
              						<div class="select-box"><div class="select-wrap">
                  					<select name="">
                     					<option value="0">成人（全价票）</option>
                  					</select>
               						</div></div>  
              					</li>
							<li class="s_w130"><label class="left"><em>*</em>手机号码： </label> <input type="text" class="txtinput w130"  value="" methodname="phone" name="" maxLength="11"></li>
							<li class="save">
								<span class="save_a">将此乘客设为取票人</span>
							</li>
							<li style="display:none;" class="del"><a>删除</a></li>
						</ul>
					</div>
					<div class="h20"></div>
					<!--点击增加联系人信息-->
					<div class="addsafe">
							<a id="addBaoXianButton" class="addbtn"><em>&nbsp;</em>添加乘车人</a><span class="cf60 left" id="addPassageError"> &nbsp;&nbsp;该车次单笔订单最多可购买3张车票</span>
							<div class="checkboxlink right c555">
								<label ><input type="checkbox" checked="" value="" id="checkboxlink" name="checkboxlink">
								我要免费购买<a href="http://www.12308.com/bbm/pafreeins.html" style="color:#3b8de3;" target="_blank">《平安活动保险》</a>
								（最高理赔<b class="cf60"> 5 </b>万元）
								</label>
								<!-- 儿童票 -->
							</div>	
					</div>

					<div class="safeprompt" style="display: none;">
						投保成功后，保险公司将生成电子保单，并将电子保单号发送到您登记的手机上，电子保单与纸质保单具有同等法律效力，您可以登录保险官网查询，下载。乘车站及12308暂不提供纸质保单。 详情请点击 <a class="color4">保险详细说明</a>

					</div>
				</div>

				<div class="h20"></div>
				<!--取票人/联系人信息 -->
				<div class="ticket_h1">
						<h1>谁去取票/取票人信息</h1>
				</div>
					<div class="prompt_y">
						<span><i class="i_attention">&nbsp;</i>需取票后乘车，建议开车前30分钟（节假日等高峰期建议提前1个小时）到出发站取票</span>
					</div>
				<div class="ticketbox">

					<div class="h15"></div>
					<div class="item item2" id="passageItemUser">
						<ul>
							<li class="second2 s_w160"><label class="left"><em>*</em>姓名：</label>
							<div class="e_error_notice left" style="display: none;">
									<div class="inner">
										<div class="orange_layer">
											<div class="jt_layer">
												<cite class="bot"></cite><cite class="top"></cite>
											</div>
											<div class="content">不能为空！</div>
										</div>
									</div>
								</div> <input type="text" value="" id="qupiaoUserName" methodname="userName" class="txtinput" style="width:150px;" maxLength="15"></li>
							<li class="s_w280"><label class="left"><em>*</em>身份证：</label>
								<div class="e_error_notice left" style="display: none;">
									<div class="inner">
										<div class="orange_layer">
											<div class="jt_layer">
												<cite class="bot"></cite><cite class="top"></cite>
											</div>
											<div class="content">不能为空</div>
										</div>
									</div>
								</div> <input type="text" value="" id="qupiaoCardNo" methodname="cardNo" class="txtinput" style="width:270px;" maxLength="18"></li>
							<li class="s_w180"><label class="left"><em>*</em>手机号码：</label> <input type="text" value="" id="qupiaoPhone" methodname="phone" class="txtinput" style="width:170px;" maxLength="11"></li>
							<!--<li class="save"><label><input name="" type="checkbox" value="">保存联系人信息</label></li>-->
						</ul>
					</div>
				</div>
				<div class="h20"></div>
				<!--车票购买提示 -->
				<div class="ticket_h1">
					<h1>车票购买提示</h1>
				</div>
				<div class="ticketbox">
					<div class="prompt">
						<ul>
							<li class="yellow">1、12308目前仅售全价票，暂无活动优惠和折扣票出售。</li>
							<li>2、您可凭二代身份证信息购买乘意保险，投保后保险公司将电子保单号发送到会员预留的手机号上，请妥善保管。</li>
							<li>3、乘车站及12308不提供纸质保单，电子保单与纸质保单具有同等法律效力。</li>
							<li>4、购票高峰期，由于票源紧张，支付成功不能保证100%出票。如出票失败，建议您更换其他班次或前往车站购买，12308会保证在3-7个工作日内为您退款， <Br />&nbsp; &nbsp; &nbsp;&nbsp;全额返还到原支付账户，视银行规定不同，退款将在3-21内到账。请妥善保管短信，以便实时查询订单状态。
							</li>
							<li>5、请您预留充足的时间前往乘车站取票，凭短信和身份证件到乘车站自助取票机或服务专窗取票，逾期不取，责任自负。</li>
						</ul>
					</div>
				</div>
			</div>
			<!--确定操作-->
			<div class="h50"></div>
			<div class="btns">
				<input name="" type="button" value="确认无误，提交" class="btn_y200" id="ticket_btn">
			</div>
			<div class="h50"></div>
			<div class="warm_prompt" style="width:720px; top:0; left:0; background:#fff;display:none;">
			    <div class="ui_title_wrap">
			    <div class="ui_title">
			    <div class="ui_title_text"><span class="ui_title_icon"></span>温馨提示</div>
			    <div class="ui_btn_wrap"><a class="ui_btn_close">关闭</a></div>
			    </div></div>
			     <div id="buyappenddiv" style="display: ;">
			       <div class="appenddiv layout">
			          <div class="divportent">
			             <em></em>
			             <span>支付成功后，我们会将第一时间短信通知您，请耐心等待！<br>
			              如果购票失败，您支付的金额我们会将3-7个工作日全额退还至您账户。
			             </span>
			          </div>
			          <div class="divbox">
			          <h1>车票信息</h1>
			          <div class="table_topbg"></div>
			          <div class="item">
			            <table>
			              <tbody>
			              <tr>
			                <td class="line">长沙<div>长沙市汽车西站</div></td>
			                <td class="line_z"><div>高档空调   X0601</div><p>发车:2016-05-02 07:30</p></td>
			                <td class="line">常德<div>常德</div></td>
			              </tr>
			            </tbody></table>
			            <table class="moneytable">
			              <tbody>
			              <tr class="moneytable_b">
			                <td width="22%" class="moneytable_pl">取票人:</td>
			                <td width="22%">手机:</td>
			                <td colspan="2">身份证：</td>
			                <td rowspan="2" class="price"><h2>总额</h2><span>￥<span id="finalPrice"></span></span></td>
			              </tr>
			              <tr>
			                <td class="moneytable_pl">
			                <p>全价票:<em>￥64.0×</em><span id="confirmFullPriceNum" class="finalPiaoNumber">1</span></p>
			                <p id="halfPricep">半价票:<em>￥0.0×</em><span id="confirmHalfPriceNum" class="finalPiaoNumber">0</span></p>
			                	<!-- 票价:<em class="confirmPrice">￥64.0×</em><span class="finalPiaoNumber">1</span> -->
			                </td>
			                <td class="baoxian_pl"><span class="baoxian_ctx" style="color:#555;">保险:<em class="confirmPrice">￥0.0×</em><span id="baoXianNum" class="finalBaoXianNumber">0</span></span></td>
			                <td class="servicefee_pl">服务费:<em class="confirmPrice">￥<span>0.0</span>×</em><span id="feeNum" class="finalPiaoNumber">1</span></td>
			                <td class="xt_pl">携童:<em></em></td>
			              </tr>                 
			            </tbody></table>
			          </div>
			        </div>  
			        <div class="h20"></div> 
			        <div class="divbtn">
			          <label id="ticket_btnSbumit"><input class="btn_y332" id="submitOrder" type="button" value="确认并支付"></label>
			        </div>           
			     </div>
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
  
</div>	<script src="Scripts/require.js" data-main="http://cdn-resource-alias.12308.com/2015/js/common/buy-main-201604.js"></script>
	<!-- <script src="Scripts/require.js" data-main="http://cdn-resource-alias.12308.com/2015/js/chepiao_buy.js"></script> -->
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