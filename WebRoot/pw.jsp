<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>

<link rel="stylesheet" href="Content/pw.css" type="text/css" />
<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script type="text/javascript" src="Scripts/jquery.superslide.2.1.1.js"></script>
<script type="text/javascript" src="Scripts/public.js"></script>
</head>

<body>
	
	<div id="web">	
		
<div class="topall">
	<div class="top-line">
    <div class="top-line-box">
    <c:if test="${list[0].pcnuName!=null}">
   		<a href="SignoutServlet">退出登录</a>
	   	<a href="dd_zl.jsp?">${list[0].pcnuName}</a>
   	</c:if>
   	<c:if test="${list[0].pcnuName==null}">
    <a href="denglu.jsp">登录</a><a class="top-line-a-on" href="zhuce.jsp">注册</a>
    	</c:if>
    <form class="search-form"  id="search-form" action="SearchServlet" method="post">
		<input type="text" class="search-text" name="name" id="search_input" autocomplete="off" placeholder="请输入搜索关键字" value="${name}"/>
		<input type="submit" class="search-button" value=""/>
	</form>
        </div>
    </div>
    <div  style="clear:both;"></div>
  <div class="top">
  <img src="Picture/denglu_02.jpg" />
  <img src="Picture/index_03.jpg" style="float:right;" />
  </div>
</div>
<div class="nav">
  <ul>
   <li ><a href="IndexShowServlet">首页</a></li>
    <li><a href="ParentChildThemeActivityShowServlet">亲子活动</a></li>
    <li><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
    <li  class="wbg"><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
    <li ><a href="ActivityDisplayShowServlet">活动展示</a></li>
    <li><a>关于我们</a></li>
  </ul>
</div>
		
		<div class="main">
                 <div style=" clear:both;"></div>
			<div class="qzhd">
            <div class="qzhd-back">阿拉亲子&gt;票务</div>
				   <div class="qzhd-all">
                  <h2>您已选择：<span>共有<i>${count }</i>条活动信息</span></h2>
                <div class="qzhd-all-d" ><p>区域：</p>
                  
                  <a <c:if test="${city==null}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=${activity}&curday=${day}&names=${name}">全部</a>
                  <a <c:if test="${city=='天心区'}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=天心区&activity=${activity}&curday=${day}&names=${name}">天心区</a>
                  <a <c:if test="${city=='望城区'}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=望城区&activity=${activity}&curday=${day}&names=${name}">望城区</a>
                  <a <c:if test="${city=='岳麓区'}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=岳麓区&activity=${activity}&curday=${day}&names=${name}">岳麓区</a>
                  <a <c:if test="${city=='雨花区'}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=雨花区&activity=${activity}&curday=${day}&names=${name}">雨花区</a>
                  <a <c:if test="${city=='星沙区'}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=星沙区&activity=${activity}&curday=${day}&names=${name}">星沙区</a>                 
                  </div>
                  <div class="qzhd-all-d" ><p>商家活动：</p>
                  <a <c:if test="${activity==null}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?city=${city}&curday=${day}&names=${name}">全部</a>
                  <a <c:if test="${activity==1}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=1&city=${city}&curday=${day}&names=${name}">户外亲子</a>
                  <a <c:if test="${activity==2}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=2&city=${city}&curday=${day}&names=${name}">室内亲子</a>
                  <a <c:if test="${activity==3}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=3&city=${city}&curday=${day}&names=${name}">亲子DIY</a>
                  <a <c:if test="${activity==4}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=4&city=${city}&curday=${day}&names=${name}">农家乐采摘</a>
                  <a <c:if test="${activity==5}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?activity=5&city=${city}&curday=${day}&names=${name}">儿童剧</a></div>
                  <div  class="qzhd-all-d"><p>时间：</p>
                  <a <c:if test="${day==null}"> class="all-p-a"</c:if>  href="ParentChildThemeTicketingShowServlet?activity=${activity}&city=${city}&names=${name}">全部</a>
                  <a <c:if test="${day==1}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?curday=1&activity=${activity}&city=${city}&curday=${day}&names=${name}">今天</a>
                  <a <c:if test="${day==2}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?curday=2&activity=${activity}&city=${city}&curday=${day}&names=${name}">最近一周</a>
                  <a <c:if test="${day==3}"> class="all-p-a"</c:if> href="ParentChildThemeTicketingShowServlet?curday=3&activity=${activity}&city=${city}&curday=${day}&names=${name}">网期活动</a>
                  </div>
                    
                    
                    <ul class="pw-main" >
                    <c:forEach var="pcttsList" items="${pcttsList }" varStatus="status">
               			<c:if test="${(status.index-1)%3!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index-1)%3==0}">					
							<li style="margin:0px 10px">									
						</c:if>
						<a href="ParentChildThemeParticularsShowServlet?pctid=${pcttsList.pcnpctId}">
						<img src="${pcttsList.imgUrl}"  width="322" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>${pcttsList.pcnThemeName}</p>
                                    <a><b>￥</b>${pcttsList.adultPrice }</a>
                                    <span>门店价<b>￥${pcttsList.storePrice}</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                             </c:forEach>       
							<div style="clear:both;"></div>		
					</ul>
                    <div class="page-normal">
                  <c:if test="${page!=1}">
		       <a href="ParentChildThemeTicketingShowServlet?curPage=1&city=${city}&activity=${activity}&curday=${day}&names=${name}">首页</a>      
		       <a href="ParentChildThemeTicketingShowServlet?curPage=${page-1}&city=${city}&activity=${activity}&curday=${day}&names=${name}">上一页</a>
	 		</c:if>      
                <c:forEach var="i" begin="1" end="${number }" >
                <c:if test="${page!=i }">
                 <a href="ParentChildThemeTicketingShowServlet?curPage=${i }&city=${city}&activity=${activity}&curday=${day}&names=${name}">${i }</a>
                </c:if>
               	<c:if test="${page==i }">
                <span class="page-current"> ${i }</span>
                </c:if>              
                </c:forEach>
			<c:if test="${page!=number&&number>0}">
       			<a href="ParentChildThemeTicketingShowServlet?curPage=${page+1}&city=${city}&activity=${activity}&curday=${day}&names=${name}">下一页</a>
       			<a href="ParentChildThemeTicketingShowServlet?curPage=${number}&city=${city}&activity=${activity}&curday=${day}&names=${name}">末页</a>
       		</c:if>  
            </div>
            </div>
		</div>
		<div class="footer-b">
        	<ul>
            	<li><a href="IndexShowServlet">首页</a></li>
                <li><a href="ParentChildThemeActivityShowServlet">亲子活动</a></li>
                <li><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
                <li><a href="ActivityDisplayShowServlet">区域活动</a></li>
                <li><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
                <li><a href="ActivityDisplayShowServlet">活动展示</a></li>
                <div style="clear:both;"></div>
            </ul>
            <p>	COPYRIGHT&nbsp;&nbsp;&nbsp;2015-2016&nbsp;&nbsp;&nbsp;版权所有：阿拉亲子&nbsp;浙IPC备14003668号-2</p>
        </div>


		
	</div>

</body>
</html>
