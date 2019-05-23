<%@ page language="java" import="java.util.*,Dao.*,entity.*,Marriimp.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>婚姻填表登陆界面</title>
    
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
    <h1>hello你来啦</h1>
    <%
    	request.setCharacterEncoding("utf-8");
   		//拿到表格的数据，数据在resquest对象上
   		//拿到name值
   		String name=request.getParameter("name");
   		//创建Marri对象
   		Marri marri=new Marri(name,0,0);
   		//创建实现类对象
   		Marriimplement mi=new Marriimplement();
   		//调用实现类方法，并且通过int类型rs来记影响的行数
   		int rs=mi.update(marri);
   		if(rs>0){
   		out.print("<script>javascript:alert('恭喜你修改成功')</script>");
   		response.sendRedirect("MarriOK.jsp");
   		}else{
   		   		out.print("<script>javascript:alert('小伙子修改失败了')</script>");
   		
   		}
   		
    %>
  </body>
</html>
