<%@ page language="java" import="java.util.*,com.jspsmart.upload.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'unload_control.jsp' starting page</title>
    
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
		 	su=new SmartUpload();
		 	su.setCharset("utf-8");
		 	su.setAllowedFilesList("jpg,gif,png");
		 	su.setMaxFileSize(2*1024*1024);
		 	su.initialize(pageContext);
		 	su.upload();
	 		Files files=su.getFiles();
		 	for(int i=0;i<=files.getSize();i++){
			 	String rootPath=request.getRealPath("/");
			 	String filePath=rootPath+"uploadimg//"+files.getFile(i).getFileName();	 	
			 	files.getFile(i).saveAs(filePath);		 	
		 	}
	 	}catch(Exception e){
	 		out.print("<script>alter('文件上传失败');location.href='unload.jsp'</script>");
	 		return;
	 	}
	 	Request sq=su.getRequest();
	 	String name=sq.getParameter("name");
	 	out.print("用户"+name+"成功上传两个文件");
 	%>
  </body>
</html>
