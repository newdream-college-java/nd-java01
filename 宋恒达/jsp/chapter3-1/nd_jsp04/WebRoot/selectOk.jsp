<%@ page language="java" import="java.util.*,com.cc.entity.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>发结果的人</title>
  </head>
  
  <body>
  	<%
  		//1.得到数据
  		List<Person> persons = (List<Person>)request.getAttribute("persons");
  		///2.显示数据
  		for(Person p :persons){
  			System.out.print(p.getId()+"\t"+p.getName()+"\t");
  		}
  	 %>
    	<table align="center" border="1" width="60%">
    		<tr>
    			<th>编号</th>
    			<th>姓名</th>
    			<th>婚否</th>
    			<th>年</th>
    		</tr>
    		<%for(Person p :persons){ %>
    		<tr>
    			<th><%=p.getId()%></th>
    			<th><%=p.getName()%></th>
    			<th><%=p.getIsMarried()%></th>
    			<th><%=p.getAge()%></th>
    		</tr>
    		<%} %>
    	</table>
  </body>
</html>
