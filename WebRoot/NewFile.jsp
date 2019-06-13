 <%@ page language="java" import="java.util.*,cn.song.dao.*,cn.song.dao.impl.*,cn.song.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!doctype html>
<html>
<head>
</head>
<body>
<%
	StationDao dd = new StationDaoImpl();
	List<Station> list= new ArrayList<Station>();
	list=dd.GetStation();
	System.out.print(list);
%>
</body>