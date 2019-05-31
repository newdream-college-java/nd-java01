<%@ page language="java" import="java.util.*,java.sql.*,biao.*" pageEncoding="utf-8"%>

<html xmlns="http://www.w3.org/1999/xhtml"><head>
	<meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<title>新闻中国</title>
	
	<link href="index_files/main.css" rel="stylesheet" type="text/css"/>
	<script language="javascript">
		function check(){			
			return false;
		}
		
		
	</script>
</head>
<body>
<div id="header">
	<div id="top_login">
		<%
		if(session.getAttribute("uname1") ==null){
	 %>
		<form action="index_control.jsp" method="post" >
			用户名：<input id="uname" name="uname" class="login_input" type="text"/>
			<label> 密&nbsp;&nbsp;码 </label>
			<input id="upwd" name="upwd" value="" class="login_input" type="password"/>
			<input class="login_sub" value="登录" type="submit"/>
			<label id="error"> </label>
			<img src="index_files/friend_logo.gif" alt="Google" id="friend_logo"/>
		</form>
	<%
	
		}else{ %>
	
	
		欢迎你，<%=(String)session.getAttribute("uname1") %> | <a href="#">登录控制台</a> | <a href="loginOut.jsp">登出</a>
		<%} %>
  </div>
  <div id="nav">
    <div id="logo"> <img src="index_files/logo.jpg" alt="新闻中国"/> </div>
    <div id="a_b01"> <img src="index_files/a_b01.gif" alt=""/> </div>
    <!--mainnav end-->
  </div>
</div>
<div id="container">
<div class="sidebar">
    <h1> <img src="index_files/title_1.gif" alt="国内新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> 全国非时政类报刊出版单位2012年全面转制</b></a> </li>
      	
     		<li> <a href="#"><b> 中方强烈抗议菲律宾议员登上中国南沙岛屿</b></a> </li>
      	
      </ul>
    </div>
    <h1> <img src="index_files/title_2.gif" alt="国际新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> 英拉议员资格获泰国选委会确认将当选女总理</b></a> </li>
      	
     		<li> <a href="#"><b> 默多克遭男子扔盘子袭击 妻子邓文迪反击护夫</b></a> </li>
      	
      </ul>
    </div>
    <h1> <img src="index_files/title_3.gif" alt="娱乐新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> "变形金刚3"24位悍金刚列传</b></a> </li>
      	
      </ul>
    </div>
  </div>


  <div class="main">
    <div class="class_type"> <img src="index_files/class_type.gif" alt="新闻中心"/> </div>
    <div class="content">
      <ul class="class_date">
      	<li id="class_month">
      	
      	      		    		<%
    		
    			Connection con=null;
    			PreparedStatement pst=null;
    			ResultSet r=null;
    			try{
    				Class.forName("com.mysql.jdbc.Driver");
    				String url = "jdbc:mysql://127.0.0.1:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf8&useSSL=true";
			con = DriverManager.getConnection(url, "root", "123");
					String sql="select tname from topic";
					pst=con.prepareStatement(sql);
					r=pst.executeQuery();	
					
					while(r.next()){
   			 %>
   			 <a href="#"><b><%=r.getString("tname") %></b></a>
   			 <% 
    			}
    			}catch(Exception e){
    				e.printStackTrace();
    			}finally{
    			r.close();
    				pst.close();
    				con.close();
    			}
    	 %>
      	
      		
      		
      	
      </li></ul>
      <ul class="classlist">
				<%
					//1.取index_control带过来的数据
					List<news> n =(List<news>)request.getAttribute("news");
					Integer max=(Integer)request.getAttribute("max");
					//2.显示
					
					for(news nw : n){ %>

					<li><a href="#"> <%=nw.getNtitle() %> </a> <span>
							<%=nw.getNcreatedate() %></span></li>
						
					<%} %>
					<p align="right">
						当前页数:[<%=(Integer)request.getAttribute("curPage") %>/<%=max %>]&nbsp;&nbsp; <a href="jin.jsp?curPage=1">首页</a><a href="jin.jsp?curPage=
						<%
							if((Integer)request.getAttribute("curPage")==1){
								out.print((Integer)request.getAttribute("curPage"));						
							}else{
								
								out.print((Integer)request.getAttribute("curPage")-1);	
							}
						%>">&nbsp;&nbsp;上一页</a>
						<a href="jin.jsp?curPage=
						<%
							if((Integer)request.getAttribute("curPage")==3){
								out.print((Integer)request.getAttribute("curPage"));						
							}else{
								
								out.print((Integer)request.getAttribute("curPage")+1);	
							}
						%>
						">&nbsp;&nbsp;下一页</a>
<a href="jin.jsp?curPage=<%=max %>">&nbsp;&nbsp;末页</a></p>
       </ul>
    </div>
    <div class="picnews">
  <ul>
    <li> <a href="#"><img src="index_files/Picture1.jpg" alt="" width="249"/> </a><a href="#">幻想中穿越时空</a> </li>
    <li> <a href="#"><img src="index_files/Picture2.jpg" alt="" width="249"/> </a><a href="#">国庆多变的发型</a> </li>
    <li> <a href="#"><img src="index_files/Picture3.jpg" alt="" width="249"/> </a><a href="#">新技术照亮都市</a> </li>
    <li> <a href="#"><img src="index_files/Picture4.jpg" alt="" width="249"/> </a><a href="#">群星闪耀红地毯</a> </li>
  </ul>
</div>
  </div>
</div>

<div id="friend">
  <h1 class="friend_t"><img src="index_files/friend_ico.gif" alt="合作伙伴"></h1>
  <div class="friend_list">
    <ul>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
      <li> <a href="#">中国政府网</a> </li>
    </ul>
	<div style="margin-left:300px;">
	
		<%!int count =0; %>
    <%
    		//1.记录访问次数
    		application.setAttribute("cnt", ++count);
     %>
    
    	<br/>本站在线人数：<span style="font-size: 20px;color:red;font-weight:bold;">
    	<%
    	List<String> list02=(List<String>)application.getAttribute("list");
    	if(list02!=null){
    	out.print(list02.size());
    	}else{
    		out.print("0");
    	}
    	%>
    	</span>人
      	&nbsp;&nbsp;本站访问量已经达到：<span style="font-size: 20px;color:blue;font-weight:bold;"><%=application.getAttribute("cnt") %></span>
   </div>
  </div>
</div>
<div id="footer">
  <p class=""> 24小时客户服务热线：010-68988888 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">常见问题解答</a> &nbsp;&nbsp;&nbsp;&nbsp; 新闻热线：010-627488888 <br/>
    文明办网文明上网举报电话：010-627488888 &nbsp;&nbsp;&nbsp;&nbsp; 举报邮箱： <a href="#">jubao@jb-aptech.com.cn</a> </p>
  <p class="copyright"> Copyright &#169; 1999-2009 News China gov, All Right Reserver <br/>
    新闻中国 版权所有 </p>
</div>

</body></html>
