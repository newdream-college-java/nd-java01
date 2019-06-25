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
    <meta http-equiv=“X-UA-Compatible” content=“IE=EmulateIE7″>
<meta http-equiv=“X-UA-Compatible” content=“IE=8″>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title>阿拉亲子</title>

<link rel="stylesheet" href="Content/qzhd-1.css" type="text/css" />
<script type="text/javascript" src="Scripts/spinner.js"></script>
<script type="text/javascript" src="Scripts/jquery1.42.min.js"></script>
<script type="text/javascript" src="Scripts/jquery.superslide.2.1.1.js"></script>
<script type="text/javascript" src="Scripts/public.js"></script>
<script type="text/javascript" src="Scripts/jquery.spinner.js"></script>
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
    <form class="search-form"  id="search-form" action="SearchServlet">
	 		<input type="text" class="search-text" name="q" id="search_input" autocomplete="off" placeholder="请输入搜索关键字" onkeyup="upperCase(this)"/>
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
    
    <li <c:if test="${coctpVo.pcnttId==1}">class="wbg"  </c:if>><a href="ParentChildThemeActivityShowServlet">亲子活动</a></li>
    
    <li <c:if test="${coctpVo.pcnttId==2}">class="wbg"  </c:if>><a href="ParentChildThemeTravelServlet">亲子旅游</a></li>
    <li <c:if test="${coctpVo.pcnttId==3}">class="wbg"  </c:if>><a href="ParentChildThemeTicketingShowServlet">票务</a></li>
    <li><a href="ActivityDisplayShowServlet">活动展示</a></li>
    <li><a>关于我们</a></li>
  </ul>
</div>
		<div class="main">
			
            <div class="main-top" >
            <h2>${coctpVo.pcnpctThemeName }</h2>
            <div id="demo1" class="picBtnTop">
                <div class="hd">
                    <ul>
                     <c:forEach var="themeImage" items="${themeImageList }">
                        <li><img src="${themeImage.pcntiImagePath}" /></li>
                   	</c:forEach>
                    </ul>
                   
                </div>
                <div class="bd">
                    <ul>
                    <c:forEach var="themeImage" items="${themeImageList }">
                        <li>
                            
                            <div class="pic"><a href=""><img src="${themeImage.pcntiImagePath}" /></a></div>
                            
                        </li>
                      </c:forEach>
                    </ul>
                </div>
		</div>
		<div class="table-right" id="price_id">
		<c:if test="${coctpVo.pcnttId==1}">
        	<h1><b>￥</b>${goodsSpuValue.largePriceAndSmallPrice }.00</h1>
        	<input type="hidden" value="${goodsSpuValue.largePriceAndSmallPrice }"/>
        </c:if>
        <c:if test="${coctpVo.pcnttId==2||coctpVo.pcnttId==3}">
        	<h1><b>￥</b>${goodsSpuValue.adultPrice}.00</h1>
        	<input type="hidden" value="${goodsSpuValue.adultPrice}"/>
        </c:if>  
            <span>推荐理由：${coctpVo.pcnpctReason}</span>
            <span><img src="Picture/hd-n_06.jpg" />${coctpVo.pcnSite}<i style="font-style:normal; padding-left:50px;"><img src="Picture/hd-n_03_03.jpg" style="padding:5px 5px 0px 0px;" />${coctpVo.pcnpctTripMode}</i></span>
            <div class="table-right-box">
            <div class="table-right-b-t1">
            	<p>出行日期：</p>
               
                
     <c:set var="now" value="<%=new java.util.Date()%>" />
     <c:forEach var="i" begin="0" end="1">       
     <fmt:formatDate value="${date[i]}" pattern="MM月dd日" var="d" />

       <span>${d}（${coctpVo.pcnpctTravelDays}）</span>
       </c:forEach>   
                
               
                <div style="clear:both;"></div>
            </div>
            <div style="clear:both;"></div>
            <div class="table-right-b-t2">
            	<p>价格：</p>
               	<div class="table-right-b-t2-box">
               	
                <div class="table-right-b-t2-m">
                 <c:if test="${coctpVo.pcnttId==1}">
                <div id="" class="Spinner">
                	<a class="DisDe" onclick="reloadPrice(this,false)"><i>-</i></a>
                	<input class="Amount" value="1" maxlength="5"/>
                	<a class="Increase" onclick="reloadPrice(this,true)"><i>+</i></a>
                </div>
                
               
                <b>一大一小</b><i>￥${goodsSpuValue.largePriceAndSmallPrice }</i>
                <input type="hidden" value="${goodsSpuValue.largePriceAndSmallPrice }"/>
               
                </c:if>
                <div style="clear:both;"></div>
                 
                </div>
                
				<div class="table-right-b-t2-m">
				<c:if test="${coctpVo.pcnttId==2||coctpVo.pcnttId==3}">
                <div id="" class="Spinner">
                	<a class="DisDe" onclick="reloadPrice(this,false)"><i>-</i></a>
                	<input class="Amount" value="1" maxlength="5" id="number_id"/>
                	<a class="Increase" onclick="reloadPrice(this,true)"><i>+</i></a>
                </div>
                </c:if>
                <c:if test="${coctpVo.pcnttId==1}">
                <div id="" class="Spinner">
                	<a class="DisDe" onclick="reloadPrice(this,false)"><i>-</i></a>
                	<input class="Amount" value="0" maxlength="5" id="number_id"/>
                	<a class="Increase" onclick="reloadPrice(this,true)"><i>+</i></a>
                </div>
                </c:if>
                <b>成人</b><i>￥${goodsSpuValue.adultPrice}</i>
                <input type="hidden" value="${goodsSpuValue.adultPrice}"/>
                <div style="clear:both;"></div>
                </div>
                <div class="table-right-b-t2-m">
                <div id="" class="Spinner">
               	 	<a class="DisDe" onclick="reloadPrice(this,false)"><i>-</i></a>
                	<input class="Amount" value="0" maxlength="5"/>
                	<a class="Increase" onclick="reloadPrice(this,true)"><i>+</i></a>
                	</div>
                <b>儿童</b><i>￥${goodsSpuValue.childrenPrice}</i>
                <input type="hidden" value="${goodsSpuValue.childrenPrice}"/>
                <div style="clear:both;"></div>
                </div>
               
                <div style="clear:both;"></div>
                </div>
            </div>
            </div>
            <a class="goumai">立刻购买</a>
        </div>
            </div>
            
            
            
            <div class="qzly">
            	
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">
				<ul>
                <li>活动介绍</li>
                <li>收费标准</li>
                <li>交通路线</li>
                </ul>
			</div>
            <div class="content2-main-r">
            <img src="Picture/hd-n_03.jpg" width="100%"/>
            <c:forEach var="recommen" items="${recommendList }">
            	<p>
                <img src="${recommen.pcnpctimgUrl }"/>
                <span>${recommen.pcnpctThemeName}</span>
                </p>
           
             </c:forEach>
            </div>
			<div class="bd">
				
               
				
				<ul>
					<p>${coctpVo.introductionContent}</p>
<span><img src="${coctpVo.introductionContentImg}" /><span>
				</ul>
                <ul>
					<p>${coctpVo.expenseContent}</p>
<span><img src="${coctpVo.expenseContentImg}" /><span>
				</ul>
                <ul>
					<p>${coctpVo.trafficRouteContent}</p>
<span><img src="${coctpVo.trafficRouteContentImg}" /><span>
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
<script type="text/javascript">

jQuery(".content2-main").slide({trigger:"click"});

</script>
<script type="text/javascript">

jQuery("#demo1").slide({ mainCell:".bd ul",effect:"top",autoPlay:true,triggerTime:0 });

</script>
<script type="text/javascript">
$(function(){
	$("#d").Spinner();
	$("#d1").Spinner();
	$("#d2").Spinner();
	$("#d3").Spinner();
	
});
</script>
</body>
</html>
