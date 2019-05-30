<%@ page language="java" import="java.util.*,javax.sql.*,javax.naming.*,java.sql.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'jsbc.jsp' starting page</title>
	</head>

	<body>
		<%
			long start =  System.currentTimeMillis();
          //1.上下文对象
          Context ctx = new InitialContext();
         //2.从上下文中获取数据源(连接池)
         DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/news");
         //3.从连接池中得到连接
         out.print(ds);
         for(int i=0;i<100;i++){
             Connection conn = ds.getConnection();
             conn.close();//没有真正关闭 连接，而是将数据库连接放回连接池(服务器)
         }
         
         long end =  System.currentTimeMillis();
         out.print("通过连接池获取连接的时间："+(end-start)+"<br/>");
     
         
         start =  System.currentTimeMillis();
         Class.forName("com.mysql.jdbc.Driver");
         String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
         for(int i=0;i<100;i++){
             Connection conn = DriverManager.getConnection(url, "root", "chenhui");
             conn.close();//真正关闭的数据库连接  这个连接不能使用了。
         }
         end =  System.currentTimeMillis();
         out.print("通过JDBC获取连接的时间："+(end-start)+"<br/>");
		 %>
	</body>
</html>
