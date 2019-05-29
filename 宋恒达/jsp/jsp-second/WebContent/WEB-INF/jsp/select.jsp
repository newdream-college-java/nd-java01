<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>查看全部数据</title>
<style type="text/css">
	th,td{
		border:1px solid red;
		text-align:center
	}
</style>
</head>
<body>
	<table>
	<tr>
		<th>id</th>
		<th>sname</th>
		<th>sage</th>
		<th>sbirthday</th>
	</tr>
	<%
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/nd_sys?useUnicode=true&characterEncoding=utf8&"
				+"serverTimezone=GMT&useSSL=true";
		String name="songhengda";
		String password="123456";
		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,name,password);
			String sql="select * from stu_info";
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()){
				out.print("<tr>");
				out.print("<td>");
				out.print(rs.getInt("id"));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString("sname"));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getInt("sage"));
				out.print("</td>");
				out.print("<td>");
				out.print(rs.getString("sbirthday"));
				out.print("</td>");
				out.print("</tr>");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				rs.close();
				ps.close();
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	%>
	</table>
</body>
</html>