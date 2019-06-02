<%@page import="com.cc.Dao.Impl.TopicDaoImpl"%>
<%@include file="loginCtrol.jsp" %>
<%@ page language="java" import="java.util.*,java.sql.*,com.cc.entity.*,com.cc.Dao.*" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="pragma" content="no-cache" />
<meta http-equiv="cache-control" content="no-cache" />
<title>新闻发布系统管理后台</title>
<link href="news_add_files/admin.css" rel="stylesheet" type="text/css" />
</head>
<body>
<%!public ResultSet getTopics() {
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
}
%>
	<div id="header">
		<div id="welcome">欢迎使用新闻管理系统！</div>
		<div id="nav">
			<div id="logo">
				<img src="news_add_files/logo.jpg" alt="新闻中国">
			</div>
			<div id="a_b01">
				<img src="news_add_files/a_b01.gif" alt="">
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

			return true;

		}
	</script>

	<div id="main">
		<div id="opt_list">
			<%@include file="nav.jsp" %>
		</div>

		<div id="opt_area">
			<h1 id="opt_type">添加新闻：</h1>
			<form action="news_add_control03.jsp" method="post"
				onsubmit="return check()" enctype="multipart/form-data">
				<p>
					<label> 主题 </label> <select name="ntid" id="nid">

						<option selected="selected" value="1">国内</option>
						
						<%
						ResultSet rs=getTopics();
						while(rs.next()){%>
							<option value="2"><%=rs.getString("Tname") %></option>
						<%}
						rs.close();
						%>
						

						
							<%-- <%//在不用传数据的时候，返回是个集合直接显示不用定义参数的时候，直接在要显示的页面把集合调用方法
							//就可以了
								List<String> topic = new TopicDaoImpl().selectTopic();
							//循环输出集合的东西用这个就好像永不增强for循环
							for(int i=0;i<topic.size();i++){%>
								<% if(i==0){%>
									<option selected="selected" value=<%=i+1 %>><%=topic.get(i) %></option>
								<% }else{%>
									<option value=<%=i+1 %>><%=topic.get(i) %></option>
								<% }
							}
							%> --%>
						


					</select>
				</p>
				<p>
					<label> 标题 </label> <input name="ntitle" id="ntitle"
						class="opt_input" type="text" />
				</p>
				<p>
					<label> 作者 </label> <input name="nauthor" id="nauthor"
						class="opt_input" type="text" />
				</p>
				<p>
					<label> 摘要 </label>
					<textarea name="nsummary" id="nsummary" cols="40" rows="3"></textarea>
				</p>
				<p>
					<label> 内容 </label>
					<textarea name="ncontent" id="ncontent" cols="70" rows="10"></textarea>
				</p>
				<p>
					<label> 上传图片 </label> <input name="file" class="opt_input"
						type="file" />
				</p>
				<input value="提交" class="opt_sub" type="submit" /> <input value="重置"
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
