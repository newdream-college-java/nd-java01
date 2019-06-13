<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
	<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>阿拉亲子</title>
	<link rel="stylesheet" href="Content/qzhd.css" type="text/css" />
	<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
	<script type="text/javascript" src="Scripts/jquery.superslide.2.1.1.js"></script>
	<script type="text/javascript" src="Scripts/public.js"></script>
</head>
<body>
	
	<div id="web">			
	<div class="topall">
		<div class="top-line">
		    <div class="top-line-box">
		    	<a>登录</a><a class="top-line-a-on">注册</a>
			    <form class="search-form"  id="search-form">
				 		<input type="text" class="search-text" name="q" id="search_input" autocomplete="off" placeholder="请输入搜索关键字"/>
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
   <li ><a href="index.html">首页</a></li>
    <li class="wbg"><a href="qzhd.html">亲子活动</a></li>
    <li><a href="qzly-1.html">亲子旅游</a></li>
    <li><a href="pw.html">票务</a></li>
    <li ><a href="hdzs.html">活动展示</a></li>
    <li><a>关于我们</a></li>
  </ul>
</div>

		
		<div class="main">
                 <div style=" clear:both;"></div>
			<div class="qzhd">
            <div class="qzhd-back">阿拉亲子&gt;亲子活动</div>
				   <div class="qzhd-all">
                  <h2>您已选择：<span>共有<i>${count }</i>条活动信息</span></h2>
                  <div class="qzhd-all-d" ><p>区域：</p>
                  
                  <a <c:if test="${city==null}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=${activity}">全部</a>
                  <a <c:if test="${city=='天心区'}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=天心区&activity=${activity}&curday=${day}">天心区</a>
                  <a <c:if test="${city=='望城区'}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=望城区&activity=${activity}&curday=${day}">望城区</a>
                  <a <c:if test="${city=='岳麓区'}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=岳麓区&activity=${activity}&curday=${day}">岳麓区</a>
                  <a <c:if test="${city=='雨花区'}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=雨花区&activity=${activity}&curday=${day}">雨花区</a>
                  <a <c:if test="${city=='星沙区'}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=星沙区&activity=${activity}&curday=${day}">星沙区</a>                 
                  </div>
                  <div class="qzhd-all-d" ><p>商家活动：</p>
                  <a <c:if test="${activity==null}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?city=${city}">全部</a>
                  <a <c:if test="${activity==1}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=1&city=${city}&curday=${day}">户外亲子</a>
                  <a <c:if test="${activity==2}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=2&city=${city}&curday=${day}">室内亲子</a>
                  <a <c:if test="${activity==3}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=3&city=${city}&curday=${day}">亲子DIY</a>
                  <a <c:if test="${activity==4}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=4&city=${city}&curday=${day}">农家乐采摘</a>
                  <a <c:if test="${activity==5}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?activity=5&city=${city}&curday=${day}">儿童剧</a></div>
                  <div  class="qzhd-all-d"><p>时间：</p>
                  <a <c:if test="${day==null}"> class="all-p-a"</c:if>  href="ParentChildThemeActivityShowServlet?activity=${activity}&city=${city}">全部</a>
                  <a <c:if test="${day==1}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?curday=1&activity=${activity}&city=${city}">今天</a>
                  <a <c:if test="${day==2}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?curday=2&activity=${activity}&city=${city}">最近一周</a>
                  <a <c:if test="${day==3}"> class="all-p-a"</c:if> href="ParentChildThemeActivityShowServlet?curday=3&activity=${activity}&city=${city}&curday=${day}">网期活动</a>
                  </div>
  					</div>                   
                    <ul class="qzhd-main" >                 	
                    	<c:forEach var="pctasList" items="${pctasList }" varStatus="status">
               			<c:if test="${(status.index-1)%3!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index-1)%3==0}">					
							<li style="margin:0px 36px;">									
						</c:if>
						<a href="">
						<img src="${pctasList.getImgUrl() }" width="305"  height="242"/></a>
						<div class="qzhd-li-t">                                   
                        <p>${pctasList.getPcnThemeName()}</p>
                      	<span><i><img src="Picture/time_19.jpg" /></i>${pctasList.getPcnStartTime() }-${pctasList.getPcnEndTime()  }</span>
                        <a><b>￥</b>${pctasList.getPrice()}</a>
                        </div>
                        <c:if test="${pctasList.getPcnStatus()==1}">
                        <div class="jinxin">进行中</div>
                        </c:if>
                        <c:if test="${pctasList.getPcnStatus()!=1}">
                        <div class="guanbi">已关闭</div>
                         <div class="black"></div>                
                        </c:if>
                        </li>                              
                        </c:forEach>
		<div style="clear:both;"></div>		
					</ul>
                <div class="page-normal">
	        <c:if test="${page!=1}">
		       <a href="ParentChildThemeActivityShowServlet?curPage=1&city=${city}&activity=${activity}&curday=${day}">首页</a>      
		       <a href="ParentChildThemeActivityShowServlet?curPage=${page-1}&city=${city}&activity=${activity}&curday=${day}">上一页</a>
	 		</c:if>      
                <c:forEach var="i" begin="1" end="${number }" >
                <c:if test="${page!=i }">
                 <a href="ParentChildThemeActivityShowServlet?curPage=${i }&city=${city}&activity=${activity}&curday=${day}">${i }</a>
                </c:if>
               	<c:if test="${page==i }">
                <span class="page-current"> ${i }</span>
                </c:if>              
                </c:forEach>
			<c:if test="${page!=number&&number>0}">
       			<a href="ParentChildThemeActivityShowServlet?curPage=${page+1}&city=${city}&activity=${activity}&curday=${day}">下一页</a>
       			<a href="ParentChildThemeActivityShowServlet?curPage=${number}&city=${city}&activity=${activity}&curday=${day}">末页</a>
       		</c:if>              
            </div>
            </div>
		</div>
		<div class="footer-b">
        	<ul>
            	<li><a href="index.html">首页</a></li>
                <li><a href="qzhd.html">亲子活动</a></li>
                <li><a href="qzly.html">亲子旅游</a></li>
                <li><a href="index.html">区域活动</a></li>
                <li><a href="pw.html">票务</a></li>
                <li><a href="hdzs.html">活动展示</a></li>
                <div style="clear:both;"></div>
            </ul>
            <p>	COPYRIGHT&nbsp;&nbsp;&nbsp;2015-2016&nbsp;&nbsp;&nbsp;版权所有：阿拉亲子&nbsp;浙IPC备14003668号-2</p>
        </div>		
	</div>
</body>
</html>
