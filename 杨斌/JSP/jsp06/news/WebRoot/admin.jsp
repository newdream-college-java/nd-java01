<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html><head>
<title>新闻发布系统管理后台</title>
<link href="admin_files/admin.css" rel="stylesheet" type="text/css" />
</head><body>
<%@include file="loginCtrol.jsp"%>
<div id="header">
  <div id="welcome">欢迎使用新闻管理系统！</div>
  <div id="nav">
    <div id="logo"><img src="admin_files/logo.jpg" alt="新闻中国"></div>
    <div id="a_b01"><img src="admin_files/a_b01.gif" alt=""></div>
  </div>
</div>
<div id="admin_bar">
  <div id="status">管理员： 登录  &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">退出</a></div>
  <div id="channel"> </div>
</div>



<script language="javascript">
	function clickdel(){
		return confirm("删除请点击确认");
	}	
</script>


<div id="main">
  <div id="opt_list">
 <%@include file="nav.jsp" %>
</div>

  <div id="opt_area">
    <ul class="classlist">
    	
    	    		
    		
    			
    			<li class="space"><strong>科技</strong></li>
    		
    		<li>测试科技新闻<span> 作者：lwl                                               &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    			
    			<li class="space"><strong>体育</strong></li>
    		
    		<li>姚明全家福<span> 作者：夜归的猫                                              &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    			
    			<li class="space"><strong>娱乐</strong></li>
    		
    		<li>"变形金刚3"24位悍金刚列传<span> 作者：阿明                                                &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    			
    			<li class="space"><strong>军事</strong></li>
    		
    		<li>首架F-35A战机交付美国埃格林空军基地<span> 作者：小强                                                &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    		<li>菲议员拟今日登南沙岛屿 中国驻菲使馆严重关切<span> 作者：小强                                                &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    			
    			<li class="space"><strong>国际</strong></li>
    		
    		<li>英拉议员资格获泰国选委会确认将当选女总理<span> 作者：中国新闻网                                             &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    		<li>默多克遭男子扔盘子袭击 妻子邓文迪反击护夫<span> 作者：人民网                                               &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    			
    			<li class="space"><strong>国内</strong></li>
    		
    		<li>全国非时政类报刊出版单位2012年全面转制<span> 作者：新华网                                               &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	    		
    		
    		<li>中方强烈抗议菲律宾议员登上中国南沙岛屿<span> 作者：新华网                                               &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </span> </li>
    	
    	
      		
      	
    </ul>
  </div>
</div>

<div id="site_link"> <a href="#">关于我们</a><span>|</span> <a href="#">Aboue Us</a><span>|</span> <a href="#">联系我们</a><span>|</span> <a href="#">广告服务</a><span>|</span> <a href="#">供稿服务</a><span>|</span> <a href="#">法律声明</a><span>|</span> <a href="#">招聘信息</a><span>|</span> <a href="#">网站地图</a><span>|</span> <a href="#">留言反馈</a> </div>
<div id="footer">
  <p class="">24小时客户服务热线：010-68988888  &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">常见问题解答</a> &nbsp;&nbsp;&nbsp;&nbsp;  新闻热线：010-627488888<br/>
    文明办网文明上网举报电话：010-627488888  &nbsp;&nbsp;&nbsp;&nbsp;  举报邮箱：<a href="#">jubao@jb-aptech.com.cn</a></p>
  <p class="copyright">Copyright &#169; 1999-2009 News China gov, All Right Reserver<br/>
    新闻中国   版权所有</p>
</div>

</body></html>