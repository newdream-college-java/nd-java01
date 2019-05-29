<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/nd_sys?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT"+
		"&useSSL=true";
		String name="songhengda";
		String password="123456";
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try{
			Class.forName(driver);
			conn=DriverManager.getConnection(url,name,password);
			String sql="update stu_info set sname=? where id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,"小婷");
			ps.setInt(2,3);
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
			out.print("修改成功");
		}else{
			out.print("修改失败");
		}
	%>
	<a href="select">查找全部数据</a>
</body>
</html>