<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <meta http-equiv="pragma" content="no-cache"/>
	<meta http-equiv="cache-control" content="no-cache"/>
	<title>新闻中国</title>
	
	<link href="news_read_files/main.css" rel="stylesheet" type="text/css"/>
	<script language="javascript">
		function check(){
			return false;
		}
		
		
	</script>
</head>
<body >
<div id="header">
	<div id="top_login">	
		<form action="" method="post" onsubmit="return check()">
			用户名<input id="uname" name="uname" class="login_input" type="text"/>
			<label> 密&nbsp;&nbsp;码 </label>
			<input id="upwd" name="upwd" value="" class="login_input" type="password"/>
			<input class="login_sub" value="登录" type="submit"/>
			<label id="error"> </label>
			<img src="news_read_files/friend_logo.gif" alt="Google" id="friend_logo"/>
		</form>
  </div>
  <div id="nav">
    <div id="logo"> <img src="news_read_files/logo.jpg" alt="新闻中国"/> </div>
    <div id="a_b01"> <img src="news_read_files/a_b01.gif" alt=""/> </div>
    <!--mainnav end-->
  </div>
</div>


<link href="news_read_files/read.css" rel="stylesheet" type="text/css"/>
<link href="news_read_files/news_read_main.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
	function checkComment(){
		var cauthor = document.getElementById("cauthor");
		var content = document.getElementById("ccontent");
		if(cauthor.value == ""){
			alert("用户名不能为空！！");
			return false;
		}else if(content.value == ""){
			alert("评论内容不能为空！！");
			return false;
		}
		return true;
	}
</script>


<div id="container">
  




<div class="sidebar">
    <h1> <img src="news_read_files/title_1.gif" alt="国内新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> 全国非时政类报刊出版单位2012年全面转制</b></a> </li>
      	
     		<li> <a href="#"><b> 中方强烈抗议菲律宾议员登上中国南沙岛屿</b></a> </li>
      	
      </ul>
    </div>
    <h1> <img src="news_read_files/title_2.gif" alt="国际新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> 英拉议员资格获泰国选委会确认将当选女总理</b></a> </li>
      	
     		<li> <a href="#"><b> 默多克遭男子扔盘子袭击 妻子邓文迪反击护夫</b></a> </li>
      	
      </ul>
    </div>
    <h1> <img src="news_read_files/title_3.gif" alt="娱乐新闻"/> </h1>
    <div class="side_list">
      <ul>
      	
      	
     		<li> <a href="#"><b> "变形金刚3"24位悍金刚列传</b></a> </li>
      	
      </ul>
    </div>
  </div>


  
  
  <div class="main">
    <div class="class_type"> <img src="news_read_files/class_type.gif" alt="新闻中心"/> </div>
    <div class="content">
      <ul class="classlist">
        <table align="center" width="80%">
          <tbody><tr width="100%">
            <td colspan="2" align="center">全国非时政类报刊出版单位2012年全面转制</td>
          </tr>
          <tr>
            <td colspan="2"><hr/>
            </td>
          </tr>
          <tr>
            <td align="center">作者：新华网                                   
            
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

              类型：<a href="#">国内</a></td>
            <td align="left" width="25%">发布时间：11-07-20 22:28</td>
          </tr>
          <tr bgcolor="aliceblue">
            <td colspan="2" align="left"><strong>摘要：新华网重庆7月20日电(记者 张琴 黄小希)记者从20日在重庆召开的全国新闻出版局长座谈会获悉，全国非时政类报刊出版单位将在2012年9月底前全面完成转制任务，中央和地方同步推进，分批次进行</strong></td>
          </tr>
          <tr>
            <td colspan="2" align="center"></td>
          </tr>
          <tr>
            <td colspan="2">　新闻出版总署署长柳斌杰表示，下一步文化体制改革要重点抓好非时政类报刊出版单位体制改革，
要求在2012年9月底前全面完成转制任务。目前，中央各部门各单位以及各地区均已行动起来，山东、湖南等省(区、市)公布了本地非时政类报刊出版单位转
制名单，中央也将很快公布名单，并下发转制规程，首批转制的中央各部门各单位非时政类报刊出版单位将在今年底前完成转制任务。

　　柳斌杰说，目前，新闻出版体制改革进入深水区，能否在重要领域和难点问题上取得新突破，直接关系国家文化体制改革整体进程，直接关系新闻出版强国目标
的实现。推进非时政类报刊出版单位转制是全国文化体制改革的一项重点工作，也是今年新闻出版体制改革的核心工作。

　　6月29日，中央宣传部、新闻出版总署联合召开电视电话会议，对这项工作进行全面动员部署。</td>
          </tr>
          <tr>
            <td colspan="6">&nbsp;
            </td>
          </tr>
          <tr>
            <td colspan="2"><hr/>
            </td>
          </tr>
        </tbody></table>
      </ul>
      <ul class="classlist">
        <table align="center" width="80%">
        
        
        
        	
				<tbody><tr>
				    <td> 留言人： </td>
				    <td>风过无痕</td>
					<td> IP： </td>
					<td>127.0.0.1</td>
					<td> 留言时间： </td>
					<td>11-07-26 10:36</td>
				</tr>
				<tr>
					<td colspan="6">支持，强烈支持！</td>
				</tr>
				<tr>
					<td colspan="6"><hr/>
					</td>
				</tr>
        	
				<tr>
				    <td> 留言人： </td>
				    <td>不知道我呀!</td>
					<td> IP： </td>
					<td>127.0.0.1</td>
					<td> 留言时间： </td>
					<td>11-07-26 10:33</td>
				</tr>
				<tr>
					<td colspan="6">什么玩意儿！</td>
				</tr>
				<tr>
					<td colspan="6"><hr/>
					</td>
				</tr>
        	
        
        </tbody></table>
      </ul>
      <ul class="classlist">
        <form action="" method="post" onsubmit="return checkComment()">
          <table align="center" width="80%">
            <tbody><tr>
              <td> 评 论 </td>
            </tr>
            <tr>
              <td> 用户名： </td>
              <td><input id="cauthor" name="cauthor" value="这家伙很懒什么也没留下"/>
                IP：
                <input name="cip" value="127.0.0.1" readonly="readonly"/>
              </td>
            </tr>
            <tr>
              <td colspan="2"><textarea name="ccontent" cols="70" rows="10"></textarea>
              </td>
            </tr>
            <tr><td><input name="submit" value="发  表" type="submit"/>
              </td>
          </tr></tbody></table>
        </form>
      </ul>
    </div>
  </div>
</div>
  
  
  
  
  
  
  
  

<div id="friend">
  <h1 class="friend_t"><img src="news_read_files/friend_ico.gif" alt="合作伙伴"></h1>
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
  </div>
</div>
<div id="footer">
  <p class=""> 24小时客户服务热线：010-68988888 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">常见问题解答</a> &nbsp;&nbsp;&nbsp;&nbsp; 新闻热线：010-627488888 <br/>
    文明办网文明上网举报电话：010-627488888 &nbsp;&nbsp;&nbsp;&nbsp; 举报邮箱： <a href="#">jubao@jb-aptech.com.cn</a> </p>
  <p class="copyright"> Copyright &#169; 1999-2009 News China gov, All Right Reserver <br/>
    新闻中国 版权所有 </p>
</div>

  </body>
</html>
