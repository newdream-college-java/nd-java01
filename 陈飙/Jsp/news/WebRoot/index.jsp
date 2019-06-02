<%@ page language="java" import="java.util.*,java.sql.*"
	pageEncoding="utf-8"%>
<%@page import="com.cc.entity.New"%>
<%@page import="com.cc.Dao.BaseDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.cc.entity.Topic"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<title>新闻中国</title>

<link href="index_files/main.css" rel="stylesheet" type="text/css" />
<script language="javascript">
	function check() {
		return true;
	}
</script>
</head>
<body>
	<%!//查询所有的主题信息
	public ResultSet getTopics() {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Topic tp = null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select Tname from topic ";//此处只能查询Tname
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("Tid");//这一句一定要加不然出不来
				String name = rs.getString("Tname");
				//此处可以用传入参数的也可以用不传入参数的
				//不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				tp = new Topic(id, name);
				/*  tp=new Topic();
				 tp.setTid(id);
				tp.setTname(name); */
				list.add(tp);
				//find=true;
			}
			System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//BaseDao.closeConn(rs, pst, conn);

		}
		return rs;
	}%>
	<%!public ResultSet getTopics01() {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		New nw = null;
		//boolean find=false;
		try {
			conn = BaseDao.getConn();
			String sql = "select nsummary from news;";//此处只能查询Tname
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("nid");//主建一定要写
				String ns = rs.getString("nsummary");
				//此处可以用传入参数的也可以用不传入参数的
				//不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
				nw = new New();
				nw.setNid(id);
				nw.setNsummary(ns);
				/*  tp=new Topic();
				 tp.setTid(id);
				tp.setTname(name); */
				list.add(nw);
				//find=true;
			}
			//

			//System.out.println(list);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//BaseDao.closeConn(rs, pst, conn);

		}
		return rs;
	}%>
	<div id="header">
		<div id="top_login">
			<%
				if (session.getAttribute("uname") == null) {
					//if (request.getParameter("uname") == null) {
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
			%>
			欢迎你，<%=(String) session.getAttribute("uname")%>| <a href="#">登录控制台</a>
			| <a href="loginOut.jsp">登出</a>
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
					<li id="class_month"><a href="#"><b>国内</b></a> <%
 	ResultSet rs1 = getTopics();
 	while (rs1.next()) {
 %> <a href="#"><b><%=rs1.getString("Tname")%></b></a> <%
 	}
 	rs1.close();
 %>
				</ul>
				<ul class="classlist">

					<li><a href="#"> 测试科技新闻 </a> <span> 2011-07-21
							08:38:05.0</span></li>
					<%
						//1.取index_control带过来的数据
						List<New> news = (List<New>) request.getAttribute("news");
						//2.显示数据
						for (New nw : news) {
					%>


					<li><a href="#"> <%=nw.getNauthor()%></a> <span> <%=nw.getNcreatedate()%></span></li>
					<%
						}
					%>


					<%
						ResultSet rs = getTopics01();
						while (rs.next()) {
					%>
					<li><a href="#"> <%=rs.getString("nsummary")%>
					</a> <span> 2011-07-20 22:27:27.0</span></li>
					<%
						}
						rs.close();
					%>
					<p align="right">
					<%if((Integer) request.getAttribute("curPage")==1){%>
					
					当前页数:[${curPage }/${pageMax }]&nbsp;&nbsp; <a
							href="index_control02.jsp?curPage=${curPage + 1}">&nbsp;&nbsp;下一页</a>
						<a
							href="index_control02.jsp?curPage=${pageMax }">&nbsp;&nbsp;末页</a>
						
					
						
					
					
					
						
					<%}else if((Integer) request.getAttribute("curPage")==(Integer) request.getAttribute("pageMax")){%>
						当前页数:[${curPage }/${pageMax }]&nbsp;&nbsp; <a href="index_control02.jsp?curPage=1">首页</a><a
							href="index_control02.jsp?curPage=<%=((Integer) request.getAttribute("curPage") - 1)%>">&nbsp;&nbsp;上一页</a>
					<%}else{
						%>
					
					
						当前页数:[${curPage }/${pageMax }]&nbsp;&nbsp; <a href="index_control02.jsp?curPage=1">首页</a><a
							href="index_control02.jsp?curPage=${ curPage - 1}">&nbsp;&nbsp;上一页</a><a
							href="index_control02.jsp?curPage=${curPage + 1}">&nbsp;&nbsp;下一页</a>
						<a
							href="index_control02.jsp?curPage=${pageMax }">&nbsp;&nbsp;末页</a>
							<%} %>
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
	<%=application.getAttribute("asd")%>
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
			<div style="margin-left:300px;">
				<br />本站在线人数：<span
					style="font-size: 20px;color:red;font-weight:bold;"> <%
 	List loginusers = null;
 	if (application.getAttribute("logined_user") != null) {
 		loginusers = (ArrayList) application
 				.getAttribute("logined_user");
 		out.print(loginusers.size());
 	} else {
 		out.print(0);
 	}
 %></span>人 &nbsp;&nbsp;本站访问量已经达到：<span
					style="font-size: 20px;color:blue;font-weight:bold;"> <%
 	int count = 0;
 	if (application.getAttribute("con") != null) {
 		count = (Integer) application.getAttribute("con");
 	}
 	application.setAttribute("con", ++count);
 	Integer icount = (Integer) application.getAttribute("con");
 	out.print(icount);
 %>
				</span>
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
