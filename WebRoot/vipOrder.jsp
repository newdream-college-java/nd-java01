<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>会员订单</title>
<link type="text/css" href="Content/css.css" rel="stylesheet" />
<script type="text/javascript" src="Scripts/jquery.js"></script>
<script type="text/javascript" src="Scripts/js.js"></script>
<script src="Scripts/wb.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">
 $(function(){
	 $(".vipNav dd:first").show();
	 })
</script>
</head>

<body>
 <div class="mianCont">
  <div class="top">
   <span>您好！欢迎来到17商城 请&nbsp;<a href="login.jsp">[登录]</a>&nbsp;<a href="reg.jsp">[注册]</a></span>
   <span class="topRight">
    <a href="vip.jsp">我的17</a>&nbsp;| 
    <a href="order.jsp">我的订单</a>&nbsp;| 
    <a href="login.jsp">会员中心</a>&nbsp;|
    <a href="contact.jsp">联系我们</a>
   </span>
  </div><!--top/-->
  <div class="lsg">
   <h1 class="logo"><a href="index.jsp"><img src="Picture/logo.png" width="217" height="90" /></a></h1>
   <form action="#" method="get" class="subBox">
    <div class="subBoxDiv">
     <input type="text" class="subLeft" />
     <input type="image" src="images/subimg.png" width="63" height="34" class="sub" />
     <div class="hotWord">
      热门搜索：
      <a href="proinfo.jsp">冷饮杯</a>&nbsp;
      <a href="proinfo.jsp">热饮杯</a> &nbsp;
      <a href="proinfo.jsp">纸杯</a>&nbsp;
      <a href="proinfo.jsp">纸巾</a>  &nbsp;
      <a href="proinfo.jsp">纸巾</a> &nbsp;
      <a href="proinfo.jsp">纸杯</a>&nbsp;
     </div><!--hotWord/-->
    </div><!--subBoxDiv/-->
   </form><!--subBox/-->
   <div class="gouwuche">
    <div class="gouCar">
     <img src="Picture/gouimg.png" width="19" height="20" style="position:relative;top:6px;" />&nbsp;|&nbsp;
     <strong class="red">0</strong>&nbsp;件&nbsp;|
     <strong class="red">￥ 0.00</strong> 
     <a href="order.jsp">去结算</a> <img src="Picture/youjian.jpg" width="5" height="8" />    
    </div><!--gouCar/-->
    <div class="myChunlv">
     <a href="vip.jsp"><img src="Picture/mychunlv.jpg" width="112" height="34" /></a>
    </div><!--myChunlv/-->
   </div><!--gouwuche/-->
  </div><!--lsg/-->
  <div class="pnt">
   <div class="pntLeft">
    <h2 class="Title">所有商品分类
     <ul class="InPorNav">
     <li><a href="product.jsp">纸杯系列</a>
      <div class="chilInPorNav">
       <a href="#">单层热饮杯</a>
       <a href="#">双层中空杯</a>
       <a href="#">瓦楞隔热杯</a>
       <a href="#">双淋膜冷饮杯</a>
       <a href="#">爆米花桶</a>
       <a href="#">纸碗</a>
       <a href="#">冰淇淋纸杯</a>
       <a href="#">PS杯盖</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">PET系列</a>
      <div class="chilInPorNav">
       <a href="#">PET透明杯</a>
       <a href="#">PET透明盖</a>
       <a href="#">PET透明沙拉盒</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">饮品杯配套系列</a>
      <div class="chilInPorNav">
       <a href="#">杯袖</a>
       <a href="#">环保纸浆杯托</a>
       <a href="#">纸杯打包袋</a>
       <a href="#">吸管</a>
       <a href="#">搅拌棒</a>
       <a href="#">杯盖</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">纸浆环保餐具系列</a>
      <div class="chilInPorNav">
       <a href="#">纸碟</a>
       <a href="#">纸碗</a>
       <a href="#">纸浆带盖汤碗</a>
       <a href="#">连体餐盒</a>
       <a href="#">分体餐盒</a>
       <a href="#">纸浆沙拉盒</a>
       <a href="#">纸托盘</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">纸餐盒系列</a>
      <div class="chilInPorNav">
       <a href="#">圆底纸餐盒</a>
       <a href="#">方底纸餐盒</a>
       <a href="#">三明治纸盒</a>
       <a href="#">蛋糕盒</a>
       <a href="#">其他纸餐盒</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">刀叉勺餐具</a>
      <div class="chilInPorNav">
       <a href="#">PS刀叉勺系列</a>
       <a href="#">PLA刀叉勺系列</a>
       <a href="#">淀粉刀叉勺系列</a>
       <a href="#">搅拌棒/吸管</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">生活用纸</a>
      <div class="chilInPorNav">
       <a href="#">餐巾纸</a>
       <a href="#">抽纸</a>
       <a href="#">卫生纸</a>
       <a href="#">擦手纸</a>
       <a href="#">其他纸类</a>
      </div><!--chilLeftNav/-->
     </li>
     <li><a href="product.jsp">纸袋/环保打包袋</a>
      <div class="chilInPorNav">
       <a href="#">纸袋</a>
       <a href="#">环保淀粉塑料袋</a>
       <a href="#">PLA塑料袋</a>
       <a href="#">食品袋</a>
      </div><!--chilLeftNav/-->
     </li>
    </ul><!--InPorNav/-->
    </h2>
   </div><!--pntLeft/-->
   <div class="pntRight">
    <ul class="nav">
     <li><a href="index.jsp">商城首页</a></li>
     <li><a href="product.jsp">促销中心</a></li>
     <li><a href="login.jsp">会员中心</a></li>
     <li><a href="help.jsp">帮助中心</a></li>
     <div class="clears"></div>
     <div class="phone">TEL：021-12345678</div>
    </ul><!--nav/-->
   </div><!--pntRight/-->
   <div class="clears"></div>
  </div><!--pnt/-->
  <div class="positions">
   当前位置：<a href="index.jsp">首页</a> &gt; <a href="vip.jsp">会员中心</a>
    &gt; <a href="#" class="posCur">我的订单</a>
  </div><!--positions/-->
  <div class="cont">
   <div class="contLeft" id="contLeft">
    <h3 class="leftTitle">会员中心</h3>
    <dl class="helpNav vipNav">
     <dt>我的主页</dt>
      <dd>
       <a href="vip.jsp">个人中心</a>
       <a href="vipOrder.jsp" class="vipCur">我的订单</a>
      </dd>
     <dt>账户设置</dt>
      <dd>
       <a href="vipMy.jsp">个人信息</a>
       <a href="vipPwd.jsp">密码修改</a>
       <a href="vipAdress.jsp">收货地址</a>
      </dd>
      <dt>客户服务</dt>
       <dd>
        <a href="vipExit.jsp">网站使用条款</a>
        <a href="vipTuihuo.jsp">网站免责声明</a>
        <a href="message.jsp">在线留言</a>
       </dd>
      
      
    </dl><!--helpNav/-->
   </div><!--contLeft/-->
   <div class="contRight">
    <h1 class="vipName"><span>用户名：</span>纯小绿先森</h1>
    <h2 class="oredrName">
    我的订单 <span style="margin-left:40px;">待发货 <span class="red">10</span> </span>
    <span>待收货 <span class="red">15</span></span>
    </h2>
    <table class="vipOrder">
     <tr>
      <td><a href="proinfo.jsp"><img src="Picture/rdpro4.jpg" width="60" height="55"></a></td>
      <td>张益达</td>
      <td>￥16.9<br />支付宝支付</td>
      <td>2014年6月23日11:32:17</td>
      <td><a href="success.jsp"><strong>等待付款</strong></a></td>
      <td><a href="orderDetails.jsp">查看</a></td>
     </tr>
     <tr>
      <td><a href="proinfo.jsp"><img src="Picture/rdpro3.jpg" width="60" height="55"></a></td>
      <td>张益达</td>
      <td>￥16.9<br />支付宝支付</td>
      <td>2014年6月23日11:32:17</td>
      <td><a href="success.jsp"><strong>等待付款</strong></a></td>
      <td><a href="orderDetails.jsp">查看</a></td>
     </tr>
     <tr>
      <td><a href="proinfo.jsp"><img src="Picture/rdpro2.jpg" width="60" height="55"></a></td>
      <td>张益达</td>
      <td>￥16.9<br />支付宝支付</td>
      <td>2014年6月23日11:32:17</td>
      <td><a href="success.jsp"><strong>等待付款</strong></a></td>
      <td><a href="orderDetails.jsp">查看</a></td>
     </tr>
     <tr>
      <td><a href="proinfo.jsp"><img src="Picture/rdpro1.jpg" width="60" height="55"></a></td>
      <td>张益达</td>
      <td>￥16.9<br />支付宝支付</td>
      <td>2014年6月23日11:32:17</td>
      <td><a href="success.jsp"><strong>等待付款</strong></a></td>
      <td><a href="orderDetails.jsp">查看</a></td>
     </tr>
     <tr>
      <td><a href="proinfo.jsp"><img src="Picture/rdpro5.jpg" width="60" height="55"></a></td>
      <td>张益达</td>
      <td>￥16.9<br />支付宝支付</td>
      <td>2014年6月23日11:32:17</td>
      <td><a href="success.jsp"><strong>等待付款</strong></a></td>
      <td><a href="orderDetails.jsp">查看</a></td>
     </tr>
    </table><!--vipOrder/-->
    <br />
    <div class="scott"><span class="disabled"> < </span><span class="current">1</span><a href="#?page=2">2</a><a href="#?page=3">3</a><a href="#?page=4">4</a><a href="#?page=5">5</a><a href="#?page=6">6</a><a href="#?page=7">7</a>...<a href="#?page=199">199</a><a href="#?page=200">200</a><a href="#?page=2"> > </a></div>
    <br />
   </div><!--contRight/-->
   <div class="clears"></div>
  </div><!--cont/-->
  <div class="inHelp">
   <div class="inHLeft">
    <h4>帮助中心</h4>
    <ul class="inHeList">
     <li><a href="help.jsp">购物指南</a></li>
     <li><a href="help.jsp">支付方式</a></li>
     <li><a href="help.jsp">售后服务</a></li>
     <li><a href="about.jsp">企业简介</a></li>
     <div class="clears"></div>
    </ul><!--inHeList/-->
   </div><!--inHLeft/-->
   <div class="inHLeft">
    <h4>会员服务</h4>
    <ul class="inHeList">
     <li><a href="reg.jsp">会员注册</a></li>
     <li><a href="login.jsp">会员登录</a></li>
     <li><a href="order.jsp">购物车</a></li>
     <li><a href="order.jsp">我的订单</a></li>
     <div class="clears"></div>
    </ul><!--inHeList/-->
   </div><!--inHLeft/-->
   <div class="inHRight">
    <h4>全国统一免费服务热线</h4>
    <div class="telBox">400-8000-0000</div>
    <div class="weibo">
    <wb:follow-button uid="2991975565" type="red_1" width="67" height="24" ></wb:follow-button>
    </div>
   </div><!--inHRight/-->
   <div class="clears"></div>
  </div><!--inHelp/-->
  <div class="footer">
   <p>
   <a href="#">进入17官网</a>&nbsp;|&nbsp;
   <a href="index.jsp">商城首页</a>&nbsp;|&nbsp;
   <a href="product.jsp">促销中心</a>&nbsp;|&nbsp;
   <a href="order.jsp">我的订单</a>&nbsp;|&nbsp;
   <a href="new.jsp">新闻动态</a>&nbsp;|&nbsp;
   <a href="login.jsp">会员中心</a>&nbsp;|&nbsp;
   <a href="help.jspl">帮助中心</a>
   </p>
   <p>
    版权所有：上海17实业有限公司 版权所有  Copyright 2010-2015   沪ICP备10213975号   技术支持：<a href="http://www.webqin.net/" target="_blank">秦王网络</a>
   </p>
  </div><!--footer/-->
 </div><!--mianCont/-->
 <a href="#" class="backTop">&nbsp;</a>
</body>
</html>
