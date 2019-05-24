<%@ page language="java" import="java.util.*,BaseDao.imgl.*,entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doinsert.jsp' starting page</title>
    
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
		String sname=request.getParameter("sname"); 
		String sage=request.getParameter("sage");
    	String sbirthday=request.getParameter("sbirthday");
    	int age=Integer.parseInt(sage);
    	Stu_info stuinfo = new Stu_info(sname,age,sbirthday);
    	Stu_infoDaoImgl s=new Stu_infoDaoImgl();
    	int result=s.save(stuinfo);
    	if(result>0){
    		request.getRequestDispatcher("insertOk.jsp").forward(request,response);
    	}else{
    		out.print("<script>javascript:alert('添加失败');</script>");
    	}
     %>
  </body>
</html>
