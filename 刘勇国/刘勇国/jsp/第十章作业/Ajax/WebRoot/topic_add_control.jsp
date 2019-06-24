<%@ page language="java" import="java.util.*,com.cc.entity.*,com.cc.dao.imp.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topic_add_control.jsp' starting page</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%
  	request.setCharacterEncoding("utf-8");
  	String tname=request.getParameter("tname");
  	TopicDaoImp td=new TopicDaoImp();
	boolean falg=td.getName(tname);
	if(falg){
		out.print("<script>javascript:alert('主题已经存在，请重新添加');location.href='topic_add.jsp'</script>");
	}else{
		int line=td.save(tname);
		String  message = line>0?"新增主题成功":"新增主题失败";
		out.print("<script>javascript:alert('"+message+"');location.href='topic_add.jsp'</script>");
	}
  %>
    
  </body>
</html>