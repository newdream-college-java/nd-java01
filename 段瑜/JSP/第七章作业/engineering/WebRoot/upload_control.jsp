<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="com.jspsmart.upload.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upload_control.jsp' starting page</title>
    
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
    	try{
    		su = new SmartUpload();
    		su.setCharset("utf-8");
    		su.setAllowedFilesList("txt,png,jpg");
			su.setTotalMaxFileSize(10*1024*1024);
    		su.setMaxFileSize(2*1024*1024);
    		su.initialize(pageContext);
    		su.upload();
    		Files files = su.getFiles();
    		for(int i=0;i<files.getCount();i++){
    			File file = files.getFile(i);
    			String rootPath = request.getRealPath("/");
    			String filePath = rootPath + "upload/" + file.getFileName();
    			file.saveAs(filePath);
    		}
    		out.print("用户"+su.getRequest().getParameter("uname")+"成功上传了2个文件");
    	}catch(Exception e){
    		out.print("上传失败");
    		e.printStackTrace();
    	}
     %>
  </body>
</html> 
