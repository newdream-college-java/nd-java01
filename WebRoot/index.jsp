<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <a>登录</a><a class="top-line-a-on">注册</a><form class="search-form"  id="search-form">
	 		<input type="text" class="search-text" name="q" id="search_input" autocomplete="off" placeholder="请输入搜索关键字"/>
	 		<input type="submit" class="search-button" value=""/>
	 	</form>
        </div>
    </div>
    <div  style="clear:both;"></div>
  <div class="top">
  <img src="images/denglu_02.jpg" />
  <img src="Picture/index_03.jpg" style="float:right;" />
  </div>
</div>
<div class="nav">
  <ul>
   <li class="wbg"><a href="index.html">首页</a></li>
    <li><a href="qzhd.html">亲子活动</a></li>
    <li><a href="qzly-1.html">亲子旅游</a></li>
    <li><a href="pw.html">票务</a></li>
    <li ><a href="hdzs.html">活动展示</a></li>
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
                	<div class="container-tit-p1"><img src="Picture/index_05.jpg" /><p><a href="qzhd.html">亲子活动</a></p></div>
                  <div class="container-tit-p2"><img src="Picture/index_05.jpg" style="padding-left:100px;"/><p><a href="qzly.html">亲子旅游</a></p></div>
                  <div class="container-tit-p3"><img src="Picture/index_05.jpg" /><p><a href="pw.html">票务</a></p></div>
                </div>
                 <div style=" clear:both;"></div>
			<div class="qzhd">
				    <div class="title">
                    <p><i>A</i><b>亲子活动</b><span>activities</span></p>
                    <span class="more">more</span>
                    </div>
                    
                    
                    <ul class="qzhd-main" >
									<li><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                    <div class="guanbi">已关闭</div>
                                    <div class="black"></div>
                                    </li>
									<li style="margin:0px 36px;"><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                     <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                     <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
                                    <li style="margin:0px 36px;"><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
                                    <li><a href=""><img src="Picture/index_15.jpg" width="305"  height="242"/></a>					                                    <div class="qzhd-li-t">
                                    <p>新梦想少儿足球免费试踢啦！</p>
                                    <span><i><img src="Picture/time_19.jpg" /></i>2015年07月01日-2015年09月01日</span>
                                    <a><b>￥</b>70</a>
                                    </div>
                                    <div class="jinxin">进行中</div>
                                    </li>
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="qzly">
            	<div class="title">
                    <p><i>T</i><b>亲子旅游</b><span>tourism</span></p>
                    <span class="more">more</span>
                    </div>
                    <div class="qzly-main">
                    	<div class="content2-main">
			<div class="hd">
				<ul>
                <li class="on">全部</li>
                <li>一日游</li>
                <li>二日游</li>
                <li>周边游</li>
                 <li>国内游</li>
                <li>境外游</li>
                </ul>
			</div>
			<div class="bd">
				<ul>
					<li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
                    <li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
					<li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
                    <li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
                    <li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
					<li><img src="Picture/index_08.jpg" width="205"  height="138"/></li>
				</ul>
				
               
               
			</div>
		</div>
        
        <div class="sideMenu" style="margin:0 auto">
        	<img src="Picture/qzly_03.jpg" />
			<h3><img src="Picture/1_03.jpg" />上海科技馆</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>

			<h3><img src="Picture/2_07.jpg" />幻灯片/焦点图系列</h3>

			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
			<h3><img src="Picture/1_06.jpg" />南京海底世界</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
            <h3><img src="Picture/1_09.jpg"/>上海动物园</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
            <h3><img src="Picture/1_11.jpg" />常州动物园</h3>
			<ul>
				<img src="Picture/1-p_07.jpg" width="125" height="79" />
             <div class="sideMenu-t">
             <b>常州恐龙园</b>
             <span>中华恐龙园享有"东恐龙园享有"东方侏恐龙园享有"东方侏恐龙园享有"东方侏罗纪"中华恐龙园享有"东方侏中华恐龙园享有"东方侏
美誉</span>
             </div>
			</ul>
		</div>
        
        <div style="clear:both;"></div>
                    </div>
            </div>
            <div class="pw">
            	<div class="title">
                    <p><i>T</i><b>票务</b><span>ticket</span></p>
                    <span class="more">more</span>
                    </div>
                 	<ul class="pw-main" >
									<li><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li style="margin:0px 10px"><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
									<li><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li style="margin:0px 10px"><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
                                    <li><a href=""><img src="Picture/index_12.jpg"  width="326" height="247"/></a>					                                    <div class="pw-li-t">
                                    <p>北仑凤凰山海港乐园门票</p>
                                    <a><b>￥</b>145</a>
                                    <span>门店价<b>￥160</b></span>
                                    <div class="pw-li-t-d">
                                    立即购买&gt;&gt;
                                    </div>
                                    </div>
                                    </li>
							<div style="clear:both;"></div>		
					</ul>
            </div>
            
            <div class="hdzs">
            	<div class="title">
                    <p><i>S</i><b>活动展示</b><span>show</span></p>
                    <span class="more">more</span>
                    </div>
                 	<ul class="hdzs-main" >
									<li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li class="last"><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    <li class="last"><a href=""><img src="Picture/index_16.jpg" width="236" height="185"/></a>					                                    <span>杭州烂苹果乐园</span>
                                    </li>
                                    
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
                        <span class="more">more</span>
                     </div>
                     <p>由带队总指导员宣布 “成长体验营”成立并正式开始，任命各级训导员并进行授旗仪式，集体宣誓，承诺，辅导员、学员代表发言；团队建设：夏令营纪律学习、设计队名旗帜，建立团队归属感，团队荣誉感。认识小伙伴扩大社交圈...</p>
                 </div>
                    <div class="footer-t-r"><img src="Picture/demo_07.jpg" width="95" height="95" /><p >扫一扫，更多精彩</p></div>			
            <div style="clear:both;"></div>
        </div>
	</div><!--footer end-->
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
<script id="jsID" type="text/javascript">
		 var ary = location.href.split("&");
		jQuery(".slideBox").slide( { mainCell:".bd ul", effect:ary[1],autoPlay:ary[2],trigger:ary[3],easing:ary[4],delayTime:ary[5],mouseOverStop:ary[6],pnLoop:ary[7] });
		</script>
       

</body>
</html>
