<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../common/taglib.jsp" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>后台管理 - 易买网</title>
<link type="text/css" rel="stylesheet" href="../css/style.css" />
<script type="text/javascript" src="../scripts/function-manage.js"></script>
</head>
<body>
<div id="header" class="wrap">
    <div id="logo"><img src="../images/logo.gif" /></div>
    <div class="help"><a href="../index.html">返回前台页面</a></div>
    <div class="navbar">
        <ul class="clearfix">
            <li><a href="index.html">首页</a></li>
            <li><a href="user.html">用户</a></li>
            <li><a href="product.html">商品</a></li>
            <li><a href="order.html">订单</a></li>
            <li><a href="guestbook.html">留言</a></li>
            <li class="current"><a href="news.html">新闻</a></li>
        </ul>
    </div>
</div>
<div id="childNav">
    <div class="welcome wrap">
        管理员pillys您好，今天是2012-12-21，欢迎回到管理后台。
    </div>
</div>
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; 管理后台
</div>
<div id="main" class="wrap">
    <div id="menu-mng" class="lefter">
        <div class="box">
            <dl>
                <dt>用户管理</dt>
                <dd><em><a href="user-add.html">新增</a></em><a href="user.html">用户管理</a></dd>
                <dt>商品信息</dt>
                <dd><em><a href="productClass-add.html">新增</a></em><a href="productClass.html">分类管理</a></dd>
                <dd><em><a href="product-add.html">新增</a></em><a href="product.html">商品管理</a></dd>
                <dt>订单管理</dt>
                <dd><a href="order.html">订单管理</a></dd>
                <dt>留言管理</dt>
                <dd><a href="guestbook.html">留言管理</a></dd>
                <dt>新闻管理</dt>
                <dd><em><a href="news-add.html">新增</a></em><a href="news.html">新闻管理</a></dd>
            </dl>
        </div>
    </div>
    <div class="main">
        <h2>新闻管理</h2>
        <div class="manage">
            <table class="list">
                <tr>
                    <th>ID</th>
                    <th>新闻标题</th>
                    <th>操作</th>
                </tr>
               <c:forEach items="${news}" var="nw">
                <tr>
                    <td class="first w4 c">${nw.enId }</td>
                    <td>${nw.enTitle}</td>
                    <td class="w1 c"><a href="news-modify.html">修改</a> <a href="javascript:Delete(1);">删除</a></td>
                </tr>
                </c:forEach>
               
            </table>
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2016 湖南软测信息技术有限公司 All Rights Reserved. 湘ICP证1001号
</div>
</body>
</html>
    