<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<title>阿拉亲子</title>

<meta name="description" content="" />

<meta name="keywords" />

<link href="Content/wddd.css" rel="stylesheet" type="text/css" />

<link href="Content/base.css" rel="stylesheet" type="text/css" />
</head>
<style type="text/css">


.demo-right{width:80%; float:right; background:#fff;}
.tb-title{ height:50px;}
.tb-title1{ margin:0 auto;border-collapse:collapse; background:#FFF;}
.tb-title1 td{border:1px solid #ccc; }
.tb-title2{  line-height:40px; text-indent:20px; border-top:1px solid #ccc; border-left:1px solid #ccc;border-right:1px solid #ccc;width:100%; background:#f4f4f4; box-sizing:border-box;}
.tb-title2 span{ float:right; position:absolute; right:10px; position:relative;}
.demo-right table{ float:right;  }
.demo table tr td{text-align:center; padding:20px 0;}
.tb-min{width:780px; margin:0 auto; margin-top:10px;}
</style>
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
        <p><img src="Picture/dingdan_03.jpg" /></p>
        <h3>addasd</h3>
        </div>
        	<ul>
            <li class="title2"><a href="dd_zl.jsp">我的资料</a></li>
            <li class="title2"><a href="myorderListServlet">我的订单</a></li>
            <li class="title2"><a href="#">意见反馈</a></li>		
            </ul>
        	</div>
        <div class="demo-right">
        <div style="width:780px; margin:0 auto; padding-top:10px;">
            <table width="100%" border="0"  class="tb-title" style=" border-collapse:collapse;" >
                  <tr style=" background:#fef7ea; border:1px solid #fed89a;">
                    <th scope="col" width="40%">主题</th>
                    <th scope="col" width="17%">订购信息</th>
                    <th scope="col" width="8%">数量</th>
                    <th scope="col" width="20%" >实付款（元）</th>
                    <th scope="col" width="15%">交易状态</th>
                  </tr>
            </table>
        </div>
        <c:forEach var="list" items="${Mylist}">
        <div style="clear:both;"></div>
        <div  class="tb-min" >
         <p class="tb-title2">${list.pcni_time}<span>订单号：${list.pcni_order_number}</span></p>
       
        	 <table width="100%" border="1"class="tb-title1" >
           
              <tr >
                <td class="ddc" width="40%"><a>${list.pcnpct_theme_name}</a></td>
                <td class="ddc" width="17%" ><p>${list.pcngs_name},￥${list.pcngsv_value}/人</p></td>
                <td class="ddc" width="8%" >${list.pcnpt_quantity}</td>
                <td class="ddc" width="20%" >${list.pcnpt_order_amount}</td>
                <td class="ddc" width="15%"><p><c:if test="${list.pcni_transaction_status==1}">交易完成</c:if>
                							<c:if test="${list.pcni_transaction_status==2}">交易未完成</c:if>
                							</p><a href="detailsListServlet?id=${list.pcni_id}">查看详情</a></td>
              </tr>
			</table>
        </div>
        </c:forEach>
      <div style="clear:both;"></div>
          <div class="page-normal">
          		<c:if test="${apg==1}">
                <a href="myorderListServlet?apg=1" class="page-next">上一页</a>
                </c:if>
                <c:if test="${apg!=1}">
                <a href="myorderListServlet?apg=${apg-1}" class="page-next">上一页</a>
                </c:if>
                <a <c:if test="${apg==1}">class="page-current"</c:if> href="myorderListServlet?apg=1">1</a>
                <a <c:if test="${apg==2}">class="page-current"</c:if> href="myorderListServlet?apg=2">2</a>
                <a <c:if test="${apg==3}">class="page-current"</c:if> href="myorderListServlet?apg=3">3</a>
                <a <c:if test="${apg==4}">class="page-current"</c:if> href="myorderListServlet?apg=4">4</a>
                <a <c:if test="${apg==5}">class="page-current"</c:if> href="myorderListServlet?apg=5">5</a>
                <a <c:if test="${apg==6}">class="page-current"</c:if> href="myorderListServlet?apg=6">6</a>
                <a <c:if test="${apg==7}">class="page-current"</c:if> href="myorderListServlet?apg=7">7</a>
                <c:set var="a" value="${count}"></c:set>
                <c:if test="${apg <a}">
                <a href="myorderListServlet?apg=${apg+1}" class="page-next">下一页</a>
                </c:if>
                 <c:if test="${apg == a}">
                <a href="myorderListServlet?apg=${count}" class="page-next">下一页</a>
                </c:if>
            </div>
        </div>
            <div style="clear:both;"></div>
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


</body>
</html>
