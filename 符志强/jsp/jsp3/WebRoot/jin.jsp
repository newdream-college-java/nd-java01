<%@ page language="java" import="java.util.*,biao.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'jin.jsp' starting page</title>
    
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
//1.编码
	
	//2.取值(第1次请求分页 不需要取值 )
	/*默认查询第1页*/
	int curPage =1;
	/*默认每页查询1条*/
	int pageSize=1;
	
	//不是第1次请求
	String sCurPage = request.getParameter("curPage");
	if(sCurPage!=null){
		curPage= Integer.parseInt(sCurPage);
	}
	
	//3.调dao:调分页查询的方法
	NewsDao nd =new News_usersDaoImp();
	List<news> n = nd.listByPage(curPage, pageSize);
	//4.跳转到首页index.jsp
	System.out.print(n);
	
int max=nd.getmax(pageSize);

	if(n.size()>0){
		//获取到第1页的数据
		//转发
		//绑定当前页数据
		request.setAttribute("news", n);
    			//绑定当前页
    	request.setAttribute("curPage", curPage);
     	request.setAttribute("max", max);
    	request.getRequestDispatcher("index.jsp").forward(request, response);
    	
	}else{
		//没有查询到数据的处理
	}
  %>
  </body>
</html>
