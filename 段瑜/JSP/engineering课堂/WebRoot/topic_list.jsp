<%@ page language="java" import="java.util.*,BaseDao.*,entity.*" pageEncoding="utf-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="BaseDao.imgl.topicDaoimgl"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <meta http-equiv="cache-control" content="no-cache"/>
<title>新闻发布系统管理后台</title>
<link href="topic_list_files/admin.css" rel="stylesheet" type="text/css"/>
</head><body><div id="header">
  <div id="welcome">欢迎使用新闻管理系统！</div>
  <div id="nav">
    <div id="logo"><img src="topic_list_files/logo.jpg" alt="新闻中国"></div>
    <div id="a_b01"><img src="topic_list_files/a_b01.gif" alt=""></div>
  </div>
</div>
<div id="admin_bar">
  <div id="status">管理员： <%@include file="loginCtrol.jsp" %></div>
  <div id="channel"> </div>
</div>






<script language="javascript">
	function clickdel(){
		return confirm("确认删除吗？");
	}	
</script>


<div id="main">
  <div id="opt_list">
 <%@include file="nav.jsp"%>
</div>

  <div id="opt_area">
    <ul class="classlist">
			<%
			topicDaoimgl tp=new topicDaoimgl();
			List<Topic> list=tp.getTopics();
			for(Topic li:list){
			 %>
    		<li>
    		<%=li.getTname() %> </li>
    		<%
    			}
    		 %>
      		<p align="right"> 当前页数:[1/3]&nbsp; <a href="#">下一页&nbsp;&nbsp;</a> <a href="#">末页</a> </p>
      	
      	
      		
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
  </body>
</html>
