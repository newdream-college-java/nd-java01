<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.cc.Dao.Impl.UserDaoImpl"%>
<%@page import="com.cc.entity.User"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>管理员登录操作</title>
    
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
  	//1.先设置编译转码
  	request.setCharacterEncoding("utf-8");
  	//2.拿到表单上的数据，数据在request上。
  	String name=request.getParameter("uname");
  	String pwd=request.getParameter("upwd");
  	//都是字符串不用转型
  	boolean rs=login(name, pwd);
  	if(!rs){
  		//登录失败
  		out.print("<script>alert('登录失败，请重新登录');location.href='index.jsp';</script>");
  	}else{
  	//登录成功
  	request.getRequestDispatcher("index.jsp").forward(request, response);
  		
  	}
  	 %>
    <%!
    	public boolean login(String uname,String upwd){
    	boolean find=false;
    	User us=new User();
		us.setUname(uname);
		us.setUpwd(upwd);
		
		 find=new UserDaoImpl().selectLogin1(us);
    	return find;
    	}
     %><br>
  </body>
</html>
