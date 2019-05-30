<%@ page language="java"
	import="java.util.*,com.dao.impl.*,com.entity.*,com.dao.*"
	pageEncoding="UTF-8"%>
<%@page import="javax.servlet.jsp.tagext.TryCatchFinally"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'topic_add_control.jsp' starting page</title>

	</head>

	<body>
		<div align="left">
			<%
				//编码
				request.setCharacterEncoding("utf-8");
				//取值
				String title = request.getParameter("tname");
				//dao
				//TopicDaoImpl tdi=new TopicDaoImpl();
				boolean find = getTopicByName(title);
				//out.print(find);
				//结果
				if (find == false) {
					Topic tp = new Topic(title);
					//out.print(title);
					TopicDaoImpl tdi= new TopicDaoImpl();
					int result =tdi.insertTopic(tp);
					String message = result > 0 ? "新增主题成功" : "新增主题失败";
					out.print("<script>alert('" + message+ "');location.href='topic_add.jsp';</script>");
				} else {
					out.print("<script>alert('主题以存在');location.href='topic_add.jsp';</script>");
				}
			%>
			<%!public boolean getTopicByName(String title) {
				boolean find = false;
				TopicDaoImpl tdi = new TopicDaoImpl();
				find = tdi.getTopicByName(title);
				return find;
			}%>
		</div>
	</body>
</html>
