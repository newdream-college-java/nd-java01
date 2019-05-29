<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<title>新闻发布系统管理后台</title>
<link href="topic_add_files/admin.css" rel="stylesheet" type="text/css" />
</head>
<%@include file="loginControl.jsp"%>
<body>
	<div id="header">
		<div id="welcome">欢迎使用新闻管理系统！</div>
		<div id="nav">
			<div id="logo">
				<img src="topic_add_files/logo.jpg" alt="新闻中国">
			</div>
			<div id="a_b01">
				<img src="topic_add_files/a_b01.gif" alt="">
			</div>
		</div>
	</div>
	<div id="admin_bar">
		<div id="status">
			管理员： 登录 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">退出</a>
		</div>
		<div id="channel"></div>
	</div>



	<script type="text/javascript">
		function check() {
			var tname=document.getElementById("tname").value.trim();
			if(tname==""){
				alert("添加的主题内容不能为空！！");
				return false;
			}
			return true;

		}
	</script>
	<div id="main">
		<%@include file="nav.jsp" %>

		<div id="opt_area">
			<h1 id="opt_type">添加主题：</h1>
			<form action="topic_add_control.jsp" method="post" onsubmit="return check()">
				<p>
					<label> 主题名称 </label> <input name="tname" id="tname"
						class="opt_input" type="text" />
				</p>
				<input name="action" value="addtopic" type="hidden" /> <input
					value="提交" class="opt_sub" type="submit" /> <input value="重置"
					class="opt_sub" type="reset" />
			</form>
		</div>
	</div>
	<div id="site_link">
		<a href="#">关于我们</a><span>|</span> <a href="#">Aboue Us</a><span>|</span>
		<a href="#">联系我们</a><span>|</span> <a href="#">广告服务</a><span>|</span>
		<a href="#">供稿服务</a><span>|</span> <a href="#">法律声明</a><span>|</span>
		<a href="#">招聘信息</a><span>|</span> <a href="#">网站地图</a><span>|</span>
		<a href="#">留言反馈</a>
	</div>
	<div id="footer">
		<p class="">
			24小时客户服务热线：010-68988888 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">常见问题解答</a>
			&nbsp;&nbsp;&nbsp;&nbsp; 新闻热线：010-627488888<br />
			文明办网文明上网举报电话：010-627488888 &nbsp;&nbsp;&nbsp;&nbsp; 举报邮箱：<a href="#">jubao@jb-aptech.com.cn</a>
		</p>
		<p class="copyright">
			Copyright &#169; 1999-2009 News China gov, All Right Reserver<br />
			新闻中国 版权所有
		</p>
	</div>

</body>
</html>