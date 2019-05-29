<%@ page language="java" import="java.util.*,com.cc.entity.*,com.cc.dao.*,com.cc.dao.impl.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>办业务员的人</title>
  </head>
  
  <body>
    <%
    		//1.编码
    		request.setCharacterEncoding("utf-8");
    		//2.取值
    		String spid = request.getParameter("pid");
    		int pid = -1;
    		if(spid!=null&&spid.trim().length()>0){
    			pid = Integer.parseInt(spid);
    		}
    		String uname = request.getParameter("pname");
    		String sisMarried = request.getParameter("isMarried");
    		int isMarried= 1;
    		if(sisMarried!=null&&sisMarried.trim().length()>0&&sisMarried.equals("是")){
    			isMarried=0;
    		}
    		String perAge = request.getParameter("page");
    		int age = -1;
    		if(perAge!=null&&perAge.trim().length()>0){
    			age = Integer.parseInt(perAge);
    		}
    		//封装
    		Person person = new Person(uname,isMarried,age);
    		person.setId(pid);
    		out.print(person);
    		//3.调dao：调dao的更新的方法
    		int result = new PersonDaoImpl().updatePerson(person);
    		//4.跳转
    		if(result>0){
    			response.sendRedirect("updateOk.jsp");
    		}else{
    		
    		}
    
    
     %>
  </body>
</html>
