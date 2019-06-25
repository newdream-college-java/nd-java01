<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>

<link rel="stylesheet" href="Content/hdzs.css" type="text/css" />
<script type="text/javascript" src="Scripts/common.min.js"></script>
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
   		<a >退出登录</a>
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
    <li><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
    <li class="wbg"><a href="ActivityDisplayShowServlet">活动展示</a></li>
    <li><a>关于我们</a></li>
  </ul>
</div>
<!--heder end-->
		
		<div class="banner">			
			<div class="bd">
				<ul class="fixed">
				<li style=" background:url(Images/index_02.jpg) 50% 0 no-repeat"><a href="cn/#"></a></li>
				<li style=" background:url(Images/index_02.jpg ) 50% 0 no-repeat"><a href="cn/#"></a></li>
				<li style=" background:url(Images/index_02.jpg) 50% 0 no-repeat"><a href="cn/#"></a></li>
				</ul>
			</div>
			<div class="hd"><ul class="fixed"><li class="on"></li><li class=""></li><li class=""></li></ul></div>
		</div>
		<script type="text/javascript">
			jQuery(".banner").slide({ titCell:".hd ul", mainCell:".bd ul", effect:"left", autoPage:"<li></li>", autoPlay:true, effect:"fold"})
		</script>
		<!--banner end-->
		
		<div class="main">
        
                
			
            
            
            
            
            <div class="hdzs">
            	<div class="title">
                    <p><i>S</i><b>活动展示</b><span>show</span></p>
                    </div>
                 	<ul class="hdzs-main" >
                 	<c:forEach var="pctasList" items="${pctasList }" varStatus="status">
                 		<c:if test="${(status.index+1)%4!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index+1)%4==0}">					
							<li class="last">								
						</c:if>
							<a href="ParentChildThemeParticularsShowServlet?pctid=${pctasList.pcnpctId}"><img src="${pctasList.pcnpctimgUrl }" width="236" height="185"/></a>					                                    
							<span>${pctasList.pcnpctThemeName}</span>
                             </li>
                     </c:forEach>
							<div style="clear:both;"></div>		
					</ul>
                    <div class="page-normal">
                <c:if test="${page!=1}">
		       <a href="ActivityDisplayShowServlet?curPage=1">首页</a>      
		       <a href="ActivityDisplayShowServlet?curPage=${page-1}">上一页</a>
	 		</c:if>      
                <c:forEach var="i" begin="1" end="${count }" >
                <c:if test="${page!=i }">
                 <a href="ActivityDisplayShowServlet?curPage=${i }">${i }</a>
                </c:if>
               	<c:if test="${page==i }">
                <span class="page-current"> ${i }</span>
                </c:if>              
                </c:forEach>
			<c:if test="${page!=count}">
       			<a href="ActivityDisplayShowServlet?curPage=${page+1}">下一页</a>
       			<a href="ActivityDisplayShowServlet?curPage=${count}">末页</a>
       		</c:if>  
                
              
            </div>
            </div>
		</div>
		<!--main end-->
		
	<!--footer end-->
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
<script id="jsID" type="text/javascript">
		 var ary = location.href.split("&");
		jQuery(".slideBox").slide( { mainCell:".bd ul", effect:ary[1],autoPlay:ary[2],trigger:ary[3],easing:ary[4],delayTime:ary[5],mouseOverStop:ary[6],pnLoop:ary[7] });
		</script>
      
</body>
</html>
