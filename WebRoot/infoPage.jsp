<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>个人中心_全国汽车票预订平台_长途汽车线路时刻表_汽车票查询_</title>
	<link href="http://image.12308.com/favicon.ico" type="image/x-icon" rel="icon" />
	<meta name="keywords" content="12308,汽车票,长途汽车,汽车票预订,汽车票查询,汽车时刻表,全国汽车站" />
	<meta name="description" content="12308是中国道路运输协会与全国站场工委合作共建平台，提供网上汽车票查询,汽车时刻表查询,汽车票预订,全国汽车站查询等服务的便民性门户网站！服务热线:400-6841-110."/> 
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


	<script type="text/javascript" src="Scripts/userinfo.js"></script>
	
	<script type="text/javascript">
	
	  $(document).ready(function() {
	  
	    $("#dd21").attr("class","active");
	    
	     var birthday = $("#birthdayData").val().split("-");
	          if(birthday.length>0){
		          var year = birthday[0];
		          var month = birthday[1];
		          var day = birthday[2];
                  //为了解决IE7下的兼容性，采用document访问节点方式
		          var nodes_year = document.getElementById("birth_year").childNodes;
		          for(var i = 0;i<nodes_year.length; i++){
		             if(nodes_year[i].innerHTML == year){
		                nodes_year[i].setAttribute("selected","selected");
		             }
		          }
		          var nodes_month = document.getElementById("birth_month").childNodes;
		          for(var i = 0;i<nodes_month.length; i++){
		             if(nodes_month[i].innerHTML == month){
		                nodes_month[i].setAttribute("selected","selected");
		             }
		          }
		          var nodes_day = document.getElementById("birth_day").childNodes;
		          for(var i = 0;i<nodes_day.length; i++){
		             if(nodes_day[i].innerHTML == day){
		                nodes_day[i].setAttribute("selected","selected");
		             }
		          }
	            }
                $(".select_li").selectbox();
	    
	  });
	</script>
</head>
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
    <div class="b_ucbreadcrumb color4">
    <a href="http://uc.12308.com/user/infoPage.html">个人中心</a><em>&gt;</em>
    <span id="nowNav">基础信息</span> </div>
    <!--\breadcrumb--> 
 <div class="qn_usercenter_in">
      <div class="frm">
        <div class="basic_main">
        <!--样式修改  by宁杰   -->
           <!--  <p class="welcome_tip">欢迎回来<span class="uname"><cite class="tri"></cite>349959253@qq.com</span><a id="changePsw" class="reset_psw" href="/user/editPwdPage.html">修改密码</a></p>-->
               <div style="margin-left:10px;" class="clr_after">              
                <div id="indexform" class="indexform usertypes">
                    <!--显示&&修改用户名-->
                    <div class="username">
                        <h4><span class="title">基本信息</span><a   class="modify js-modify" id="divNickname_fy">修改</a></h4>                     
                         <div class="displays" id="divNickname">

                           <p class="info">
                                <label class="infoname">昵称：</label>
                               	<span class="descext" id="show_nickName"></span>
                                <span class="note">  社区统一昵称，不可用于登录，可随时修改  </span> 
                            </p>
                                                                     
                            <p class="info">
                                <label class="infoname">生日：</label>
                                <span class="descext"><span class="info1" id="show_birthday"></span></span>
                            </p>
                            <p class="info">
                                <label class="infoname">性别：</label>
                                <span class="descext" id="show_gender">
保密
                                </span>
                            </p>  
                            <p class="info">
                                <label class="infoname">用户名：</label>
							                                <span class="descext" id="show_userName">349959253@qq.com
							                                </span>
							                                <span class="note">  </span> 
                           </p>  
                        </div>
                        <div style="display:none" class="modifydiv" id="divChangeNickname">
                               <div class="pub-form">
                               		<form id="form1">
                                    <div class="fm-item pbot-15">
                                      <span class="fm-label"><label>昵称：</label></span>
                                                    <input maxlength="45" value="" id="nickName"  name="nickName" class="i-input w200">
                                           <div class="msg-box">
                                                <div id="nickNameTip" class="msg-weak msg-inline msg-attention"><i></i>
                                                    <label class="valid">请输入昵称</label>
                                                </div>
                                           </div>
                                    </div>
                                 	<div class="fm-item pbot-15">
	                                    <span class="fm-label"><label for="select_test1">生日：</label></span>         
	                                    <div class="w240 left">
	                                    <select id="birth_year"  class="select_li"><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option><option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option><option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option><option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option><option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option><option>1950</option><option>1949</option><option>1948</option><option>1947</option><option>1946</option><option>1945</option><option>1944</option><option>1943</option><option>1942</option><option>1941</option><option>1940</option><option>1939</option><option>1938</option><option>1937</option><option>1936</option><option>1935</option><option>1934</option><option>1933</option><option>1932</option><option>1931</option><option>1930</option><option>1929</option><option>1928</option><option>1927</option><option>1926</option><option>1925</option><option>1924</option><option>1923</option><option>1922</option><option>1921</option><option>1920</option><option>1919</option><option>1918</option><option>1917</option><option>1916</option><option>1915</option><option>1914</option><option>1913</option><option>1912</option><option>1911</option><option>1910</option><option>1909</option><option>1908</option><option>1907</option><option>1906</option><option>1905</option><option>1904</option><option>1903</option><option>1902</option><option>1901</option><option>1900</option></select>
	                                    <select id="birth_month"  class="select_li"><option>01</option><option>02</option><option>03</option><option>04</option><option>05</option><option>06</option><option>07</option><option>08</option><option>09</option><option>10</option><option>11</option><option>12</option></select>
	                                    <select id="birth_day"  class="select_li"><option value="01">01</option><option value="02">02</option><option value="03">03</option><option value="04">04</option><option value="05">05</option><option value="06">06</option><option value="07">07</option><option value="08">08</option><option value="09">09</option><option value="10">10</option><option value="11">11</option><option value="12">12</option><option value="13">13</option><option value="14">14</option><option value="15">15</option><option value="16">16</option><option value="17">17</option><option value="18">18</option><option value="19">19</option><option value="20">20</option><option value="21">21</option><option value="22">22</option><option value="23">23</option><option value="24">24</option><option value="25">25</option><option value="26">26</option><option value="27">27</option><option value="28">28</option><option value="29">29</option><option value="30">30</option><option value="31">31</option></select>
	                                	<input type="hidden" id="birthday" name="birthday"/>
	                                	<input type="hidden" id="birthdayData" value=""/>
                                	</div>
                                   <div class="msg-info">
                                        <div id="txt_NameTip" class="msg-weak msg-inline msg-attention"><i></i>
                                           <span class="msg-cnt">请输入您的生日</span>
                                        </div>
                                   </div>
                               </div>
                                                                                 
                                <div class="info pbot-15">
                                    <span class="fm-label"><label>性别：</label></span>
                                    <span>
                                      <input type="radio" autocomplete="off" id="F" class="radio" value="2" name="gender"  ><label class="label_for" for="F" style="margin-right:38px;"> 女</label>
                                      <input type="radio" autocomplete="off" id="M" class="radio" value="1" name="gender"  ><label style="margin-right:38px;" class="label_for" for="M"> 男</label>
                                      <input type="radio" autocomplete="off" id="S" class="radio" value="0" name="gender" ><label for="S"> 保密</label>
                                      <input type="hidden" id="gender" value=""/>
                                    </span>
                                </div>                
                                <div class="fm-item pbot-15">
                                      <span class="fm-label"><label for="txt_Name6"></label></span>
                                      <a id="submit1" class="button_ok" >确 定</a><a id="cancNickname" class="button_canc" >取 消</a>
                               </div>
                               </div>
                               </form>
                        </div>
                    </div>
                    <!--/显示&&修改用户名-->
                    
                    <!--显示&&修改手机-->
                    <div class="mobile" >
                        <h4><span class="title">绑定手机</span><a   class="modify js-modify" id="divMobile_fy">修改</a></h4>
                        <div class="displays" id="divMobile" style="display:">
                            <p>
                                <label class="infoname">手机：</label>
                                <span class="descext" id="show_mobilePhone"></span>
                                <span class="note">可用密码找回，请妥善保管</span>
                            </p>
                        </div>
                        <div style="display:none" class="modifydiv" id="divChangeMobile">
                    <div class="pub-form">
                    <form id="form2">
                    <div class="fm-item pbot-15">
                      <span class="fm-label"><label for="">手机号</label></span>
                         <input type="text" value="" name="mobilePhone" id="mobilePhone" class="i-input w200">
                         <input type="hidden" value=""  id="mobilePhoneCheck" >
                          <div class="msg-box">
                                <div id="mobilePhoneTip" class="msg-weak msg-attention"><i></i>
                                    <label class="valid"><span style="width:auto;" id="phoneArea">提示：请输入手机号</span></label>
                                </div>
                           </div>
                    </div>
                    <div class="fm-li pbot-10">
                      <span class="fm-label"><label for="txt_input6">短信校验码</label></span>
                         <div  class="dinbl"><input type="text" value="" name="verifyCode" id="verifyCode" class="i-input w80 left"><input type="button" class="hqyzm_btn color1" id="sendCodeBtn"  value="免费获取验证码"/></div>
                          <div class="msg-info">
                                <div id="verifyCodeTip" class="msg-weak msg-attention"><i></i>
                                    <label class="valid" id="codeArea">提示：请输入内容</label>
                                </div>
                           </div>
                    </div>
                 
                   <div class="fm-item pbot-15">
                          <span class="fm-label"><label for="txt_Name6"></label></span>
                          <a  id="submit2" class="button_ok" >确 定</a><a id="cancMobile" class="button_canc" >取 消</a>
                   </div> 
                   </form>
            </div>
                        </div>                  
                    </div>

                    <!--/显示&&修改手机-->
                    
                    <!--显示&&修改Email-->
                    <div class="email">
                        <h4><span class="title">绑定邮箱</span><a   class="modify js-modify" id="divEmail_fy">修改</a></h4>                   
                        <div class="displays" id="divEmail">
                            <p>
                                <label class="infoname">邮箱：</label>
                                <span class="descext" id="show_mail">349959253@qq.com</span> 
                                <span class="note">可用于密码找回，请妥善保管</span> 
                            </p>
                        </div>
                        <div style="display:none" class="modifydiv" id="divChangeEmail">
                                 <div class="pub-form">
                                 <form id="form3">
                                    <div class="fm-item pbot-15">
                                      <span class="fm-label"><label for="">邮箱</label></span>
                                         <input type="hidden" value="349959253@qq.com" id="mailCheck"/>
                                         <input type="text" value="349959253@qq.com" name="mail" id="mail" class="i-input w200">
                                          <div class="msg-box">
                                                <div id="mailTip" class="msg-weak msg-attention"><i></i>
                                                    <label class="valid">请输入邮箱</label>
                                                </div>
                                           </div>
                                     </div>
                                   <div class="fm-item pbot-15">
                                          <span class="fm-label"><label for="txt_Name6"></label></span>
                                          <a id="submit3" class="button_ok" >确 定</a><a id="cancEmail" class="button_canc" >取 消</a>
                                   </div> 
                                   </form>
                         	 </div>
                            </form>
                        </div>
                    </div>
                    <!--/显示&&修改Email-->
                </div>
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