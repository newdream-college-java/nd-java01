<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%//主要的是session能够带数据，在同一浏览器的时候跳转到任何页面，数据不会消失
			if (session.getAttribute("uname") == null) {
				out.print("<script>alert('你尚未登录不允许访问！');location.href='index.jsp';</script>");
				return;
			}
		%>
		
	


