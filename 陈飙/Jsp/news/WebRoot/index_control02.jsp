<%@page import="com.cc.Dao.Impl.NewDaoImpl"%>
<%@page import="com.cc.Dao.NewDao"%>
<%@page import="com.cc.entity.New"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>index_control02.jsp02</title>
    
	

  </head>
  
  <body>
    <%
    //1.编码
    //2.取值
   //2.1第一次请求分页，不需要取值
   /*默认查询第一页*/
   int curPage=1;
   /*默认每页查询3条*/
   int pageSize=3;
   
   //先要一次请求
   String sCurPage=request.getParameter("curPage");
   if(sCurPage!=null){
   curPage=Integer.parseInt(sCurPage);
   }
    //3.掉bao
    NewDao nd=new NewDaoImpl();
    //out.print(nd);
    List<New> news =nd.list(curPage, pageSize);
   // out.print(nd.list(curPage, pageSize));
    // out.print("====="+news);
    //4.跳转到首页index.jsp
   // out.print(news.size());
    if(news.size()>0){
    //获取到第一页的数据
    //转发
    //绑定当前页面数据
    //绑定当前页
    request.setAttribute("news",news );
    request.setAttribute("curPage", curPage);
    request.getRequestDispatcher("index.jsp").forward(request,response);
    }else{
    out.print("<script>alert('查询失败');location.href='index.jsp';</script>");
    }
     %> <br>
    
  </body>
</html>
