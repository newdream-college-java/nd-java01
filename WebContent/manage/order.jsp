<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="../common/taglib.jsp" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
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
            <li class="current"><a href="order.html">订单</a></li>
            <li><a href="guestbook.html">留言</a></li>
            <li><a href="news.html">新闻</a></li>
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
    <%@include file="../common/manage-left.jsp" %>
    <div class="main">
        <h2>订单管理</h2>
        <div class="manage">
            <div class="search">
                <form method="post" action="${basePath}/manage/listOrderConditionSvl">
                    订单号：<input type="text" class="text" name="orderId" /> 
                    订货人：<input type="text" class="text" name="userName" /> 
                    <label class="ui-blue">
                    <input type="submit" name="submit" value="查询" />
                    </label>
                </form>
            </div>
            <div class="spacer"></div>
            <table class="list">
                <tr>
                    <th>ID</th>
                    <th>姓名</th>
                    <th>发货地址</th>
                    <th>状态</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${ordersVo}" var="ov">
                <tr>
                    <td class="first w4 c">${ov.eoId }</td>
                    <td class="w1 c">${ov.eoUserName}</td>
                    <td>${ov.eoUserAddress}</td>
                    <td class="w1 c">${ov.eoStutsView }</td>
                    <td class="w1 c"><a href="order-modify.html">修改</a> <a href="javascript:Delete(1);">删除</a></td>
                </tr>
               </c:forEach>
            </table>
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
        </div>
    </div>
    <div class="clear"></div>
</div>
<div id="footer">
    Copyright &copy; 2016 湖南软测信息技术有限公司 All Rights Reserved. 湘ICP证1001号
</div>
</body>
</html>