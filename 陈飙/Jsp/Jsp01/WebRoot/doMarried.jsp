<%@page import="com.cc.dao.Impl.PersonDaoImpl"%>
<%@ page language="java" import="java.util.*,com.cc.entity.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doMarried.jsp' starting page</title>
    
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
    	request.setCharacterEncoding("utf-8");//这句代码是对post提交有效
    	//2.拿到表格的数据  数据在request对象上
    	String sname=request.getParameter("username");//表单元素的name值
    	String sage=request.getParameter("age");
    	
    	//字符串转整数
    	int age = Integer.parseInt(sage);
    	//封装数据
    	Person person = new Person(sname,0,age);
    	//删除
    	//Person person1 = new Person(sname,0,age);
    	//out.print("doMarried.jsp拿到数据："+sname+"\t"+sage);
    	//3.调dao方法，操作数据
    	PersonDaoImpl pdao=new PersonDaoImpl();
    	int result=pdao.save(person);
    	//删除
    	//out.print(sname);
    	//int result1=pdao.delete(person);
    	//int result2=pdao.update(person);
    	//out.print("doMarried.jsp拿到数据："+sname+"\t"+sage);
    	
    	//4.根据操作，提示用户到哪里拿结果。
    	if(result>0){
    		//4.根据操作，提示用户到哪里拿结果。数据不成在的
    		//response.sendRedirect("MarriedOk.jsp");
    		//request.getRequestDispatcher("MarriedOk.jsp").forward(request, response);
    		request.setAttribute("money", 100*100*100);
    		request.getRequestDispatcher("MarriedOk.jsp").forward(request, response);
    	}else{
    			//数据存在的
    		out.print("<script>javascript:alert('小伙子，你不是结婚了吗？');location.href='index.jsp'</script>");
    	}
     %> <br>
  </body>
</html>
