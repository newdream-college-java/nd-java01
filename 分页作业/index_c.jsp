<%@ page language="java" import="Dao.*,java.util.*,entity.*,imple.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index_c.jsp' starting page</title>
    
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
   			//2.取值（第一次请求分页 不需要取值）			
    //默认查询第一页
    int curPage=1;
    //默认每页查询3条
    int pageSize=3;
    
    //不是第一次请求
    String sCurPage=request.getParameter("curPage");
    if(sCurPage!=null){
    curPage=Integer.parseInt(sCurPage);
    }
    //3.调dao：调分页查询的查询
    Newsinterface nd=new Newsimplement();
    //这里通过limit方法 把存的第几页 几个数据的值放入 List集合 news集合中
    List<News> news=nd.limit(curPage,pageSize);
    
    //4.跳转到首页index.jsp
    if(news.size()>0){ //如果放进去了  name获取这一页的数据
    //获取到第一页的数据
    //转发
    //绑定当前页数据
     request.setAttribute("news",news);
    request.setAttribute("curpage",curPage);
    request.getRequestDispatcher("index.jsp").forward(request,response);
    }else{
    out.print("没有查到数据");
    }
    
    
    
     %>
    
    
  </body>
</html>
