<%@ page language="java" import="java.util.*,dao.impl.*,entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doSave.jsp' starting page</title>
    
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
    		//1.设置resquest的编码
    		request.setCharacterEncoding("utf-8");// 这句代码是对post提交有效
    		//2.拿到表格的数据  数据在request对象上
    		String sname = request.getParameter("pname");//表单元素的name值
    		String sage = request.getParameter("page");
    		
    		//字符串转整数
    		int age = Integer.parseInt(sage);
    		//封装数据
    		Student student = new Student(sname,age);
    		//out.print("doMarried.jsp拿到数据："+sname+"\t"+sage);
    		//3.调dao方法，操作数据
    		StudentDaoImpl pdao  =new StudentDaoImpl();
    		int result = pdao.save(student);
    		//4.根据操作，提示用户到哪里拿结果。
    		if(result>0){
    			//告诉他到 marriedOk.jsp这个人这里拿证
    			response.sendRedirect("saveOk.jsp");
    		}else{
    			out.print("<script>javascript:alert('小伙子，你不是结婚了吗？');location.href='index.jsp'</script>");
    		}
    
      %>
  </body>
</html>