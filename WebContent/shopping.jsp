<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="common/taglib.jsp"%>
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
<div id="position" class="wrap">
    您现在的位置：<a href="index.html">易买网</a> &gt; 购物车
</div>
<div class="wrap">
    <div id="shopping">
        <form action="shopping-result.html">
            <table>
                <tr>
                    <th width="584">商品名称</th>
                    <th width="136">商品价格</th>
                    <th width="161">购买数量</th>
                    <th width="59">操作</th>
                </tr>
                  <c:forEach items="${car }" var="pro">
		                <tr id="price_id_1">
		                    <td class="thumb"><img src="images/product/${pro.epFileName }" /><a href="product-view.html">${pro.epName }</a></td>
		                    <td class="price" id="price_id_1">
		                        <span>￥ ${pro.epPrice }</span>
		                        <input type="hidden" value="${pro.epPrice}" />
		                    </td>
		                    <td class="number">
		                        <dl>
		                            <dt><input id="number_id_1" type="text" name="number" value="${pro.count }" disabled="disabled"/></dt>
		                            <dd onclick="reloadPrice(1,true,${pro.epStock});">+</dd>
		                            <dd onclick="reloadPrice(1,false,${pro.epStock});">-</dd>
		                        </dl>
		                    </td>
		                    <td class="delete"><a href="javascript:delShopping(1);">删除</a></td>
		                </tr>
                </c:forEach>
            </table>
            <div class="button"><input type="submit" value="" /></div>
        </form>
    </div>
    <script type="text/javascript">     
    </script>
</div>
<div id="footer">
    Copyright &copy; 2016 湖南软测信息技术有限公司 All Rights Reserved. 湘ICP证1001号
</div>
</body>
</html>