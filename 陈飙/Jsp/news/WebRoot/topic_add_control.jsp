<%@page import="java.sql.ResultSet"%>
<%@page import="com.cc.Dao.Impl.TopicDaoImpl"%>
<%@page import="com.cc.entity.Topic"%>


<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>表单提交</title>



</head>

<body>
	<%
		//1.设置提交文字编码
		request.setCharacterEncoding("utf-8");
		//2.拿到表格的数据  数据在request对象上
		String sname = request.getParameter("tname");
		
		boolean rs=getTopicByName(sname);
		
		if(rs==false){
			Topic tp = new Topic(20, sname);

		int result = new TopicDaoImpl().insert(tp);

		String message = result > 0 ? "新增主题成功" : "新增主题失败";
		out.print("<script>alert('" + message
				+ "');location.href='topic_add.jsp';</script>");
		}else{
			out.print("<script>alert('主题以存在');location.href='topic_add.jsp';</script>");
		}
		
	%>
	<%!public boolean getTopicByName(String title) {
		boolean find = false;//假设不存在
		//for (int i = 0; i < 20; i++) {
			Topic tp=new Topic();
		tp.setTname(title);
		 find=new TopicDaoImpl().selectTopic1(tp);
		//}
		return find;
	}%>
	
	
	<br>
</body>
</html>
