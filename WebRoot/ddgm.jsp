<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>阿拉亲子</title>
	<script type="text/javascript" src="js/shopping.js"></script>
<meta name="description" content="" />

<meta name="keywords" />
<link href="Content/ddxq.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/public.js"></script>
<link href="Content/base.css" rel="stylesheet" type="text/css" />
<link href="Content/ddgm.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="Scripts/spinner.js"></script>
<script>
			window.onload = function(){
				var plus = document.getElementById("plus");
				var i = document.getElementById("text").value;
				var subtract = document.getElementById("subtract");
				var money = document.getElementById("money").value;
				plus.onclick = function(){
					i++;
					document.getElementById("text").value = i;
					document.getElementById("money").value = i*money;
				}
				subtract.onclick = function(){
					if (i>1) {
						i--;
						document.getElementById("text").value = i;
						document.getElementById("money").value = i*money;
					} else{
						i=1;
						document.getElementById("text").value = i;
						document.getElementById("money").value = i*money;
					}
				}				
			}		
		</script>

</head>

<body style="background:#f9f9f9;">

<div class="logBox">
		<div class="login">
			<div class="siderNav">
				<ul class="topmenu" id="jq_topmenu">
                <li class="first"><a href="index.html">首页</a>|<a>关于我们</a></li>
              
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
        <div class="c">
        <table>
        	请输入联系人：<input tyep="text" name="pcnpt_linkman_name"/><br/>
        	联系人手机号
        </table>
        </div>
        </div>
        
<div class="shopping_list_top">您已选购以下商品</div>
  <div class="shopping_list_border">
  	<table width="100%" border="0" cellspacing="0" cellpadding="0">
	    <tr class="shopping_product_list">
	       <td>商品名</td>
	       <td>门票价格</td>
	       <td>数量</td>
	       <td>操作</td>
	    </tr>
   		<tr  class="shopping_product_list" id="shoppingProduct_01">
       		<td class="shopping_product_list_1"><a href="#" class="blue"><img src="">私募（首部披露资本博弈秘密的金融...</a></td>
       		<td class="shopping_product_list_2"><li>&nbsp;&nbsp;&nbsp;¥<input type="text" id="money" value="88"/></td>
       		<td class="shopping_product_list_3">
	       		<ul class="box">
					<li><button id="plus">+</button></li>
					<li><input type="text" id="text" value="1"/></li>
					<li><button id="subtract">-</button></li>
				</ul>
			</td>
       		<td class="shopping_product_list_4"><a href="javascript:deleteProduct(shoppingProduct_01)" class="blue">删除</a></td>
   		</tr>
   	</table>
   	<div class="shopping_list_end">
      <ul>
       <li ><input name="" type="image" src="Images/shopping_balance.gif"></li>
       <li ><label class="shopping_list_end_yellow" id="product_total">￥00.00</label> </li>
       <li class="shopping_list_end_3">商品金额总计：</li>
      </ul>
     </div>
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


</body>
</html>
