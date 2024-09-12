<%@ page language="java" import="java.util.*,com.cc.dao.imp.*,com.jspsmart.upload.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'news_add_control.jsp' starting page</title>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
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
  	SmartUpload su =null;
  	String filePath=null;		
  	try{	
	  	su=new SmartUpload();
	  	su.setCharset("utf-8");
		su.setAllowedFilesList("txt,png,jpg");
	  	su.initialize(pageContext);
	  	su.setMaxFileSize(1*1024*1024);//设置单个文件大小（1mb）
	  	su.upload();
	  	Files files=su.getFiles();
	  	File file=files.getFile(0);
	  	String rootPath=request.getRealPath("/");
	  	filePath=rootPath+"upload\\"+file.getFileName();
	  	out.print(filePath);
	  	file.saveAs(filePath);
  	}catch(Exception e){
  		out.print("<script>javascript:alert('文件上传失败');location.href='news_add.jsp'</script>");
  		return;
  	}
  	Request suRequest=su.getRequest(); 	
  	String tname=suRequest.getParameter("ntid");
  	int ntid=Integer.parseInt(tname);
  	String ntitle=suRequest.getParameter("ntitle");
  	String nauthor=suRequest.getParameter("nauthor");
  	String ncontent=suRequest.getParameter("ncontent");
  	String nsummary=suRequest.getParameter("nsummary");
  	NewsDaoImp nd=new NewsDaoImp();
  	nd.add(ntid, ntitle, nauthor, filePath, ncontent, nsummary);
  %>
    
  </body>
</html>
