<%@ page language="java" import="java.util.*,java.sql.*,as.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'biao.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <%
   			try{
			Class.forName("com.mysql.jdbc.Driver");
   			String url="jdbc:mysql://127.0.0.1:3306/nd_sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
   			Connection conn =DriverManager.getConnection(url,"root","123");
  			String sql="select * from stu_info";
  			PreparedStatement ps=conn.prepareStatement(sql);
  			ResultSet r = ps.executeQuery();
  			out.print("<table border=1>");
  			
			while(r.next()){
				out.print("<tr>");
  				out.print("<td>");
				out.print(r.getInt("id"));
				out.print("</td>");
				out.print("<td>");
				out.print(r.getString("name"));
				out.print("</td>");
				out.print("<td>");
				out.print(r.getInt("age"));
				out.print("</td>");
				out.print("<td>");
				out.print(r.getString("birthday"));
				out.print("</td>");
				out.print("</tr>");
			}
				out.print("</table>");
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   %>
  </body>
</html>
