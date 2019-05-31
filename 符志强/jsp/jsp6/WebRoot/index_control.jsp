<%@ page language="java" import="java.util.*,biao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index_control.jsp' starting page</title>
    
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
   //改编码
  	request.setCharacterEncoding("utf-8");
  	//获取表单数据
  	String uname=request.getParameter("uname");
  	String upwd=request.getParameter("upwd");
 
	//创建集合
	List<String> list=new ArrayList<String>();
	//判断list的值是否为空
	if(application.getAttribute("list")!=null){
		//把list的值存入list
		list=(List<String>)application.getAttribute("list");
	}

  	//调用bao方法
  	News_usersDaoImp td=new News_usersDaoImp();
	boolean falg=td.getName(uname,upwd);
	//跳转
	if(falg){
		//把uname的值添加到集合list里
		list.add(uname);
		//把值存入list
		application.setAttribute("list",list);
		//在session对象中加入名为uname1的属性并附值为uname
		session.setAttribute("uname1",uname);
		response.sendRedirect("jin.jsp");
		//request.getRequestDispatcher("index.jsp").forward(request, response);
	}else{		
		out.print("<script>javascript:alert('登录失败，请重新登录');location.href='jin.jsp'</script>");
	}
  %>
 
  </body>
</html>
