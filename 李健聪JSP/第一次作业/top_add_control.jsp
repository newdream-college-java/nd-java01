<%@ page language="java" import="java.util.*,java.sql.*,Dao.*,entity.*,imple.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'top_add_control.jsp' starting page</title>
    
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
    String name=request.getParameter("tname");//接收传过来的数据
   	boolean find=getTopicByName(name);
    if(find==true){
    	out.print("<script>javascript:alert('已经存在了 大兄弟');location.href='top_add.jsp'</script>");
    }else{
    	Topic tp=new Topic();
    	tp.setTname(name);
    	TopicImplement top=new TopicImplement();
    	int line=top.add(tp);
    	String message=line>0?"新增主题成功":"新增主题失败";
    	out.print("<script>alert('"+message+"');location.href='topic_add.jsp';</script>");
    }
    //String sname=request;
    %>
   <%! 
   	//根据主题标题查询该主题是否存在
   	public boolean getTopicByName(String title){
   		boolean find=false;
   		Topic tp=new Topic();
   		tp.setTname(title);
   		TopicImplement top=new TopicImplement();
   		return top.save(tp);
   	};
   %>
    
  </body>
</html>
