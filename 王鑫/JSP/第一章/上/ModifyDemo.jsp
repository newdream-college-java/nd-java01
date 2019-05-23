<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改</title>
    
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
    	Connection conn = null;
		PreparedStatement ps =null;
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/datebase?useUnicode=true&characterEncoding=utf8&useSLL=true";
		String username = "root";
		String password = "123456";	
		try {
			conn = DriverManager.getConnection(url,username,password);
			String sql = "update stu_info set sname = '小粉', sage = 20, sbirthday = '1998-2-2' where sid = 6;";
			ps = conn.prepareStatement(sql);
			int rs = ps.executeUpdate();
			if (rs>0) {
				out.print("操作完成");
			}else {
				out.print("操作未完成");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				ps.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    %>
  </body>
</html>
