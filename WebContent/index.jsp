<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@include file="common/taglib.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>易买网 - 首页</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="scripts/function.js"></script>
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
<div id="main" class="wrap">
    <div class="lefter">
        <div class="box">
          <h2>商品分类</h2>
            <dl>
                <dt>图书音像</dt>
                <dd><a href="product-list.html">图书</a></dd>
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
    <div class="main">
        <div class="price-off">
            <h2>商品列表</h2>
            <ul class="product clearfix">
                <c:forEach items="${pros}"  var="pro">
                <li>
                    <dl>
                        <dt><a href="findProductSvl?pid=${pro.epId}" target="_blank"><img src="${basePath}/images/product/${pro.epFileName}" /></a></dt>
                        <dd class="title"><a href="product-view.html" target="_blank">${pro.epName}</a></dd>
                        <dd class="price">￥${pro.epPrice}</dd>
                    </dl>
                </li>
                </c:forEach>
            </ul>
            
            <div class="pager">
 
             <ul class="clearfix">
                        <li class="current">1</li>
                        <li><a href="#">2</a></li>
            </ul>
            </div>
            
        </div>
  <div class="side">
            <div class="spacer"></div>
            <div class="news-list">
                <h4>新闻动态</h4>
                <ul>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>
                    <li><a href="news-view.html" target="_blank">抢钱啦</a></li>                                        
                </ul>

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
    