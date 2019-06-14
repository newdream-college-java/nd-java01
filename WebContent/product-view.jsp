<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="common/taglib.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>易买网 - 首页</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js">
var basePath = "${basePath}";
</script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="images/logo.gif" /></div>
    <div class="help"><a href="#" class="shopping">购物车</a><a href="login.html">登录</a><a href="register.html">注册</a><a href="guestbook.html">留言</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li class="current"><a href="#">首页</a></li>
            <li><a href="#">图书</a></li>
            <li><a href="#">百货</a></li>
            <li><a href="#">品牌</a></li>
            <li><a href="#">促销</a></li>
        </ul>
    </div>
</div>
<div id="childNav">
    <div class="wrap">
        <ul class="clearfix">
            <li class="first"><a href="#">音乐</a></li>
            <li><a href="#">影视</a></li>
            <li><a href="#">少儿</a></li>
            <li><a href="#">动漫</a></li>
            <li><a href="#">小说</a></li>
            <li><a href="#">外语</a></li>
            <li><a href="#">数码相机</a></li>
            <li><a href="#">笔记本</a></li>
            <li class="last"><a href="#">Investor Relations</a></li>
        </ul>
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; <a href="product-list.html">图书音像</a> &gt; 图书
</div>
<div id="main" class="wrap">
    <div class="lefter">
        <div class="box">
          <h2>商品分类</h2>
            <dl>
                <dt>图书音像</dt>
                <dd><a href="product-list.html">图书</a></dd>
                <dd><a href="product-list.html">音乐</a></dd>
                <dt>百货</dt>
                <dd><a href="product-list.html">运动健康</a></dd>
                <dd><a href="product-list.html">服装</a></dd>
                <dd><a href="product-list.html">家居</a></dd>
                <dd><a href="product-list.html">美妆</a></dd>
                <dd><a href="product-list.html">母婴</a></dd>
                <dd><a href="product-list.html">食品</a></dd>
                <dd><a href="product-list.html">手机数码</a></dd>
                <dd><a href="product-list.html">家具首饰</a></dd>
                <dd><a href="product-list.html">手表饰品</a></dd>
            </dl>
        </div>
        <div class="spacer"></div>
        <div class="last-view">
            <h2>最近浏览</h2>
            <dl class="clearfix">
                <dt><img src="images/product/0_tiny.gif" /></dt>
                <dd><a href="product-view.html">法国德菲丝松露精品巧克力500g/盒</a></dd>
                <dt><img src="images/product/0_tiny.gif" /></dt>
                <dd><a href="product-view.html">法国德菲丝松露精品巧克力500g/盒</a></dd>
            </dl>
        </div>
    </div>
    <div id="product" class="main">
        <h1>${pro.epName }</h1>
        <div class="infos">
            <div class="thumb"><img src="${basePath}/images/product/${pro.epFileName}"  width="296px" height="313px"/></div>
            <div class="buy">
                <p>商城价：<span class="price">￥${pro.epPrice }</span></p>
               
                <c:if test="${ pro.epStock>0}">
                 <p>库　存：有货(库存 ${ pro.epStock}件)           </p>
                </c:if>
                <c:if test="${ pro.epStock<=0}">
                 <p>库　存：<font color="red">无货  </font>       </p>
                </c:if>
                
              <div class="button"><input type="button" name="button"  onclick="addOrderSvl(${pro.epId})"/><a href="#">放入购物车</a></div>
            </div>
            <div class="clear"></div>
        </div>
        <div class="introduce">
            <h2><strong>商品详情</strong></h2>
            <div class="text">
                ${pro.epDescription }<br />
            </div>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2016 湖南软测信息技术有限公司 All Rights Reserved. 湘ICP证1001号
</div>
</body>
</html>