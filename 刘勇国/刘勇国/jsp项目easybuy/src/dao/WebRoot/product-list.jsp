<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
	<div class="help"><a href="#" class="shopping">购物车</a><a href="login.jsp">登录</a><a href="register.jsp">注册</a><a href="guestbook.jsp">留言</a></div>
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
	您现在的位置：<a href="index.jsp">易买网</a> &gt; 图书音像 &gt; 图书
</div>
<div id="main" class="wrap">
	<div class="lefter">
		<div class="box">
		  <h2>商品分类</h2>
			<dl>
				<dt>图书音像</dt>
				<dd><a href="DoGoodList">图书</a></dd>
				<dd><a href="DoGoodList">音乐</a></dd>
				<dt>百货</dt>
				<dd><a href="DoGoodList">运动健康</a></dd>
				<dd><a href="DoGoodList">服装</a></dd>
				<dd><a href="DoGoodList">家居</a></dd>
				<dd><a href="DoGoodList">美妆</a></dd>
				<dd><a href="DoGoodList">母婴</a></dd>
				<dd><a href="DoGoodList">食品</a></dd>
				<dd><a href="DoGoodList">手机数码</a></dd>
				<dd><a href="DoGoodList">家具首饰</a></dd>
				<dd><a href="DoGoodList">手表饰品</a></dd>
			</dl>
		</div>
		<div class="spacer"></div>
			
		
			
		<div class="last-view">
			<h2>最近浏览</h2>
			<dl class="clearfix">
				<dt><img src="images/product/0_tiny.gif" /></dt>
				<dd><a href="product-view.jsp">法国德菲丝松露精品巧克力500g/盒</a></dd>
				<dt><img src="images/product/0_tiny.gif" /></dt>
				<dd><a href="product-view.jsp">法国德菲丝松露精品巧克力500g/盒</a></dd>
			</dl>
		</div>
	</div>
	<div class="main">
		<div class="product-list">
			<h2>全部商品</h2>
			<div class="pager">
				<ul class="clearfix">
					<c:if test="${curPage>1}">
					<li><a href="DoGoodList?curPage=${curPage-1}">上一页</a></li>
					</c:if>
					<c:if test="${curPage<=1}">
					
					</c:if>
					
					<li class="current"><a href="DoGoodList?curPage=1">1</a></li>
					<li><a href="DoGoodList?curPage=2">2</a></li>
					<li><a href="DoGoodList?curPage=3">3</a></li>
					<li><a href="DoGoodList?curPage=4">4</a></li>
					<li><a href="DoGoodList?curPage=5">5</a></li>
					<c:if test="${curPage<5}">
					<li><a href="DoGoodList?curPage=${curPage+1}">下一页</a></li></c:if>
					<c:if test="${curPage>=5}"></c:if>
				</ul>
			</div>
			<div class="clear"></div>
			<ul class="product clearfix">
				<%-- <li>
					<c:forEach var="a" items="${list}"><img src="${a.picturePath}" /> <P>${a.pictureTitle }<br/>${a.picturePrice}</p></c:forEach>
				
				
				</li>--%>
				<c:forEach var="a" items="${list}">
	 			<li>
					<dl>
						<dt><a href="DoProductView?id=${a.productViewId}" target="_blank"><img src="${a.picturePath}" /></a></dt>
						<dd class="title"><a href="DoProductView?id=${a.productViewId}" target="_blank">${a.pictureTitle }</a></dd>
						<dd class="price">￥${a.picturePrice}</dd>
						<dd class="price">${a.productViewId}</dd>
					</dl>
				</li>
				</c:forEach>
			</ul>
			<div class="clear"></div>
			<div class="pager">
				<ul class="clearfix">
					
					<c:if test="${curPage>1}">
					<li><a href="DoGoodList?curPage=${curPage-1}">上一页</a></li>
					</c:if>
					<c:if test="${curPage<=1}">
					
					</c:if>
					
					<li class="current"><a href="DoGoodList?curPage=1">1</a></li>
					<li><a href="DoGoodList?curPage=2">2</a></li>
					<li><a href="DoGoodList?curPage=3">3</a></li>
					<li><a href="DoGoodList?curPage=4">4</a></li>
					<li><a href="DoGoodList?curPage=5">5</a></li>
					<c:if test="${curPage<5}">
					<li><a href="DoGoodList?curPage=${curPage+1}">下一页</a></li></c:if>
					<c:if test="${curPage>=5}"></c:if>
					
					
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
