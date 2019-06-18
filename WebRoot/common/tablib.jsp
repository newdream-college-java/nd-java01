<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.ArrayList"%>
<link rel="stylesheet" href="Css/cityselect.css">
<script type="text/javascript" src="Scripts/cityselect.js"></script>
<script type="text/javascript" src="Scripts/jquery.js"></script>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("basePath", basePath);
%>
<%!String currentDate = null;%>
<%!String lastDate = null;%>
<%
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	Calendar c = Calendar.getInstance();
	currentDate = sd.format(c.getTime());
	c.add(Calendar.DATE, 15);
	lastDate = sd.format(c.getTime());
%>