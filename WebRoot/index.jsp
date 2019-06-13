<%@page import="cn.song.dao.BaseDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/tablib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>12308-全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>

<meta charset="utf-8" />
<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
<meta name="description"
	content="12308是提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:0755-82867116 " />
<meta name="baidu-site-verification" content="MJbcemLWY8" />
<meta property="qc:admins" content="15532463676123006375" />
<link href="http://cdn-resource.12308.com/2015/image/favicon.ico"
	type="image/x-icon" rel="icon" />
<link href="http://cdn-resource.12308.com/2015/image/favicon.ico"
	type="image/x-icon" rel="shortcut icon" />
<link rel="stylesheet" href="Css/index-min-201604.css" />
<!--  <link rel="stylesheet" href="Css/base.css" />
 <link rel="stylesheet" href="Css/date.css" />
 <link rel="stylesheet" href="Css/index.css" /> -->

</head>
<script>
    var system ={
    win : false,
    mac : false,
    xll : false
    };
	var p = navigator.platform;
	system.win = p.indexOf('Win') == 0;
	system.mac = p.indexOf('Mac') == 0;
	system.x11 = (p == 'X11') || (p.indexOf('Linux') == 0);
	if(system.win||system.mac||system.xll ||p=="Maclntel"){
	}else{
	   window.location.href="http://m.12308.com/";
	}
  function searchInputClick(id){
		var val = $("#" + id).val();
		if(val=='输入中文/拼音'){
			$("#" + id).val('');
		}
		_hmt.push(['_trackEvent', 'index_' + id, 'focus', id]);
	}
 </script>
<body>
<<<<<<< HEAD
	<!--顶部公用-->
	<div class="bodyhead">
		<div class="main-wrap">
			<h1 class="logo">
				<a title="12308全国汽车票网" href="index.html">12308全国汽车票网</a>
			</h1>
			<div class="headr">
				<div class="toolkit">
					<span class="a_mapp" target="_blank"><i class="to_mapp"></i><span>手机APP</span>
						<div class="to_code_box">
							<div class="to_code_hd">
								<span class="arr"></span>
								<div class="code_hd">
									<p>司机端下载</p>
									<a href="http://qiye.12308.com/download.html" target="_blank"><img
										src="Picture/driver_code.png" width="94px" height="94px" /></a>
								</div>
								<div class="code_line"></div>
								<div class="code_hd">
									<p>客户端下载</p>
									<a href="http://app.12308.com/" target="_blank"><img
										src="Picture/clients_code.png" width="94px" height="94px" /></a>
								</div>
							</div>
						</div></span> <a href="http://qiye.12308.com" class="link a_ched"
						target="_blank"><i class="to_ched"></i><span>车队入驻</span></a> <a
						href="http://weibo.com/12308com" class="link weibo"
						target="_blank"><i class="to_weibo"></i><span>微博</span></a> <a
						href="http://app.12308.com/weixin.html" class="link weixin"
						target="_blank"> <i class="to_weixin"></i><span>微信</span>
						<div class="to_code_box">
							<div class="to_code_hd">
								<span class="arr"></span>
								<div class="code_hd">
									<p>扫描关注微信</p>
									<img src="Picture/weixin_code.png" width="94px" height="94px" />
								</div>
							</div>
						</div></a>
				</div>
				<div class="handapp">
					<a title="12308司机端下载" href="http://qiye.12308.com/download.html"
						target="_blank">12308手机订票</a>
				</div>
			</div>
		</div>
		<style>
.navmenu li.ico em {
	position: absolute;
	background: url("Images/ico.gif") no-repeat 0px 15px;
	height: 50px;
	left: 120px;
	top: -35px;
	width: 65px;
	display: block;
}

.navmenu li.ico a {
	color: #ff0;
}

.navmenu li.ico a.cur {
	color: #0096ff;
}

.navmenu li.ico a:hover {
	color: #f90;
}

.navmenu li.ico a, .navmenu li.ico span, .navmenu li.ico i {
	/* transition:all 0.3s ease; */
	transition: none;
}
</style>
		<!--导航菜单-->
		<div class="bodymenu">
			<div class="mainnav">
				<ul class="navmenu">
					<li class="nav_0"><a href="index.html" title="首页"><i></i>首页<span></span></a></li>
					<li class="nav_1"><a href="chepiao.html" id="booking_menu"
						onclick="javascript:_hmt.push(['_trackEvent', 'index_booking_menu', 'click', 'booking_menu']);"
						title="汽车票预订"><i></i>汽车票预订<span></span></a></li>
					<li class="nav_2 ico"><a
						href="http://www.12308.com/huodong/wyindex.html" tts="link_3316"
						title="全国特价票" target="_blank"><i></i>全国特价票<span></span><em></em></a></li>
					<li class="nav_5"><a href="car.html" title="我要包车"><i></i>我要包车<span></span></a></li>
					<li class="nav_3"><a
						href="http://www.12308.com/news/index.html" title="资讯中心"><i></i>资讯中心<span></span></a></li>
					<li class="nav_4"><a
						href="http://www.12308.com/help/help.html" title="客服中心"><i></i>客服中心<span></span></a></li>
				</ul>
				<div class="navuserbg"></div>
				<ul class="navuser" id="login_content">
					<c:if test="${phone!=null }">
					<li class="mytrip" id="login_menu"><a tltle="用户中心 "
						class="ushow" href="http://uc.12308.com">用户中心<em>图标</em></a>
						<div style="display: none;" class="ubox" id="login_menubox">
							<ul>
								<li class=""><a tltle="我的订单 " rel="nofollow"
									href="http://uc.12308.com/order/usercenter/orderListAll.html">我的订单</a></li>
								<li class=""><a tltle="我的提问 " rel="nofollow"
									href="http://uc.12308.com/message/questionList.html">我的提问</a></li>
								<li class=""><a tltle="个人资料 " rel="nofollow"
									href="http://uc.12308.com/user/infoPage.html">个人资料</a></li>
							</ul>
						</div></li>
						</c:if>
						<c:if test="${phone==null }">
					<li class="reg"><a title="注册" rel="nofollow"
						href="register.jsp">注册</a></li>
						</c:if>
						<c:if test="${phone!=null }">
					<li class="reg"><a title="退出"
						rel="nofollow" href="loginOutServlet">退出</a></li>
						<li class="reg"><a title="phone"
							rel="nofollow">${phone }</a></li>
						</c:if>
						<c:if test="${phone==null }">
					<li class="go"><span><a title="登录" href="login.jsp"
							class="logLin">登录</a></span></li>
						</c:if>
				</ul>

				<!--有订单显示-->
				<!--  <span class="hasorder"><a href="#">1</a></span> -->
			</div>
		</div>
	</div>
=======
<%@ include file="/content/headpublic.jsp" %>
>>>>>>> branch '宋恒达-pro' of https://github.com/newdream-college-java/nd-java01.git


	<!--中间部份-->
	<div class="banner_n">
		<!--  banner cms start  -->
		<div class="banner_wrap has-dots"
			style="overflow: hidden; width: 100%; height: 380px;">
			<ul class="pic_show">
				<li><a href="http://www.12308.com/huodong/wyindex.html"
					target="_blank"
					style="background: url(Images/wybanner.jpg) no-repeat center bottom;"></a></li>
				<!-- 	<li style="display: none;"><a href="http://dwz.cn/30WSAB" target="_blank"
					style="background: url(Images/jcbanner.jpg) no-repeat center bottom;"></a></li>
				<li style="display: none;"><a href="http://www.12308.com/baoche/index.html" target="_blank"
					style="background: url(Images/baochebanner.jpg) no-repeat center bottom;"></a></li> -->
				<li style="display: none;"><a href="http://qiye.12308.com"
					target="_blank"
					style="background: url(Images/bannernew.jpg) no-repeat center bottom;"></a></li>
			</ul>
			<!--<ol class="dots"><li class="dot">1</li><li class="dot active">2</li><li class="dot">3</li><li class="dot">4</li><li class="dot">5</li><li class="dot">6</li><li class="dot">7</li></ol>-->
		</div>
		<!--big search start-->
		<div class="all_search">
			<div class="maintabbox">
				<div class="tabboxhead">
					<ul>
						<li class="tab1"><a href="http://www.12308.com"><span><s></s>汽车票预订</span></a></li>
					</ul>
				</div>

				<!--tab1 汽车票预订-->
				<div class="tabboxcon1" style="display: block;">
					<div class="indextab">
						<form method="get" id="12308form">
							<input type="hidden" id="interfaceId" name="interfaceId" />
							<ul>
								<li class="clearfix"><label>出发城市</label>
									<div class="s-inputbox" id="shikeStartCityClass">
										<input type="text" name="startCityName" autocomplete="off"
											id="startCityName"
											onfocus="javascript:searchInputClick('startCityName');"
											value="输入中文/拼音" class="s-input s-ihover"> <a
											class="city_ico" id="city_ico" style="cursor: pointer;"></a>
									</div>
								<li class="clearfix"><label>到达城市</label>
									<div class="s-inputbox">
										<input type="text" validate="NotNull" autocomplete="off"
											validation="endCityName"
											onfocus="javascript:searchInputClick('endCityName');"
											postion="down" autocomplete="off" maxlength="20"
											name="endCityName" value="输入中文/拼音" class="s-input"
											id="endCityName" />
									</div>
								<li class="clearfix"><label>出发日期</label>
									<div id="s-inputtime" class="s-inputtime">
										<div class="kalven-dp">
											<div class="dp-info">
												<b></b><span class="dp-text">今天</span>
											</div>
											<input type="text" data-prefix="" readonly maxlength="10"
												autocomplete="off" class="cinput textbox" name="leaveDate"
												value="" id="bookStartDate" data-type="oneWay">
										</div>
										<li class="pl_btn"><span id="searchBtn"
											onclick="javascript:_hmt.push(['_trackEvent', 'index_searchBtn', 'click', 'searchBtn']);">
												<span class="search_btn" action="search" id="jueryButton"><i
													class="com_iconsearch"></i>搜索</span>
										</span></li>
							</ul>
						</form>
					</div>
				</div>
			</div>
		</div>
		<!--big search end-->
	</div>
	<!--/banner-->
	<div class="tabbox_bg">
		<div class="main-wrap">
			<!--购票流程-->
			<div class="bprocess">
				<div class="bp_tit">购票流程：</div>
				<ul>
					<li><a href="javascript:void(0)"><span class="bp-n1"></span>
						<p>
								<b>车次查询</b>选择出行班次
							</p></a></li>
					<li><a href="javascript:void(0)"><span class="bp-n2"></span>
						<p>
								<b>提交订单</b>登记乘车人和取票人
							</p></a></li>
					<li><a href="javascript:void(0)"><span class="bp-n3"></span>
						<p>
								<b>在线支付</b>支付车票款
							</p></a></li>
					<li class="last"><a href="javascript:void(0)"><span
							class="bp-n4"></span>
						<p>
								<b>车站取票</b>凭取票信息换票
							</p></a></li>
				</ul>
			</div>
		</div>
	</div>

	<!--帮帮忙快捷操作-->
	<div class="h20"></div>
	<div class="main-wrap">
		<div class="partbox bb clearfix">
			<div class="assist-mod">
				<ul class="assist-lists clearfix">
					<li class="assist-list"><a target="_blank" title="预售时间"
						href="http://www.12308.com/index/timeList.html"><span
							class="my-beginner"></span>
							<p>预售时间</p></a><em class="newest-ico">新</em></li>
					<li class="assist-list"><a target="_blank" title="购票问题"
						href="http://www.12308.com/help/help_24.html"><span
							class="my-insurance"></span>
							<p>购票问题</p></a></li>
					<li class="assist-list"><a target="_blank" title="支付问题"
						href="http://www.12308.com/help/help_25.html"><span
							class="app"></span>
							<p>支付问题</p></a></li>
					<li class="assist-list"><a target="_blank" title="退票改签"
						href="http://www.12308.com/help/help_27.html"><span
							class="apay"></span>
							<p>退票改签</p></a></li>
					<li class="assist-list last-assist"><a target="_blank"
						title="新手指南" href="http://www.12308.com/bbm/register_guide.html"><span
							class="traffic"></span>
							<p>新手指南</p></a></li>
					<li class="assist-list last-assist"><a target="_blank"
						title="账户问题" href="http://www.12308.com/help/help_29.html"><span
							class="checkin"></span>
							<p>账户问题</p></a></li>

				</ul>
			</div>
			<!-- 首页资讯模板 -->
			<div class="webinfo-mod">
				<div class="info1">
					<h1>
						<span>最新资讯</span><a href="http://www.12308.com/news/index.html">更多<s></s></a>
					</h1>
					<dl>
						<dt>
							<a href="http://www.12308.com/news/n3023.html"><div
									class="img">
									<img src="Picture/1604221803552611118.jpg" />
								</div></a>
						</dt>
						<dd>
							<a title="12308CEO 陈晓红：互联网助力客运行业的创新和升级"
								href="http://www.12308.com/news/n3023.html">12308CEO
								陈晓红：互联网助力客运行业的创新和升级</a> <a title="12308开通浙江省多个城市汽车站的汽车票网络预售服务"
								href="http://www.12308.com/news/n3022.html">12308开通浙江省多个城市汽车站的汽车票网络预售服务</a>
							<a title="[浙江]高速公路年底前将建成120个充电站"
								href="http://www.12308.com/news/n3021.html">[浙江]高速公路年底前将建成120个充电站</a>
							<a title="[青海]运管局安排部署全面推进全省道路运输行业安全生产标准化达标工作"
								href="http://www.12308.com/news/n3020.html">[青海]运管局安排部署全面推进全省道路运输行业安全生产标准化达标工作</a>
						</dd>
					</dl>
				</div>
				<div class="info2">
					<h1>
						<span>网站公告</span><a href="http://www.12308.com/news/t1_c1.html">更多<s></s></a>
					</h1>
					<ul>
						<li><a title="12308CEO 陈晓红：互联网助力客运行业的创新和升级"
							href="http://www.12308.com/news/n3023.html">12308CEO
								陈晓红：互联网助力客运行业的创新和升级</a></li>
						<li><a title="12308开通浙江省多个城市汽车站的汽车票网络预售服务"
							href="http://www.12308.com/news/n3022.html">12308开通浙江省多个城市汽车站的汽车票网络预售服务</a></li>
						<li><a title="【宁波】关于汽车票实名制购票通知"
							href="http://www.12308.com/news/n2998.html">【宁波】关于汽车票实名制购票通知</a></li>
						<li><a title="关于同程旅游网再次侵犯12308全国汽车票网合法权益的公告"
							href="http://www.12308.com/news/n2997.html">关于同程旅游网再次侵犯12308全国汽车票网合法权益的公告</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>
	</div>

	<!--热门查询线路-->
	<!-- 首页热门路线模板 -->
	<div class="h40"></div>
	<div class="main-wrap">
		<div class="yuding">
			<div class="mod-hd">
				<h2 class="coach-header">
					<em class="coach-type"><em>汽车票</em>热门•线路预订</em>
				</h2>
				<ul class="tabctn" id="cities">
					<li data-tabindex="0" class="selected"><span
						class="tabview-span-1">广州</span></li>
					<li data-tabindex="1"><span class="tabview-span-1">武汉</span></li>
					<li data-tabindex="2"><span class="tabview-span-1">宁波</span></li>
					<li data-tabindex="3"><span class="tabview-span-1">太原</span></li>
					<li data-tabindex="4"><span class="tabview-span-1">厦门</span></li>
					<li data-tabindex="5"><span class="tabview-span-1">深圳</span></li>
					<li data-tabindex="6"><span class="tabview-span-1">淮安</span></li>
				</ul>
			</div>
			<div class="mod-bd ne-bd">
				<div class="tab-ctn" style="top: 0px;">
					<div class="clearfix pannel" style="display: block;">
						<ul class="ticket-list clearfix">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=深圳" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="深圳">深圳</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">64.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=清远"></a>
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="清远">清远</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">41.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=湛江" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="湛江">湛江</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">169.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=惠州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="惠州">惠州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">73.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=阳江" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="阳江">阳江</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">88.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=阳春" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="阳春">阳春</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">90.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=罗定" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="罗定">罗定</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">65.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=信宜" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="信宜">信宜</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">150.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=梅州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="梅州">梅州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">170.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=广州&endCityName=茂名" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="广州">广州</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="茂名">茂名</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">120.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=英山" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="英山">英山</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">72.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=蕲春" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="蕲春">蕲春</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">60.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=麻城" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="麻城">麻城</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">45.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=石首" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="石首">石首</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">105.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=浠水" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="浠水">浠水</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">48.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=宜城" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="宜城">宜城</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">120.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=荆门" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="荆门">荆门</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">99.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=黄石" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="黄石">黄石</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">25.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=武穴" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="武穴">武穴</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">75.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=武汉&endCityName=罗田" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="武汉">武汉</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="罗田">罗田</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">66.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=象山" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="象山">象山</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">35.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=沈家门" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="沈家门">沈家门</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">50.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=慈溪" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="慈溪">慈溪</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">22.5</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=定海" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="定海">定海</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">46.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=平湖" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="平湖">平湖</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">68.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=衢州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="衢州">衢州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">108.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=石浦" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="石浦">石浦</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">41.5</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=诸暨" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="诸暨">诸暨</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">73.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=萧山" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="萧山">萧山</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">57.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=宁波&endCityName=金华" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="宁波">宁波</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="金华">金华</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">95.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=朔州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="朔州">朔州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">84.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=大同" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="大同">大同</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">117.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=洛阳" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="洛阳">洛阳</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">123.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=浑源" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="浑源">浑源</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">100.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=呼和浩特" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="呼和浩特">呼和浩</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">158.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=怀仁" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="怀仁">怀仁</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">90.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=赤峰" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="赤峰">赤峰</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">320.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=桃红坡" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="桃红坡">桃红坡</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">59.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=山阴" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="山阴">山阴</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">82.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=太原&endCityName=广灵" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="太原">太原</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="广灵">广灵</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">110.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=龙海" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="龙海">龙海</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">23.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=南安" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="南安">南安</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">34.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=永春" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="永春">永春</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">50.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=永安" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="永安">永安</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">116.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=泉港" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="泉港">泉港</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">55.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=漳州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="漳州">漳州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">23.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=泉州中心" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="泉州中心">泉州中</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">36.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=大田" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="大田">大田</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">89.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=金井" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="金井">金井</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">35.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=厦门&endCityName=漳平" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="厦门">厦门</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="漳平">漳平</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">56.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=梅州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="梅州">梅州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">120.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=广州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="广州">广州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">65.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=茂名" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="茂名">茂名</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">130.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=中山" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="中山">中山</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">85.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=兴宁" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="兴宁">兴宁</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">130.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=河源" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="河源">河源</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">70.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=珠海" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="珠海">珠海</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">90.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=湛江" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="湛江">湛江</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">210.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=永新" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="永新">永新</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">180.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=深圳&endCityName=阳江" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="深圳">深圳</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="阳江">阳江</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">140.0</span>
								</div>
								</a></li>
						</ul>
						<ul class="ticket-list clearfix" style="display: none;">
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=南京红山站" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="南京红山站">南京红</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">65.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=南京南站" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="南京南站">南京南</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">65.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=上海总站" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="上海总站">上海总</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">138.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=苏州南站" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="苏州南站">苏州南</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">117.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=镇江" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="镇江">镇江</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">50.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=无锡" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="无锡">无锡</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">98.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=昆山" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="昆山">昆山</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">125.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=常州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="常州">常州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">105.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=连云港市区" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="连云港市区">连云港</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">43.0</span>
								</div>
								</a></li>
							<li class="list-item"><a
								href="http://www.12308.com/index/search.html?startCityName=淮安&endCityName=泰州" />
								<div class="ncoach_name">
									<span class="ncoach_name_start" title="淮安">淮安</span><i
										class="ncoach_name_arrow"></i><span class="ncoach_name_end"
										title="泰州">泰州</span>
								</div>
								<div class="ncoach_date">04月29日</div>
								<div class="ncoach_type">
									<i class="ncoach_type_bus"></i> <span class="ncoach_type_t1">票价：</span>
									<span class="ncoach_type_t2">￥</span><span
										class="ncoach_type_t3">57.0</span>
								</div>
								</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="h50"></div>
	<script type="text/javascript">
	   
    	
</script>
	<!--推荐汽车站-->
	<!-- 首页汽车站模板 -->
	<div class="main-wrap">
		<div class="partbox">
			<div class="mod-hd">
				<h2>
					<em>联网</em>最新开通汽车站
				</h2>
				<span class="mod-more"><s></s><a
					href="http://chezhan.12308.com">更多车站</a></span>
			</div>
			<div class="h20"></div>
			<div class="station-con clearfix">
				<div class="station-rec">
					<ul>
						<li><a href="http://chezhan.12308.com/shenzhen-15.html"><div
									class="img">
									<img src="Picture/station.png" alt="">
								</div></a> <span class="title"><label>深圳罗湖汽车站</label></span></li>
					</ul>
					<p class="info">
						<span class="info_left"></span><span class="info_right"></span> <span>深圳罗湖汽车站，始建于1987年，是公用型国家一级汽车客运站。车站毗邻罗湖口岸和深圳火车站，位于繁华的罗湖商业城1-2层，是深圳市乃至全国公路客运量最大、场站利用率最高的公用型汽车客运站之一。
							<br /> <br />地址：罗湖区火车站东广场商业城1，2楼 <br />电话：0755-82321670 <br />途径公交：17、25、38、82、83、101
						</span>
					</p>
				</div>
				<div class="station-city">
					<ul>
						<li><a href="http://chezhan.12308.com/changsha-22887.html"><div
									class="st_li">
									<img src="Picture/33391395132130329.jpg" alt="长沙市汽车南站" /><span
										class="title"><label>长沙市汽车南站</label></span>
								</div></a></li>
						<li><a href="http://chezhan.12308.com/guangzhou-20614.html"><div
									class="st_li">
									<img src="Picture/63361395121170248.jpg" alt="天河客运站" /><span
										class="title"><label>天河客运站</label></span>
								</div></a></li>
						<li><a href="http://chezhan.12308.com/guangzhou-20616.html"><div
									class="st_li">
									<img src="Picture/63011395121710540.jpg" alt="广州南站客运站" /><span
										class="title"><label>广州南站客运站</label></span>
								</div></a></li>
						<li><a href="http://chezhan.12308.com/shanghai-18687.html"><div
									class="st_li">
									<img src="Picture/92841395298563654.png" alt="上海长途客运总站" /><span
										class="title"><label>上海长途客运总站</label></span>
								</div></a></li>
						<li><a href="http://chezhan.12308.com/lijiang-22180.html"><div
									class="st_li">
									<img src="Picture/20761395195612752.jpg" alt="省旅丽江客运站" /><span
										class="title"><label>省旅丽江客运站</label></span>
								</div></a></li>
						<li><a href="http://chezhan.12308.com/quanzhou-19325.html"><div
									class="st_li">
									<img src="Picture/99141395199258666.png" alt="泉州市汽车东站" /><span
										class="title"><label>泉州市汽车东站</label></span>
								</div></a></li>
					</ul>
				</div>

			</div>
		</div>
	</div>
	<!-- 公用底部 -->
	<div class="h40"></div>
	<div class="foot-main">
		<div class="foot-nav clearfix">
			<ul>
				<li><span class="foot-n1"></span>
				<h2>支付安全</h2>
					<p>在线支付100%认证</p></li>
				<li><span class="foot-n2"></span>
				<h2>实时同步</h2>
					<p>全国汽车站联网售票</p></li>
				<li><span class="foot-n3"></span>
				<h2>全天服务</h2>
					<p>7*24小时专业客服人员为您服务</p></li>
				<li><span class="foot-n4"></span>
				<h2>方便快捷</h2>
					<p>取票自由，车站直接取票上车</p></li>
			</ul>
		</div>
	</div>
	<div class="helpserver">
		<div class="main-wrap">

			<div class="helplist">
				<div class="help_l">
					<h2>新手指南</h2>
					<ul>
						<li><a href="http://uc.12308.com/register/registerPage.html"
							target="_blank">用户注册</a></li>
						<li><a href="http://www.12308.com/bbm/pay_guide.html"
							target="_blank">在线支付</a></li>
						<li><a
							href="http://www.12308.com/bbm/receive_ticket_guide.html"
							target="_blank">取票上车</a></li>
					</ul>
				</div>



				<div class="help_l">
					<h2>购票须知</h2>
					<ul>
						<li><a href="http://www.12308.com//bbm/ckxz.html"
							rel="nofollow">乘客须知</a></li>
						<!--   <li><a href="http://www.12308.com/help/help_27.html" rel="nofollow">取票须知</a></li>-->
						<li><a href="http://www.12308.com/index/timeList.html"
							rel="nofollow">售票预售期</a></li>
					</ul>
				</div>

				<div class="help_l">
					<h2>常见问题</h2>
					<ul>
						<li><a href="http://www.12308.com/help/help_22.html"
							target="_blank">班次查询</a></li>
						<li><a href="http://www.12308.com/help/help_27.html"
							target="_blank">退票问题</a></li>
						<li><a href="http://www.12308.com/help/help_25.html"
							target="_blank">支付问题</a></li>
					</ul>
				</div>

				<div class="help_l">
					<h2>乘车保险</h2>
					<ul>
						<!--  <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">保险须知</a></li>
        <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">车票保险</a></li> -->
						<li><a href="http://www.12308.com//bbm/e_insurance.html"
							target="_blank">电子保险</a></li>
						<li><a href="http://www.12308.com/bbm/pains.html"
							target="_blank">保险说明</a></li>
					</ul>
				</div>

				<div class="help_l">
					<h2>会员服务</h2>
					<ul>
						<li><a
							href="http://uc.12308.com/resetPwd/resetPwdByMobilePage.html"
							rel="nofollow">找回密码</a></li>
						<li><a
							href="http://www.12308.com/help/complainAndAdvise.html"
							rel="nofollow">投诉与建议</a></li>
						<li><a href="http://www.12308.com/bbm/contact_us.html">联系客服</a></li>
					</ul>
				</div>

				<div class="help_last">
					<div class="help_time">
						<h2>服务热线</h2>
						<p>
							<span></span><b>0755-82867116</b>
						</p>
					</div>
					<div class="help_weibo">
						<span></span><a target="_blank" href="http://weibo.com/12308com"><p>关注微博</p></a>
					</div>
					<div class="help_weixin">
						<span></span><a target="_blank"
							href="http://app.12308.com/weixin.html"><p>关注微信</p></a>
					</div>
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
				<em>&copy; 2015 12308.com 版权所有</em> <b>|</b> <span>粤ICP备14020827号-1</span>
			</p>
			<p>
				<a href="http://www.12308.com/bbm/intro.html" target="_blank"
					title="关于12308">关于12308</a><b>|</b> <a
					href="http://www.12308.com/bbm/contact_us.html" target="_blank"
					title="联系我们">联系我们</a><b>|</b> <a
					href="http://www.12308.com/bbm/service_protocol.html"
					target="_blank" title="服务协议">服务协议</a><b>|</b> <a
					href="http://www.12308.com/bbm/join_us.html" target="_blank"
					title="诚征英才">诚征英才</a><b>|</b> <a
					href="http://www.12308.com/help/help_0.html" target="_blank"
					title="常见问题">常见问题</a><b>|</b>
				<!--  <a href="http://www.12308.com./yqlj.html" target="_blank" title="友情链接">友情链接</a><b>|</b> -->
				<a href="http://www.12308.com/help/complainAndAdvise.html"
					target="_blank" title="用户建议">用户建议</a>
			</p>

		</div>

	</div>
	<input type="hidden" value="http://www.12308.com" id="basePath" />
	<input type="hidden" value="http://cdn-resource-alias.12308.com/2015"
		id="resourcePath" />
	<input type="hidden" value="04月29日" id="startDateflag" />
	<div class="bottom_soft_icon"></div>
	<div class="bottom_soft" style="display: block;">
		<div class="bottom_soft_bg"></div>
		<div class="bottom_soft_Pos">
			<div class="bottom_soft_MiddleBox">
				<i class="bottom_soft_img"></i> <a class="bottom_soft_close"
					href="javascript:void(0)"></a>
				<div class="bottom_soft_tx">
					<a target="_blank" href="http://app.12308.com"><p
							class="bottom_soft_hd">手机预订 更便捷</p>
						<p class="bottom_soft_cn">
							<span>不再排队、不再等待，实时动态<br>随时随地查询、买票轻松搞定！
							</span>
						</p></a>
				</div>
				<div class="bottom_app">
					<a target="_blank" href="http://app.12308.com"><span>扫描下载应用</span></a>
				</div>
				<div class="bottom_soft_link">
					<a target="_blank" class="bottom_soft_link_ios"
						href="http://app.12308.com" title="客户端苹果手机APP下载">iOS下载</a> <a
						target="_blank" class="bottom_soft_link_and"
						href="http://app.12308.com" title="客户端安卓手机APP下载">安卓下载</a>
				</div>
				<div class="bottom_weixin">
					<a target="_blank" class="bottom_app_index"
						href="http://app.12308.com/weixin.html"><span>扫描官方微信</span></a>
				</div>
			</div>
		</div>
	</div>
</body>
<script>
	var b =[{'name':'新余市',"simplepy": "xys","provinceName": "江西省","pinyin": "xinyushi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'蚌埠',"simplepy": "BB","provinceName": "安徽省","pinyin": "bangbu","preDate": "14","typeNo": 0,"orderby":0 },{'name':'益阳',"simplepy": "yy","provinceName": "湖南省","pinyin": "yiyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'北白象',"simplepy": "bbx","provinceName": "浙江省","pinyin": "beibaixiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'海口',"simplepy": "hk","provinceName": "海南省","pinyin": "haikou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'新余渝水区',"simplepy": "xyysq","provinceName": "江西省","pinyin": "xinyuyushuiqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'芜湖市',"simplepy": "WHS","provinceName": "安徽省","pinyin": "wuhushi","preDate": "30","typeNo": 0,"orderby":0 },{'name':'盐源县',"simplepy": "yyx","provinceName": "四川省","pinyin": "yanyuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'吉林',"simplepy": "jl","provinceName": "吉林省","pinyin": "jilin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'儋州',"simplepy": "dz","provinceName": "海南省","pinyin": "danzhou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'分宜县',"simplepy": "fyx","provinceName": "江西省","pinyin": "fenyixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'盘锦',"simplepy": "pj","provinceName": "辽宁省","pinyin": "panjin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'吴江',"simplepy": "wj","provinceName": "江苏省","pinyin": "wujiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'三亚',"simplepy": "sy","provinceName": "海南省","pinyin": "sanya","preDate": "3","typeNo": 0,"orderby":0 },{'name':'鹰潭市',"simplepy": "yts","provinceName": "江西省","pinyin": "yingtanshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'繁昌县',"simplepy": "FCX","provinceName": "安徽省","pinyin": "fanchangxian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'石家庄',"simplepy": "sjz","provinceName": "河北省","pinyin": "shijiazhuang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'四川省',"simplepy": "scs","provinceName": "四川省","pinyin": "sichuansheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'文昌',"simplepy": "wc","provinceName": "海南省","pinyin": "wenchang","preDate": "3","typeNo": 0,"orderby":0 },{'name':'赣州市',"simplepy": "gzs","provinceName": "江西省","pinyin": "ganzhoushi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'眉山市',"simplepy": "mss","provinceName": "四川省","pinyin": "meishanshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'南陵县',"simplepy": "NLX","provinceName": "安徽省","pinyin": "nanlingxian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'石狮',"simplepy": "ss","provinceName": "福建省","pinyin": "shishi","preDate": "22","typeNo": 0,"orderby":0 },{'name':'宁蒗县',"simplepy": "nlx","provinceName": "云南省","pinyin": "ninglangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'五指山',"simplepy": "wzs","provinceName": "海南省","pinyin": "wuzhishan","preDate": "3","typeNo": 0,"orderby":0 },{'name':'赣县',"simplepy": "gx","provinceName": "江西省","pinyin": "ganxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'芜湖候机楼',"simplepy": "WHHJL","provinceName": "安徽省","pinyin": "wuhuhoujilou","preDate": "30","typeNo": 0,"orderby":0 },{'name':'长沙',"simplepy": "CS","provinceName": "湖南省","pinyin": "changsha","preDate": "30","typeNo": 0,"orderby":0 },{'name':'福州',"simplepy": "fz","provinceName": "福建省","pinyin": "fuzhou","preDate": "21","typeNo": 0,"orderby":0 },{'name':'宁蒗彝族自治县',"simplepy": "nlyzzzx","provinceName": "云南省","pinyin": "ninglangyizuzizhixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'东方',"simplepy": "df","provinceName": "海南省","pinyin": "dongfang","preDate": "3","typeNo": 0,"orderby":0 },{'name':'信丰县',"simplepy": "xfx","provinceName": "江西省","pinyin": "xinfengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'芜湖县',"simplepy": "WHX","provinceName": "安徽省","pinyin": "wuhuxian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'上海',"simplepy": "sh","provinceName": "上海市","pinyin": "shanghai","preDate": "27","typeNo": 0,"orderby":0 },{'name':'福清',"simplepy": "fq","provinceName": "福建省","pinyin": "fuqing","preDate": "21","typeNo": 0,"orderby":0 },{'name':'安庆',"simplepy": "aq","provinceName": "安徽省","pinyin": "anqing","preDate": "10","typeNo": 0,"orderby":0 },{'name':'定安县',"simplepy": "dax","provinceName": "海南省","pinyin": "dinganxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'大余县',"simplepy": "dyx","provinceName": "江西省","pinyin": "dayuxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'蓬安县',"simplepy": "pax","provinceName": "四川省","pinyin": "penganxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'福鼎',"simplepy": "fd","provinceName": "福建省","pinyin": "fuding","preDate": "15","typeNo": 0,"orderby":0 },{'name':'安远县',"simplepy": "ayx","provinceName": "江西省","pinyin": "anyuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万宁县',"simplepy": "wnx","provinceName": "海南省","pinyin": "wanningxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'上犹县',"simplepy": "syx","provinceName": "江西省","pinyin": "shangyouxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'天津',"simplepy": "TJ","provinceName": "天津市","pinyin": "tianjin","preDate": "18","typeNo": 0,"orderby":0 },{'name':'秦皇岛',"simplepy": "qhd","provinceName": "河北省","pinyin": "qinhuangdao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜丰县',"simplepy": "yfx","provinceName": "江西省","pinyin": "yifengxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'琼海县',"simplepy": "qhx","provinceName": "海南省","pinyin": "qionghaixian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'崇义县',"simplepy": "cyx","provinceName": "江西省","pinyin": "chongyixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'许昌市',"simplepy": "xcs","provinceName": "河南省","pinyin": "xuchangshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'红河',"simplepy": "hh","provinceName": "云南省","pinyin": "honghe","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宿迁',"simplepy": "sq","provinceName": "江苏省","pinyin": "suqian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'陵水县',"simplepy": "lsx","provinceName": "海南省","pinyin": "lingshuixian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'辽源市',"simplepy": "lys","provinceName": "吉林省","pinyin": "liaoyuanshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'肥西县',"simplepy": "fxx","provinceName": "安徽省","pinyin": "feixixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'屯昌',"simplepy": "tc","provinceName": "海南省","pinyin": "tunchang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'屯昌县',"simplepy": "tcx","provinceName": "海南省","pinyin": "tunchangxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'龙南县',"simplepy": "lnx","provinceName": "江西省","pinyin": "longnanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'合肥',"simplepy": "hf","provinceName": "安徽省","pinyin": "hefei","preDate": "49","typeNo": 0,"orderby":0 },{'name':'苏州',"simplepy": "sz","provinceName": "江苏省","pinyin": "suzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'巩义',"simplepy": "gy","provinceName": "河南省","pinyin": "gongyi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'临高县',"simplepy": "lgx","provinceName": "海南省","pinyin": "lingaoxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'定南县',"simplepy": "dnx","provinceName": "江西省","pinyin": "dingnanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'若尔盖县',"simplepy": "regx","provinceName": "四川省","pinyin": "ruoergaixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'常熟',"simplepy": "cs","provinceName": "江苏省","pinyin": "changshu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'昌江县',"simplepy": "cjx","provinceName": "海南省","pinyin": "changjiangxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'全南县',"simplepy": "qnx","provinceName": "江西省","pinyin": "quannanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'荔波县',"simplepy": "lbx","provinceName": "贵州省","pinyin": "liboxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广昌',"simplepy": "gc","provinceName": "江西省","pinyin": "guangchang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'白沙县',"simplepy": "bsx","provinceName": "海南省","pinyin": "baishaxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'宁都县',"simplepy": "ndx","provinceName": "江西省","pinyin": "ningdouxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'荣成',"simplepy": "rc","provinceName": "山东省","pinyin": "rongcheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广西壮族自治区',"simplepy": "gxzzzzq","provinceName": "广西壮族自治区","pinyin": "guangxizhuangzuzizhiqu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乐东县',"simplepy": "ldx","provinceName": "海南省","pinyin": "ledongxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'于都县',"simplepy": "ydx","provinceName": "江西省","pinyin": "yudouxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'莆田',"simplepy": "pt","provinceName": "福建省","pinyin": "putian","preDate": "14","typeNo": 0,"orderby":0 },{'name':'延吉',"simplepy": "yj","provinceName": "吉林省","pinyin": "yanji","preDate": "10","typeNo": 0,"orderby":0 },{'name':'保亭县',"simplepy": "btx","provinceName": "海南省","pinyin": "baotingxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'兴国县',"simplepy": "xgx","provinceName": "江西省","pinyin": "xingguoxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'阿坝县',"simplepy": "abx","provinceName": "四川省","pinyin": "abaxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'重庆',"simplepy": "CQ","provinceName": "重庆市","pinyin": "chongqing","preDate": "14","typeNo": 0,"orderby":0 },{'name':'菏泽',"simplepy": "hz","provinceName": "山东省","pinyin": "heze","preDate": "10","typeNo": 0,"orderby":0 },{'name':'张家港',"simplepy": "zjg","provinceName": "江苏省","pinyin": "zhangjiagang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'澄迈县',"simplepy": "cmx","provinceName": "海南省","pinyin": "chengmaixian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'会昌县',"simplepy": "hcx","provinceName": "江西省","pinyin": "huichangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'马尔康县',"simplepy": "mekx","provinceName": "四川省","pinyin": "maerkangxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'营口',"simplepy": "yk","provinceName": "辽宁省","pinyin": "yingkou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德州',"simplepy": "dz","provinceName": "山东省","pinyin": "dezhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'丽江',"simplepy": "lj","provinceName": "云南省","pinyin": "lijiang","preDate": "15","typeNo": 0,"orderby":0 },{'name':'琼中县',"simplepy": "qzx","provinceName": "海南省","pinyin": "qiongzhongxian","preDate": "3","typeNo": 0,"orderby":0 },{'name':'寻乌县',"simplepy": "xwx","provinceName": "江西省","pinyin": "xunwuxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'马鞍山',"simplepy": "mas","provinceName": "安徽省","pinyin": "maanshan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'葫芦岛',"simplepy": "hld","provinceName": "辽宁省","pinyin": "huludao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'扬州',"simplepy": "yz","provinceName": "江苏省","pinyin": "yangzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'武汉',"simplepy": "wh","provinceName": "湖北省","pinyin": "wuhan","preDate": "11","typeNo": 0,"orderby":0 },{'name':'石城县',"simplepy": "scx","provinceName": "江西省","pinyin": "shichengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'黄山市',"simplepy": "hss","provinceName": "安徽省","pinyin": "huangshanshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'西乌旗',"simplepy": "xwq","provinceName": "内蒙古","pinyin": "xiwuqi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'抚州',"simplepy": "fz","provinceName": "江西省","pinyin": "fuzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'瑞金市',"simplepy": "rjs","provinceName": "江西省","pinyin": "ruijinshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'泰兴市',"simplepy": "txs","provinceName": "江苏省","pinyin": "taixingshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'杭州',"simplepy": "hz","provinceName": "浙江省","pinyin": "hangzhou","preDate": "20","typeNo": 0,"orderby":0 },{'name':'西双版纳',"simplepy": "xsbn","provinceName": "云南省","pinyin": "xishuangbanna","preDate": "10","typeNo": 0,"orderby":0 },{'name':'新乡',"simplepy": "xx","provinceName": "河南省","pinyin": "xinxiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南康市',"simplepy": "nks","provinceName": "江西省","pinyin": "nankangshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'泗阳县',"simplepy": "syx","provinceName": "江苏省","pinyin": "siyangxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'西安',"simplepy": "xa","provinceName": "陕西省","pinyin": "xian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'无锡',"simplepy": "wx","provinceName": "江苏省","pinyin": "wuxi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'吉安吉州区',"simplepy": "jajzq","provinceName": "江西省","pinyin": "jianjizhouqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'泗县',"simplepy": "sx","provinceName": "安徽省","pinyin": "sixian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'西昌市',"simplepy": "xcs","provinceName": "四川省","pinyin": "xichangshi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'杭州市',"simplepy": "hzs","provinceName": "浙江省","pinyin": "hangzhoushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'吉安青原区',"simplepy": "jaqyq","provinceName": "江西省","pinyin": "jianqingyuanqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'贵阳',"simplepy": "gy","provinceName": "贵州省","pinyin": "guiyang","preDate": "45","typeNo": 0,"orderby":0 },{'name':'枣庄',"simplepy": "zz","provinceName": "山东省","pinyin": "zaozhuang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'昆明',"simplepy": "km","provinceName": "云南省","pinyin": "kunming","preDate": "45","typeNo": 0,"orderby":0 },{'name':'吉安县',"simplepy": "jax","provinceName": "江西省","pinyin": "jianxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'赤峰',"simplepy": "cf","provinceName": "","pinyin": "chifeng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'柳市',"simplepy": "ls","provinceName": "浙江省","pinyin": "liushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广州',"simplepy": "gz","provinceName": "广东省","pinyin": "guangzhou","preDate": "30","typeNo": 0,"orderby":0 },{'name':'吉水县',"simplepy": "jsx","provinceName": "江西省","pinyin": "jishuixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'灵璧县',"simplepy": "lbx","provinceName": "安徽省","pinyin": "linbixian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'达州',"simplepy": "dz","provinceName": "四川省","pinyin": "dazhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'榆树',"simplepy": "ys","provinceName": "吉林省","pinyin": "yushu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'峡江县',"simplepy": "xjx","provinceName": "江西省","pinyin": "xiajiangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'郎溪县',"simplepy": "lxx","provinceName": "安徽省","pinyin": "langxixian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'邵阳',"simplepy": "sy","provinceName": "湖南省","pinyin": "shaoyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'武宁县',"simplepy": "wnx","provinceName": "江西省","pinyin": "wuningxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'新干县',"simplepy": "xgx","provinceName": "江西省","pinyin": "xinganxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'康定县',"simplepy": "kdx","provinceName": "四川省","pinyin": "kangdingxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'泉州',"simplepy": "qz","provinceName": "福建省","pinyin": "quanzhou","preDate": "22","typeNo": 0,"orderby":0 },{'name':'永嘉',"simplepy": "yj","provinceName": "浙江省","pinyin": "yongjia","preDate": "10","typeNo": 0,"orderby":0 },{'name':'永丰县',"simplepy": "yfx","provinceName": "江西省","pinyin": "yongfengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'都昌县',"simplepy": "dcx","provinceName": "江西省","pinyin": "duchangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'江苏省',"simplepy": "jss","provinceName": "江苏省","pinyin": "jiangsusheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'泰和县',"simplepy": "thx","provinceName": "江西省","pinyin": "taihexian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'金湖县',"simplepy": "jhx","provinceName": "江苏省","pinyin": "jinhuxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'都江堰',"simplepy": "djy","provinceName": "四川省","pinyin": "dujiangyan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'江阴',"simplepy": "jy","provinceName": "江苏省","pinyin": "jiangyin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'遂川县',"simplepy": "scx","provinceName": "江西省","pinyin": "suichuanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'鄂尔多斯',"simplepy": "eeds","provinceName": "内蒙古","pinyin": "eerduosi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'泰州',"simplepy": "tz","provinceName": "江苏省","pinyin": "taizhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万安县',"simplepy": "wax","provinceName": "江西省","pinyin": "wananxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'泸州',"simplepy": "lz","provinceName": "四川省","pinyin": "luzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'安福县',"simplepy": "afx","provinceName": "江西省","pinyin": "anfuxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'金华',"simplepy": "jh","provinceName": "浙江省","pinyin": "jinhua","preDate": "10","typeNo": 0,"orderby":0 },{'name':'泽州县',"simplepy": "zzx","provinceName": "山西省","pinyin": "zezhouxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'永新县',"simplepy": "yxx","provinceName": "江西省","pinyin": "yongxinxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'砀山县',"simplepy": "dsx","provinceName": "安徽省","pinyin": "dangshanxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'盐城',"simplepy": "yc","provinceName": "江苏省","pinyin": "yancheng","preDate": "15","typeNo": 0,"orderby":0 },{'name':'铁岭',"simplepy": "tl","provinceName": "辽宁省","pinyin": "tieling","preDate": "10","typeNo": 0,"orderby":0 },{'name':'洛阳',"simplepy": "ly","provinceName": "河南省","pinyin": "luoyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'井冈山市',"simplepy": "jgss","provinceName": "江西省","pinyin": "jinggangshanshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'大丰市',"simplepy": "dfs","provinceName": "江苏省","pinyin": "dafengshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'锡林浩特',"simplepy": "xlht","provinceName": "内蒙古","pinyin": "xilinhaote","preDate": "10","typeNo": 0,"orderby":0 },{'name':'津市',"simplepy": "js","provinceName": "湖南省","pinyin": "jinshi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜春袁州区',"simplepy": "ycyzq","provinceName": "江西省","pinyin": "yichunyuanzhouqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'长垣县',"simplepy": "cyx","provinceName": "河南省","pinyin": "changyuanxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'锦州',"simplepy": "jz","provinceName": "辽宁省","pinyin": "jinzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'洱源县',"simplepy": "eyx","provinceName": "云南省","pinyin": "eryuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'奉新县',"simplepy": "fxx","provinceName": "江西省","pinyin": "fengxinxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'宝鸡',"simplepy": "bj","provinceName": "陕西省","pinyin": "baoji","preDate": "7","typeNo": 1,"orderby":0 },{'name':'镇宁布依族苗族自治县',"simplepy": "znbyzmzzzx","provinceName": "贵州省","pinyin": "zhenningbuyizumiaozuzizhixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'济宁',"simplepy": "jn","provinceName": "山东省","pinyin": "jining","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万载县',"simplepy": "wzx","provinceName": "江西省","pinyin": "wanzaixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'永济',"simplepy": "yj","provinceName": "山西省","pinyin": "yongji","preDate": "7","typeNo": 1,"orderby":0 },{'name':'镇远县',"simplepy": "zyx","provinceName": "贵州省","pinyin": "zhenyuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'浙江省',"simplepy": "zjs","provinceName": "浙江省","pinyin": "zhejiangsheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'上高县',"simplepy": "sgx","provinceName": "江西省","pinyin": "shanggaoxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'长春',"simplepy": "cc","provinceName": "吉林省","pinyin": "changchun","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湖州',"simplepy": "hz","provinceName": "浙江省","pinyin": "huzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜兴市',"simplepy": "yxs","provinceName": "江苏省","pinyin": "yixingshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'灵宝',"simplepy": "lb","provinceName": "河南省","pinyin": "lingbao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'靖安县',"simplepy": "jax","provinceName": "江西省","pinyin": "jinganxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'阜南县',"simplepy": "fnx","provinceName": "安徽省","pinyin": "funanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'烟台',"simplepy": "yt","provinceName": "山东省","pinyin": "yantai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'铜鼓县',"simplepy": "tgx","provinceName": "江西省","pinyin": "tongguxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'铜川',"simplepy": "tc","provinceName": "陕西省","pinyin": "tongchuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'阜阳',"simplepy": "fy","provinceName": "安徽省","pinyin": "fuyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'琼中',"simplepy": "qz","provinceName": "海南省","pinyin": "qiongzhong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'丰城市',"simplepy": "fcs","provinceName": "江西省","pinyin": "fengchengshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'临澧',"simplepy": "ll","provinceName": "湖南省","pinyin": "linli","preDate": "30","typeNo": 0,"orderby":0 },{'name':'阳朔县',"simplepy": "ysx","provinceName": "广西省","pinyin": "yangshuoxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'瑞安',"simplepy": "ra","provinceName": "浙江省","pinyin": "ruian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'樟树市',"simplepy": "zss","provinceName": "江西省","pinyin": "zhangshushi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'石门',"simplepy": "sm","provinceName": "湖南省","pinyin": "shimen","preDate": "30","typeNo": 0,"orderby":0 },{'name':'雷山县',"simplepy": "lsx","provinceName": "贵州省","pinyin": "leishanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'瓦房店',"simplepy": "wfd","provinceName": "辽宁省","pinyin": "wafangdian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'高安市',"simplepy": "gas","provinceName": "江西省","pinyin": "gaoanshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'安乡',"simplepy": "ax","provinceName": "湖南省","pinyin": "anxiang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'青城山',"simplepy": "qcs","provinceName": "四川省","pinyin": "qingchengshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'福安',"simplepy": "fa","provinceName": "福建省","pinyin": "fuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'抚州市',"simplepy": "fzs","provinceName": "江西省","pinyin": "fuzhoushi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'青岛',"simplepy": "qd","provinceName": "山东省","pinyin": "qingdao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'聊城',"simplepy": "lc","provinceName": "山东省","pinyin": "liaocheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'抚州临川区',"simplepy": "fzlcq","provinceName": "江西省","pinyin": "fuzhoulinchuanqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'汉寿',"simplepy": "hs","provinceName": "湖南省","pinyin": "hanshou","preDate": "30","typeNo": 0,"orderby":0 },{'name':'鞍山',"simplepy": "as","provinceName": "辽宁省","pinyin": "anshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'肇东',"simplepy": "zd","provinceName": "黑龙江省","pinyin": "zhaodong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南城县',"simplepy": "ncx","provinceName": "江西省","pinyin": "nanchengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'桃源',"simplepy": "ty","provinceName": "湖南省","pinyin": "taoyuan","preDate": "30","typeNo": 0,"orderby":0 },{'name':'韩城',"simplepy": "hc","provinceName": "陕西省","pinyin": "hancheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'胶南',"simplepy": "jn","provinceName": "山东省","pinyin": "jiaonan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'黎川县',"simplepy": "lcx","provinceName": "江西省","pinyin": "lichuanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'岳阳',"simplepy": "yy","provinceName": "湖南省","pinyin": "yueyang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'颍上县',"simplepy": "ysx","provinceName": "安徽省","pinyin": "yingshangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'胶州',"simplepy": "jz","provinceName": "山东省","pinyin": "jiaozhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南丰县',"simplepy": "nfx","provinceName": "江西省","pinyin": "nanfengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'澧县',"simplepy": "lx","provinceName": "湖南省","pinyin": "lixian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'辽阳',"simplepy": "ly","provinceName": "辽宁省","pinyin": "liaoyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'香港',"simplepy": "xg","provinceName": "香港","pinyin": "xianggang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'舟山',"simplepy": "zs","provinceName": "浙江省","pinyin": "zhoushan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'崇仁县',"simplepy": "crx","provinceName": "江西省","pinyin": "chongrenxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'桓仁',"simplepy": "hr","provinceName": "辽宁省","pinyin": "huanren","preDate": "10","typeNo": 0,"orderby":0 },{'name':'黄山',"simplepy": "hs","provinceName": "安徽省","pinyin": "huangshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'莱阳',"simplepy": "ly","provinceName": "山东省","pinyin": "laiyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乐安县',"simplepy": "lax","provinceName": "江西省","pinyin": "leanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'兴城',"simplepy": "xc","provinceName": "辽宁省","pinyin": "xingcheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'蒙自',"simplepy": "mz","provinceName": "云南省","pinyin": "mengzi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜黄县',"simplepy": "yhx","provinceName": "江西省","pinyin": "yihuangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'新密',"simplepy": "xm","provinceName": "河南省","pinyin": "xinmi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'蓬莱',"simplepy": "pl","provinceName": "山东省","pinyin": "penglai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'金溪县',"simplepy": "jxx","provinceName": "江西省","pinyin": "jinxixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'阜新',"simplepy": "fx","provinceName": "辽宁省","pinyin": "fuxin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'登封',"simplepy": "df","provinceName": "河南省","pinyin": "dengfeng","preDate": "10","typeNo": 1,"orderby":0 },{'name':'贺州',"simplepy": "hz","provinceName": "广西省","pinyin": "hezhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'资溪县',"simplepy": "zxx","provinceName": "江西省","pinyin": "zixixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'温县',"simplepy": "wx","provinceName": "河南省","pinyin": "wenxian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'赣州',"simplepy": "gz","provinceName": "江西省","pinyin": "ganzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'东乡县',"simplepy": "dxx","provinceName": "江西省","pinyin": "dongxiangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'本溪',"simplepy": "bx","provinceName": "辽宁省","pinyin": "benxi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'叶县',"simplepy": "yx","provinceName": "河南省","pinyin": "yexian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'连云港',"simplepy": "lyg","provinceName": "江苏省","pinyin": "lianyungang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广昌县',"simplepy": "gcx","provinceName": "江西省","pinyin": "guangchangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'绥中',"simplepy": "sz","provinceName": "辽宁省","pinyin": "suizhong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'焦作',"simplepy": "jz","provinceName": "河南省","pinyin": "jiaozuo","preDate": "10","typeNo": 1,"orderby":0 },{'name':'通辽',"simplepy": "tl","provinceName": "内蒙古","pinyin": "tongliao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'上饶信州区',"simplepy": "srxzq","provinceName": "江西省","pinyin": "shangraoxinzhouqu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'平顶山',"simplepy": "pds","provinceName": "河南省","pinyin": "pingdingshan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'遂溪县城，廉江',"simplepy": "sxxc，lj","provinceName": "遂溪县城，廉江","pinyin": "suixixiancheng，lianjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'上饶县',"simplepy": "srx","provinceName": "江西省","pinyin": "shangraoxian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'岫岩',"simplepy": "xy","provinceName": "辽宁省","pinyin": "xiuyan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'邓州',"simplepy": "dz","provinceName": "河南省","pinyin": "dengzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广丰县',"simplepy": "gfx","provinceName": "江西省","pinyin": "guangfengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'开原',"simplepy": "ky","provinceName": "辽宁省","pinyin": "kaiyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'安阳',"simplepy": "ay","provinceName": "河南省","pinyin": "anyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'邯郸',"simplepy": "hd","provinceName": "河北省","pinyin": "handan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'玉山县',"simplepy": "ysx","provinceName": "江西省","pinyin": "yushanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'阜蒙',"simplepy": "fm","provinceName": "辽宁省","pinyin": "fumeng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'许昌',"simplepy": "xc","provinceName": "河南省","pinyin": "xuchang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'铅山县',"simplepy": "qsx","provinceName": "江西省","pinyin": "qianshanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'长垣',"simplepy": "cy","provinceName": "河南省","pinyin": "changyuan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'镇江',"simplepy": "zj","provinceName": "江苏省","pinyin": "zhenjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'横峰县',"simplepy": "hfx","provinceName": "江西省","pinyin": "hengfengxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'鮁鱼圈',"simplepy": "byq","provinceName": "辽宁省","pinyin": "bayuquan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'正阳',"simplepy": "zy","provinceName": "河南省","pinyin": "zhengyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'长治',"simplepy": "cz","provinceName": "山西省","pinyin": "changzhi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'余干县',"simplepy": "ygx","provinceName": "江西省","pinyin": "yuganxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'大石桥',"simplepy": "dsq","provinceName": "辽宁省","pinyin": "dashiqiao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'偃师',"simplepy": "ys","provinceName": "河南省","pinyin": "yanshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'阳新',"simplepy": "yx","provinceName": "湖北省","pinyin": "yangxin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'深圳',"simplepy": "sz","provinceName": "广东省","pinyin": "ShenZhen","preDate": "48","typeNo": 0,"orderby":0 },{'name':'鄱阳县',"simplepy": "pyx","provinceName": "江西省","pinyin": "poyangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'凤城',"simplepy": "fc","provinceName": "辽宁省","pinyin": "fengcheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'滑县',"simplepy": "hx","provinceName": "河南省","pinyin": "huaxian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'阳新县',"simplepy": "yxx","provinceName": "湖北省","pinyin": "yangxinxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万年县',"simplepy": "wnx","provinceName": "江西省","pinyin": "wannianxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'泌阳',"simplepy": "by","provinceName": "河南省","pinyin": "miyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'霞浦',"simplepy": "xp","provinceName": "福建省","pinyin": "xiapu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'婺源县',"simplepy": "wyx","provinceName": "江西省","pinyin": "wuyuanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'东港',"simplepy": "dg","provinceName": "辽宁省","pinyin": "donggang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'卫辉',"simplepy": "wh","provinceName": "河南省","pinyin": "weihui","preDate": "10","typeNo": 1,"orderby":0 },{'name':'靖江',"simplepy": "jj","provinceName": "江苏省","pinyin": "jingjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德兴市',"simplepy": "dxs","provinceName": "江西省","pinyin": "dexingshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'大洼',"simplepy": "dw","provinceName": "辽宁省","pinyin": "dawa","preDate": "10","typeNo": 0,"orderby":0 },{'name':'鲁山',"simplepy": "ls","provinceName": "河南省","pinyin": "lushan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'黄冈',"simplepy": "hg","provinceName": "湖北省","pinyin": "huanggang","preDate": "6","typeNo": 0,"orderby":0 },{'name':'西丰',"simplepy": "xf","provinceName": "辽宁省","pinyin": "xifeng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'汤阴',"simplepy": "ty","provinceName": "河南省","pinyin": "tangyin","preDate": "10","typeNo": 1,"orderby":0 },{'name':'高邮',"simplepy": "gy","provinceName": "江苏省","pinyin": "gaoyou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'昭通',"simplepy": "zt","provinceName": "云南省","pinyin": "zhaotong","preDate": "15","typeNo": 0,"orderby":0 },{'name':'调兵山',"simplepy": "tbs","provinceName": "辽宁省","pinyin": "diaobingshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'武陵',"simplepy": "wl","provinceName": "河南省","pinyin": "wuling","preDate": "10","typeNo": 1,"orderby":0 },{'name':'黄岛',"simplepy": "hd","provinceName": "山东省","pinyin": "huangdao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'彰武',"simplepy": "zw","provinceName": "辽宁省","pinyin": "zhangwu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'商城',"simplepy": "sc","provinceName": "河南省","pinyin": "shangcheng","preDate": "10","typeNo": 1,"orderby":0 },{'name':'黔西南州',"simplepy": "qxnz","provinceName": "贵州省","pinyin": "qianxinanzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宽甸',"simplepy": "kd","provinceName": "辽宁省","pinyin": "kuandian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'驻马店',"simplepy": "zmd","provinceName": "河南省","pinyin": "zhumadian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'黔西南布依族苗族自治州',"simplepy": "qxnbyzmzzzz","provinceName": "贵州省","pinyin": "qianxinanbuyizumiaozuzizhizhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'盖州',"simplepy": "gz","provinceName": "辽宁省","pinyin": "gaizhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'鹤壁',"simplepy": "hb","provinceName": "河南省","pinyin": "hebi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'乌鲁木齐市',"simplepy": "wlmqs","provinceName": "新疆","pinyin": "wulumuqishi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'建昌',"simplepy": "jc","provinceName": "辽宁省","pinyin": "jianchang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'商丘',"simplepy": "sq","provinceName": "河南省","pinyin": "shangqiu","preDate": "10","typeNo": 1,"orderby":0 },{'name':'潜江',"simplepy": "qj","provinceName": "湖北省","pinyin": "qianjiang","preDate": "6","typeNo": 1,"orderby":0 },{'name':'昌图',"simplepy": "ct","provinceName": "辽宁省","pinyin": "changtu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'濮阳',"simplepy": "py","provinceName": "河南省","pinyin": "puyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'衡阳市',"simplepy": "hy","provinceName": "湖南省","pinyin": "hengyang","preDate": "15","typeNo": 0,"orderby":0 },{'name':'台安',"simplepy": "ta","provinceName": "辽宁省","pinyin": "taian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'周口',"simplepy": "zk","provinceName": "河南省","pinyin": "zhoukou","preDate": "10","typeNo": 1,"orderby":0 },{'name':'衡阳县',"simplepy": "hyx","provinceName": "湖南省","pinyin": "hengyangxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'丹东',"simplepy": "dd","provinceName": "辽宁省","pinyin": "dandong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'潢川',"simplepy": "hc","provinceName": "河南省","pinyin": "huangchuan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'衡山县',"simplepy": "hsx","provinceName": "湖南省","pinyin": "hengshanxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'清原',"simplepy": "qy","provinceName": "辽宁省","pinyin": "qingyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'耒阳市',"simplepy": "lys","provinceName": "湖南省","pinyin": "leiyangshi","preDate": "15","typeNo": 0,"orderby":0 },{'name':'庄河',"simplepy": "zh","provinceName": "辽宁省","pinyin": "zhuanghe","preDate": "10","typeNo": 0,"orderby":0 },{'name':'光山',"simplepy": "gs","provinceName": "河南省","pinyin": "guangshan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'衡东县',"simplepy": "hdx","provinceName": "湖南省","pinyin": "hengdongxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'大连',"simplepy": "dl","provinceName": "辽宁省","pinyin": "dalian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'新野',"simplepy": "xy","provinceName": "河南省","pinyin": "xinye","preDate": "10","typeNo": 1,"orderby":0 },{'name':'祁东县',"simplepy": "qdx","provinceName": "湖南省","pinyin": "qidongxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'北票',"simplepy": "bp","provinceName": "辽宁省","pinyin": "beipiao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'上蔡',"simplepy": "sc","provinceName": "河南省","pinyin": "shangcai","preDate": "10","typeNo": 1,"orderby":0 },{'name':'常宁市',"simplepy": "cns","provinceName": "湖南省","pinyin": "changningshi","preDate": "15","typeNo": 0,"orderby":0 },{'name':'朝阳',"simplepy": "zy","provinceName": "辽宁省","pinyin": "chaoyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'固始',"simplepy": "gs","provinceName": "河南省","pinyin": "gushi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'衡南县',"simplepy": "hnx","provinceName": "湖南省","pinyin": "hengnanxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'建平',"simplepy": "jp","provinceName": "辽宁省","pinyin": "jianping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'夏邑',"simplepy": "xy","provinceName": "河南省","pinyin": "xiayi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'抚顺',"simplepy": "fs","provinceName": "辽宁省","pinyin": "fushun","preDate": "10","typeNo": 0,"orderby":0 },{'name':'息县',"simplepy": "xx","provinceName": "河南省","pinyin": "xixian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'高平',"simplepy": "gp","provinceName": "山西省","pinyin": "gaoping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'凌海',"simplepy": "lh","provinceName": "辽宁省","pinyin": "linghai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'西平',"simplepy": "xp","provinceName": "河南省","pinyin": "xiping","preDate": "10","typeNo": 1,"orderby":0 },{'name':'黄梅',"simplepy": "hm","provinceName": "湖北省","pinyin": "huangmei","preDate": "6","typeNo": 1,"orderby":0 },{'name':'喀左',"simplepy": "kz","provinceName": "辽宁省","pinyin": "kazuo","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南召',"simplepy": "nz","provinceName": "河南省","pinyin": "nanzhao","preDate": "10","typeNo": 1,"orderby":0 },{'name':'娄底',"simplepy": "ld","provinceName": "湖南省","pinyin": "loudi","preDate": "6","typeNo": 0,"orderby":0 },{'name':'普兰店',"simplepy": "pld","provinceName": "辽宁省","pinyin": "pulandian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'卢氏',"simplepy": "ls","provinceName": "河南省","pinyin": "lushi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'涟源',"simplepy": "ly","provinceName": "湖南省","pinyin": "lianyuan","preDate": "30","typeNo": 0,"orderby":0 },{'name':'北镇',"simplepy": "bz","provinceName": "辽宁省","pinyin": "beizhen","preDate": "10","typeNo": 0,"orderby":0 },{'name':'漯河',"simplepy": "th","provinceName": "河南省","pinyin": "luohe","preDate": "10","typeNo": 1,"orderby":0 },{'name':'双峰',"simplepy": "sf","provinceName": "湖南省","pinyin": "shuangfeng","preDate": "30","typeNo": 0,"orderby":0 },{'name':'黑山',"simplepy": "hs","provinceName": "辽宁省","pinyin": "heishan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南阳',"simplepy": "ny","provinceName": "河南省","pinyin": "nanyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'新化',"simplepy": "xh","provinceName": "湖南省","pinyin": "xinhua","preDate": "30","typeNo": 0,"orderby":0 },{'name':'三门峡',"simplepy": "smx","provinceName": "河南省","pinyin": "sanmenxia","preDate": "10","typeNo": 1,"orderby":0 },{'name':'冷水江',"simplepy": "lsj","provinceName": "湖南省","pinyin": "lengshuijiang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'旅顺口',"simplepy": "lsk","provinceName": "辽宁省","pinyin": "lvshunkou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜阳',"simplepy": "yy","provinceName": "河南省","pinyin": "yiyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'桥头河',"simplepy": "qth","provinceName": "湖南省","pinyin": "qiaotouhe","preDate": "6","typeNo": 1,"orderby":0 },{'name':'新宾',"simplepy": "xb","provinceName": "辽宁省","pinyin": "xinbin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'唐河',"simplepy": "th","provinceName": "河南省","pinyin": "tanghe","preDate": "10","typeNo": 1,"orderby":0 },{'name':'杨家滩',"simplepy": "yjt","provinceName": "湖南省","pinyin": "yangjiatan","preDate": "6","typeNo": 1,"orderby":0 },{'name':'沈阳',"simplepy": "sy","provinceName": "辽宁省","pinyin": "shenyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'镇平',"simplepy": "zp","provinceName": "河南省","pinyin": "zhenping","preDate": "10","typeNo": 1,"orderby":0 },{'name':'汝阳',"simplepy": "ry","provinceName": "河南省","pinyin": "ruyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'郴州',"simplepy": "cz","provinceName": "湖南省","pinyin": "chenzhou","preDate": "60","typeNo": 0,"orderby":0 },{'name':'溧阳',"simplepy": "LY","provinceName": "江苏省","pinyin": "liyang","preDate": "9","typeNo": 0,"orderby":0 },{'name':'新民',"simplepy": "xm","provinceName": "辽宁省","pinyin": "xinmin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'临颍',"simplepy": "ly","provinceName": "河南省","pinyin": "linying","preDate": "10","typeNo": 1,"orderby":0 },{'name':'泸沽湖',"simplepy": "lgh","provinceName": "云南省","pinyin": "luguhu","preDate": "14","typeNo": 0,"orderby":0 },{'name':'南京',"simplepy": "NJ","provinceName": "江苏省","pinyin": "nanjing","preDate": "18","typeNo": 0,"orderby":0 },{'name':'康平',"simplepy": "kp","provinceName": "辽宁省","pinyin": "kangping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'淅川',"simplepy": "xc","provinceName": "河南省","pinyin": "xichuan","preDate": "10","typeNo": 1,"orderby":0 },{'name':'永胜',"simplepy": "ys","provinceName": "云南省","pinyin": "yongsheng","preDate": "14","typeNo": 0,"orderby":0 },{'name':'义县',"simplepy": "yx","provinceName": "辽宁省","pinyin": "yixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'西峡',"simplepy": "xx","provinceName": "河南省","pinyin": "xixia","preDate": "10","typeNo": 1,"orderby":0 },{'name':'保山',"simplepy": "bs","provinceName": "云南省","pinyin": "baoshan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'沂水',"simplepy": "ys","provinceName": "山东省","pinyin": "yishui","preDate": "10","typeNo": 0,"orderby":0 },{'name':'内乡',"simplepy": "nx","provinceName": "河南省","pinyin": "neixiang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'曲靖',"simplepy": "qj","provinceName": "云南省","pinyin": "qujing","preDate": "14","typeNo": 0,"orderby":0 },{'name':'舞阳',"simplepy": "wy","provinceName": "河南省","pinyin": "wuyang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'文山',"simplepy": "ws","provinceName": "云南省","pinyin": "wenshan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'昆山',"simplepy": "KSS","provinceName": "江苏省","pinyin": "kunshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'社旗',"simplepy": "sq","provinceName": "河南省","pinyin": "sheqi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'太仓',"simplepy": "TBS","provinceName": "江苏省","pinyin": "taicang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'淄博',"simplepy": "zb","provinceName": "山东省","pinyin": "zibo","preDate": "10","typeNo": 1,"orderby":0 },{'name':'兰考',"simplepy": "lk","provinceName": "河南省","pinyin": "lankao","preDate": "10","typeNo": 1,"orderby":0 },{'name':'曹县',"simplepy": "cx","provinceName": "山东省","pinyin": "caoxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'开封',"simplepy": "kf","provinceName": "河南省","pinyin": "kaifeng","preDate": "10","typeNo": 1,"orderby":0 },{'name':'巨野',"simplepy": "jy","provinceName": "山东省","pinyin": "juye","preDate": "10","typeNo": 0,"orderby":0 },{'name':'鄄城',"simplepy": "jc","provinceName": "山东省","pinyin": "juancheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'兴化',"simplepy": "XH","provinceName": "江苏省","pinyin": "xinghua","preDate": "15","typeNo": 0,"orderby":0 },{'name':'东明',"simplepy": "dm","provinceName": "山东省","pinyin": "dongming","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湘潭',"simplepy": "xt","provinceName": "湖南省","pinyin": "xiangtan","preDate": "30","typeNo": 0,"orderby":0 },{'name':'宜兴',"simplepy": "YX","provinceName": "江苏省","pinyin": "yixing","preDate": "14","typeNo": 0,"orderby":0 },{'name':'成武',"simplepy": "cw","provinceName": "山东省","pinyin": "chengwu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'单县',"simplepy": "dx","provinceName": "山东省","pinyin": "danxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湘潭县',"simplepy": "xtx","provinceName": "湖南省","pinyin": "xiangtanxian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'桂东县',"simplepy": "gdx","provinceName": "湖南省","pinyin": "guidongxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'兰陵',"simplepy": "ll","provinceName": "山东省","pinyin": "lanling","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湘乡',"simplepy": "xx","provinceName": "湖南省","pinyin": "xiangxiang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'资兴市',"simplepy": "zxs","provinceName": "湖南省","pinyin": "zixingshi","preDate": "60","typeNo": 0,"orderby":0 },{'name':'丹阳',"simplepy": "DYS","provinceName": "江苏省","pinyin": "danyang","preDate": "15","typeNo": 0,"orderby":0 },{'name':'费县',"simplepy": "fx","provinceName": "山东省","pinyin": "feixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'韶山',"simplepy": "ss","provinceName": "湖南省","pinyin": "shaoshan","preDate": "30","typeNo": 0,"orderby":0 },{'name':'永兴县',"simplepy": "yxx","provinceName": "湖南省","pinyin": "yongxingxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'句容',"simplepy": "JRS","provinceName": "江苏省","pinyin": "jurong","preDate": "15","typeNo": 0,"orderby":0 },{'name':'莒南',"simplepy": "jn","provinceName": "山东省","pinyin": "junan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'晋城',"simplepy": "jc","provinceName": "山西省","pinyin": "jincheng","preDate": "30","typeNo": 0,"orderby":0 },{'name':'安仁县',"simplepy": "arx","provinceName": "湖南省","pinyin": "anrenxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'扬中',"simplepy": "YZS","provinceName": "江苏省","pinyin": "yangzhong","preDate": "15","typeNo": 0,"orderby":0 },{'name':'平邑',"simplepy": "py","provinceName": "山东省","pinyin": "pingyi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'淮安',"simplepy": "ha","provinceName": "江苏省","pinyin": "huaian","preDate": "40","typeNo": 0,"orderby":0 },{'name':'汝城县',"simplepy": "rcx","provinceName": "湖南省","pinyin": "ruchengxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'定陶',"simplepy": "dt","provinceName": "山东省","pinyin": "dingtao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'天门',"simplepy": "tm","provinceName": "湖北省","pinyin": "tianmen","preDate": "10","typeNo": 0,"orderby":0 },{'name':'嘉禾县',"simplepy": "jhx","provinceName": "湖南省","pinyin": "jiahexian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'郯城',"simplepy": "tc","provinceName": "山东省","pinyin": "tancheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'黄石',"simplepy": "hs","provinceName": "湖北省","pinyin": "huangshi","preDate": "16","typeNo": 1,"orderby":0 },{'name':'桂阳县',"simplepy": "gyx","provinceName": "湖南省","pinyin": "guiyangxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'丘北',"simplepy": "qb","provinceName": "云南省","pinyin": "qiubei","preDate": "14","typeNo": 0,"orderby":0 },{'name':'临沭',"simplepy": "ls","provinceName": "山东省","pinyin": "linshu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'临武县',"simplepy": "lwx","provinceName": "湖南省","pinyin": "linwuxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'广南',"simplepy": "gn","provinceName": "云南省","pinyin": "guangnan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'茌平',"simplepy": "cp","provinceName": "山东省","pinyin": "chiping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'浏阳',"simplepy": "ly","provinceName": "湖南省","pinyin": "liuyang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'百色市',"simplepy": "bss","provinceName": "广西省","pinyin": "baiseshi","preDate": "25","typeNo": 0,"orderby":0 },{'name':'麻栗坡',"simplepy": "mlp","provinceName": "云南省","pinyin": "malipo","preDate": "14","typeNo": 0,"orderby":0 },{'name':'浠水县',"simplepy": "xs","provinceName": "湖北省","pinyin": "xishui","preDate": "30","typeNo": 1,"orderby":0 },{'name':'田阳县',"simplepy": "tyx","provinceName": "广西省","pinyin": "tianyangxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'富宁',"simplepy": "fn","provinceName": "云南省","pinyin": "funing","preDate": "14","typeNo": 0,"orderby":0 },{'name':'乳山',"simplepy": "rs","provinceName": "山东省","pinyin": "rushan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'大同',"simplepy": "dt","provinceName": "山西省","pinyin": "datong","preDate": "30","typeNo": 0,"orderby":0 },{'name':'田东县',"simplepy": "tdx","provinceName": "广西省","pinyin": "tiandongxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'马关',"simplepy": "mg","provinceName": "云南省","pinyin": "maguan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'新泰',"simplepy": "xt","provinceName": "山东省","pinyin": "xintai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'常德',"simplepy": "cd","provinceName": "湖南省","pinyin": "changde","preDate": "30","typeNo": 0,"orderby":0 },{'name':'平果县',"simplepy": "pgx","provinceName": "广西省","pinyin": "pingguoxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'平远街',"simplepy": "pyj","provinceName": "云南省","pinyin": "pingyuanjie","preDate": "14","typeNo": 0,"orderby":0 },{'name':'威海',"simplepy": "wh","provinceName": "山东省","pinyin": "weihai","preDate": "10","typeNo": 1,"orderby":0 },{'name':'陵川',"simplepy": "lc","provinceName": "山西省","pinyin": "lingchuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德保县',"simplepy": "dbx","provinceName": "广西省","pinyin": "debaoxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'砚山',"simplepy": "ys","provinceName": "云南省","pinyin": "yanshan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'泰安',"simplepy": "ta","provinceName": "山东省","pinyin": "taian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'珠海',"simplepy": "zh","provinceName": "广东省","pinyin": "zhuhai","preDate": "22","typeNo": 0,"orderby":0 },{'name':'靖西县',"simplepy": "jxx","provinceName": "广西省","pinyin": "jingxixian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'西畴',"simplepy": "xc","provinceName": "云南省","pinyin": "xichou","preDate": "14","typeNo": 0,"orderby":0 },{'name':'莱芜',"simplepy": "lw","provinceName": "山东省","pinyin": "laiwu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'东莞',"simplepy": "dg","provinceName": "广东省","pinyin": "dongguan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'斗门',"simplepy": "dm","provinceName": "广东省","pinyin": "doumen","preDate": "7","typeNo": 1,"orderby":0 },{'name':'田林县',"simplepy": "tlx","provinceName": "广西省","pinyin": "tianlinxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'文登区',"simplepy": "wdq","provinceName": "山东省","pinyin": "wendengqu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'中山',"simplepy": "zs","provinceName": "广东省","pinyin": "zhongshan","preDate": "29","typeNo": 0,"orderby":0 },{'name':'汕头',"simplepy": "st","provinceName": "广东省","pinyin": "shantou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'隆林县',"simplepy": "llx","provinceName": "广西省","pinyin": "longlinxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'石岛',"simplepy": "sd","provinceName": "山东省","pinyin": "shidao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'佛山',"simplepy": "fs","provinceName": "广东省","pinyin": "foshan","preDate": "7","typeNo": 0,"orderby":0 },{'name':'澄海',"simplepy": "ch","provinceName": "广东省","pinyin": "chenghai","preDate": "7","typeNo": 1,"orderby":0 },{'name':'西林县',"simplepy": "xlx","provinceName": "广西省","pinyin": "xilinxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'宁德',"simplepy": "ND","provinceName": "福建省","pinyin": "ningde","preDate": "15","typeNo": 0,"orderby":0 },{'name':'沾化',"simplepy": "zh","provinceName": "山东省","pinyin": "zhanhua","preDate": "10","typeNo": 0,"orderby":0 },{'name':'凤岗',"simplepy": "fg","provinceName": "广东省","pinyin": "fenggang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'潮阳',"simplepy": "cy","provinceName": "广东省","pinyin": "chaoyang","preDate": "7","typeNo": 1,"orderby":0 },{'name':'盛泽',"simplepy": "sz","provinceName": "江苏省","pinyin": "shengze","preDate": "7","typeNo": 1,"orderby":0 },{'name':'乐业县',"simplepy": "lyx","provinceName": "广西省","pinyin": "leyexian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'和平',"simplepy": "hp","provinceName": "广东省","pinyin": "heping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南澳',"simplepy": "na","provinceName": "广东省","pinyin": "nanao","preDate": "7","typeNo": 1,"orderby":0 },{'name':'凌云县',"simplepy": "lyx","provinceName": "广西省","pinyin": "lingyunxian","preDate": "25","typeNo": 0,"orderby":0 },{'name':'古田县',"simplepy": "GTX","provinceName": "福建省","pinyin": "gutianxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'肥城',"simplepy": "fc","provinceName": "山东省","pinyin": "feicheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'大岭山',"simplepy": "dls","provinceName": "广东省","pinyin": "dalingshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'潮南',"simplepy": "cn","provinceName": "广东省","pinyin": "chaonan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'吉首',"simplepy": "js","provinceName": "湖南省","pinyin": "jishou","preDate": "30","typeNo": 0,"orderby":0 },{'name':'屏南县',"simplepy": "PNX","provinceName": "福建省","pinyin": "pingnanxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'邹平',"simplepy": "zp","provinceName": "山东省","pinyin": "zouping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'寮步',"simplepy": "lb","provinceName": "广东省","pinyin": "liaobu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'寿宁县',"simplepy": "SNX","provinceName": "福建省","pinyin": "shouningxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'蒙阴',"simplepy": "my","provinceName": "山东省","pinyin": "mengyin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南海',"simplepy": "nh","provinceName": "广东省","pinyin": "nanhai","preDate": "7","typeNo": 1,"orderby":0 },{'name':'柘荣县',"simplepy": "ZRX","provinceName": "福建省","pinyin": "zherongxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'滨州',"simplepy": "bz","provinceName": "山东省","pinyin": "binzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'廉江',"simplepy": "lj","provinceName": "广东省","pinyin": "lianjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'周宁县',"simplepy": "ZNX","provinceName": "福建省","pinyin": "zhouningxian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'临沂',"simplepy": "ly","provinceName": "山东省","pinyin": "linyi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'惠州',"simplepy": "hz","provinceName": "广东省","pinyin": "huizhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'高明',"simplepy": "gm","provinceName": "广东省","pinyin": "gaoming","preDate": "7","typeNo": 1,"orderby":0 },{'name':'梁山',"simplepy": "ls","provinceName": "山东省","pinyin": "liangshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'揭阳',"simplepy": "jy","provinceName": "广东省","pinyin": "jieyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'三水',"simplepy": "ss","provinceName": "广东省","pinyin": "sanshui","preDate": "7","typeNo": 1,"orderby":0 },{'name':'曲阜',"simplepy": "qf","provinceName": "山东省","pinyin": "qufu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'普宁',"simplepy": "pn","provinceName": "广东省","pinyin": "puning","preDate": "10","typeNo": 0,"orderby":0 },{'name':'韶关',"simplepy": "sg","provinceName": "广东省","pinyin": "shaoguan","preDate": "7","typeNo": 0,"orderby":0 },{'name':'梅州',"simplepy": "mz","provinceName": "广东省","pinyin": "meizhou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'乐昌',"simplepy": "lc","provinceName": "广东省","pinyin": "lechang","preDate": "7","typeNo": 1,"orderby":0 },{'name':'滕州',"simplepy": "tz","provinceName": "山东省","pinyin": "tengzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'樟木头',"simplepy": "zmt","provinceName": "广东省","pinyin": "zhangmutou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'仁化',"simplepy": "rh","provinceName": "广东省","pinyin": "renhua","preDate": "7","typeNo": 1,"orderby":0 },{'name':'盱眙',"simplepy": "xy","provinceName": "江苏省","pinyin": "xuyi","preDate": "40","typeNo": 0,"orderby":0 },{'name':'鱼台',"simplepy": "yt","provinceName": "山东省","pinyin": "yutai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南雄',"simplepy": "nx","provinceName": "广东省","pinyin": "nanxiong","preDate": "7","typeNo": 1,"orderby":0 },{'name':'涟水',"simplepy": "ls","provinceName": "江苏省","pinyin": "lianshui","preDate": "40","typeNo": 0,"orderby":0 },{'name':'汶上',"simplepy": "ws","provinceName": "山东省","pinyin": "wenshang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'汕尾',"simplepy": "sw","provinceName": "广东省","pinyin": "shanwei","preDate": "10","typeNo": 0,"orderby":0 },{'name':'始兴',"simplepy": "sx","provinceName": "广东省","pinyin": "shixing","preDate": "7","typeNo": 1,"orderby":0 },{'name':'洪泽',"simplepy": "hz","provinceName": "江苏省","pinyin": "hongze","preDate": "40","typeNo": 0,"orderby":0 },{'name':'金乡',"simplepy": "jx","provinceName": "山东省","pinyin": "jinxiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'江门',"simplepy": "jm","provinceName": "广东省","pinyin": "jiangmen","preDate": "20","typeNo": 0,"orderby":0 },{'name':'翁源',"simplepy": "wy","provinceName": "广东省","pinyin": "wengyuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'微山',"simplepy": "ws","provinceName": "山东省","pinyin": "weishan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'河源',"simplepy": "hy","provinceName": "广东省","pinyin": "heyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'新丰',"simplepy": "xf","provinceName": "广东省","pinyin": "xinfeng","preDate": "7","typeNo": 1,"orderby":0 },{'name':'兖州',"simplepy": "yz","provinceName": "山东省","pinyin": "yanzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'曲江',"simplepy": "qj","provinceName": "广东省","pinyin": "qujiang","preDate": "7","typeNo": 1,"orderby":0 },{'name':'绍兴市',"simplepy": "sxs","provinceName": "浙江省","pinyin": "shaoxingshi","preDate": "60","typeNo": 0,"orderby":0 },{'name':'明溪县',"simplepy": "MXX","provinceName": "福建省","pinyin": "mingxixian","preDate": "15","typeNo": 0,"orderby":0 },{'name':'泗水',"simplepy": "ss","provinceName": "山东省","pinyin": "sishui","preDate": "10","typeNo": 0,"orderby":0 },{'name':'清远',"simplepy": "qy","provinceName": "广东省","pinyin": "qingyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乳源',"simplepy": "ry","provinceName": "广东省","pinyin": "ruyuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'宜昌市',"simplepy": "ycs","provinceName": "湖北省","pinyin": "yichangshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'沂南',"simplepy": "yn","provinceName": "山东省","pinyin": "yinan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湛江',"simplepy": "zj","provinceName": "广东省","pinyin": "zhanjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'保定市',"simplepy": "bds","provinceName": "河北省","pinyin": "baodingshi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'潍坊',"simplepy": "wf","provinceName": "山东省","pinyin": "weifang","preDate": "10","typeNo": 1,"orderby":0 },{'name':'潮州',"simplepy": "cz","provinceName": "广东省","pinyin": "chaozhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'雷州',"simplepy": "lz","provinceName": "广东省","pinyin": "leizhou","preDate": "7","typeNo": 1,"orderby":0 },{'name':'忻州',"simplepy": "xz","provinceName": "山西省","pinyin": "xinzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'栖霞',"simplepy": "qx","provinceName": "山东省","pinyin": "qixia","preDate": "10","typeNo": 0,"orderby":0 },{'name':'广饶',"simplepy": "gr","provinceName": "山东省","pinyin": "guangrao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'茂名',"simplepy": "mm","provinceName": "广东省","pinyin": "maoming","preDate": "10","typeNo": 0,"orderby":0 },{'name':'吴川',"simplepy": "wc","provinceName": "广东省","pinyin": "wuchuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'章丘',"simplepy": "zq","provinceName": "山东省","pinyin": "zhangqiu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'遂溪廉江',"simplepy": "sxlj","provinceName": "广东省","pinyin": "suixilianjiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'徐闻',"simplepy": "xw","provinceName": "广东省","pinyin": "xuwen","preDate": "7","typeNo": 1,"orderby":0 },{'name':'济南',"simplepy": "jn","provinceName": "山东省","pinyin": "jinan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'顺德',"simplepy": "sd","provinceName": "广东省","pinyin": "shunde","preDate": "10","typeNo": 0,"orderby":0 },{'name':'遂溪',"simplepy": "sx","provinceName": "广东省","pinyin": "suixi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'银川',"simplepy": "yc","provinceName": "宁夏省","pinyin": "yinchuan","preDate": "4","typeNo": 0,"orderby":0 },{'name':'开平',"simplepy": "kp","provinceName": "广东省","pinyin": "kaiping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'肇庆',"simplepy": "zq","provinceName": "广东省","pinyin": "zhaoqing","preDate": "7","typeNo": 0,"orderby":0 },{'name':'吴忠',"simplepy": "wz","provinceName": "宁夏省","pinyin": "wuzhong","preDate": "4","typeNo": 0,"orderby":0 },{'name':'渝北区',"simplepy": "ybq","provinceName": "重庆市","pinyin": "yubeiqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'高要',"simplepy": "gy","provinceName": "广东省","pinyin": "gaoyao","preDate": "7","typeNo": 1,"orderby":0 },{'name':'中宁',"simplepy": "zn","provinceName": "宁夏省","pinyin": "zhongning","preDate": "4","typeNo": 0,"orderby":0 },{'name':'东营',"simplepy": "dy","provinceName": "山东省","pinyin": "dongying","preDate": "10","typeNo": 1,"orderby":0 },{'name':'永川区',"simplepy": "ycq","provinceName": "重庆市","pinyin": "yongchuanqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'四会',"simplepy": "sh","provinceName": "广东省","pinyin": "sihui","preDate": "7","typeNo": 1,"orderby":0 },{'name':'灵武',"simplepy": "lw","provinceName": "宁夏省","pinyin": "lingwu","preDate": "4","typeNo": 0,"orderby":0 },{'name':'招远',"simplepy": "zy","provinceName": "山东省","pinyin": "zhaoyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万州区',"simplepy": "wzq","provinceName": "重庆市","pinyin": "wanzhouqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'广宁',"simplepy": "gn","provinceName": "广东省","pinyin": "guangning","preDate": "7","typeNo": 1,"orderby":0 },{'name':'大武口',"simplepy": "dwk","provinceName": "宁夏省","pinyin": "dawukou","preDate": "4","typeNo": 0,"orderby":0 },{'name':'荣昌区',"simplepy": "rcq","provinceName": "重庆市","pinyin": "rongchangqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'德庆',"simplepy": "dq","provinceName": "广东省","pinyin": "deqing","preDate": "7","typeNo": 1,"orderby":0 },{'name':'固原',"simplepy": "gy","provinceName": "宁夏省","pinyin": "guyuan","preDate": "4","typeNo": 0,"orderby":0 },{'name':'莱州',"simplepy": "lz","provinceName": "山东省","pinyin": "laizhou","preDate": "10","typeNo": 1,"orderby":0 },{'name':'南川区',"simplepy": "ncq","provinceName": "重庆市","pinyin": "nanchuanqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'封开',"simplepy": "fk","provinceName": "广东省","pinyin": "fengkai","preDate": "7","typeNo": 1,"orderby":0 },{'name':'海原',"simplepy": "hy","provinceName": "宁夏省","pinyin": "haiyuan","preDate": "4","typeNo": 0,"orderby":0 },{'name':'合川区',"simplepy": "hcq","provinceName": "重庆市","pinyin": "hechuanqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'怀集',"simplepy": "hj","provinceName": "广东省","pinyin": "huaiji","preDate": "7","typeNo": 1,"orderby":0 },{'name':'同心',"simplepy": "tx","provinceName": "宁夏省","pinyin": "tongxin","preDate": "4","typeNo": 0,"orderby":0 },{'name':'龙口',"simplepy": "lk","provinceName": "山东省","pinyin": "longkou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'江津区',"simplepy": "jjq","provinceName": "重庆市","pinyin": "jiangjinqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'西吉',"simplepy": "xj","provinceName": "宁夏省","pinyin": "xiji","preDate": "4","typeNo": 0,"orderby":0 },{'name':'寿光',"simplepy": "sg","provinceName": "山东省","pinyin": "shouguang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'大足区',"simplepy": "dzq","provinceName": "重庆市","pinyin": "dazuqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'新会',"simplepy": "xh","provinceName": "广东省","pinyin": "xinhui","preDate": "7","typeNo": 1,"orderby":0 },{'name':'平罗',"simplepy": "pl","provinceName": "宁夏省","pinyin": "pingluo","preDate": "4","typeNo": 0,"orderby":0 },{'name':'海阳',"simplepy": "hy","provinceName": "山东省","pinyin": "haiyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'巫山',"simplepy": "ws","provinceName": "重庆市","pinyin": "wushan","preDate": "5","typeNo": 0,"orderby":0 },{'name':'台山',"simplepy": "ts","provinceName": "广东省","pinyin": "taishan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'惠农区',"simplepy": "hnq","provinceName": "宁夏省","pinyin": "huinongqu","preDate": "4","typeNo": 0,"orderby":0 },{'name':'潼南',"simplepy": "tn","provinceName": "重庆市","pinyin": "tongnan","preDate": "5","typeNo": 0,"orderby":0 },{'name':'石嘴山',"simplepy": "szs","provinceName": "宁夏省","pinyin": "shizuishan","preDate": "4","typeNo": 0,"orderby":0 },{'name':'铜梁',"simplepy": "tl","provinceName": "重庆市","pinyin": "tongliang","preDate": "5","typeNo": 0,"orderby":0 },{'name':'恩平',"simplepy": "ep","provinceName": "广东省","pinyin": "enping","preDate": "7","typeNo": 1,"orderby":0 },{'name':'临汾',"simplepy": "lf","provinceName": "山西省","pinyin": "linfen","preDate": "10","typeNo": 0,"orderby":0 },{'name':'万盛区',"simplepy": "wsq","provinceName": "重庆市","pinyin": "wanshengqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'鹤山',"simplepy": "hs","provinceName": "广东省","pinyin": "heshan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'安化',"simplepy": "ah","provinceName": "湖南省","pinyin": "anhua","preDate": "30","typeNo": 0,"orderby":0 },{'name':'黔江区',"simplepy": "qjq","provinceName": "重庆市","pinyin": "qianjiangqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'桃江',"simplepy": "tj","provinceName": "湖南省","pinyin": "taojiang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'綦江区',"simplepy": "qjq","provinceName": "重庆市","pinyin": "qijiangqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'高州',"simplepy": "gz","provinceName": "广东省","pinyin": "gaozhou","preDate": "7","typeNo": 1,"orderby":0 },{'name':'南县',"simplepy": "nx","provinceName": "湖南省","pinyin": "nanxian","preDate": "30","typeNo": 0,"orderby":0 },{'name':'义乌',"simplepy": "yw","provinceName": "浙江省","pinyin": "yiwu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'北碚区',"simplepy": "bbq","provinceName": "重庆市","pinyin": "beibeiqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'信宜',"simplepy": "xy","provinceName": "广东省","pinyin": "xinyi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'沅江',"simplepy": "yj","provinceName": "湖南省","pinyin": "yuanjiang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'乐山',"simplepy": "ls","provinceName": "四川省","pinyin": "leshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'长寿区',"simplepy": "csq","provinceName": "重庆市","pinyin": "changshouqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'电白',"simplepy": "db","provinceName": "广东省","pinyin": "dianbai","preDate": "7","typeNo": 1,"orderby":0 },{'name':'大通湖',"simplepy": "dth","provinceName": "湖南省","pinyin": "datonghu","preDate": "30","typeNo": 0,"orderby":0 },{'name':'九寨沟县',"simplepy": "jzgx","provinceName": "四川省","pinyin": "jiuzhaigouxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'巫溪',"simplepy": "wx","provinceName": "重庆市","pinyin": "wuxi","preDate": "5","typeNo": 0,"orderby":0 },{'name':'化州',"simplepy": "hz","provinceName": "广东省","pinyin": "huazhou","preDate": "7","typeNo": 1,"orderby":0 },{'name':'梅城',"simplepy": "mc","provinceName": "湖南省","pinyin": "meicheng","preDate": "30","typeNo": 0,"orderby":0 },{'name':'九江',"simplepy": "jj","provinceName": "江西省","pinyin": "jiujiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'石柱',"simplepy": "sz","provinceName": "重庆市","pinyin": "shizhu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'灰山港',"simplepy": "hsg","provinceName": "湖南省","pinyin": "huishangang","preDate": "30","typeNo": 0,"orderby":0 },{'name':'丰都',"simplepy": "fd","provinceName": "重庆市","pinyin": "fengdu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'惠阳',"simplepy": "hy","provinceName": "广东省","pinyin": "huiyang","preDate": "7","typeNo": 0,"orderby":0 },{'name':'龙岩',"simplepy": "ly","provinceName": "福建省","pinyin": "LongYan","preDate": "29","typeNo": 0,"orderby":0 },{'name':'云浮市',"simplepy": "yfs","provinceName": "广西省","pinyin": "yunfushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'城口',"simplepy": "ck","provinceName": "重庆市","pinyin": "chengkou","preDate": "5","typeNo": 0,"orderby":0 },{'name':'惠东',"simplepy": "hd","provinceName": "广东省","pinyin": "huidong","preDate": "7","typeNo": 1,"orderby":0 },{'name':'亳州',"simplepy": "bz","provinceName": "安徽省","pinyin": "bozhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'开县',"simplepy": "kx","provinceName": "重庆市","pinyin": "kaixian","preDate": "5","typeNo": 0,"orderby":0 },{'name':'博罗',"simplepy": "bl","provinceName": "广东省","pinyin": "boluo","preDate": "7","typeNo": 1,"orderby":0 },{'name':'忠县',"simplepy": "zx","provinceName": "重庆市","pinyin": "zhongxian","preDate": "5","typeNo": 0,"orderby":0 },{'name':'龙门',"simplepy": "lm","provinceName": "广东省","pinyin": "longmen","preDate": "7","typeNo": 1,"orderby":0 },{'name':'三明',"simplepy": "sm","provinceName": "福建省","pinyin": "sanming","preDate": "14","typeNo": 0,"orderby":0 },{'name':'信阳',"simplepy": "xy","provinceName": "河南省","pinyin": "xinyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'璧山',"simplepy": "bs","provinceName": "重庆市","pinyin": "bishan","preDate": "5","typeNo": 0,"orderby":0 },{'name':'大亚湾',"simplepy": "dyw","provinceName": "广东省","pinyin": "dayawan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'长汀县',"simplepy": "ct","provinceName": "福建省","pinyin": "changting","preDate": "29","typeNo": 0,"orderby":0 },{'name':'公主岭',"simplepy": "gzl","provinceName": "吉林省","pinyin": "gongzhuling","preDate": "10","typeNo": 0,"orderby":0 },{'name':'垫江',"simplepy": "dj","provinceName": "重庆市","pinyin": "dianjiang","preDate": "5","typeNo": 0,"orderby":0 },{'name':'永定县',"simplepy": "yd","provinceName": "福建省","pinyin": "yongding","preDate": "29","typeNo": 0,"orderby":0 },{'name':'兰州',"simplepy": "lz","provinceName": "甘肃省","pinyin": "lanzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'奉节',"simplepy": "fj","provinceName": "重庆市","pinyin": "fengjie","preDate": "5","typeNo": 0,"orderby":0 },{'name':'梅县',"simplepy": "mx","provinceName": "广东省","pinyin": "meixian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'上杭县',"simplepy": "sh","provinceName": "福建省","pinyin": "shanghang","preDate": "29","typeNo": 0,"orderby":0 },{'name':'兴义',"simplepy": "xy","provinceName": "贵州省","pinyin": "xingyi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'梁平',"simplepy": "lp","provinceName": "重庆市","pinyin": "liangping","preDate": "5","typeNo": 0,"orderby":0 },{'name':'蕉岭',"simplepy": "jl","provinceName": "广东省","pinyin": "jiaoling","preDate": "7","typeNo": 1,"orderby":0 },{'name':'武平县',"simplepy": "wp","provinceName": "福建省","pinyin": "wuping","preDate": "29","typeNo": 0,"orderby":0 },{'name':'凤凰县',"simplepy": "fhx","provinceName": "湖南省","pinyin": "fenghuangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'彭水',"simplepy": "ps","provinceName": "重庆市","pinyin": "pengshui","preDate": "5","typeNo": 0,"orderby":0 },{'name':'大埔',"simplepy": "dp","provinceName": "广东省","pinyin": "dapu","preDate": "7","typeNo": 1,"orderby":0 },{'name':'连城县',"simplepy": "lc","provinceName": "福建省","pinyin": "liancheng","preDate": "29","typeNo": 0,"orderby":0 },{'name':'包头',"simplepy": "bt","provinceName": "内蒙古","pinyin": "baotou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'武隆',"simplepy": "wl","provinceName": "重庆市","pinyin": "wulong","preDate": "5","typeNo": 0,"orderby":0 },{'name':'丰顺',"simplepy": "fs","provinceName": "广东省","pinyin": "fengshun","preDate": "7","typeNo": 1,"orderby":0 },{'name':'漳平市',"simplepy": "zp","provinceName": "福建省","pinyin": "zhangping","preDate": "29","typeNo": 0,"orderby":0 },{'name':'秀山',"simplepy": "xs","provinceName": "重庆市","pinyin": "xiushan","preDate": "5","typeNo": 0,"orderby":0 },{'name':'五华',"simplepy": "wh","provinceName": "广东省","pinyin": "wuhua","preDate": "7","typeNo": 1,"orderby":0 },{'name':'涵江区',"simplepy": "hj","provinceName": "福建省","pinyin": "hanjiang","preDate": "14","typeNo": 0,"orderby":0 },{'name':'北海',"simplepy": "bh","provinceName": "广西省","pinyin": "beihai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'酉阳',"simplepy": "yy","provinceName": "重庆市","pinyin": "youyang","preDate": "5","typeNo": 0,"orderby":0 },{'name':'兴宁',"simplepy": "xn","provinceName": "广东省","pinyin": "xingning","preDate": "7","typeNo": 1,"orderby":0 },{'name':'仙游县',"simplepy": "xy","provinceName": "福建省","pinyin": "xianyou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'云阳',"simplepy": "yy","provinceName": "重庆市","pinyin": "yunyang","preDate": "5","typeNo": 0,"orderby":0 },{'name':'平远',"simplepy": "py","provinceName": "广东省","pinyin": "pingyuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'惠安县',"simplepy": "ha","provinceName": "福建省","pinyin": "huian","preDate": "22","typeNo": 0,"orderby":0 },{'name':'南充',"simplepy": "nc","provinceName": "四川省","pinyin": "nanchong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'涪陵区',"simplepy": "flq","provinceName": "重庆市","pinyin": "fulingqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'安溪县',"simplepy": "ax","provinceName": "福建省","pinyin": "anxi","preDate": "22","typeNo": 0,"orderby":0 },{'name':'南宁',"simplepy": "nn","provinceName": "广西省","pinyin": "nanning","preDate": "25","typeNo": 0,"orderby":0 },{'name':'九龙坡区',"simplepy": "jlpq","provinceName": "重庆市","pinyin": "jiulongpoqu","preDate": "5","typeNo": 0,"orderby":0 },{'name':'海丰',"simplepy": "hf","provinceName": "广东省","pinyin": "haifeng","preDate": "7","typeNo": 1,"orderby":0 },{'name':'永春县',"simplepy": "yc","provinceName": "福建省","pinyin": "yongchun","preDate": "22","typeNo": 0,"orderby":0 },{'name':'南平',"simplepy": "np","provinceName": "福建省","pinyin": "nanping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'防城港',"simplepy": "fcg","provinceName": "广西壮族自治区","pinyin": "fangchenggang","preDate": "4","typeNo": 0,"orderby":0 },{'name':'陆河',"simplepy": "lh","provinceName": "广东省","pinyin": "luhe","preDate": "7","typeNo": 1,"orderby":0 },{'name':'德化县',"simplepy": "dh","provinceName": "福建省","pinyin": "dehua","preDate": "22","typeNo": 0,"orderby":0 },{'name':'南昌',"simplepy": "nc","provinceName": "江西省","pinyin": "nanchang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'东兴市',"simplepy": "dgs","provinceName": "广西省","pinyin": "dongxingshi","preDate": "4","typeNo": 0,"orderby":0 },{'name':'陆丰',"simplepy": "lf","provinceName": "广东省","pinyin": "lufeng","preDate": "7","typeNo": 1,"orderby":0 },{'name':'石狮市',"simplepy": "ss","provinceName": "福建省","pinyin": "shishi","preDate": "22","typeNo": 0,"orderby":0 },{'name':'南通',"simplepy": "nt","provinceName": "江苏省","pinyin": "nantong","preDate": "7","typeNo": 0,"orderby":0 },{'name':'晋江市',"simplepy": "jj","provinceName": "福建省","pinyin": "jinjiang","preDate": "22","typeNo": 0,"orderby":0 },{'name':'柳州',"simplepy": "lz","provinceName": "广西壮族自治区","pinyin": "liuzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'东源',"simplepy": "dy","provinceName": "广东省","pinyin": "dongyuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'南安市',"simplepy": "na","provinceName": "福建省","pinyin": "nanan","preDate": "22","typeNo": 0,"orderby":0 },{'name':'即墨',"simplepy": "jm","provinceName": "山东省","pinyin": "jimo","preDate": "10","typeNo": 0,"orderby":0 },{'name':'桂林',"simplepy": "gl","provinceName": "广西壮族自治区","pinyin": "guilin","preDate": "20","typeNo": 0,"orderby":0 },{'name':'清流县',"simplepy": "ql","provinceName": "福建省","pinyin": "qingliu","preDate": "22","typeNo": 0,"orderby":0 },{'name':'厦门',"simplepy": "xm","provinceName": "福建省","pinyin": "xiamen","preDate": "40","typeNo": 0,"orderby":0 },{'name':'龙川',"simplepy": "lc","provinceName": "广东省","pinyin": "longchuan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'宁化县',"simplepy": "nh","provinceName": "福建省","pinyin": "ninghua","preDate": "14","typeNo": 0,"orderby":0 },{'name':'台州',"simplepy": "tz","provinceName": "浙江省","pinyin": "taizhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'荔浦县',"simplepy": "lp","provinceName": "广西壮族自治区","pinyin": "lipu","preDate": "7","typeNo": 0,"orderby":0 },{'name':'紫金',"simplepy": "zj","provinceName": "广东省","pinyin": "zijin","preDate": "7","typeNo": 1,"orderby":0 },{'name':'大田县',"simplepy": "dt","provinceName": "福建省","pinyin": "datian","preDate": "14","typeNo": 0,"orderby":0 },{'name':'吕梁',"simplepy": "ll","provinceName": "山西省","pinyin": "lvliang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'兴安县',"simplepy": "xax","provinceName": "广西壮族自治区","pinyin": "xinganxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'连平',"simplepy": "lp","provinceName": "广东省","pinyin": "lianping","preDate": "7","typeNo": 1,"orderby":0 },{'name':'尤溪县',"simplepy": "yx","provinceName": "福建省","pinyin": "youxi","preDate": "14","typeNo": 0,"orderby":0 },{'name':'灌阳县',"simplepy": "gyx","provinceName": "广西壮族自治区","pinyin": "guanyangxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'阳江',"simplepy": "yj","provinceName": "广东省","pinyin": "yangjiang","preDate": "7","typeNo": 0,"orderby":0 },{'name':'沙县',"simplepy": "sx","provinceName": "福建省","pinyin": "shaxian","preDate": "14","typeNo": 0,"orderby":0 },{'name':'呼和浩特',"simplepy": "hhht","provinceName": "内蒙古","pinyin": "huhehaote","preDate": "10","typeNo": 0,"orderby":0 },{'name':'龙胜各族自治县',"simplepy": "lsgzzzx","provinceName": "广西壮族自治区","pinyin": "longshenggezuzizhixian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'阳春',"simplepy": "yc","provinceName": "广东省","pinyin": "yangchun","preDate": "7","typeNo": 1,"orderby":0 },{'name':'将乐县',"simplepy": "jl","provinceName": "福建省","pinyin": "jiangle","preDate": "14","typeNo": 0,"orderby":0 },{'name':'哈尔滨',"simplepy": "heb","provinceName": "黑龙江省","pinyin": "haerbin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'恭城瑶族自治县',"simplepy": "gcyzzzx","provinceName": "广西壮族自治区","pinyin": "gongchengyaozuzizhixian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'阳东',"simplepy": "yd","provinceName": "广东省","pinyin": "yangdong","preDate": "7","typeNo": 1,"orderby":0 },{'name':'泰宁县',"simplepy": "tn","provinceName": "福建省","pinyin": "taining","preDate": "14","typeNo": 0,"orderby":0 },{'name':'唐山',"simplepy": "ts","provinceName": "河北省","pinyin": "tangshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'资源县',"simplepy": "zyx","provinceName": "广西壮族自治区","pinyin": "ziyuanxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'阳西',"simplepy": "yx","provinceName": "广东省","pinyin": "yangxi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'建宁县',"simplepy": "jn","provinceName": "福建省","pinyin": "jianning","preDate": "14","typeNo": 0,"orderby":0 },{'name':'嘉兴',"simplepy": "jx","provinceName": "浙江省","pinyin": "jiaxing","preDate": "10","typeNo": 0,"orderby":0 },{'name':'全州县',"simplepy": "qzx","provinceName": "广西壮族自治区","pinyin": "quanzhouxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'永安市',"simplepy": "ya","provinceName": "福建省","pinyin": "yongan","preDate": "14","typeNo": 0,"orderby":0 },{'name':'嘉善',"simplepy": "js","provinceName": "浙江省","pinyin": "jiashan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'平乐县',"simplepy": "plx","provinceName": "广西壮族自治区","pinyin": "pinglexian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'清新',"simplepy": "qx","provinceName": "广东省","pinyin": "qingxin","preDate": "7","typeNo": 1,"orderby":0 },{'name':'漳州',"simplepy": "zz","provinceName": "福建省","pinyin": "zhangzhou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'四平',"simplepy": "sp","provinceName": "吉林省","pinyin": "siping","preDate": "10","typeNo": 0,"orderby":0 },{'name':'梧州',"simplepy": "wz","provinceName": "广西壮族自治区","pinyin": "wuzhou","preDate": "5","typeNo": 0,"orderby":0 },{'name':'英德',"simplepy": "yd","provinceName": "广东省","pinyin": "yingde","preDate": "7","typeNo": 1,"orderby":0 },{'name':'芗城区',"simplepy": "xcq","provinceName": "福建省","pinyin": "xiangchengqu","preDate": "7","typeNo": 0,"orderby":0 },{'name':'大丰',"simplepy": "df","provinceName": "江苏省","pinyin": "dafeng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'玉林',"simplepy": "yl","provinceName": "广西壮族自治区","pinyin": "yulin","preDate": "5","typeNo": 0,"orderby":0 },{'name':'连州',"simplepy": "lz","provinceName": "广东省","pinyin": "lianzhou","preDate": "7","typeNo": 1,"orderby":0 },{'name':'龙文区',"simplepy": "lwq","provinceName": "福建省","pinyin": "longwenqu","preDate": "7","typeNo": 0,"orderby":0 },{'name':'贵港',"simplepy": "gg","provinceName": "广西壮族自治区","pinyin": "guigang","preDate": "5","typeNo": 0,"orderby":0 },{'name':'佛冈',"simplepy": "fg","provinceName": "广东省","pinyin": "fogang","preDate": "7","typeNo": 1,"orderby":0 },{'name':'云霄县',"simplepy": "yxx","provinceName": "福建省","pinyin": "yunxiaxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'大庆',"simplepy": "dq","provinceName": "黑龙江省","pinyin": "daqing","preDate": "10","typeNo": 0,"orderby":0 },{'name':'连山',"simplepy": "ls","provinceName": "广东省","pinyin": "lianshan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'漳浦县',"simplepy": "zpx","provinceName": "福建省","pinyin": "zhangpuxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'大理',"simplepy": "dl","provinceName": "云南省","pinyin": "dali","preDate": "10","typeNo": 0,"orderby":0 },{'name':'连南',"simplepy": "ln","provinceName": "广东省","pinyin": "liannan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'诏安县',"simplepy": "zax","provinceName": "福建省","pinyin": "zhaoanxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'阳山',"simplepy": "ys","provinceName": "广东省","pinyin": "yangshan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'长泰县',"simplepy": "ctx","provinceName": "福建省","pinyin": "changtaixian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'东山县',"simplepy": "dsx","provinceName": "福建省","pinyin": "dongshanxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'大邑县',"simplepy": "dyx","provinceName": "四川省","pinyin": "dayixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南靖县',"simplepy": "njx","provinceName": "福建省","pinyin": "nanjingxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'平和县',"simplepy": "phx","provinceName": "福建省","pinyin": "pinghexian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'太原',"simplepy": "ty","provinceName": "山西省","pinyin": "taiyuan","preDate": "7","typeNo": 0,"orderby":0 },{'name':'那坡县',"simplepy": "npx","provinceName": "广西壮族自治区","pinyin": "napoxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'饶平',"simplepy": "rp","provinceName": "广东省","pinyin": "raoping","preDate": "7","typeNo": 1,"orderby":0 },{'name':'华安县',"simplepy": "hax","provinceName": "福建省","pinyin": "huaanxian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'太和',"simplepy": "th","provinceName": "安徽省","pinyin": "taihe","preDate": "10","typeNo": 0,"orderby":0 },{'name':'潮安',"simplepy": "ca","provinceName": "广东省","pinyin": "chaoan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'龙海市',"simplepy": "zz","provinceName": "福建省","pinyin": "longhaishi","preDate": "7","typeNo": 0,"orderby":0 },{'name':'隆林各族自治县',"simplepy": "llgzzzx","provinceName": "广西壮族自治区","pinyin": "longlingezuzizhixian","preDate": "7","typeNo": 0,"orderby":0 },{'name':'宁乡',"simplepy": "nx","provinceName": "湖南省","pinyin": "ningxiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'揭东',"simplepy": "jd","provinceName": "广东省","pinyin": "jiedong","preDate": "7","typeNo": 1,"orderby":0 },{'name':'鼓楼区',"simplepy": "gl","provinceName": "福建省","pinyin": "gulouqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'宁波',"simplepy": "nb","provinceName": "浙江省","pinyin": "ningbo","preDate": "48","typeNo": 0,"orderby":0 },{'name':'台江区',"simplepy": "tjq","provinceName": "福建省","pinyin": "taijiangqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'惠来',"simplepy": "hl","provinceName": "广东省","pinyin": "huilai","preDate": "7","typeNo": 1,"orderby":0 },{'name':'仓山区',"simplepy": "csq","provinceName": "福建省","pinyin": "cangshanqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'宜昌',"simplepy": "yc","provinceName": "湖北省","pinyin": "yichang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'河池市',"simplepy": "hcs","provinceName": "广西壮族自治区","pinyin": "hechishi","preDate": "9","typeNo": 0,"orderby":0 },{'name':'揭西',"simplepy": "jx","provinceName": "广东省","pinyin": "jiexi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'马尾区',"simplepy": "mwq","provinceName": "福建省","pinyin": "maweiqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'射阳县',"simplepy": "syx","provinceName": "江苏省","pinyin": "sheyangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜州县',"simplepy": "yzx","provinceName": "广西壮族自治区","pinyin": "yizhouxian","preDate": "9","typeNo": 0,"orderby":0 },{'name':'云浮',"simplepy": "yf","provinceName": "广东省","pinyin": "yunfu","preDate": "7","typeNo": 1,"orderby":0 },{'name':'晋安区',"simplepy": "jaq","provinceName": "福建省","pinyin": "jinanqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'峨眉山',"simplepy": "ems","provinceName": "四川省","pinyin": "emeishan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'罗定',"simplepy": "ld","provinceName": "广东省","pinyin": "luoding","preDate": "7","typeNo": 1,"orderby":0 },{'name':'郑州',"simplepy": "ZZ","provinceName": "河南省","pinyin": "zhengzhou","preDate": "9","typeNo": 1,"orderby":0 },{'name':'闽侯县',"simplepy": "mhx","provinceName": "福建省","pinyin": "minhouxian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'常州',"simplepy": "cz","provinceName": "江苏省","pinyin": "changzhou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'泸州市',"simplepy": "lzs","provinceName": "四川省","pinyin": "luzhoushi","preDate": "15","typeNo": 0,"orderby":0 },{'name':'新兴',"simplepy": "xx","provinceName": "广东省","pinyin": "xinxing","preDate": "7","typeNo": 1,"orderby":0 },{'name':'连江县',"simplepy": "ljx","provinceName": "福建省","pinyin": "lianjiangxian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'绵阳',"simplepy": "my","provinceName": "四川","pinyin": "mianyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'郁南',"simplepy": "yn","provinceName": "广东省","pinyin": "yunan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'罗源县',"simplepy": "lyx","provinceName": "福建省","pinyin": "luoyuanxian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'广元',"simplepy": "gy","provinceName": "四川省","pinyin": "guangyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'资阳',"simplepy": "zy","provinceName": "四川","pinyin": "ziyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'云安',"simplepy": "ya","provinceName": "广东省","pinyin": "yunan","preDate": "7","typeNo": 1,"orderby":0 },{'name':'巴彦淖尔',"simplepy": "BYZE","provinceName": "内蒙古","pinyin": "bayannaoer","preDate": "6","typeNo": 0,"orderby":0 },{'name':'闽清县',"simplepy": "mqx","provinceName": "福建省","pinyin": "minqingxian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'廊坊',"simplepy": "lf","provinceName": "河北省","pinyin": "langfang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'自贡',"simplepy": "zg","provinceName": "四川","pinyin": "zigong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'永泰县',"simplepy": "ytx","provinceName": "福建省","pinyin": "yongtaixian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'建瓯',"simplepy": "jo","provinceName": "福建省","pinyin": "jianou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'巴中',"simplepy": "BZ","provinceName": "四川省","pinyin": "bazhong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'平潭县',"simplepy": "ptx","provinceName": "福建省","pinyin": "pingtanxian","preDate": "21","typeNo": 0,"orderby":0 },{'name':'成都',"simplepy": "CD","provinceName": "四川省","pinyin": "chengdu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'福清市',"simplepy": "fqs","provinceName": "福建省","pinyin": "fuqingshi","preDate": "21","typeNo": 0,"orderby":0 },{'name':'张家界',"simplepy": "zjj","provinceName": "湖南省","pinyin": "zhangjiajie","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南江县',"simplepy": "NJX","provinceName": "四川省","pinyin": "nanjiangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'长乐市',"simplepy": "cls","provinceName": "福建省","pinyin": "changleshi","preDate": "21","typeNo": 0,"orderby":0 },{'name':'徐州',"simplepy": "xz","provinceName": "江苏省","pinyin": "xuzhou","preDate": "7","typeNo": 0,"orderby":0 },{'name':'青田',"simplepy": "qt","provinceName": "浙江","pinyin": "qingtian","preDate": "20","typeNo": 0,"orderby":0 },{'name':'通江县',"simplepy": "TJX","provinceName": "四川省","pinyin": "tongjiangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德惠',"simplepy": "dh","provinceName": "吉林省","pinyin": "dehui","preDate": "10","typeNo": 0,"orderby":0 },{'name':'温州',"simplepy": "wz","provinceName": "浙江省","pinyin": "wenzhoushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德阳',"simplepy": "dy","provinceName": "四川省","pinyin": "deyang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'慈溪',"simplepy": "cx","provinceName": "浙江省","pinyin": "cixi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'华阳',"simplepy": "HY","provinceName": "四川省","pinyin": "huayang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德清',"simplepy": "dq","provinceName": "浙江省","pinyin": "deqingxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'双流县',"simplepy": "SLX","provinceName": "四川省","pinyin": "shuangliuxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'文登',"simplepy": "wd","provinceName": "山东省","pinyin": "wendeng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'衢州',"simplepy": "qz","provinceName": "浙江省","pinyin": "quezhoushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'江油',"simplepy": "JY","provinceName": "四川省","pinyin": "jiangyou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'张家口',"simplepy": "ZJK","provinceName": "河北","pinyin": "zhangjiakou","preDate": "3","typeNo": 0,"orderby":0 },{'name':'苍溪县',"simplepy": "BXX","provinceName": "四川省","pinyin": "cangxixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'北京',"simplepy": "BJ","provinceName": "北京","pinyin": "beijing","preDate": "7","typeNo": 0,"orderby":0 },{'name':'丽水',"simplepy": "ls","provinceName": "浙江省","pinyin": "lishuishi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'剑阁县',"simplepy": "JGX","provinceName": "四川省","pinyin": "jiangexian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'龙泉',"simplepy": "lq","provinceName": "浙江省","pinyin": "longquanshi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'青川县',"simplepy": "QCX","provinceName": "四川省","pinyin": "qingchuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'庆元',"simplepy": "qy","provinceName": "浙江省","pinyin": "qingyuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'旺苍县',"simplepy": "WBX","provinceName": "四川省","pinyin": "wangcangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'晋江',"simplepy": "jj","provinceName": "福建省","pinyin": "jinjiang","preDate": "22","typeNo": 0,"orderby":0 },{'name':'九寨沟口',"simplepy": "JZGK","provinceName": "四川省","pinyin": "jiuzhaigoukou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'普陀山',"simplepy": "pts","provinceName": "浙江省","pinyin": "putuoshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'海宁',"simplepy": "hn","provinceName": "浙江省","pinyin": "hainingshi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'松原',"simplepy": "sy","provinceName": "吉林省","pinyin": "songyuan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'玉环',"simplepy": "yh","provinceName": "浙江省","pinyin": "yuhuanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'松潘县',"simplepy": "spx","provinceName": "四川省","pinyin": "songpanxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'嵊州',"simplepy": "sz","provinceName": "浙江省","pinyin": "shengzhoushi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'理县',"simplepy": "LX","provinceName": "四川省","pinyin": "lixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'凉山',"simplepy": "LS","provinceName": "四川省","pinyin": "liangshan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'萧山',"simplepy": "xs","provinceName": "浙江省","pinyin": "xiaoshanqu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'南昌市',"simplepy": "ncs","provinceName": "江西省","pinyin": "nanchangshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'乌兰浩特',"simplepy": "wlht","provinceName": "内蒙古","pinyin": "wulanhaote","preDate": "7","typeNo": 1,"orderby":0 },{'name':'临海',"simplepy": "lh","provinceName": "浙江省","pinyin": "linhaishi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'安义县',"simplepy": "ayx","provinceName": "江西省","pinyin": "anyixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'犍为县',"simplepy": "JWX","provinceName": "四川省","pinyin": "jianweixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'杜桥',"simplepy": "dq","provinceName": "浙江省","pinyin": "duqiaozheng","preDate": "10","typeNo": 0,"orderby":0 },{'name':'进贤县',"simplepy": "jxx","provinceName": "江西省","pinyin": "jinxianxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'景德镇市',"simplepy": "jdzs","provinceName": "江西省","pinyin": "jingdezhenshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'德昌县',"simplepy": "DCX","provinceName": "四川省","pinyin": "dechangxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乐平市',"simplepy": "lps","provinceName": "江西省","pinyin": "lepingshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'会理县',"simplepy": "HLX","provinceName": "四川省","pinyin": "huilixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'上饶',"simplepy": "sr","provinceName": "江西省","pinyin": "shangrao","preDate": "10","typeNo": 0,"orderby":0 },{'name':'萍乡市',"simplepy": "pxs","provinceName": "江西省","pinyin": "pingxiangshi","preDate": "10","typeNo": 1,"orderby":0 },{'name':'兰州市',"simplepy": "lzs","provinceName": "甘肃省","pinyin": "lanzhoushi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'攀枝花',"simplepy": "PZH","provinceName": "四川省","pinyin": "panzhihua","preDate": "10","typeNo": 0,"orderby":0 },{'name':'荔城区',"simplepy": "lcq","provinceName": "福建省","pinyin": "lichengqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'莲花县',"simplepy": "lhx","provinceName": "江西省","pinyin": "lianhuaxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'南部县',"simplepy": "nbx","provinceName": "四川省","pinyin": "nanbuxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'阆中',"simplepy": "LZS","provinceName": "四川省","pinyin": "langzhong","preDate": "10","typeNo": 0,"orderby":0 },{'name':'城厢区',"simplepy": "cxq","provinceName": "福建省","pinyin": "chengxiangqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'九江市',"simplepy": "jjs","provinceName": "江西省","pinyin": "jiujiangshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'合作市',"simplepy": "hzs","provinceName": "甘肃省","pinyin": "hezuoshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'西充县',"simplepy": "XCX","provinceName": "四川省","pinyin": "xichongxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'秀屿区',"simplepy": "xyq","provinceName": "福建省","pinyin": "xiuyuqu","preDate": "21","typeNo": 0,"orderby":0 },{'name':'温岭',"simplepy": "wl","provinceName": "浙江省","pinyin": "wenling","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乌丹',"simplepy": "wd","provinceName": "内蒙古","pinyin": "wudan","preDate": "10","typeNo": 0,"orderby":0 },{'name':'九江县',"simplepy": "jjx","provinceName": "江西省","pinyin": "jiujiangxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'嘉峪关市',"simplepy": "jygs","provinceName": "甘肃省","pinyin": "jiayuguanshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'仪陇县',"simplepy": "YLX","provinceName": "四川省","pinyin": "yilongxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乌海',"simplepy": "wh","provinceName": "内蒙古","pinyin": "wuhai","preDate": "10","typeNo": 0,"orderby":0 },{'name':'小金县',"simplepy": "xjx","provinceName": "四川省","pinyin": "xiaojinxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'遂宁',"simplepy": "SN","provinceName": "四川省","pinyin": "suining","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜章县',"simplepy": "yzx","provinceName": "湖南省","pinyin": "yizhangxian","preDate": "60","typeNo": 0,"orderby":0 },{'name':'湘西',"simplepy": "xx","provinceName": "湖南省","pinyin": "xiangxi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乌牛',"simplepy": "wn","provinceName": "浙江省","pinyin": "wuniu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'修水县',"simplepy": "xsx","provinceName": "江西省","pinyin": "xiushuixian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'盐亭县',"simplepy": "YTX","provinceName": "四川省","pinyin": "yantingxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'滁州',"simplepy": "cz","provinceName": "安徽省","pinyin": "chuzhou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'乐清',"simplepy": "lq","provinceName": "浙江省","pinyin": "leqing","preDate": "10","typeNo": 0,"orderby":0 },{'name':'永修县',"simplepy": "yxx","provinceName": "江西省","pinyin": "yongxiuxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'川主寺',"simplepy": "czs","provinceName": "四川省","pinyin": "chuanzhusi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'宜宾',"simplepy": "YB","provinceName": "四川省","pinyin": "yibin","preDate": "10","typeNo": 0,"orderby":0 },{'name':'滨海县',"simplepy": "bhx","provinceName": "江苏省","pinyin": "binhaixian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'德安县',"simplepy": "dax","provinceName": "江西省","pinyin": "deanxian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'张掖市',"simplepy": "zys","provinceName": "甘肃省","pinyin": "zhangyeshi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'星子县',"simplepy": "xzx","provinceName": "江西省","pinyin": "xingzixian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'彭州市',"simplepy": "pzs","provinceName": "四川省","pinyin": "pengzhoushi","preDate": "7","typeNo": 1,"orderby":0 },{'name':'南溪区',"simplepy": "NXQ","provinceName": "四川省","pinyin": "nanxiqu","preDate": "10","typeNo": 0,"orderby":0 },{'name':'宜宾县',"simplepy": "YBX","provinceName": "四川省","pinyin": "yibinxian","preDate": "10","typeNo": 0,"orderby":0 },{'name':'澳门',"simplepy": "am","provinceName": "澳门","pinyin": "aomen","preDate": "10","typeNo": 0,"orderby":0 },{'name':'湖口县',"simplepy": "hkx","provinceName": "江西省","pinyin": "hukouxian","preDate": "10","typeNo": 1,"orderby":0 },{'name':'彭泽县',"simplepy": "pzx","provinceName": "江西省","pinyin": "pengzexian","preDate": "3","typeNo": 1,"orderby":0 },{'name':'沐川县',"simplepy": "mcx","provinceName": "四川省","pinyin": "muchuanxian","preDate": "7","typeNo": 1,"orderby":0 },{'name':'甘孜',"simplepy": "gz","provinceName": "四川省","pinyin": "ganzi","preDate": "10","typeNo": 0,"orderby":0 },{'name':'内江',"simplepy": "nj","provinceName": "四川省","pinyin": "neijiang","preDate": "10","typeNo": 0,"orderby":0 },{'name':'瑞昌市',"simplepy": "rcs","provinceName": "江西省","pinyin": "ruichangshi","preDate": "3","typeNo": 1,"orderby":0 },{'name':'界首',"simplepy": "js","provinceName": "安徽省","pinyin": "jieshou","preDate": "10","typeNo": 0,"orderby":0 },{'name':'沧州',"simplepy": "cz","provinceName": "河北省","pinyin": "cangzhou","preDate": "5","typeNo": 1,"orderby":17 },{'name':'宝应县',"simplepy": "byx","provinceName": "江苏省","pinyin": "baoyingxian","preDate": "5","typeNo": 1,"orderby":2844 },{'name':'荆州',"simplepy": "jz","provinceName": "湖北省","pinyin": "jingzhou","preDate": "5","typeNo": 1,"orderby":2880 },{'name':'绥化',"simplepy": "sh","provinceName": "黑龙江省","pinyin": "suihua","preDate": "5","typeNo": 1,"orderby":2943 },{'name':'黑河',"simplepy": "hh","provinceName": "黑龙江省","pinyin": "heihe","preDate": "5","typeNo": 1,"orderby":2961 },{'name':'牡丹江',"simplepy": "mdj","provinceName": "黑龙江省","pinyin": "mudanjiang","preDate": "5","typeNo": 1,"orderby":2962 },{'name':'七台河',"simplepy": "qth","provinceName": "黑龙江省","pinyin": "qitaihe","preDate": "5","typeNo": 1,"orderby":2966 },{'name':'双鸭山',"simplepy": "sys","provinceName": "黑龙江省","pinyin": "shuangyashan","preDate": "5","typeNo": 1,"orderby":2973 },{'name':'芜湖',"simplepy": "wh","provinceName": "安徽省","pinyin": "wuhu","preDate": "5","typeNo": 1,"orderby":3021 },{'name':'榆林',"simplepy": "yl","provinceName": "陕西省","pinyin": "yulin","preDate": "5","typeNo": 1,"orderby":3027 },{'name':'酒泉',"simplepy": "jq","provinceName": "甘肃省","pinyin": "jiuquan","preDate": "5","typeNo": 1,"orderby":3031 },{'name':'白山',"simplepy": "bs","provinceName": "吉林省","pinyin": "baishan","preDate": "5","typeNo": 1,"orderby":3039 },{'name':'通化',"simplepy": "th","provinceName": "吉林省","pinyin": "tonghua","preDate": "5","typeNo": 1,"orderby":3040 },{'name':'拉萨',"simplepy": "ls","provinceName": "西藏","pinyin": "lasa","preDate": "5","typeNo": 1,"orderby":3043 },{'name':'白城',"simplepy": "bc","provinceName": "吉林省","pinyin": "baicheng","preDate": "5","typeNo": 1,"orderby":3065 },{'name':'宣城',"simplepy": "xc","provinceName": "安徽省","pinyin": "xuancheng","preDate": "5","typeNo": 1,"orderby":3073 },{'name':'广安',"simplepy": "ga","provinceName": "四川省","pinyin": "guangan","preDate": "5","typeNo": 1,"orderby":3135 },{'name':'雅安',"simplepy": "ya","provinceName": "四川省","pinyin": "yaan","preDate": "5","typeNo": 1,"orderby":3137 },{'name':'延安',"simplepy": "ya","provinceName": "陕西省","pinyin": "yanan","preDate": "5","typeNo": 1,"orderby":3146 },{'name':'安康',"simplepy": "ak","provinceName": "陕西省","pinyin": "ankang","preDate": "5","typeNo": 1,"orderby":3148 },{'name':'商洛',"simplepy": "sl","provinceName": "陕西省","pinyin": "shangluo","preDate": "5","typeNo": 1,"orderby":3149 },{'name':'白银',"simplepy": "by","provinceName": "甘肃省","pinyin": "baiyin","preDate": "5","typeNo": 1,"orderby":3150 },{'name':'天水',"simplepy": "ts","provinceName": "甘肃省","pinyin": "tianshui","preDate": "5","typeNo": 1,"orderby":3151 },{'name':'平凉',"simplepy": "pl","provinceName": "甘肃省","pinyin": "pingliang","preDate": "5","typeNo": 1,"orderby":3152 },{'name':'庆阳',"simplepy": "qy","provinceName": "甘肃省","pinyin": "qingyang","preDate": "5","typeNo": 1,"orderby":3153 },{'name':'西宁',"simplepy": "xn","provinceName": "青海省","pinyin": "xining","preDate": "5","typeNo": 1,"orderby":3155}];
</script>
<link rel="stylesheet" href="Css/opendivcity.css" />
<!--/城市弹出层-->
<div style="position: absolute; z-index: 9999; display: none;"
	id="_busCity_">
	<div winstyle="hot">
		<div class="com_hotrenew" style="width: 530px; display: block">
			<div id="div_citybox_wrapper" style="width: 100%;">
				<div class="ac_title" id="ac_title"></div>
				<ul class="AbcSearchnew clx" method="hotTab" id="hotTab">
					<li class="action" index="0" method="liHotTab">已开通城市</li>
					<li class="" index="1" method="liHotTab">按省份</li>
					<li class="" index="2" method="liHotTab">按拼音</li>
				</ul>
				<!-- hot data item -->
				<div class="clx"></div>
				<ul class="popcitylistnew" id="opencitys" tab="0">

				</ul>

				<ul class="popcitylistnew" id="provinces" style="display: none;"
					tab="1">

				</ul>

				<ul class="popcitylistnew pop_prov" id="belongCitys"
					style="display: none;">

				</ul>
				<ul class="letter_list" style="display: none;" tab="2">
					<li class="action" index="0">ABCD</li>
					<li index="1">EFGHJ</li>
					<li index="2">KLMN</li>
					<li index="3">PQRSTW</li>
					<li index="4">XYZ</li>
				</ul>
				<ul class="popcitylistnew" id="shortCityGroup"
					style="display: none;" tab="2">
				</ul>
			</div>
		</div>
	</div>
</div>
<script type="text/template" id="zxs-template">
		<li class="letter">直辖市</li>
			
		<li class="let_line"></li>
</script>
<!-- 开通城市模板 -->
<script type="text/template" id="opencity-template">
		
</script>

<!-- 所有省份模板 -->
<script type="text/template" id="province-template">
	<li class="ac_even" title="直辖市">直辖市</li>
	
</script>

<!-- 省份所属城市模板 -->
<script type="text/template" id="citysBelongProvince-template">

</script>


<!-- 按拼音分组模板  -->
<script type="text/template" id="shortPinyinGroup-template">
	
</script>
<script type="text/template" id="endCitys-template">
	<ul>
	<p>输入中文/拼音/或↑↓键选择</p>
	
 	</ul>	
   	
</script>

<script type="text/template" id="history-template">
<dl id="dl_searchbox_history">
	<dt>最近搜索记录：</dt>
	
</dl>
</script>

<div id="cityToolBar" class="sug"
	style="position: absolute; z-index: 9998; width: 228px; height: 220px; display: none;">

</div>
<span style="visibility: hidden;"> <script type="text/javascript">
	var _hmt = _hmt || [];
	(function() {
		var hm = document.createElement("script");
		hm.src = "//hm.baidu.com/hm.js?7ae99e8c2df45dc624bafedd8216c545";
		var s = document.getElementsByTagName("script")[0];
		s.parentNode.insertBefore(hm, s);
	})();
</script>
</span>
<script src="Scripts/require.js"
	data-main="http://cdn-resource-alias.12308.com/2015/js/common/index-main-201604.js"></script>
</html>