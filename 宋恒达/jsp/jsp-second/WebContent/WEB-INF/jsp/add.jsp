<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>添加一个数据</title>
</head>
<body>
	<%
		String DRIVER="com.mysql.cj.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/nd_sys?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
		String NAME="songhengda";
		String PASSWORD="123456";
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try{
			Class.forName(DRIVER);
			String sql="insert into stu_info values(null,?,?,?)";
			conn=DriverManager.getConnection(URL,NAME,PASSWORD);
			ps=conn.prepareStatement(sql);
			ps.setString(1,"小白");
			ps.setInt(2,3);
			ps.setString(3,"1996-01-09 11:11:11");
			result=ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				ps.close();
				conn.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		if(result>0){
			out.print("添加成功");
		}else{
			out.print("添加失败");
		}
	%>
	<a href="delete">删除一条数据</a>
</body>
</html>