<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	if(session.getAttribute("uname")==null){
		out.print("<script>alert('你尚未登录，不允许访问');location.href='index_controls.jsp';</script>");
		return;
	}
%>

