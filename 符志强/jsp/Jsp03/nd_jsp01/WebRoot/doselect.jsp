<%@ page language="java" import="java.util.*,com.cc.entity.*,com.cc.dao.imp.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'toInsert.jsp' starting page</title>
    
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
	int id=Integer.parseInt(request.getParameter("id"));
	MasterDaoImp mdi=new MasterDaoImp();
	List<Master> list=mdi.list(id);
	if(list.size()>0){
		request.setAttribute("master",list);
		request.getRequestDispatcher("selectOK.jsp").forward(request,response);
	}else{
		out.print("<script>javascript:alert('错了')</script>");
	}
	 %>
  </body>
</html>
