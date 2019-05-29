<%@ page language="java" import="java.util.*,java.sql.*,entity.*,Dao.*" pageEncoding="UTF-8"%>
<html><head><meta http-equiv="pragma" content="no-cache"/>
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
  <div id="status">管理员： 登录  &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">退出</a></div>
  <div id="channel"> </div>
</div>
<%! 
	public ResultSet getTopics(){
	List list=new ArrayList();
	Connection conn=null;
	PreparedStatement  pst=null;
	ResultSet rs=null;
	Topic  tp=null;
	try{
	conn=BaseDao.getConn();
	String sql="select Tname from Topic";
	pst=conn.prepareStatement(sql);
	rs=pst.executeQuery();
	 while(rs.next()){
				 int id=rs.getInt("Tid");//这一句一定要加不然出不来
				 String name=rs.getString("Tname");
				  tp=new Topic(id,name);
				 //此处可以用传入参数的也可以用不传入参数的
				 //不用传入参数的可以自己定义穿那些，然后把定义的方法集合里面出。
			//	tp.setTname(rs.getString("Tname"));
				 /*  tp=new Topic();
				  tp.setTid(id);
				 tp.setTname(name); */
				 list.add(tp);
				 //find=true;
			 }
	
	}catch(Exception  e){
	e.printStackTrace();
	}finally{
	//BaseDao.closeConn(rs,conn,pst);
	}
	return rs;
	}
%>


<ul class="classlist">
<% 
	ResultSet rs=getTopics();
	while(rs.next()){
		
%>
   <li> &nbsp;&nbsp;&nbsp;&nbsp; <%=rs.getString("Tname")%>&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </li>
<%	}
	rs.close();
 %>
 	<p align="right">当前页数:[1/3]&nbsp;<a href="#">下一页&nbsp;&nbsp;</a></p>
</ul>




<script language="javascript">
	function clickdel(){
		return confirm("确认删除吗？");
	}	
</script>


<div id="main">
  <div id="opt_list">
  <ul>
    <li><a href="#">添加新闻</a></li>
    <li><a href="#">编辑新闻</a></li>
    <li><a href="#">添加主题</a></li>
    <li><a href="#">编辑主题</a></li>
  </ul>
</div>
  <div id="opt_area">
    <ul class="classlist">
    		<li> &nbsp;&nbsp;&nbsp;&nbsp; 国内&nbsp;&nbsp;&nbsp;&nbsp; <a href="#">修改</a> &nbsp;&nbsp;&nbsp;&nbsp; <a href="#" onclick="return clickdel()">删除</a> </li>
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

</body></html>