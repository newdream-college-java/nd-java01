<%@ page language="java" import="java.util.*,Dao.*,entity.*,Marriimp.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>婚姻填表登陆界面</title>
    
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
    <h1>halo你来啦</h1>
    <%
    request.setCharacterEncoding("utf-8");
    //拿到表格的数据，数据在requset对象上
    //添加
    String name=request.getParameter("name");
   // String sage=request.getParameter("age");
    out.print("doMarri.jsp拿到数据："+name);
    //字符串转整形
   // int age=Integer.parseInt(sage);
    
    Marriimplement mi  =new Marriimplement();
    //封装数据    没弄懂
 	// Marri marri=new Marri(name,0,age);
 	 //增加
  	// out.print("doMarri.jsp拿到数据："+name+"\t"+age);
  	//删除
  	 Marri marri=new Marri(name,0,0);
  	 //3.调dao方法，操作数据
    		int rs=mi.delete(marri);
    		
    		if(rs>0){
    			//告诉他到 marriedOk.jsp这个人这里拿证
    			response.sendRedirect("MarriOK.jsp");
    		}else{
    			out.print("<script>javascript:alert('小伙子，你不是结婚了吗？');location.href='index.jsp'</script>");
    		}
    		//int result =-1;
    		//result = mi.save(marri);
    		//4.根据操作，提示用户到哪里拿结果。
    	//	if(result>0){0 
    			//告诉他到 marriedOk.jsp这个人这里拿证
    	//		response.sendRedirect("MarriOK.jsp");
    	//	}else{
    	//		out.print("<script>javascript:alert('小伙子，你不是结婚了吗？');location.href='index.jsp'</script>");
    	//	}
     %>
  </body>
</html>
