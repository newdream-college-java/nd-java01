<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'request_show.jsp' starting page</title>
    
	

  </head>
  
  <body>
    <%request.setCharacterEncoding("utf-8"); %> 
    你的选择的兴趣爱好是：<br>
    <%//获取它的值，因为是个集合，所以要强转集合的到小为.size();
    List<String> list1=(ArrayList)session.getAttribute("aihao");
    for(int i=0;i<list1.size();i++){
    out.print(list1.get(i)+"<br/>");
    }
     %>
  </body>
</html>
