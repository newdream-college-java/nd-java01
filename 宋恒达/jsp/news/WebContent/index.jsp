
<%@page import="cn.song.entity.News"%>
<%@page import="cn.song.dao.impl.NewsDaoImpl"%>
<%@page import="cn.song.dao.NewsDao"%>
<%@page import="java.util.Set"%>
<%@page import="cn.song.entity.Topic"%>
<%@page import="java.util.Map"%>
<%@page import="cn.song.dao.impl.TopicDaoImpl"%>
<%@page import="cn.song.dao.TopicDao"%>
<%@page import="cn.song.entity.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<title>新闻中国</title>

<link href="index_files/main.css" rel="stylesheet" type="text/css" />
<script language="javascript">
	function check() {
		var uname = document.getElementById("uname").value;
		var pwd = document.getElementById("upwd").value;
		if (uname == "" || pwd == "") {
			alert("用户名或者密码不能为为空");
			return false;
		}
		return true;
	}
</script>
</head>
<%
	int count=0;
	if(application.getAttribute("count")!=null){
		count=(Integer)application.getAttribute("count");
		count++;
	}else{
		count=1;
	}
	application.setAttribute("count", count);
	count=(Integer)application.getAttribute("count");
%>
<body>
	<div id="header">
		<div id="top_login">
			<%
				request.setCharacterEncoding("utf-8");
				Cookie[] cookies = request.getCookies();
				List<User> lists = new ArrayList<User>();
				if (application.getAttribute("loginUser") != null) {
					lists = (List<User>) application.getAttribute("loginUser");
				}
				String name = null;
				String pwd = null;
				User user = null;
				//for(Cookie cookie:cookies){
				//		if(cookie.getName().equals("name")){
				//			name=cookie.getValue();
				//		}
				//	if(cookie.getName().equals("upwd")){
				//		pwd=cookie.getValue();
				//		}
				//	}
				if (session.getAttribute("uname") == null) {
					//if(name==null){
			%>
			<form action="index_control.jsp" method="post"
				onsubmit="return check()">
				用户名：<input id="uname" name="uname" class="login_input" type="text" />
				<label> 密&nbsp;&nbsp;码 </label> <input id="upwd" name="upwd"
					value="" class="login_input" type="password" /> <input
					class="login_sub" value="登录" type="submit" /> <label id="error">
				</label> <img src="index_files/friend_logo.gif" alt="Google"
					id="friend_logo" />
			</form>
			<%
				} else {
					name = session.getAttribute("uname").toString();
					pwd = session.getAttribute("upwd").toString();
					boolean flag = false;
					for (User user1 : lists) {
						if (user1.getUname().equals(name)) {
							flag = true;
						}
					}
					if (!flag) {
						user = new User();
						user.setUname(name);
						user.setUpwd(pwd);
						lists.add(user);
					}
					application.setAttribute("loginUser", lists);
			%>
			欢迎你，<%=session.getAttribute("uname")%>
			| <a href="#">登录控制台</a> | <a href="loginOut.jsp">登出</a>
			<%
				}
			%>
		</div>
		<div id="nav">
			<div id="logo">
				<img src="index_files/logo.jpg" alt="新闻中国" />
			</div>
			<div id="a_b01">
				<img src="index_files/a_b01.gif" alt="" />
			</div>
			<!--mainnav end-->
		</div>
	</div>
	<div id="container">
		<div class="sidebar">
			<h1>
				<img src="index_files/title_1.gif" alt="国内新闻" />
			</h1>
			<div class="side_list">
				<ul>


					<li><a href="#"><b> 全国非时政类报刊出版单位2012年全面转制</b></a></li>

					<li><a href="#"><b> 中方强烈抗议菲律宾议员登上中国南沙岛屿</b></a></li>

				</ul>
			</div>
			<h1>
				<img src="index_files/title_2.gif" alt="国际新闻" />
			</h1>
			<div class="side_list">
				<ul>


					<li><a href="#"><b> 英拉议员资格获泰国选委会确认将当选女总理</b></a></li>

					<li><a href="#"><b> 默多克遭男子扔盘子袭击 妻子邓文迪反击护夫</b></a></li>

				</ul>
			</div>
			<h1>
				<img src="index_files/title_3.gif" alt="娱乐新闻" />
			</h1>
			<div class="side_list">
				<ul>


					<li><a href="#"><b> "变形金刚3"24位悍金刚列传</b></a></li>

				</ul>
			</div>
		</div>


		<div class="main">
			<div class="class_type">
				<img src="index_files/class_type.gif" alt="新闻中心" />
			</div>
			<div class="content">
				<ul class="class_date">
					<li id="class_month">
					<%
						TopicDao topicDao=new TopicDaoImpl();
						Map<Integer, Topic> maps=topicDao.findAllTopic();
						Set<Integer> keys=maps.keySet();
						for(Integer key:keys) {
					%>
					<a href="#"><b><%=maps.get(key).getTitle() %></b></a> </b></a>
					<% } %>
						</li>
				</ul>
				<ul class="classlist">
					<%
						NewsDao newsDao=new NewsDaoImpl();
						Map<Integer,News> newses=newsDao.showAllNews();
						Set<Integer> nkeys=newses.keySet();
						for(Integer nkey:nkeys){
						
					%>
					<li><a href="#"><%=newses.get(nkey).getNsummary() %> </a> <span> <%=newses.get(nkey).getNcreatedate()%></span></li>
					<%	
								}
					%>
					<p align="right">
						当前页数:[1/1]&nbsp;&nbsp; <a href="#">首页</a><a href="#">&nbsp;&nbsp;上一页</a><a
							href="#">&nbsp;&nbsp;下一页</a> <a href="#">&nbsp;&nbsp;末页</a>
					</p>

				</ul>
			</div>
			<div class="picnews">
				<ul>
					<li><a href="#"><img src="index_files/Picture1.jpg" alt=""
							width="249" /> </a><a href="#">幻想中穿越时空</a></li>
					<li><a href="#"><img src="index_files/Picture2.jpg" alt=""
							width="249" /> </a><a href="#">国庆多变的发型</a></li>
					<li><a href="#"><img src="index_files/Picture3.jpg" alt=""
							width="249" /> </a><a href="#">新技术照亮都市</a></li>
					<li><a href="#"><img src="index_files/Picture4.jpg" alt=""
							width="249" /> </a><a href="#">群星闪耀红地毯</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div id="friend">
		<h1 class="friend_t">
			<img src="index_files/friend_ico.gif" alt="合作伙伴">
		</h1>
		<div class="friend_list">
			<ul>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
				<li><a href="#">中国政府网</a></li>
			</ul>
			<div style="margin-left: 300px;">
				<br />本站在线人数：<span
					style="font-size: 20px; color: red; font-weight: bold;"> <%
 	if (lists != null) {
 		out.print(lists.size());
 	} else {
 		out.print(0);
 	}
 %>
				</span>人 &nbsp;&nbsp;本站访问量已经达到：<span
					style="font-size: 20px; color: blue; font-weight: bold;"><%=count %></span>
			</div>
		</div>
	</div>
	<div id="footer">
		<p class="">
			24小时客户服务热线：010-68988888 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">常见问题解答</a>
			&nbsp;&nbsp;&nbsp;&nbsp; 新闻热线：010-627488888 <br />
			文明办网文明上网举报电话：010-627488888 &nbsp;&nbsp;&nbsp;&nbsp; 举报邮箱： <a href="#">jubao@jb-aptech.com.cn</a>
		</p>
		<p class="copyright">
			Copyright &#169; 1999-2009 News China gov, All Right Reserver <br />
			新闻中国 版权所有
		</p>
	</div>

</body>
</html>