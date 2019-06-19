<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@include file="common/tablib.jsp" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="keywords" content="12308全国公路客运预订平台,汽车票预, 汽车票查询,汽车票销售,网上汽车票预订,网上汽车票查询,汽车时刻表" />
	<meta name="description" content="中国道路运输协会与12308共建的一个全国公路客运平台，负责对全国汽车站的联网，实现网络在线即时购票，线下取票服务。同时还提供汽车票查询,汽车时刻表查询,汽车票预订,汽车站查询等。企业电话咨询热线:0755-36637486"/>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	 <!--禁用缓存部分开始-->
        <meta http-equiv="Expires" content="0" />
        <meta http-equiv="Progma" content="no-cache" />
        <meta http-equiv="cache-control" content="no-cache,must-revalidate" />
        <!--禁用缓存部分结束-->
	<title>12308全国公路客运预订平台_用户中心_订单列表</title>
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


	<link rel="stylesheet" href="Css/kkpager.css">	
	<script type="text/javascript" src="Scripts/kkpager.js"></script>
</head>
<script type="text/javascript">
$.ajaxSetup({
 contentType: "application/x-www-form-urlencoded; charset=utf-8"
});
$(document).ready(function() {
			$("#startDateData").selectbox();
			$("#statusData").selectbox();
			placeholder();
			
			$("#dd11").attr("class","active");//左边框显示
			
});

function delOrder(orderNo,orderType){
    if(!confirm('确定要删除订单吗？')) { 
       return false; 
    }

  $.ajax({
				type : "POST",
				dataType : "text",
				cache : false,
				url : "/order/usercenter/deleteOrder.sc?orderNo="+orderNo+"&orderType="+orderType,
				success : function(msg) {
				    var msg = $.parseJSON(msg);
				    if(msg.resultCode=="0000"){
				      alert("删除成功");
				    }else{
				      alert("删除失败");
				    }
				    location.reload();
				}
	});
};

function submitPage(n){
  submitForm(n);
}

function submitForm(n){
	
  var text = $("#textInput").val();
  if(text=='通过手机号或订单号查询'){
     text = "";
  } 
  $("#text").val(text);
  var pathData = $("#pathData").val();
  var path = pathData+"?startDate="+$("#startDateData").val()+"&statusData="+$("#statusData").val()+"&text="+$("#text").val()+"&currentPage="+n;
  window.location.href=path;
}


function refundOrder(orderNo,orderId){
  if(orderNo==null || orderNo == ""){
    alert("网络连接失败，请刷新页面");
    return false;
  }
  $.ajax({
		  type : "POST",
		  dataType : "text",
		  cache : false,
		  url : "/order/usercenter/refundOrderCheck.sc?orderNo="+orderNo,
		  success : function(msg) {
		   var msg = $.parseJSON(msg);
		       if(msg.resultCode == '0000'){
		         window.location.href='/order/usercenter/refundOrderPage.sc?orderId='+orderId+"&orderNo="+orderNo;
		       }else{
		         alert(msg.resultMsg);
		         location.reload();
		       }
		  }
	});
}
//生成随机数
function getRandomP(){  
    return  Math.round(Math.random()*100000);  
}  

</script>
<body>
<div class="q_pagecontainer">
	<div class="q_pagewrap">
<style>
.navmenu li.ico i{background:url("Images/ico.gif") no-repeat 0px 15px;height:50px;left: 120px;top: -35px;width:65px;display:block;}
.navmenu li.ico a{color:#ff0;}
.navmenu li.ico a.cur{color:#0096ff;}
.navmenu li.ico a:hover{color:#f60;}
</style>
<%@include file="common/headpublic.jsp" %>
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
											<a id="dd11" class="noclass" href="orderListAllServlet">出行订单</a>
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
    <a href="http://uc.12308.com/user/infoPage.html">个人中心</a><em>&gt;</em><span id="nowNav">出行订单</span> </div>
    <!--\breadcrumb--> 
 <div class="stage_main">    
  <form id="dataForm">
    <input type = "hidden" id="pathData" value="http://uc.12308.com/order/usercenter/orderListAll.html"/>
      <div class="search_table pis_title">
                  <select class="select_li" id="startDateData" onchange="submitForm(0)">
                    <option value="month" >一个月内的订单</option>
                    <option value="year" >一年内的订单</option>
                    <option value="history" >历史订单</option>
                  </select>
                  <select  class="select_li" id="statusData" onchange="submitForm(0)">
                    <option value="-1" >全部订单</option>
                    <option value="1" >等待付款</option>
                    <option value="2" >等待出票</option>
                    <option value="3" >订单成功</option>
                    <option value="4,5" >订单关闭</option>
                    <option value="7" >待出票</option>
                  </select>
                  <input type="text" id="textInput" class="textbox" value=""  placeholder="通过订单号查询"/>    
                  <input type="hidden" name="text" value="" id="text"/>       
                  <a href="javascript:void(0)" onclick="submitForm(0)" class="button_ok">搜 索</a>
        </div>

      <div class="inner">
      	  <c:forEach var="c" items="${orderListVos}">
      	  <c:if test="${c.tripOrder.toStatus==0}">
          <table class="order_table order_t_blue">
              <thead><tr><th colspan="4">订单编号 :${c.tripOrder.toNumber } &nbsp; &nbsp; 下订时间：${c.tripOrder.toTime }</th></tr></thead>
              <tbody>
              <tr> 
              <td class="noborder" width="50%">
              <table class="order_table_box">
              <!--<tr><td><a class="gray">${c.startStation.sName } -- ${c.endStation.sName }</a><b>￥64.00</b> <span> 1 张</span> </td></tr>-->
              <tr><td><a class="c66">${c.startStation.city } -- ${c.endStation.city }</a></td></tr>
              <tr><td><p>全价票</p><b>￥${c.ticket.tNowPrice }元</b> <span> ${c.tripOrder.toNum } 张</span></td></tr>
              <tr><td><p>乘车保险</p><b>￥0.00</b> <span> 1 张</span></td></tr>
              <tr><td><p>手续费  </p><b>￥0.00</b></td></tr>
              </table>
              
              
              </td>
              <td width="16%" class="top"><b class="yellow">￥${c.tripOrder.toPrice }</b></td>
              <td width="16%" class="top">
              <a href="javascript:void(0)"><span class="yellow">等待付款</span></a>
              </td>
              <td width="18%">
                   <a href="orderDetailServlet?orderno=${c.tripOrder.toNumber }">订单详情</a><br/>
              <input type="hidden" value="0" id="orderType"/>
             <a class="fk_btn" href="http://uc.12308.com/order/usercenter/toPay_0020160428253020.html"><span>付&nbsp;款</span></a><br/>
                   <a href="http://uc.12308.com/order/usercenter/updateOrder.html?id=3962523" onclick="javascript:if(!confirm('确定要取消订单吗？取消订单不可恢复！')) { return false; }">取消订单</a><br/>
              </td>
               </tr></tbody>
          </table>
          </c:if>
          <c:if test="${c.tripOrder.toStatus==2}">
          <table class="order_table order_t_blue">
              <thead><tr><th colspan="4">订单编号 :${c.tripOrder.toNumber } &nbsp; &nbsp; 下订时间：${c.tripOrder.toTime }</th></tr></thead>
              <tbody>
              <tr> 
              <td class="noborder" width="50%">
              <table class="order_table_box">
              <!--<tr><td><a class="gray">${c.startStation.sName } -- ${c.endStation.sName }</a><b>￥64.00</b> <span> 1 张</span> </td></tr>-->
              <tr><td><a class="c66">${c.startStation.city } -- ${c.endStation.city }</a></td></tr>
              <tr><td><p>全价票</p><b>￥${c.ticket.tNowPrice }元</b> <span> ${c.tripOrder.toNum } 张</span></td></tr>
              <tr><td><p>乘车保险</p><b>￥0.00</b> <span> 1 张</span></td></tr>
              <tr><td><p>手续费  </p><b>￥0.00</b></td></tr>
              </table>
              
              
              </td>
              <td width="16%" class="top"><b class="yellow">￥${c.tripOrder.toPrice }</b></td>
              <td width="16%" class="top">
              <a href="javascript:void(0)"><span class="yellow">预定成功</span></a>
              </td>
              <td width="18%">
                   <a href="orderDetailServlet?orderno=${c.tripOrder.toNumber }">订单详情</a><br/>
              <input type="hidden" value="0" id="orderType"/>
             <a class="fk_btn" href="http://uc.12308.com/order/usercenter/toPay_0020160428253020.html"><span>退&nbsp;款</span></a><br/>
                   <a href="http://uc.12308.com/order/usercenter/updateOrder.html?id=3962523" onclick="javascript:if(!confirm('确定要退款吗？退款不可恢复！')) { return false; }">取消订单</a><br/>
              </td>
               </tr></tbody>
          </table>
          </c:if>
          </c:forEach>   
          </div>
		<table>
			<tr>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;'"><a class="disabled" href="orderListAllServlet?page=1">|&lt;</a></td>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;"><a class="disabled" href="orderListAllServlet?page=${page-1}">&lt;</a></td>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;"><a class="disabled">${page}</a></td>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;"><a class="disabled" href="orderListAllServlet?page=${page+1}">&gt;</a></td>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;"><a class="disabled" href="orderListAllServlet?page=${pageCount}">&gt;|</a></td>
				<td style="border:2px solid gray;margin-left:10px;padding:10px;"><span class="normalsize">共${pageCount}页/${count}条数据</span></td>
			</tr>
		
		</table>
 </form>
       </div>
  </div>
<!--right/-->
            </div>
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