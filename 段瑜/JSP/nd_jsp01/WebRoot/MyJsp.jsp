<%@ page language="java" import="java.util.*,BaseDao.imgl.*,entity.*,BaseDao.*,java.sql.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    
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
  <table>
    <%
    	Scanner input=new Scanner(System.in);
    	Stu_infoDaoImgl s=new Stu_infoDaoImgl();
		Stu_info stuinfo=new Stu_info();
		s.save(stuinfo);
		s.Update(stuinfo);
		s.Delete(stuinfo);
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		conn=BaseDao.getConn();
		String sql="select * from stu_info";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				out.print("<tr>");
				out.print("<td>"+rs.getInt("id")+"</td>");
				out.print("<td>"+rs.getString("sname")+"</td>");
				out.print("<td>"+rs.getInt("sage")+"</td>");
				out.print("<td>"+rs.getString("sbirthday")+"</td>");
				out.print("</tr>");
			}
    
     %>
     </table>
  </body>
</html>
