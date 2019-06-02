<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="com.jspsmart.upload.*"%>
<%@page import="BaseDao.imgl.NewsDaoImgl,entity.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'news_add_control.jsp' starting page</title>
    
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
    		request.setCharacterEncoding("utf-8");
    		SmartUpload su=null;
    		NewsDaoImgl ne=new NewsDaoImgl();
    		News nw=new News();
    		try{
    			su = new SmartUpload();
    			su.setCharset("utf-8");
    			su.setAllowedFilesList("txt,png,jpg");
				su.setTotalMaxFileSize(10*1024*1024);
    			su.setMaxFileSize(2*1024*1024);
    			su.initialize(pageContext);
    			su.upload();
    			Files files = su.getFiles();
    			File file = files.getFile(0);
    			String rootPath = request.getRealPath("/");
    			String filePath=rootPath+"upload\\"+file.getFieldName();
    			NewsDaoImgl ns=new NewsDaoImgl();
    			News news=new News();
    			news.setNauthor(su.getRequest().getParameter("nid"));
    			news.setNcontent(su.getRequest().getParameter("ncontent"));
    			news.setNpicpath(filePath);
    			news.setNsummary(su.getRequest().getParameter("nsummary"));
    			news.setNtitle(su.getRequest().getParameter("ntitle"));
    			news.setNtid(su.getRequest().getParameter("ntid"));
    			out.print(filePath);
    			file.saveAs(filePath);
    			out.print("上传成功");
    		}catch(Exception e){
    			out.print("上传失败");
    			e.printStackTrace();
    			return;
    		}
    	 %>
  </body>
</html>
