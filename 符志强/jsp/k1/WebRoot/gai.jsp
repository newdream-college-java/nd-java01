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
			Connection conn=null;
   			Statement st=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
   			String url="jdbc:mysql://127.0.0.1:3306/nd_sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
				conn =DriverManager.getConnection(url,"root","123");
				st=conn.createStatement();
  			String sql="update stu_info set name='辉' where id=1";
  			int r = 0;
				r = st.executeUpdate(sql);
  			if(r>0){
  				out.print("修改成功");
  			}else{
  				out.print("修改失败");
  			}
				st.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   %>
  </body>
</html>
