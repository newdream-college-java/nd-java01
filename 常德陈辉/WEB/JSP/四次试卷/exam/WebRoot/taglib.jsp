<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
request.setAttribute("basePath",path);
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<%@page import="com.dao.*,com.entity.*,com.dao.impl.*" %>