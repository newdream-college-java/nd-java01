<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

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
	您现在的位置：<a href="index.jsp">易买网</a> &gt; 在线留言
</div>
<div id="main" class="wrap">
	<div class="lefter">
		<div class="box">
		  <h2>商品分类</h2>
			<dl>
				<dt>图书音像</dt>
				<dd><a href="product-list.jsp">图书</a></dd>
				<dd><a href="product-list.jsp">音乐</a></dd>
				<dt>百货</dt>
				<dd><a href="product-list.jsp">运动健康</a></dd>
				<dd><a href="product-list.jsp">服装</a></dd>
				<dd><a href="product-list.jsp">家居</a></dd>
				<dd><a href="product-list.jsp">美妆</a></dd>
				<dd><a href="product-list.jsp">母婴</a></dd>
				<dd><a href="product-list.jsp">食品</a></dd>
				<dd><a href="product-list.jsp">手机数码</a></dd>
				<dd><a href="product-list.jsp">家具首饰</a></dd>
				<dd><a href="product-list.jsp">手表饰品</a></dd>
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
		<div class="guestbook">
			<h2>全部留言</h2>
			<ul>
				<li>
					<dl>
						<dt>那个什么衣服贵吗</dt>
						<dd class="author">网友：张三丰 <span class="timer">2010:10:10 20:00:01</span></dd>
						<dd>不贵</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt>那个什么衣服贵吗</dt>
						<dd class="author">网友：张三丰 <span class="timer">2010:10:10 20:00:01</span></dd>
						<dd>不贵</dd>
					</dl>
				</li>
				<li>
					<dl>
						<dt>那个什么衣服贵吗</dt>
						<dd class="author">网友：张三丰 <span class="timer">2010:10:10 20:00:01</span></dd>
						<dd>不贵</dd>
					</dl>
				</li>
			</ul>
			<div class="clear"></div>
			<div class="pager">
				<ul class="clearfix">
					<li><a href="#">上一页</a></li>
					<li class="current">1</li>
					<li><a href="#">2</a></li>
					<li><a href="#">3</a></li>
					<li><a href="#">4</a></li>
					<li><a href="#">5</a></li>
					<li><a href="#">下一页</a></li>
				</ul>
			</div>
			<div id="reply-box">
				<form id="regForm" action="" method="post" onsubmit="return checkForm(this)">
					<table>
						<tr>
							<td class="field">昵称：</td>
							<td><input class="text" type="text" name="guestName" onfocus="FocusItem(this)" onblur="CheckItem(this);"  /><span></span></td>
						</tr>
						<tr>
							<td class="field">留言内容：</td>
							<td><textarea name="guestContent" onfocus="FocusItem(this)" onblur="CheckItem(this);"></textarea><span></span></td>
						</tr>
						<tr>
							<td></td>
							<td><label class="ui-blue"><input type="submit" name="submit" value="提交留言" /></label></td>
						</tr>
					</table>
				</form>
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