<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="commot/taglib.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index_controls.jsp' starting page</title>
    
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
  	String curpage=request.getParameter("curPage");
    int cpage=1;
    int pageSize=3;
    if(curpage!=null){
     	cpage=Integer.parseInt(curpage);
    }
    NewsDaoImp nd=new NewsDaoImp();
    News nes=new News();
    int count=nd.count();
    List li=nd.list(cpage, pageSize);
    if(li.size()>0){
      request.setAttribute("li", li);
      request.setAttribute("count",count);
      request.setAttribute("pageSize",pageSize);
      request.setAttribute("cpage", cpage);
      request.getRequestDispatcher("index.jsp").forward(request, response);
    }else{
    	response.sendRedirect("index_controls.jsp");
    }
   %>  
  </body>
</html>
