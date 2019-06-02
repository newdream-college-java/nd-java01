<%@ page language="java" import="java.util.*,BaseDao.*,entity.*" pageEncoding="utf-8"%>
<%@page import="BaseDao.imgl.topicDaoimgl"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topic_add_control.jsp' starting page</title>
    <meta http-equiv="cache-control" content="no-cache" charest="utf-8"/>
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
    	topicDaoimgl td=new topicDaoimgl();
    	boolean find=td.getByName(tname);
    	if(find==true){
    		out.print("<script>alert('主题已经存在！！')</script>");
    	}else{
    		Topic topic=new Topic(tname);
    		int result=td.save(topic);
    		if(result>0){
    			request.getRequestDispatcher("insertOk.jsp").forward(request,response);
    		}else{
    			out.print("<script>alert('添加主题失败！！')；locktion.href='topic_add.htm'</script>");
    		}
    	}
     %>
  </body>
</html>
