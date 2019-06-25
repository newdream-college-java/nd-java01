<%@ page language="java" import="java.util.*,com.yb.dao.impl.*,com.yb.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>

<link rel="stylesheet" href="Content/qzly-1.css" type="text/css" />
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
    <li  class="wbg"><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
    <li><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
    <li ><a href="ActivityDisplayShowServlet">活动展示</a></li>
    <li><a>关于我们</a></li>
  </ul>
</div>

		<div class="main">
            <div class="qzly">
            	<div class="title">
                    <p><i>T</i><b>亲子旅游</b><span>tourism</span></p>
                    
                    </div>
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">
				<ul>
                <li <c:if test="${TravelDays==1 }">class="on"</c:if> ><a  href="ParentChildThemeTravelServlet?pcnpctTravelDays=1&names=${name}">一日游</a></li>
                <li <c:if test="${TravelDays==2 }">class="on"</c:if> ><a href="ParentChildThemeTravelServlet?pcnpctTravelDays=2&names=${name}">二日游</a></li>
                <li <c:if test="${TravelDays==3 }">class="on"</c:if> ><a href="ParentChildThemeTravelServlet?pcnpctTravelDays=3&names=${name}">周边游</a></li>
                <li <c:if test="${TravelDays==4 }">class="on"</c:if> ><a href="ParentChildThemeTravelServlet?pcnpctTravelDays=4&names=${name}">国内游</a></li>
                <li <c:if test="${TravelDays==5 }">class="on"</c:if> ><a href="ParentChildThemeTravelServlet?pcnpctTravelDays=5&names=${name}">境外游</a></li>
                </ul>
			</div>
			<div class="bd">
				<ul>
					<c:set var="i" value="0"/>
					<c:forEach var="a" items="${Travellist}">	
					 	<c:set var="i" value="${i+1}"/>
						<li	
							<c:if test="${i%4==0}"> class="last"</c:if>
						>
						<a href="ParentChildThemeParticularsShowServlet?pctid=${a.pcnpctid}">
						<img src="${a.image}" width="205"  height="138"/></a>
	                    <div>
		                    <b>${a.theme}</b>
		                    <span>地址：${a.address}</span>
						    <span> 费用：成人票：${a.crPrice}元/人；儿童票：${a.etPrice1}元			
							</span>
		                    <span>年龄：3岁以上</span>
	                    </div>
	                    </li>                  
					</c:forEach>
				
                     <div style="clear:both;"></div>
                    <div class="page-normal">
                     <c:if test="${curPage!=1}">
                <a href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=1&names=${name}">首页</a>
   				<a href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=${curPage-1}&names=${name}" class="page-next">上一页</a>
                
       			</c:if>
                    <c:if test="${pcnpctTravelDays<1}">
                    <c:forEach var="i" begin="1" end="${count}" step="1">
                			<a <c:if test="${curPage==i}">
                				class="page-current"
                			</c:if> 
                				href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=${i}&names=${name}">${i}
                			</a>	
                	</c:forEach>
                	</c:if> 
               
                	 <c:if test="${pcnpctTravelDays>0}">
                    <c:forEach var="i" begin="1" end="${count}" step="1">
                			<a <c:if test="${curPage==i}">
                				class="page-current"
                			</c:if> 
                				href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=${i}&names=${name}">${i}
                			</a>	
                	</c:forEach>
                	</c:if> 
                	<c:if test="${curPage!=count&&count!=0}">
                <a href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=${curPage+1}&names=${name}" class="page-next">下一页</a>
                <a href="ParentChildThemeTravelServlet?pcnpctTravelDays=${TravelDays}&curPage=${count}&names=${name}">末页</a>
            		</c:if> 
            		</div>
               
				</ul>
			</div>
		</div>
        <div style="clear:both;"></div>
                    </div>
            </div>
            
            
            
		</div>
		<!--main end-->
		
	<!--footer end-->
<div class="footer-b">
        	<ul>
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

		
	</div>
<script>$(".top-line-box a").click(function(){
	  	$(this).siblings().removeClass('top-line-a-on');
			$(this).addClass("top-line-a-on");
        });</script>


</body>
</html>
