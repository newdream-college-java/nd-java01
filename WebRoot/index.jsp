<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>首页</title>

<link rel="stylesheet" href="Content/style.css" type="text/css" />
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
   <li  class="wbg"><a href="IndexShowServlet">首页</a></li>
    <li><a href="ParentChildThemeActivityShowServlet">亲子活动</a></li>
    <li><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
    <li><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
    <li ><a href="ActivityDisplayShowServlet">活动展示</a></li>
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
        <div class="container-tit">
                	<div class="container-tit-p1"><img src="Picture/index_05.jpg" /><p><a href="ParentChildThemeActivityShowServlet">亲子活动</a></p></div>
                  <div class="container-tit-p2"><img src="Picture/index_05.jpg" style="padding-left:100px;"/><p><a href="ParentChildThemeTravelServlet">亲子旅游</a></p></div>
                  <div class="container-tit-p3"><img src="Picture/index_05.jpg" /><p><a href="ParentChildThemeTicketingShowServlet">票务</a></p></div>
                </div>
                 <div style=" clear:both;"></div>
			<div class="qzhd">
				    <div class="title">
                    <p><i>A</i><b>亲子活动</b><span>activities</span></p>
                   <a href="ParentChildThemeActivityShowServlet"><span class="more">more</span></a>
                    </div>
                    
                    
                    <ul class="qzhd-main" >
					<c:forEach var="activityVoList" items="${activityVoList }" varStatus="status">
               			<c:if test="${(status.index-1)%3!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index-1)%3==0}">					
							<li style="margin:0px 36px;">									
						</c:if>
						<a href="ParentChildThemeParticularsShowServlet?pctid=${activityVoList.pcnpctId}">
						<img src="${activityVoList.imgUrl }" width="305"  height="242"/></a>
						<div class="qzhd-li-t">                                   
                        <p>${activityVoList.pcnThemeName}</p>
                      	<span><i><img src="Picture/time_19.jpg" />
                      		<fmt:formatDate value="${activityVoList.pcnStartTime }" var="startDate" pattern="yyyy年MM月dd日"/>
                      	<fmt:formatDate value="${activityVoList.pcnEndTime }" var="endDate" pattern="yyyy年MM月dd日"/>
                      	</i>${startDate}-${endDate }</span>
                        <a><b>￥</b>${activityVoList.price}</a>
                        </div>
                        <c:if test="${activityVoList.pcnStatus==1}">
                        <div class="jinxin">进行中</div>
                        </c:if>
                        <c:if test="${activityVoList.pcnStatus!=1}">
                        <div class="guanbi">已关闭</div>
                         <div class="black"></div>                
                        </c:if>
                        </li>                              
                        </c:forEach>
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="qzly">
            	<div class="title">
                    <p><i>T</i><b>亲子旅游</b><span>tourism</span></p>
                    <a href="ParentChildThemeTravelServlet"><span class="more">more</span></a>
             </div>
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">
				<ul>
                <li <c:if test="${pcnpctTravelDays==0}">class="on"</c:if>><a href="IndexShowServlet">全部</a></li>
                <li <c:if test="${pcnpctTravelDays==1}">class="on"</c:if>><a href="IndexShowServlet?pcnpctTravelDays=1">一日游</a></li>
                <li <c:if test="${pcnpctTravelDays==2}">class="on"</c:if>><a href="IndexShowServlet?pcnpctTravelDays=2">二日游</a></li>
                <li <c:if test="${pcnpctTravelDays==3}">class="on"</c:if>><a href="IndexShowServlet?pcnpctTravelDays=3">周边游</a></li>
                <li <c:if test="${pcnpctTravelDays==4}">class="on"</c:if>><a href="IndexShowServlet?pcnpctTravelDays=4">国内游</a></li>
                <li <c:if test="${pcnpctTravelDays==5}">class="on"</c:if>><a href="IndexShowServlet?pcnpctTravelDays=5">境外游</a></li>
                </ul>
			</div>
			<div class="bd">
			
					              
			
				<ul>
				<c:forEach var="travelVoList" items="${travelVoList}">	
					<li>
					<a href="ParentChildThemeParticularsShowServlet?pctid=${travelVoList.pcnpctid}">
					<img src="${travelVoList.image}" width="205"  height="138"/>
					</a>
					</li>
                
				</c:forEach>
				</ul>
				
               
               
			</div>
		</div>
        
        <div class="sideMenu" style="margin:0 auto">
        	
        	<img src="Picture/qzly_03.jpg" />
        	<c:forEach var="activityIntroduction" items="${ activityIntroductionList}" varStatus="statud">
			<h3><img src="Picture/1_0${statud.index+1}.jpg" />${ activityIntroduction.theme}</h3>
			
			<ul>
				<a href="ParentChildThemeParticularsShowServlet?pctid=${activityIntroduction.pcnpctid}">
				<img src="${activityIntroduction.image}" width="125" height="79" />
				</a>
             <div class="sideMenu-t">
             <b>${ activityIntroduction.theme}</b>
             <span>${ activityIntroduction.reason}</span>
             </div>
			</ul>

		

			</c:forEach>
		</div>
        
        <div style="clear:both;"></div>
                    </div>
            </div>
            <div class="pw">
            	<div class="title">
                    <p><i>T</i><b>票务</b><span>ticket</span></p>
                    <a href="ParentChildThemeTravelServlet"><span class="more">more</span></a>
                    </div>
                 	<ul class="pw-main" >
						<c:forEach var="ticketShowVo" items="${ticketShowVoList }" varStatus="status">
               			<c:if test="${(status.index-1)%3!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index-1)%3==0}">					
							<li style="margin:0px 10px">									
						</c:if>
						<a href="ParentChildThemeParticularsShowServlet?pctid=${ticketShowVo.pcnpctId}">
						<img src="${ticketShowVo.imgUrl }"  width="322" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>${ticketShowVo.pcnThemeName}</p>
                                    <a><b>￥</b>${ticketShowVo.adultPrice }</a>
                                    <span>门店价<b>￥${ticketShowVo.storePrice}</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                             </c:forEach>       
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="hdzs">
            	<div class="title">
                    <p><i>S</i><b>活动展示</b><span>show</span></p>
                   
                     <a href="ActivityDisplayShowServlet"><span class="more">more</span></a>
                    </div>
                 	<ul class="hdzs-main" >
					<c:forEach var="displayShowVo" items="${displayShowVoList }" varStatus="status">
                 		<c:if test="${(status.index+1)%4!=0}">
               				<li>									
						</c:if>
						<c:if test="${(status.index+1)%4==0}">					
							<li class="last">								
						</c:if>
							<a href="ParentChildThemeParticularsShowServlet?pctid=${displayShowVo.pcnpctId}"><img src="${displayShowVo.pcnpctimgUrl }" width="236" height="185"/></a>					                                    
							<span>${displayShowVo.pcnpctThemeName}</span>
                             </li>
                     </c:forEach>
							<div style="clear:both;"></div>		
					</ul>
            </div>
		</div>
		<!--main end-->
		
	<div class="footer">
        <div class="footer-t">
        		<div class="footer-t-l">
                    <div class="title">
                        <p><i>A</i><b>亲子活动</b><span>activities</span></p>
                        <a href="ParentChildThemeActivityShowServlet"><span class="more">more</span></a>
                     </div>
                     <p>由带队总指导员宣布 “成长体验营”成立并正式开始，任命各级训导员并进行授旗仪式，集体宣誓，承诺，辅导员、学员代表发言；团队建设：夏令营纪律学习、设计队名旗帜，建立团队归属感，团队荣誉感。认识小伙伴扩大社交圈...</p>
                 </div>
                    <div class="footer-t-r"><img src="Picture/demo_07.jpg" width="95" height="95" /><p >扫一扫，更多精彩</p></div>			
            <div style="clear:both;"></div>
        </div>
	</div><!--footer end-->
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
