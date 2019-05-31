<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.cc.Dao.Impl.NewDaoImpl"%>
<%@page import="com.cc.entity.New"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>news_add_control.jsp</title>



</head>

<body>
	<%
   //1.编码
   request.setCharacterEncoding("utf-8");
   //2.取值
   String ntid=request.getParameter("ntid");
   String ntitle=request.getParameter("ntitle");
   String nauthor=request.getParameter("nauthor");
   String nsummary=request.getParameter("nsummary");
   String ncontent=request.getParameter("ncontent");
    
   //3.调用dao
 		 New ne=new New();
		ne.setNtitle(ntitle);
		ne.setNauthor(nauthor);
		ne.setNsummary(nsummary);
		ne.setNcontent(ncontent);
		int rs1=new NewDaoImpl().insert(ne);
		if(rs1>0){
		String message = rs1 > 0 ? "新增主题成功" : "新增主题失败";
		out.print("<script>alert('" + message
				+ "');location.href='news_add.jsp';</script>");
		}else{
			out.print("<script>alert('主题以存在');location.href='news_add.jsp';</script>");
		}
   //4.跳转 %>
	<br>

</body>
</html>
