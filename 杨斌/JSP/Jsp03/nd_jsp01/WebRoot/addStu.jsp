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
	int result=-1;
    Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","1997");
			String sql="insert into student values(null,?)";
			st=conn.prepareStatement(sql);
			Scanner sc=new Scanner(System.in);
			st.setString(1, "彦斌");
			result=st.executeUpdate();
			if(result>0){
				out.print("添加成功");
			}else{
				out.print("添加失败");
			}
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
