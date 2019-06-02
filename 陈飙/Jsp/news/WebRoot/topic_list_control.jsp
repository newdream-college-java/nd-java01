<%@page import="com.cc.Dao.Impl.TopicDaoImpl"%>
<%@page import="com.cc.Dao.TopicDao"%>
<%@page import="com.cc.entity.Topic"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'topic_list_control.jsp' starting page</title>



</head>

<body>
	<%
		//1.编码
		int pageSize = 1;
		int curPage = 10;
		//2.取值
		String sPageSize=request.getParameter("pageSize");
		if(sPageSize!=null){
		//转换为包装类型
		 pageSize=Integer.parseInt(sPageSize);
		}
		//3.掉dao
		TopicDao tp = new TopicDaoImpl();
		//tp.getTopic(pageSize, curPage);
		//out.print(tp);
		//out.print(tp.getTopic(pageSize, curPage));
		int pageSizeMax=tp.pageSizeMax(curPage);
		List<Topic> topic=tp.getTopic(pageSize, curPage);//此处是实体类型所以要导实体类型的包
		 out.print(topic);
		 if(topic.size()>0){
		 	request.setAttribute("Topic", topic);
		 	request.setAttribute("pageSize", pageSize);
		 	request.setAttribute("pageSizeMax",pageSizeMax);
		 	request.getRequestDispatcher("topic_list.jsp").forward(request, response);
		 }else{
		 	out.print("<script>alert('查询失败');location.href='topic_list_control.jsp';</script>");
		 }
		
		//4.跳转
	%>
	<br>
</body>
</html>
