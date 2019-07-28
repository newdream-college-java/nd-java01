<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addStu.jsp' starting page</title>
    
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
    PreparedStatement st=null;
	ResultSet result=null;
    Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
			String sql="select * from student";
			st=conn.prepareStatement(sql);
			result=st.executeQuery();
			out.print("<table border='1px'>");
			while(result.next()){
				out.print("<tr>");
				out.print("<td>");
				out.print(result.getInt("id"));
				out.print("</td>");
				out.print("<td>");
				out.print(result.getString("name"));
				out.print("</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			st.close();
			conn.close();
		} 
     %>
  </body>
</html>
