<%@page import="cn.song.entity.Topic"%>
<%@page import="cn.song.dao.impl.TopicDaoImpl"%>
<%@page import="cn.song.dao.TopicDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<%
	request.setCharacterEncoding("utf-8");
	String title=request.getParameter("tname").trim();
	Topic topic=new Topic();
	topic.setTitle(title);
	TopicDao topicDao=new TopicDaoImpl();
	String message="新增主题失败";
	if(!topicDao.exitTopic(topic)){
		if(topicDao.addTopic(topic)){
			message="新增主题成功";
		}
	}
	out.print("<script>alert('"+message+"');location.href='topic_add.jsp';</script>");
%>
<body>

</body>
</html>