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
		String DRIVER="com.mysql.jdbc.Driver";
		String URL="jdbc:mysql://localhost:3306/nd_sys?useUnicode=true&characterEncoding=utf8&serverTimezone=GMT"
				+"&useSSL=true";
		String NAME="songhengda";
		String PASSWORD="123456";
		Connection conn=null;
		PreparedStatement ps=null;
		int result=-1;
		try{
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL,NAME,PASSWORD);
			String sql="delete from stu_info where id=?";
			ps=conn.prepareStatement(sql);
			ps.setInt(1,2);
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
			out.print("删除成功");
		}else{
			out.print("删除失败");
		}
	%>
	<a href="update">修改一条数据</a>
</body>
</html>