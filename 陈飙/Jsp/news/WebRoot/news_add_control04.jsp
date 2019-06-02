<%@page import="com.cc.Dao.Impl.NewDaoImpl"%>
<%@page import="com.cc.Dao.NewDao"%>
<%@page import="com.cc.Dao.Impl.TopicDaoImpl"%>
<%@page import="com.cc.Dao.TopicDao"%>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>news_add_control04.jsp01</title>


</head>

<body>
	<%
		//1.编码

		//2.取值

		//3.掉用dao
		//NewDao nd=new NewDaoImpl();
		//TopicDao tp1 = new TopicDaoImpl();
		//out.print(tp1);
		/* out.print(nd.selectAll());
		List<Topic> topic = nd.selectAll();
		
		//out.print(arg0)
		//out.print(topic);
		if(topic.size()>0){
			//把集合方保存起来用request传递（session,request，app都可以用只不过，考虑节省资源用request，只在本次请求有效）
			request.setAttribute("news", topic);
			//使用转发带数据过去
			request.getRequestDispatcher("news_add.jsp").forward(request, response);
		}else{
		out.print("<script>alert('查询失败');location.href='index.jsp';</script>");
		
		
		} */
		//4.跳转
	%><br>
</body>
</html>
