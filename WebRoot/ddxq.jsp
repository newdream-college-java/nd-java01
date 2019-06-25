<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>阿拉亲子</title>

<meta name="description" content="" />

<meta name="keywords" />

<link href="Content/ddxq.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/public.js"></script>
<link href="Content/base.css" rel="stylesheet" type="text/css" />

</head>

<body style="background:#f9f9f9;">

<div class="logBox">
		<div class="login">
			<div class="siderNav">
				<ul class="topmenu" id="jq_topmenu">
                <li class="first"><a href="IndexShowServlet">首页</a>|<a>关于我们</a></li>
              
				</ul>
			</div>
		</div>
</div>
<div class="main">
    <div class="search-box">
	 	<form class="search-form"  id="search-form">
	 		<input type="text" class="search-text br" id="search_input" autocomplete="off" placeholder="搜索"/>
	 		<input type="submit" class="search-button br" value=""/>
	 	</form>
        <div class="c"></div>
        </div>
<div class="demo">
		
		<div class="demo-left">
        <div class="demo-left-top">
        <h3>订单详情</h3>
        </div>
        	<ul>
            <li class="dd_zl.jsp"><a >我的资料</a></li>
            <li class=""><a href="myorderListServlet">我的订单</a></li>
            <li class=""><a >意见反馈</a></li>		
            </ul>
        	</div>
        <div class="demo-right">
        <h2>订单详情</h2>
            <div class="demo-right-tb">
                <div class="demo-right-th">
                    <p>${Dtlist[0].pcnpctthemename }<span><img src="Picture/sc_03.jpg" /></span></p>
                </div>
                <div class="demo-right-tr">
                	<p class="demo-right-s1">目的地：${Dtlist[0].pcnpctsite}</p>
                    <p class="demo-right-s2">联系人信息</p>
                    <div style="clear:both;"></div>
                </div>
                <div style="clear:both;"></div>
                <div class="demo-right-tr">
                	<p class="demo-right-s1">出行方式：<c:if test="${Dtlist[0].pcnpcttripmode==1}">自驾</c:if><c:if test="${Dtlist[0].pcnpcttripmode==2}">跟团</c:if> </p>
                    <p class="demo-right-s2">姓名：${Dtlist[0].pcnptlinkmanname}</p>
                    <div style="clear:both;"></div>
                </div>
                <div style="clear:both;"></div>
                <div class="demo-right-tr">
                	<p class="demo-right-s1">订购信息：<c:forEach var="dtlist" items="${Dtlist}">
                		${dtlist.pcngsname}，${dtlist.pcnptquantity}人，￥${dtlist.pcngsvvalue}/人<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;								</c:forEach> </p>

                    <p class="demo-right-s2">手机号：${Dtlist[0].pcnptlinkmannumber}</p>
                    <div style="clear:both;"></div>
                </div>
                <div style="clear:both;"></div>
                <div class="demo-right-tr">
                	<p class="demo-right-s1" style="text-indent:80px;"></p>
                    <p class="demo-right-s2">备注：${Dtlist[0].pcnptremark}</p>
                    <div style="clear:both;"></div>
                </div>
                <div class="demo-right-tr">
                	<p class="demo-right-s1 demo-right-last1">
                    	<span>实际付款：￥<b>${Dtlist[0].pcnptorderamount}</b></span>
                    </p>
                    <p class="demo-right-s2 demo-right-last2"></p>
                    <div style="clear:both;"></div>
                </div>
            </div>
        </div>
            <div style="clear:both;"></div>
        </div>
     
</div>

</div>


<div class="footer-b">
        	<<ul>
            	<li><a href="IndexShowServlet.java">首页</a></li>
                <li><a href="ParentChildThemeActivityShowServlet">亲子活动</a></li>
                <li><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
                <li><a href="ActivityDisplayShowServlet">区域活动</a></li>
                <li><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
                <li><a href="ActivityDisplayShowServlet">活动展示</a></li>
                <div style="clear:both;"></div>
            </ul>
            <p>	COPYRIGHT&nbsp;&nbsp;&nbsp;2015-2016&nbsp;&nbsp;&nbsp;版权所有：阿拉亲子&nbsp;浙IPC备14003668号-2</p>
        </div>


</body>
</html>
