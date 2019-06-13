<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<!-- saved from url=(0516)http://www.12308.com/baoche/addCar.html -->
<HTML>
<HEAD>
<META content="IE=10.000" http-equiv="X-UA-Compatible">
<TITLE>我要包车_汽车票查询_12308全国汽车票</TITLE>
<META charset="utf-8">
<META name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站">
<META name="description"
	content="12308是提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:0755-82867116 ">
<META name="baidu-site-verification" content="MJbcemLWY8">
<META content="15532463676123006375" property="qc:admins">
<LINK href="http://cdn-resource.12308.com/2015/image/favicon.ico"
	rel="icon" type="image/x-icon">
<LINK href="http://cdn-resource.12308.com/2015/image/favicon.ico"
	rel="shortcut icon" type="image/x-icon">
<LINK href="addCar_files/base.css" rel="stylesheet">
<LINK href="addCar_files/wantCar.css" rel="stylesheet">
<LINK href="addCar_files/validate.css" rel="stylesheet">
<SCRIPT src="addCar_files/jquery-1.11.3.min.js"></SCRIPT>

<SCRIPT src="addCar_files/layer.js"></SCRIPT>

<META name="GENERATOR" content="MSHTML 10.00.9200.17457">
</HEAD>
<BODY>
<%@ include file="/common/headpublic.jsp" %>
	<!--中间部份-->
	<DIV class="banner_n">
		<!--  banner cms start  -->
		<DIV class="banner_wrap has-dots"
			style="width: 100%; height: 380px; overflow: hidden;">
			<UL class="pic_show">
				<LI><A
					style='background: url("http://cdn-resource.12308.com/2015/image/car_banner1.png") no-repeat bottom;'
					href="http://www.12308.com/baoche/addCar.html?userName=%E6%9D%8E%E4%BC%9F%E4%BC%A6&amp;mobilePhone=18684855028&amp;source=undefined&amp;startTime=2016-05-03%2017:51:59&amp;startPlace=%E9%95%BF%E6%B2%99%E5%8D%97%E7%AB%99&amp;startCity=%E9%95%BF%E6%B2%99&amp;startLongLat=28.153076,113.071753&amp;arrivalPlace=%E6%B9%98%E6%BD%AD%E5%8C%97%E7%AB%99&amp;personCount=4&amp;endCity=%E6%B9%98%E6%BD%AD%E5%8E%BF&amp;endLongLat=27.970812,112.948852&amp;isBack=1&amp;arrivalTime=&amp;invoice=0&amp;invoiceTitle=&amp;recipients=&amp;address=&amp;rentBusInfo=&amp;couponCode=&amp;distance=50.1%E5%85%AC%E9%87%8C#"
					target="_blank"></A></LI>
				<LI style="display: none;"><A
					style='background: url("http://cdn-resource.12308.com/2015/image/banner0.png") no-repeat bottom;'
					href="http://www.12308.com/baoche/addCar.html?userName=%E6%9D%8E%E4%BC%9F%E4%BC%A6&amp;mobilePhone=18684855028&amp;source=undefined&amp;startTime=2016-05-03%2017:51:59&amp;startPlace=%E9%95%BF%E6%B2%99%E5%8D%97%E7%AB%99&amp;startCity=%E9%95%BF%E6%B2%99&amp;startLongLat=28.153076,113.071753&amp;arrivalPlace=%E6%B9%98%E6%BD%AD%E5%8C%97%E7%AB%99&amp;personCount=4&amp;endCity=%E6%B9%98%E6%BD%AD%E5%8E%BF&amp;endLongLat=27.970812,112.948852&amp;isBack=1&amp;arrivalTime=&amp;invoice=0&amp;invoiceTitle=&amp;recipients=&amp;address=&amp;rentBusInfo=&amp;couponCode=&amp;distance=50.1%E5%85%AC%E9%87%8C#"
					target="_blank"></A></LI>
			</UL>
		</DIV>
	</DIV>
	<!--/banner-->
	<INPUT id="payPath" type="hidden" value="http://payment.12308.com">
	<INPUT id="basePath" type="hidden" value="http://www.12308.com">
	<INPUT id="resourcePath" type="hidden"
		value="http://cdn-resource-alias.12308.com/2015">
	<INPUT id="userCenterPath" type="hidden" value="http://uc.12308.com">
	<DIV class="main-wrap">
		<DIV class="h20"></DIV>
		<DIV class="bw-box">
			<H2 class="m_title">
				<SPAN>当前进度</SPAN>
			</H2>
			<DIV class="txtCon1">
				<UL>
					<LI class="cur">
						<DIV class="pic">
							<EM class="icon1"></EM>
						</DIV>
						<DIV class="title">填写线路</DIV>
					</LI>
					<LI class="cur">
						<DIV class="pic">
							<EM class="icon2"></EM>
						</DIV>
						<DIV class="title">去选车</DIV>
					</LI>
					<LI>
						<DIV class="pic">
							<EM class="icon3"></EM>
						</DIV>
						<DIV class="title">确认订单</DIV>
					</LI>
					<LI class="last">
						<DIV class="pic">
							<EM class="icon4"></EM>
						</DIV>
						<DIV class="title">在线支付</DIV>
					</LI>
				</UL>
			</DIV>
		</DIV>
		<DIV class="h20"></DIV>
		<INPUT id="userId" type="hidden"> <INPUT id="userName"
			type="hidden" value="李伟伦"> <INPUT id="mobilePhone"
			type="hidden" value="18684855028"> <INPUT id="source"
			type="hidden" value="PC"> <INPUT id="startTime" type="hidden"
			value="2016-05-03 17:51:59"> <INPUT id="startCity"
			type="hidden" value="长沙"> <INPUT id="startPlace"
			type="hidden" value="长沙南站"> <INPUT id="startLongLat"
			type="hidden" value="28.153076,113.071753"> <INPUT
			id="endCity" type="hidden" value="湘潭县"> <INPUT
			id="arrivalPlace" type="hidden" value="湘潭北站"> <INPUT
			id="endLongLat" type="hidden" value="27.970812,112.948852"> <INPUT
			id="personCount" type="hidden" value="4"> <INPUT id="isBack"
			type="hidden" value="1"> <INPUT id="arrivalTime"
			type="hidden"> <INPUT id="invoice" type="hidden" value="0">
		<INPUT id="invoiceTitle" type="hidden"> <INPUT id="recipients"
			type="hidden"> <INPUT id="address" type="hidden"> <INPUT
			id="rentBusInfo" type="hidden"> <INPUT id="couponCode"
			type="hidden"> <INPUT id="distance" type="hidden"
			value="50.1公里"> <INPUT id="remommend" type="hidden"
			value="4-1">
		<DIV class="bw-box">
			<H2 class="m_title">
				<SPAN>巴士信息</SPAN>
			</H2>
			<DIV class="txtCon3">
				<DIV class="mainBox">
					<UL class="carBox">
						<LI class="carb_type"><SPAN class="img"><IMG
								src="addCar_files/1512151554523728905.png"></SPAN></LI>
						<LI class="carb_xq">
							<P>
								商务车<SPAN>（7人）</SPAN>&nbsp;&nbsp;<B>600</B><EM>元起/辆</EM>
							</P>
						</LI>
						<LI class="carb_xq">
							<H4>商务车7座</H4>
							<P>
								<SPAN>包含：</SPAN>全天包车+司机+汽油费+保险
							</P>
							<P>
								<SPAN>注释：</SPAN>不包含停车费、路桥费
							</P>
						</LI>
						<LI class="carb_nub">
							<DIV class="buynum2">
								<LABEL class="subperson on"><EM class="num_bg"></EM></LABEL> <SPAN><B
									seat="7" carid="4" price="600">1</B></SPAN> <LABEL class="addperson"><EM
									class="num_bg"></EM></LABEL>
							</DIV>
						</LI>
					</UL>
					<UL class="carBox">
						<LI class="carb_type"><SPAN class="img"><IMG
								src="addCar_files/1512151553419833845.png"></SPAN></LI>
						<LI class="carb_xq">
							<P>
								小巴车<SPAN>（22人）</SPAN>&nbsp;&nbsp;<B>750</B><EM>元起/辆</EM>
							</P>
						</LI>
						<LI class="carb_xq">
							<H4>小巴车22座</H4>
							<P>
								<SPAN>包含：</SPAN>全天包车+司机+汽油费+保险
							</P>
							<P>
								<SPAN>注释：</SPAN>不包含停车费、路桥费
							</P>
						</LI>
						<LI class="carb_nub">
							<DIV class="buynum2">
								<LABEL class="subperson on"><EM class="num_bg"></EM></LABEL> <SPAN><B
									seat="22" carid="2" price="750">0</B></SPAN> <LABEL class="addperson"><EM
									class="num_bg"></EM></LABEL>
							</DIV>
						</LI>
					</UL>
					<UL class="carBox">
						<LI class="carb_type"><SPAN class="img"><IMG
								src="addCar_files/1512151552503878318.png"></SPAN></LI>
						<LI class="carb_xq">
							<P>
								中巴车<SPAN>（33人）</SPAN>&nbsp;&nbsp;<B>850</B><EM>元起/辆</EM>
							</P>
						</LI>
						<LI class="carb_xq">
							<H4>中巴车33座</H4>
							<P>
								<SPAN>包含：</SPAN>全天包车+司机+汽油费+保险
							</P>
							<P>
								<SPAN>注释：</SPAN>不包含停车费、路桥费
							</P>
						</LI>
						<LI class="carb_nub">
							<DIV class="buynum2">
								<LABEL class="subperson on"><EM class="num_bg"></EM></LABEL> <SPAN><B
									seat="33" carid="1" price="850">0</B></SPAN> <LABEL class="addperson"><EM
									class="num_bg"></EM></LABEL>
							</DIV>
						</LI>
					</UL>
					<UL class="carBox">
						<LI class="carb_type"><SPAN class="img"><IMG
								src="addCar_files/1512151552235224742.png"></SPAN></LI>
						<LI class="carb_xq">
							<P>
								大巴车<SPAN>（53人）</SPAN>&nbsp;&nbsp;<B>1000</B><EM>元起/辆</EM>
							</P>
						</LI>
						<LI class="carb_xq">
							<H4>大巴车53座</H4>
							<P>
								<SPAN>包含：</SPAN>全天包车+司机+汽油费+保险
							</P>
							<P>
								<SPAN>注释：</SPAN>不包含停车费、路桥费
							</P>
						</LI>
						<LI class="carb_nub">
							<DIV class="buynum2">
								<LABEL class="subperson on"><EM class="num_bg"></EM></LABEL> <SPAN><B
									seat="53" carid="3" price="1000">0</B></SPAN> <LABEL class="addperson"><EM
									class="num_bg"></EM></LABEL>
							</DIV>
						</LI>
					</UL>
					<DIV class="carBox_Bot">已分配0人，还差4个座位</DIV>
					<DIV class="h40"></DIV>
				</DIV>
				<DIV class="btn_box_c">
					<A class="btn_gray" id="carbutton">下一步</A>
				</DIV>
				<DIV class="h40"></DIV>
			</DIV>
		</DIV>
	</DIV>
	<!--公用Foot和友情链接-->
	<DIV class="h40"></DIV>
	<DIV class="foot-main">
		<DIV class="foot-nav clearfix">
			<UL>
				<LI><SPAN class="foot-n1"></SPAN>
					<H2>支付安全</H2>
					<P>在线支付100%认证</P></LI>
				<LI><SPAN class="foot-n2"></SPAN>
					<H2>实时同步</H2>
					<P>全国汽车站联网售票</P></LI>
				<LI><SPAN class="foot-n3"></SPAN>
					<H2>全天服务</H2>
					<P>7*24小时专业客服人员为您服务</P></LI>
				<LI><SPAN class="foot-n4"></SPAN>
					<H2>方便快捷</H2>
					<P>取票自由，车站直接取票上车</P></LI>
			</UL>
		</DIV>
	</DIV>
	<DIV class="helpserver">
		<DIV class="main-wrap">
			<DIV class="helplist">
				<DIV class="help_l">
					<H2>新手指南</H2>
					<UL>
						<LI><A href="http://uc.12308.com/register/registerPage.html"
							target="_blank">用户注册</A></LI>
						<LI><A href="http://www.12308.com/bbm/pay_guide.html"
							target="_blank">在线支付</A></LI>
						<LI><A
							href="http://www.12308.com/bbm/receive_ticket_guide.html"
							target="_blank">取票上车</A></LI>
					</UL>
				</DIV>

				<DIV class="help_l">
					<H2>购票须知</H2>
					<UL>
						<LI><A href="http://www.12308.com//bbm/ckxz.html"
							rel="nofollow">乘客须知</A></LI>
						<!--   <li><a href="http://www.12308.com/help/help_27.html" rel="nofollow">取票须知</a></li>-->

						<LI><A href="http://www.12308.com/index/timeList.html"
							rel="nofollow">售票预售期</A></LI>
					</UL>
				</DIV>
				<DIV class="help_l">
					<H2>常见问题</H2>
					<UL>
						<LI><A href="http://www.12308.com/help/help_22.html"
							target="_blank">班次查询</A></LI>
						<LI><A href="http://www.12308.com/help/help_27.html"
							target="_blank">退票问题</A></LI>
						<LI><A href="http://www.12308.com/help/help_25.html"
							target="_blank">支付问题</A></LI>
					</UL>
				</DIV>
				<DIV class="help_l">
					<H2>乘车保险</H2>
					<UL>
						<!--  <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">保险须知</a></li>
        <li><a href="http://www.12308.com/help/help_5.html" rel="nofollow" target="_blank">车票保险</a></li> -->

						<LI><A href="http://www.12308.com//bbm/e_insurance.html"
							target="_blank">电子保险</A></LI>
						<LI><A href="http://www.12308.com/bbm/pains.html"
							target="_blank">保险说明</A></LI>
					</UL>
				</DIV>
				<DIV class="help_l">
					<H2>会员服务</H2>
					<UL>
						<LI><A
							href="http://uc.12308.com/resetPwd/resetPwdByMobilePage.html"
							rel="nofollow">找回密码</A></LI>
						<LI><A
							href="http://www.12308.com/help/complainAndAdvise.html"
							rel="nofollow">投诉与建议</A></LI>
						<LI><A href="http://www.12308.com/bbm/contact_us.html">联系客服</A></LI>
					</UL>
				</DIV>

				<DIV class="help_last">
					<DIV class="help_time">
						<H2>服务热线</H2>
						<P>
							<SPAN></SPAN><B>0755-82867116</B>
						</P>
					</DIV>
					<DIV class="help_weibo">
						<SPAN></SPAN><A href="http://weibo.com/12308com" target="_blank">
							<P>关注微博</P>
						</A>
					</DIV>
					<DIV class="help_weixin">
						<SPAN></SPAN><A href="http://app.12308.com/weixin.html"
							target="_blank">
							<P>关注微信</P>
						</A>
					</DIV>
				</DIV>
			</DIV>
			<DIV class="clear"></DIV>
		</DIV>
	</DIV>
	<!--公用Foot和友情链接-->
	<DIV class="h05"></DIV>
	<DIV class="footer">
		<DIV class="footer-bd">
			<P>
				<EM>© 2015 12308.com 版权所有</EM> <B>|</B> <SPAN>粤ICP备14020827号-1</SPAN>
			</P>
			<P>
				<A title="关于12308" href="http://www.12308.com/bbm/intro.html"
					target="_blank">关于12308</A><B>|</B> <A title="联系我们"
					href="http://www.12308.com/bbm/contact_us.html" target="_blank">联系我们</A><B>|</B>
				<A title="服务协议"
					href="http://www.12308.com/bbm/service_protocol.html"
					target="_blank">服务协议</A><B>|</B> <A title="诚征英才"
					href="http://www.12308.com/bbm/join_us.html" target="_blank">诚征英才</A><B>|</B>
				<A title="常见问题" href="http://www.12308.com/help/help_0.html"
					target="_blank">常见问题</A><B>|</B>
				<!--  <a href="http://www.12308.com./yqlj.html" target="_blank" title="友情链接">友情链接</a><b>|</b> -->
				<A title="用户建议"
					href="http://www.12308.com/help/complainAndAdvise.html"
					target="_blank">用户建议</A>
			</P>
		</DIV>
	</DIV>
	<SCRIPT src="addCar_files/require.js"
		data-main="http://cdn-resource-alias.12308.com/2015/js/baoche.js"></SCRIPT>
	<SPAN style="visibility: hidden;"> <SCRIPT
			type="text/javascript">
		var _hmt = _hmt || [];
		(function() {
			var hm = document.createElement("script");
			hm.src = "//hm.baidu.com/hm.js?7ae99e8c2df45dc624bafedd8216c545";
			var s = document.getElementsByTagName("script")[0];
			s.parentNode.insertBefore(hm, s);
		})();
	</SCRIPT>
	</SPAN>
</BODY>
</HTML>
