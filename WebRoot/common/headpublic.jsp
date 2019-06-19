<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javaScript">
		function loginOut(){
				//创建ajax对象
				createAjax();
				//发送请求
				ajaxObj.open("Post","loginOutServlet",true);
				ajaxObj.send(null);
				//回调函数处理回调结果
				ajaxObj.onreadystatechange=processResult;
				return; 
			}
			function processResult(){
				var currentHref=document.location.href;
				location.href=currentHref;
			}
			function createAjax() {
				try {
					ajaxObj = new ActiveXObject("Msxml2.XMLHTTP");//IE 6以上
				} catch (e) {
					try {
						ajaxObj = new ActiveXObject("Microsoft.XMLHTTP");//IE6以下
					} catch (e) {
						try {
							ajaxObj = new XMLHttpRequest();//其他浏览器
							if (ajaxObj.overrideMimeType) {
								ajaxObj.overrideMimeType("text/xml");
							}
						} catch (e) {
						}
					}
				}
			}
</script>
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
					href="http://weibo.com/12308com" class="link weibo" target="_blank"><i
					class="to_weibo"></i><span>微博</span></a> <a
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
				<li class="nav_0"><a href="indexServlet" title="首页"><i></i>首页<span></span></a></li>
				<li class="nav_1"><a href="chepiao.html" id="booking_menu"
					onclick="javascript:_hmt.push(['_trackEvent', 'index_booking_menu', 'click', 'booking_menu']);"
					title="汽车票预订"><i></i>汽车票预订<span></span></a></li>
				<li class="nav_2 ico"><a
					href="http://www.12308.com/huodong/wyindex.html" tts="link_3316"
					title="全国特价票" target="_blank"><i></i>全国特价票<span></span><em></em></a></li>
				<li class="nav_5"><a href="car.html" title="我要包车"><i></i>我要包车<span></span></a></li>
				<li class="nav_3"><a
					href="http://www.12308.com/news/index.html" title="资讯中心"><i></i>资讯中心<span></span></a></li>
				<li class="nav_4"><a href="http://www.12308.com/help/help.html"
					title="客服中心"><i></i>客服中心<span></span></a></li>
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
									href="infoPageSelectServlet">个人资料</a></li>
							</ul>
						</div></li>
				</c:if>
				<c:if test="${phone==null }">
					<li class="reg"><a title="注册" rel="nofollow"
						href="register.jsp">注册</a></li>
				</c:if>
				<c:if test="${phone!=null }">
					<li class="reg"><a title="退出" rel="nofollow"
						onclick="loginOut();">退出</a></li>
					<li class="reg"><a title="phone" rel="nofollow">${phone }</a></li>
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