<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
     <meta charset="utf-8" />
     <title>用户支付_12308全国汽车票</title>
     <link href="http://image.12308.com/favicon.ico" type="image/x-icon" />
     <meta name="description" content="12308全国汽车票在线支付"/>
     <link rel="stylesheet" href="Css/base.css" />
     <link rel="stylesheet" href="Css/pay.css" />
     <script src="Scripts/jquery.js"></script>
     <script src="Scripts/main.js"></script>
     <script src="Scripts/confirmpay.js"></script>
     <script src="Scripts/base.js"></script>
</head>
<body class="graybg">
<input type="hidden" id="baseUrl" value="http://payment.12308.com/"/>
<style>
.navmenu li.ico i{background:url("Images/ico.gif") no-repeat 0px 15px;height:50px;left: 120px;top: -35px;width:65px;display:block;}
.navmenu li.ico a{color:#ff0;}
.navmenu li.ico a.cur{color:#0096ff;}
.navmenu li.ico a:hover{color:#f60;}
</style>
<!--顶部公用-->
<div class="bodyhead">
 <div class="main-wrap">
  <h1 class="logo"><a title="12308全国汽车票网" href="http://www.12308.com">12308全国汽车票网</a></h1>
  <div class="headr">
  <div class="toolkit">
     <span class="a_mapp"><i class="to_mapp"></i><span>手机APP</span>
         <div class="to_code_box"><div class="to_code_hd"><span class="arr"></span>
         <div class="code_hd">
         <p>司机端下载</p><a href="http://qiye.12308.com/download.html"><img src="Picture/driver_code.png" width="94px" height="94px"/></a></div>
         <div class="code_line"></div>
         <div class="code_hd">
         <p>客户端下载</p><a href="http://app.12308.com/"><img src="Picture/clients_code.png" width="94px" height="94px"/></a></div>
         </div></div>
     </span>
     <a href="http://weibo.com/12308com" class="link a_weibo" target="_blank"><i class="to_weibo"></i><span>微博</span></a>
     <a href="http://app.12308.com/weixin.html" class="link a_weixin" target="_blank"><i class="to_weixin"></i><span>微信</span>
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
        <li class="nav_0"><a href="http://www.12308.com" title="首页"><i></i>首页<span></span></a></li>
        <li class="nav_1"><a href="http://www.12308.com/index/chepiao.html" title="汽车票预订"><i></i>汽车票预订<span></span></a></li>
        <!--<li class="nav_2 ico"><a href="http://www.12308.com/huodong/index.html" tts="link_3316" title="春运特价票"><i></i>春运特价票<span></span></a></li>-->
        <li class="nav_3"><a href="http://www.12308.com/news/index.html" title="资讯中心"><i></i>资讯中心<span></span></a></li>
        <li class="nav_4"><a href="http://www.12308.com/help.html" title="客服中心"><i></i>客服中心<span></span></a></li>
        <li class="nav_5"><a href="http://www.12308.com/baoche/index.html" title="我要包车"><i></i>我要包车<span></span></a></li>
        </ul>
        <div class="navuserbg"></div>
       <ul id="login_content" class="navuser">
	        <li id="login_menu" class="mytrip">
               <a href="http://uc.12308.com" class="ushow">用户中心<em>图标</em></a>
	           <div id="login_menubox" class="ubox">		        
		        <ul>
                   <li class=""><a href="http://uc.12308.com/order/usercenter/orderListAll.html" rel="nofollow">我的订单</a></li>
                    <li class=""><a href="http://uc.12308.com/message/questionList.html" rel="nofollow">我的提问</a></li>
                    <li class=""><a href="http://uc.12308.com/user/infoPage.html" rel="nofollow">个人资料</a></li>
		        </ul>
	        </div>
	        </li>
	       <li class="reg">
	          <a href="http://uc.12308.com/register/registerPage.html" rel="nofollow" title="注册">注册</a>
	        </li>
	        <li class="out hide" style="display: none;">
	          <a href="http://uc.12308.com/auth/logout.html" rel="nofollow" title="退出">退出</a>
	        </li>
	        <li class="go">
              <span><a class="logLin" id="logLin" href="http://uc.12308.com" title="登录">登录</a></span>
            </li>
	       
        </ul>
    </div>
 </div>

	<!--中间部份-->
	<div class="h20"></div>
	<div class="main-wrap">
		<div class="ticketstep">
		  <ul class="step3">
		  <li class="start"></li>
		    <li class="start"></li>
		    <li class="li1"><span class="ico1">确定预订车票车次</span></li>
		    <li class="li2"><span class="ico2">核对订单信息</span></li>
		    <li class="li3"><span class="ico3">成功提交订单</span></li>
		  </ul>
		</div>
 		<div class="bodymain">
	       <div class="orderst_b clearfix" id="timeTip">
		        <div class="orderst_div">
			        <i></i>
			        <div class="left">
			        <h2 id="t_msg">您的订单提交成功，请在10分钟内尽快付款，以免订单失效！</h2>
			        <p>订单编号：<span>0020160428220742</span><span class="plr10">|</span>应付金额<b>64</b>元</p>
			        <p>支付剩余时间：<span class="time" id="t_time"></span></p>
		        </div>
	       </div>  
	       <div class="h20"></div>
       <div class="divbox">
          <div class="item">
            <table>
              <tbody><tr>
               <th>车票信息</th>
                <td class="line">长沙市汽车西站 -- 常德</td>
                	<td class="line18">座次：<span>高档空调  </span></td>
                <td class="line18">发车时间:<span>2016-05-02 07:30</span></p>
                </td>
              </tr>
            </tbody></table>
          </div>
        </div> 
        </div> 
    
    <form action="" id="confimpaymoney" name="subform" method="post" target="_blank">  
	<input id="orderId" name="orderId" value="3963499" type="hidden" />	
	<input id="orderNO" name="orderNO" value="0020160428220742" type="hidden" />	
	<input id="orderNo" name="orderNo" value="0020160428220742" type="hidden" />	
	<input name="phone" value="18684855028" type="hidden" />	
	<input name="subject" value="汽车票" 	 type="hidden" />
	<input name="alibody" value="12308汽车票"	 type="hidden" />
	<input type="hidden" value="64" id="total_fee" name="total_fee"/>
	<input type="hidden" name="remainingTime" id="remainingTime" value="572"/>
	
        <!--银行卡支付信息-->
     <div class="h10"></div>
     
    
     <!--/快捷支付-->
     <div id="kjp" class="paytabs paytabs_pt0" style="display:none">
	     <div class="mc">
		     <h3 class="maintit"><s class="fastpay"></s><div class="extra"></div></h3>
		     <div class="clear"></div>
		     <div class="h10"></div>
    		 <ul class="list-bank" id="tab01_l02">
		     </ul>
		     <div class="h10"></div>
		    <div class="fm-box">            
		    <div class="fm-li">
		          <span class="fm-label"><label for="txt_userName">预留手机号</label></span>
		             <input type="text" class="i-input" maxlength="11" name="k_phone" id="k_phone">
		              <div class="msg-info">
		                    <div class="msg-weak msg-attention" id="p_cw"><i></i>
		                        <label class="valid" id="p_msg">提示：请输入您在银行开户或办理业务时留存的手机号码</label>
		                    </div>
		                    <div class="msg-weak msg-error" id="p_ts"  style="display: none;"><i></i>
		                        <label class="valid" id="pts"></label>
		                    </div>
		               </div>
		        </div>
		        
		        <div class="fm-li">
		          <span class="fm-label"><label for="txt_password2">短信验证码</label></span>
		             <input type="text" class="i-input" maxlength="6" name="k_code" id="k_code"><a id="getVc" class="fm-btn">免费获取</a>
		              <div class="msg-info">
		                    <div class="msg-weak msg-attention" id="v_cw"><i></i>
		                        <label class="valid" id="v_msg">提示：请输入银联95516发送到您手机上的6位短信验证码</label>
		                    </div>
		                    <div class="msg-weak msg-error" id="v_ts"  style="display: none;"><i></i>
		                        <label class="valid" id="vts"></label>
		                    </div>
		               </div>
		        </div>
		      </div> 
	     </div>
     </div>
     <!--快捷支付/-->
      </div> 
     <div id="otherp" class="paytabs" >
     <div class="mt">
	 <ul class="tab">
	    <!--<li class="curr">微信支付<em class="sale-ico">优惠</em></li>-->
        <li>银行卡/储蓄卡</li>
        <li>信用卡</li>
        <li>第三方支付平台</li>
        <li class="curr">微信支付</li>
        </ul>
        <!--- 
        <div class="extra">
				<em class="newest-ico">新</em><a href="http://huodong.12308.com/hongbao/index.html" target="_blank">首次使用微信支付，100%送红包！</a>
			</div>
			-->
     </div>
     <div class="mc">
           <!---tab04-->
           <!--微信支付
           <div style="display: block;" class="tabcon" id="tab04">    
           <div class="h20"></div> 
            <ul class="list-pay">
                 <li class="select">
                <label>
                 <input type="radio" name="bank" title="微信支付" checked="checked" class="payradio" value="wxPay">
				<span class="pay-logo pay-weixinpay"></span>
				</label>
                </li>
                <p style=" font:16px/60px 'microsoft yahei'; color:#f30;">支付5元以上送最高100元现金红包</p>
                </ul>
                <div class="h05"></div> 
                <p style="color:#666;font:14px/22px 'microsoft yahei'; display:inline-block; float: left">
                	活动规则：
                <br/>1活动时间：2015年4月21日上午11点30分00秒至4月30日晚上23点59分59秒；
                <br/>2活动期间，用户凡在12308网站使用微信支付成功支付5元(含5元)以上送最高100元微信红包1个，活动期间每个用户每天限1次。
                <br/></p>
                <div class="h20"></div>  
           </div>
           -->
           <!--QQ支付
            <div style="display: block;" class="tabcon" id="tab04">    
           <div class="h20"></div> 
            <ul class="list-pay">
                 <li class="select">
                <label><input type="radio" name="bank" title="QQ钱包支付" checked="checked" class="payradio" value="qqwallet">
                <span class="pay-logo pay-qqwallet"></span></label>
                </li>
                <p style=" font:16px/60px 'microsoft yahei'; color:#f30;">支付5元以上送最高100元现金红包</p>
                </ul>
                <div class="h05"></div> 
                <p style="color:#666;font:14px/24px 'microsoft yahei'; display:inline-block; float: left">
                活动规则：
                <br/>1活动时间：2015年4月27日上午11点30分00秒至5月3日晚上23点59分59秒；
                <br/>2活动期间，用户凡在12308网站使用QQ钱包支付成功支付5元(含5元)以上即可送最高100元随机手Q现金红包1个，活动期间每个用户每天限1次；
				<br/>3手Q现金红包在用户完成支付后10分钟内发放，手机QQ5.3及以上版本用户可以通过“QQ红包”公众账号查收，用户需在收到消息后的1天内拆红包领取奖金；若1天内未拆红包领取奖金，该红包将会退回并不能再领取。
                <br/></p>
                <div class="h20"></div>  
           </div>
           -->
     <!--- 银行卡支付 -->
     <div class="tabcon" id="tab01">
         	<!--
         	<h5 class="paytit"><i class="icon-arr01"></i><b>银行卡快捷支付</b></h5>
            <p class="paytip">由网银提供快捷支付保障；免开通，有卡就能付</p>
            <ul class="list-pay">
                <li>
                <label><input type="radio" name="bank" title="中国银联" class="payradio" value="kj_unionpay">
                <span class="pay-logo pay-unionpay"></span></label>
                </li>
            </ul>
            -->
            <h5 class="paytit"><i class="icon-arr01"></i><b>选择银行卡支付</b></h5>
            <ul class="list-bank" id="tab01_l02">
                <li>
	                <label>
		                <input type="radio" name="bank" title="建设银行" class="payradio" value="bankPay@CCB-DEBIT">
		                <span class="bank-logo bank-ccb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="工商银行" class="payradio" value="bankPay@ICBC-DEBIT">
		                <span class="bank-logo bank-icbc"></span>
	                </label>
                </li>
              	<li>
	                <label>
		                <input type="radio" name="bank" title="中国银行" class="payradio" value="bankPay@BOC-DEBIT">
		                <span class="bank-logo bank-boc"></span>
	                </label>
                </li>
              	<li>
	                <label>
		                <input type="radio" name="bank" title="交通银行" class="payradio" value="bankPay@COMM-DEBIT">
		                <span class="bank-logo bank-bcom"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中国农业银行" class="payradio" value="bankPay@ABC">
		                <span class="bank-logo bank-abc"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="招商银行" class="payradio" value="bankPay@CMB-DEBIT">
		                <span class="bank-logo bank-cmb"></span>
	                </label>
                </li>
                <li>
                	<label>
		                <input type="radio" name="bank" title="中国光大银行" class="payradio" value="bankPay@CEB-DEBIT">
		                <span class="bank-logo bank-ceb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="浦东发展银行" class="payradio" value="bankPay@SPDB">
		                <span class="bank-logo bank-spdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="兴业银行" class="payradio" value="bankPay@CIB">
		                <span class="bank-logo bank-cib"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="广东发展银行" class="payradio" value="bankPay@GDB">
		                <span class="bank-logo bank-gdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="深圳发展银行" class="payradio" value="bankPay@SPBANK">
		                <span class="bank-logo bank-sdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中国民生银行" class="payradio" value="bankPay@CMBC">
		                <span class="bank-logo bank-cmbc"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中信银行" class="payradio" value="bankPay@CITIC">
		                <span class="bank-logo bank-citic"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="邮政储蓄" class="payradio" value="bankPay@POSTGC">
		                <span class="bank-logo bank-post"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="北京农村商业银行" class="payradio" value="bankPay@BJRCB">
		                <span class="bank-logo bank-bjrcb"></span>
	                </label>
                </li>
                <li title="c-nbcb">
	                <label>
		                <input type="radio" name="bank" title="宁波银行" class="payradio" value="bankPay@NBBANK">
		                <span class="bank-logo bank-nbcb"></span>
	                </label>
                </li>
            </ul>
 		</div>
       
       <!--- 信用卡支付 -->
       <div class="tabcon" id="tab02">
         <h5 class="paytit"><i class="icon-arr01"></i><b>选择信用卡支付</b></h5>
             <ul class="list-bank" id="tab01_l02">
             	<li>
	                <label>
		                <input type="radio" name="bank" title="工商银行" class="payradio" value="bankPay@ICBCB2C">
		                <span class="bank-logo bank-icbc"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="建设银行" class="payradio" value="bankPay@CCB">
		                <span class="bank-logo bank-ccb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="浦东发展银行" class="payradio" value="bankPay@SPDB">
		                <span class="bank-logo bank-spdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中国银行" class="payradio" value="bankPay@BOCB2C">
		                <span class="bank-logo bank-boc"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="招商银行" class="payradio" value="bankPay@CMB">
		                <span class="bank-logo bank-cmb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="兴业银行" class="payradio" value="bankPay@CIB">
		                <span class="bank-logo bank-cib"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="广东发展银行" class="payradio" value="bankPay@GDB">
		                <span class="bank-logo bank-gdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="深圳发展银行" class="payradio" value="bankPay@SPBANK">
		                <span class="bank-logo bank-sdb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中国民生银行" class="payradio" value="bankPay@CMBC">
		                <span class="bank-logo bank-cmbc"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="交通银行" class="payradio" value="bankPay@COMM">
		                <span class="bank-logo bank-bcom"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="中信银行" class="payradio" value="bankPay@CITIC">
		                <span class="bank-logo bank-citic"></span>
	                </label>
                </li>
                <li>
                	<label>
		                <input type="radio" name="bank" title="中国光大银行" class="payradio" value="bankPay@CEBBANK">
		                <span class="bank-logo bank-ceb"></span>
	                </label>
                </li>
                <li>
	                <label>
		                <input type="radio" name="bank" title="邮政储蓄" class="payradio" value="bankPay@POSTGC">
		                <span class="bank-logo bank-post"></span>
	                </label>
                </li>
                <li title="c-nbcb">
	                <label>
		                <input type="radio" name="bank" title="宁波银行" class="payradio" value="bankPay@NBBANK">
		                <span class="bank-logo bank-nbcb"></span>
	                </label>
                </li>
            </ul>  
        </div>
       
       <!--- 支付平台 -->
       <div class="tabcon" id="tab03">
         <h5 class="paytit"><i class="icon-arr01"></i><b>扫码快捷支付</b></h5>
	          <ul class="list-pay">
	                <li>
			            <label>
				            <input type="radio" name="bank" title="微支付"  class="payradio" value="wxPay">
				            <span class="pay-logo pay-weixinpay"></span>
		            	</label>
		            </li>
		            <li>
	                	<label>
		                	<input type="radio" name="bank" title="QQ钱包" class="payradio" value="qqwallet">
		               		<span class="pay-logo pay-qqwallet"></span>
	               		</label>
	                </li>
		            <!--
		            <li>
			            <label>
				            <input type="radio" name="bank" title="支付宝扫码" class="payradio" value="smAlipay">
				            <span class="pay-logo pay-alipaysm"></span>
			            </label>
		            </li>
		            -->
	            </ul> 
         <h5 class="paytit"><i class="icon-arr01"></i><b>在线支付平台</b></h5>
            <ul class="list-pay">
	            <li>
		            <label>
			            <input type="radio" name="bank" title="支付宝" class="payradio" value="aliPay">
			            <span class="pay-logo pay-alipay"></span>
		            </label>
	            </li>
	            <li>
		            <label>
			            <input type="radio" name="bank" title="财付通" class="payradio" value="tenPay">
			            <span class="pay-logo pay-tenpay"></span>
	            	</label>
	            </li>
            </ul>
          <h5 class="paytit"><i class="icon-arr01"></i><b>网上银行（银联）</b></h5>
            <ul class="list-pay">
	            <li>
		            <label>
			            <input type="radio" name="bank" title="中国银联" class="payradio" value="bjupay">
			            <span class="pay-logo pay-unionpay"></span>
		            </label>
	            </li>
            </ul>  
        </div>
        
         <div class="tabcon" id="tab04" style="display: block;">
           <div class="weixin_box">
           <img src="Picture/weixinpay.png">
           </div>
            <ul class="list-pay">
                 <li class="select">
                <label><input type="radio" name="bank" title="微信支付"  checked="checked" class="payradio" id="pay_weixinpay" value="wxPay">
                <span class="pay-logo pay-weixinpay"></span></label>
                </li>
                </ul>
           </div>
	  <div class="btns">
			<input type="button" value="下一步" class="btn_y200" id="confirtopay" name="confirtopay">
			
	   </div>
   </div>
   </div>
   
<!-- 弹出层 -->
<div id="nowpayDiv" style="display:none">
<div class="nowpay_b">
<div class="title"><span>正在支付...</span><a class="ui_btn_close"><b>关闭</b></a></div>
<div class="nowpay_c">
<div class="left"><div class="img"></div></div>
<div class="right">
<p class="f14">请及时完成支付，防止订单超时失效!</p>
<p class="mt_10">
<a href="http://uc.12308.com/order/usercenter/orderDetail_3963499.html" class="nowpaybtn">支付成功，查看订单</a>
<a href="javascript:window.location.reload()" class="nowpaybtn ml_15">支付失败，再次支付</a></p>
</div>
</div>
</div>
</div>
</form>
<script type="text/javascript">
$(function($){ 
    	$(".tab li").bind("click", function(){
    		$(".tab li").each(function(){
    			$(this).attr("class", "");
    		});
    		$(this).attr("class", "curr");
    		var cityIndex = $(this).index();
    		$(".tabcon").each(function(){
    			if($(this).index() == cityIndex){
    				$(this).show();
    			} else {
    				$(this).hide();
    			}
    		});
    	});	
	});
</script>
</div>
<div class="h40"></div>
<div class="foot-main"><div class="foot-nav clearfix">
<ul>
<li><span class="foot-n1"></span><h2>权威认证</h2><p>中国道路运输协会共建平台</p></li>
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
        <li><a href="http://www.12308.com/bbm/ckxz.html" rel="nofollow">乘客须知</a></li>
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
        <li><a href="http://www.12308.com/bbm/e_insurance.html" target="_blank">电子保险</a></li>
        <li><a href="http://www.12308.com/bbm/bxsm.html?0" target="_blank">保险说明</a></li>
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
  
</div></body>
</html>