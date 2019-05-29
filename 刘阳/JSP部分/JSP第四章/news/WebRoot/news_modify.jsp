<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html><head><meta http-equiv="pragma" content="no-cache"/>
<meta http-equiv="cache-control" content="no-cache"/>
<title>新闻发布系统管理后台</title>
<link href="news_modify_files/admin.css" rel="stylesheet" type="text/css"/>
</head><body>
<%@include file="loginCtrol.jsp" %>
<div id="header">
  <div id="welcome">欢迎使用新闻管理系统！</div>
  <div id="nav">
    <div id="logo"><img src="news_modify_files/logo.jpg" alt="新闻中国"></div>
    <div id="a_b01"><img src="news_modify_files/a_b01.gif" alt=""></div>
  </div>
</div>
<div id="admin_bar">
  <div id="status">管理员： 登录  &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">退出</a></div>
  <div id="channel"> </div>
</div>


<script type="text/javascript">
	function check(){
		
			return false;
		
	}
</script>

<div id="main">
  <div id="opt_list">
  <%@include file="nav.jsp" %>
</div>

  <div id="opt_area">
    <h1 id="opt_type"> 添加新闻： </h1>
    <form action="" method="post" onsubmit="return check()">
      <p>
        <label> 主题 </label>
        <select name="ntid" id="ntid">
        	
        		
        		<option value="1">国内</option>
        	
        		
        		<option value="2">国际</option>
        	
        		
        		<option value="3">军事</option>
        	
        		
        		<option value="4">体育</option>
        	
        		
        		<option value="5">娱乐</option>
        	
        		
        		<option value="6">社会</option>
        	
        		
        		<option value="7">财经</option>
        	
        		
        		<option value="8" selected="selected">科技</option>
        	
        		
        		<option value="9">健康</option>
        	
        		
        		<option value="10">汽车</option>
        	
        		
        		<option value="11">教育</option>
        	
        		
        		<option value="12">房产</option>
        	
        		
        		<option value="13">家居</option>
        	
        		
        		<option value="14">旅游</option>
        	
        		
        		<option value="15">文化</option>
        	
        		
        		<option value="16">其他</option>
        	
        </select>
        <input name="nid" id="nid" value="21" type="hidden"/>
      </p>
      <p>
        <label> 标题 </label>
        <input name="ntitle" id="ntitle" class="opt_input" value="测试科技新闻" type="text"/>
      </p>
      <p>
        <label> 作者 </label>
        <input name="nauthor" id="nauthor" class="opt_input" value="turing" type="text"/>
      </p>
      <p>
        <label> 摘要 </label>
        <textarea name="nsummary" id="nsummary" cols="40" rows="3">测试</textarea>
      </p>
      <p>
        <label> 内容 </label>
        <textarea name="ncontent" id="ncontent" cols="70" rows="10">如题</textarea>
      </p>
      <p>
        <label> 上传图片 </label>
        <input name="file" class="opt_input" type="file"/>
      </p>
      <input value="提交" class="opt_sub" type="submit"/>
      <input value="重置" class="opt_sub" type="reset"/>
    </form>
    <h1 id="opt_type">
		修改新闻评论：
	</h1>
      <table align="left" width="80%">
      
      
      	<tbody><tr><td colspan="6"> 暂无评论！ </td>
         </tr><tr>
           <td colspan="6"><hr/>
           </td>
         </tr>
      
      
      </tbody></table>
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