<%@ page language="java" import="java.util.*,java.lang.*"
	pageEncoding="UTF-8"%>
<%@include file="common/tablib.jsp"%>
<!DOCTYPE HTML>
<html>
<head>
<title>从长沙到常德的汽车票_12308全国汽车票</title>
<link rel="stylesheet" href="Css/opendivcity.css" type="text/css"/>
<link href="Css/style.css" type="text/css" rel="stylesheet">
<meta name="keywords" content="长沙汽车票预订,长沙长途汽车票,买长沙车票" />
<meta name="description"
	content="12308为您提供汽车票预订{长沙到常德}，订汽车票{长沙到常德}车票12308网上订票(买全国车票)" />
<link rel="stylesheet" href="Css/search-min-201604.css" type="text/css"/>
<script type="text/javascript" src="Scripts/search.js"></script>

<link rel="stylesheet" href="Css/base.css" type="text/css"/>
<link rel="stylesheet" href="Css/date.css" type="text/css"/>
<link rel="stylesheet" href="Css/chepiao.css" type="text/css"/>
<link rel="stylesheet" href="Css/mright.css" type="text/css"/>
<link rel="stylesheet" href="Css/common.css" type="text/css"/>

</head>
<body onselectstart="return false" onload="getMsg('${msg}')">
	<%@ include file="/common/headpublic.jsp"%>
	<!--中间部份-->
	<input type="hidden" value="http://www.12308.com" id="basePath" />
	<input type="hidden" value="http://uc.12308.com" id="userCenterPath" />
	<input type="hidden" value="http://cdn-resource-alias.12308.com/2015"
		id="resourcePath" />
	<div class="h20"></div>
	<form action="bookTicketServlet" method="post" name="formTicket">
		<div class="main-wrap">
			<div class="main_left">
				<div class="searchboxinput">
					<ul>
						<li><label>出发地</label>
							<div class="s-inputbox" id="shikeStartCityClass">
								<c:if test="${startStationName!=null }">
									<input type="text" id="citySelect" placeholder="输入起始站"
										value="${startStationName }" name="start-city"
										style="line-height: 30px;" />
								</c:if>
								<c:if test="${startStationName==null}">
									<input type="text" id="citySelect" placeholder="输入起始站"
										value="长沙" name="start-city" style="line-height: 30px;" />
								</c:if>
							</div></li>
						<li><label>目的地</label>
							<div class="s-inputbox">
								<c:if test="${endStationName!=null }">
									<input type="text" autocomplete="off"
										value="${endStationName }" id="endCityName" inputIsSubmit="1"
										title="输入终点站" name="end-city" style="line-height: 25px;" />
								</c:if>
								<c:if test="${endStationName==null }">
									<input type="text" autocomplete="off" value="常德"
										id="endCityName" inputIsSubmit="1" title="输入终点站"
										name="end-city" style="line-height: 25px;" />
								</c:if>
							</div></li>
						<li><label>出发日期</label>
							<div class="s-inputtime">
								<div>
									<c:if test="${endStationName!=null }">
										<input type="date" id="bookdate" min="<%=this.currentDate%>"
											max="<%=this.lastDate%>" value="${fromDate }" name="fromDate"
											style="line-height: 25px;" maxlength="10" />
									</c:if>
									<c:if test="${fromDate==null }">
										<input type="date" id="bookdate" value="<%=this.currentDate%>"
											name="fromDate" style="line-height: 25px;"
											min="<%=this.currentDate%>" max="<%=this.lastDate%>"
											maxlength="10" />
									</c:if>
								</div>

							</div></li>
						<li class="li-btn"><input type="submit" id="jueryButton"
							class="btn_b110 search-btn" name="time" value="立即查询"></li>
					</ul>

				</div>
				<script type="text/javascript">
					var test = new Vcity.CitySelector({
						input : 'citySelect'
					});
					var test = new Vcity.CitySelector({
						input : 'endCityName'
					});
				</script>
				<div class="h10"></div>
				<!--2016-5-1  (12308平台)  12308五一活动公告-->
				<div class="csNoticeB">
					<div class="csNotice">
						<p>———— &nbsp; &nbsp; &nbsp;2016-5-1 (12308平台) 12308五一活动公告
							&nbsp; &nbsp; &nbsp;————</p>
					</div>
					<div class="h10"></div>
					<div class="csNBox" style="display: none">
						<div class="csNhd">
							2016-5-1 (12308平台) 12308五一活动公告
							<div class="cs_btn_wrap">
								<b class="cs_btn_close">关闭</b>
							</div>
						</div>
						<div class="csNbd">
							<p>
								<b>一、 活动时间：</b>
							</p>
							在4月25日—4月29日（共5天）期间抢购4月28日—5月2日的特价票 <br />每天分三个时间点（分别为9：30、14：30、17：30）准时开放抢票活动

							<p>
								<b>二、 活动内容：</b>
							</p>
							1. 特价活动城市：深圳、广州、上海、武汉、厦门、长沙、苏州、昆明、南京、宁波、南宁等； <br />2.
							特价线路数量：每天每条线路共有300张特价票可供抢购，即每个时间点分别有100张特价票；

							<p>
								<b>三. 抢票规则：</b>
							</p>
							1) 活动当天可抢购三天后的特价票，即25日抢购28日的车票，26日抢购29日的车票，依此类推； <br />2)
							活动线路不限班次，用户可根据需求购票，抢完即止； <br />3)
							活动期间，一个用户限定抢购一张活动票，同个ID、手机号算一个用户； <br />4)
							活动票不可转让、不可折现、不可退票，仅限本人使用；

							<p>
								<b>四. 活动最终解释权归12308全国汽车票所有，客服电话：0755-82867116。</b>
							</p>
						</div>
					</div>


				</div>
				<!--2016-5-1  (12308平台)  12308五一活动公告-->
				<input type="hidden" id="hideStartCityName"
					value="${startStationName }" /> <input type="hidden"
					id="hideEndCityName" value="${endStationName }" /> <input
					type="hidden" id="hideStartDate" value="2016-05-01" /> <input
					type="hidden" id="hideOrderBy" value="1" /> <input type="hidden"
					id="isSearch" value="true" /> <input type="hidden" id="source"
					value="" />
				<!--车站列表-->
				<div class="ticketlist clearfix">
					<div class="queryhead">
						<h1>
							<c:if test="${startStationName!=null }">
				${startStationName }
			</c:if>
							<c:if test="${startStationName==null }">
				长沙
			</c:if>
							→
							<c:if test="${startStationName!=null }">
				${endStationName }
			</c:if>
							<c:if test="${startStationName==null }">
				常德
			</c:if>
						</h1>
						<label>车票信息<em id="scheduleCount"> <c:if
									test="${listSize!=null }">
					${listSize }
				</c:if> <c:if test="${listSize==null }">
					0
				</c:if>
						</em>条
						</label>
						<div class="times" style="display: none;">
							<em class="time-ico">时间</em><a href="#" target="_blank">与汽车站同步预售，可售<b
								id="preDate">30</b>天
							</a>
						</div>
					</div>
					<div class="calendar_tab"></div>
					<!-- 查询结果展示 -->
					<div class="orderdiv">
						<div class="h10"></div>
						<!--车站筛选条件-->
						<div class="searchselect layout">

							<div class="timebox">
								<div class="tt">发车时间：</div>
								<ul>
									<li class="no_lim"><div class="on">
											<span>不限</span>
										</div></li>
									<li><label for="上午(06:00~12:00)"> <span
											class="icbox" name="time" datatype="06:00~12:00"></span><span
											class="type_txt">上午(06:00~12:00)</span> <input
											type="checkbox"></label></li>
									<li><label for="下午(12:00~18:00)"> <span
											class="icbox" name="time" datatype="12:00~18:00"></span><span
											class="type_txt">下午(12:00~18:00)</span><input type="checkbox"></label></li>
									<li><label for="晚上(18:00~24:00)"> <span
											class="icbox" name="time" datatype="18:00~24:00"></span><span
											class="type_txt">晚上(18:00~24:00)</span><input type="checkbox"
											onclick="javascript:document.formTicket.submit();"></label></li>

								</ul>
							</div>
							<span class="control up" id="moreStation" style="display: none;"><span>更多车站</span></span>
							<div class="clear"></div>
							<div class="morebox">
								<div class="tt">始发站点：</div>
								<ul>
									<li class="no_lim"
										onclick="JavaScript:toBookTicketServlet1('${startStationName}','${endStationName}','${fromDate}');"><div
											class="on" location="">
											<span>不限</span>
										</div></li>
									<c:if test="${stations!=null}">
										<c:forEach var="c" items="${stations}">
											<li><span class="checkbox_item"> <input
													type="checkbox" name="stationStart" value="${c.sName}" />
													<c:if test="${c.isSelect=='true'}">
														<label class="check_label on"> <i
															class="checkbox_icon "></i> <em class="checkbox_text">${c.sName }</em>
														</label>
													</c:if> <c:if test="${c.isSelect=='false'||c.isSelect==null}">
														<label class="check_label"> <i
															class="checkbox_icon "></i> <em class="checkbox_text">${c.sName }</em>
														</label>
													</c:if>
											</span></li>
										</c:forEach>
									</c:if>
									</ul>
							</div>
							<script src="Scripts/checkbox.js" type="text/javascript"></script>
							<script type="text/javascript">
								$(".check_label").checkbox(); 
								
						</script>
						</div>
						<div class="clear"></div>
					</div>
	</form>
	<div id="content" style="display: block;">
		<div class="h10"></div>
		<div class="lineitem">
			<div class="head">
				<ul>
					<li class="first"><span class="icon i2" id="startTimeOrderBy">出发时间</span></li>
					<li class="second">出发/到达</li>
					<li class="third">车型/车次</li>
					<li class="fourth"><span class="icon i2"
						id="ticketPriceOrderBy">票价</span></li>
					<li class="fifth">余票</li>
					<li class="six">操作</li>
				</ul>
			</div>
			<div class="content" index="1" style="display: block">
				<c:if test="${ticketList!=null }">
					<c:forEach var="c" items="${ticketList}">
						<div class="box">
							<ul>
								<li class="first">
									<p class="time">${fn:substring(c.tStartTime,11,16)}</p>
									<p class="range">${c.tDistance }KM</p>
								</li>
								<li class="second"><span class="start">发</span>
									<p>

										<a class="color3 startStation"
											href="http://chezhan.12308.com/czSearchByName.html?stationName=长沙市汽车西站&amp;cityCode=0731"
											target="_blank">${c.startStation.sName}</a> <a
											class="map_icon"
											href="http://chezhan.12308.com/czSearchByName.html?stationName=长沙市汽车西站&amp;cityCode=0731"
											target="_blank"></a>

									</p> <span class="end">到 </span>
									<p>
										<a class="color3">${c.endStation.sName }</a>
									</p></li>
								<li class="third">
									<p class="th_o">${c.goCarTypeName }</p>
									<p class="th_t">${c.tName }</p>

								</li>
								<li class="fourth  "><span class="icon i2"><span
										id="" class="price"><em>¥</em><span>${c.tNowPrice }</span></span></span>
								</li>
								<li class="fifth pt15"><c:if
										test="${c.tTicketNumber>c.tTicketBookNumber }">
										<span class="green">有票</span>
									</c:if> <c:if test="${c.tTicketNumber<=c.tTicketBookNumber }">
										<span class="green">无票</span>
									</c:if></li>
								<li class="six pt5"><a class="btn_y80 buy-btn"
									href="bookTicketDoServlet?start-city=${startStationName }&end-city=${endStationName}&fromDate=${fromDate}&ticketId=${c.tId}"
									title="正常预订">预 订</a></li>
							</ul>
						</div>
					</c:forEach>
				</c:if>
			</div>
		</div>
		<div class="h30"></div>
		<!--翻页-->
		<input type="hidden" id="dataCount" value="41"> <input
			type="hidden" id="pageCount" value="5">
		<div class="m-page-box">
			<div class="m-page">
				<a
					href="bookTicketServlet?page=${page-1 }&start-city=${startStationName}&end-city=${endStationName }&fromDate=${fromDate}
					<c:forEach var='c' items='${stationStart }'>
						&stationStart=${c }
					</c:forEach>"
					class="up-page">上一页</a>
				<c:forEach var="c" begin="1" end="${pageCount }" step="1">

					<a
						href="bookTicketServlet?page=${c }&start-city=${startStationName}&end-city=${endStationName }&fromDate=${fromDate}
						<c:forEach var='c1' items='${stationStart }'>
						&stationStart=${c1}
						</c:forEach>"
						class="${c==page?'cur':''}">${c }</a>
				</c:forEach>
				<a
					href="bookTicketServlet?page=${page+1 }&start-city=${startStationName}&end-city=${endStationName }&fromDate=${fromDate}
					<c:forEach var='c' items='${stationStart }'>
						&stationStart=${c }
					</c:forEach>"
					class="down-page">下一页</a> <span>共<strong>${pageCount}</strong>页
					跳转到 <input type="text" id="txtGoto" value="${pageCount }"
					class="txt"> 页 <input type="button" class='btn-bg'
					onclick="JavaScript:toBookTicketServlet('${pageCount}','${startStationName}','${endStationName}','${fromDate}','<c:forEach var='c1' items='${stationStart}'>&stationStart=${c1}</c:forEach>');" /></span>
			</div>
		</div>
		<!--翻页-->
		<ul style="display: none;" id="station_list">
			<input type="hidden" id="stationList" value="4">
			<li class="no_lim"><div class="on" location="">
					<span>不限</span>
				</div></li>
			<li><label><span class="icbox" name="startplace"
					location="" datatype="长沙市汽车西站"></span><span class="type_txt">长沙市汽车西站</span><input
					type="checkbox"></label></li>
			<li><label><span class="icbox" name="startplace"
					location="" datatype="长沙高铁汽车站"></span><span class="type_txt">长沙高铁汽车站</span><input
					type="checkbox"></label></li>
			<li><label><span class="icbox" name="startplace"
					location="" datatype="长沙市汽车东站"></span><span class="type_txt">长沙市汽车东站</span><input
					type="checkbox"></label></li>
		</ul>
	</div>
	<div style="display: none;" class="promptList  promptList2"
		id="localSearchNoResult">
		<div class="prompt_ic">
			<i class="prompt_img"></i> <span class="prompt_txt">
				没有符合您查询的车次<br> 请您重新查询。
			</span>
		</div>
	</div>
	<div style="display: none;" class="promptList  promptList4"
		id="timeOutResult">
		<div class="prompt_ic">
			<i class="prompt_img"></i> <span class="prompt_txt">
				很抱歉，由于网络延迟，<br> 请您点&lt;点击重试&gt;按钮，刷新。
			</span>
		</div>
		<div class="prompt_btn">
			<a
				href="javascript:{$('#isSearch').val(true);_obj.paging.search(1);}"
				class="btn_bs200">点击重试</a>
		</div>
	</div>
	<div style="display: none;" id="loadingImage" class="loading">
		<div class="ld">
			请稍等!<br> 您查询的结果正在搜索中...
		</div>
	</div>
	</div>
	<div class="h10"></div>
	</div>
	</div>
	<!--右边部份-->
	<div class="main_right">
		<div class="main_r_b">

			<div class="map_b" id="station_position"
				style="height: 318px; width: 278px;">
				<!-- <img src="Picture/r_map.png" alt="地图" /> -->
			</div>
			<div class="h20"></div>
			<!--左边/-->
			<div class="comprob_b dashedl">
				<h4>常见问题</h4>
				<ul class="ul_wenda c54">
					<li class="cur">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8586.html" target="_blank">空调、卧空、JN空调、座椅快客、快客空卧有什么区别？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>空调、JN空调是普通的空调坐席；卧空是空调卧铺；座椅快客是快速的坐席大巴车；快客空卧是快速空调卧铺，以上信息仅供参考，具体车型以客运站信息为准。</p>
						</div>
					</li>
					<li class="">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8501.html" target="_blank">为什么出发地栏提示找不到输入的城市名称？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>该区域暂未开通网上预售票功能，您暂不能通过12308平台预订呦~敬请您持续关注平台。</p>
						</div>
					</li>
					<li class="">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8502.html" target="_blank">为什么查询不到返程的车次信息？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>如果查询不到返程车次信息，表示返程线路暂未开通网上预订。</p>
						</div>
					</li>
					<li class="">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8503.html" target="_blank">为什么车次信息中没显示目的地车站名？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>12308暂时无法查询到目的地车站信息，建议您向乘车站窗口或咨询台工作人员进行咨询噢。</p>
						</div>
					</li>
					<li class="">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8504.html" target="_blank">为什么车次信息中没显示抵达目的地的时间？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>由于长途汽车行驶途中存在不确定因素，所以暂无法查询到准确的抵达时间，请您向车站窗口或咨询台工作人员进行咨询哟。</p>
						</div>
					</li>
					<li class="">
						<div class="d_wen">
							<i class="i_wen"></i><span class="i_arr"></span>
							<p>
								<a href="http://www.12308.com/help/q8505.html" target="_blank">为什么去往同一地点的不同车次票价有差异？</a>
							</p>
						</div>
						<div class="d_da">
							<i class="i_da"></i>
							<p>感谢您对12308的支持。由于不同车次的车型、行车路线有所差异，同一路线的不同车次票价会略有不同，详细情况您可以向乘车站进行咨询呢。</p>
						</div>
					</li>
				</ul>
			</div>
			<div class="h20"></div>
			<div class="askbot_b">
				<a href="http://www.12308.com/help/travellerAsk.html"
					target="_blank"><img src="Picture/ask_img.png" alt="有疑问？点击提问"></a>
				<p>
					已有<b>50,811</b>位乘客得到了帮助
				</p>
			</div>
		</div>
	</div>
	</div>
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
</body>
</html>