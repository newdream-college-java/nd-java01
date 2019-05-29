<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<% if(session.getAttribute("uname")==null){ 
		out.print("<script>javascript:alert('您尚未登录不允许访问！');location.href='index.jsp';</script>"); 
		}else{%> 
		欢迎你，<%=session.getAttribute("uname")%> | <a href="#">登录控制台</a> | <a href="#">登出</a></font>
		<font face="Arial"><%}%>
