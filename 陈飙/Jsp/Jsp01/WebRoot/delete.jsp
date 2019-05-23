<%@ page language="java" import="java.util.*,java.sql.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'delete.jsp' starting page</title>
    
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
		PreparedStatement pst = null;
		int rs = -1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/test1?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn = DriverManager.getConnection(url, "root", "123456");
			
			String sql = "delete from mylock where name='dx';";
			 pst = conn.prepareStatement(sql);

			 rs=pst.executeUpdate();
			if(rs>0){
			out.print("删除成功！");
			}else{
				out.print("删除失败！");
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			pst.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
     %> <br>
  </body>
</html>
