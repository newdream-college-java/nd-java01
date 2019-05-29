<%@ page language="java" import="java.util.*,Dao.*,entity.*,imple.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@include file="loginCtrol.jsp" %>
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
    request.setCharacterEncoding("utf-8");
    String adname=request.getParameter("uname1");//接收传过来的数据
    String ps=request.getParameter("upwd");
    //首先新建一個 集合
    List loginedUsers=new ArrayList();
    if(application.getAttribute("logined_user")!=null){
    	loginedUsers=(ArrayList)application.getAttribute("logined_user");
    }
    application.setAttribute("logined_user",loginedUsers);
    request.getRequestDispatcher("index.jsp").forward(request,response);
   	boolean find1=login(adname,ps); 
    News_users ne=new News_users();
    ne.setUname(adname);
    ne.setUpwd(ps);
   	
    if(find1==false){
    	out.print("<script>javascript:alert('用户不存在哦，大兄弟');location.href='index.jsp'</script>");
    }else{ 	
    	login(adname,ps);
    	//response.
    	String message="马上进入";
    	out.print("<script>alert('"+message+"');location.href='index.jsp';</script>");
    	response.sendRedirect("admin.jsp");
    	//String message=line>0?"新增主题成功":"新增主题失败";
    	//out.print("<script>alert('"+message+"');location.href='topic_add.jsp';</script>");
    	
    }
    %>
   <%! 
   public boolean login(String uname,String upwd){
   	boolean find=false;
   	
   	
   	News_usersImplement n=new News_usersImplement();
   	News_users ne=new  News_users();
   	ne.setUname(uname);
   	ne.setUpwd(upwd);
   	//Topic tp=new Topic();
   //		tp.setTname(title);
   	//	TopicImplement top=new TopicImplement();
   	//	return top.save(tp);
   	find =n.select(ne);
    return  find;
   };
   
   %>
   
  </body>
</html>
