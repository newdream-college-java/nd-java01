<%@ page language="java" import="java.util.*,BaseDao.*,entity.*" pageEncoding="utf-8"%>
<%@page import="BaseDao.imgl.Stu_infoDaoImgl"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doselect.jsp' starting page</title>
    
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
    	String sid=request.getParameter("sid");
    	int id=0;
    	if(sid!=null&&sid.trim().length()>0){
    	 	id = Integer.parseInt(sid);
    	}
    	Stu_infoDaoImgl s=new Stu_infoDaoImgl();
    	List<Stu_info> list=s.select(id);
    	out.println(list);
    	if(list.size()>0){
    		request.setAttribute("list",list);
    		//2.跳转
    		request.getRequestDispatcher("selectOk.jsp").forward(request, response);
    	}else{
    		out.print("<script>alert('亲，查询的人不存在; 请重新输入编号！')</script>");
    	}
     %>
  </body>
</html>
