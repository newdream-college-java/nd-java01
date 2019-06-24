<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>search.jsp</title>
    <script type="text/javascript" src="js/zuoye.js"></script>
	

  </head>
  
  <body>
   <p>Ajax实现搜索提示</p><br>
   <form action="SearchSuggest" id="formSearch" method="post">
   <input type="text" id="search" name="search" onkeyup="searchSuggest()" autocomplete="off"/>
   <input type="submit" value="搜索">
   <div id="suggest" style="width:152px"></div>
   </form>
  </body>
</html>
