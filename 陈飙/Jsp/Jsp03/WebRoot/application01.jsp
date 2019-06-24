<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>application01.jsp</title>
    
	

  </head>
  <%--public class Person{
  		int count = 0;
  		public  void service(){
  			count++;
  			输出count;
  		}
  	}
   --%>
  <body>
  <%!//int count=0; %>
    <%
    	//思路是在进行统计的时候给个if判断，先统计次数，然后判断，第一浏览创建一个存储次数变量，
    	//不是第一访问该页面，就把先前保存的拿出来，加+1后再放进次数变量中，最后输出
    	//统计该页面的访问次数
    	Object count=application.getAttribute("count");
    	if(count==null){
    	//第一次访问该页面是，需要创建一个存储访问次数的变量，并将其放进application
    	application.setAttribute("count", 1);
    	}else{
    	//非第一访问该页面，去application中先将记录的次数的变量拿出来，+1，将最新访问次数数量放进application中
    	Integer i=(Integer)count;
    	application.setAttribute("count", ++i);//++i先自增后赋值（看++的位置，在前面就自增，在后面就先赋值后增长）
    	}
    	//int cntStr=(Integer)application.getAttribute("count");
    	//application.setAttribute("cnt", ++count); %>
    	访问量：<%=(Integer)application.getAttribute("count") %>次
    	<br>
  </body>
</html>
