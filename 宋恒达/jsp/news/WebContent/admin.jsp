<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>新闻发布系统管理后台</title>
<link href="admin_files/admin.css" rel="stylesheet" type="text/css" />
</head>
	<%@include file="loginControl.jsp"%>
<body>
	<div id="header">
		<div id="welcome">欢迎使用新闻管理系统！</div>
		<div id="nav">
			<div id="logo">
				<img src="admin_files/logo.jpg" alt="新闻中国">
			</div>
			<div id="a_b01">
				<img src="admin_files/a_b01.gif" alt="">
			</div>
		</div>
	</div>
	<div id="admin_bar">
		<div id="status">
			管理员： 登录 &nbsp;&nbsp;&nbsp;&nbsp; <a href="#">退出</a>
		</div>
		<div id="channel"></div>
	</div>