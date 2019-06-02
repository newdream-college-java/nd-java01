<%@ page language="java" import="java.util.*,com.jspsmart.upload.*,com.cc.entity.*,com.jspsmart.upload.SmartUpload,com.cc.dao.imp.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'topic_add_control.jsp' starting page</title>
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
    	
    	//文件
    	SmartUpload su=new SmartUpload();
    	su.setCharset("UTF-8");
    	su.setAllowedFilesList("gif,png,jpg");
    	su.initialize(pageContext);
    	su.setMaxFileSize(2*1024*1024);
    	try {
    	//得到对象
    	//初始化(设置编码，设置允许上传类型，设置上传文件的大小)
    	su.upload();
    	//得到上传文件
    	
    	File file = su.getFiles().getFile(0);
    	//第6步：得到上传到服务器的路径
		String rootPath = request.getRealPath("/");
			//拼接文件路径
			String savePath = rootPath + "upload/" + file.getFileName();
		//第7步：上传
		file.saveAs(savePath);
		out.print("成功上传了文件！！！！");
		}catch (Exception e) {
			out.print("上传文件失败！！！"+"<br/>");
			out.print(e.getMessage());
			return;
		}
  	//取值
  	String tname=request.getParameter("ntid");
  	String ntitle=request.getParameter("ntitle");
  	String nauthor=request.getParameter("nauthor");
  	String ncontent=request.getParameter("ncontent");
  	String nsummary=request.getParameter("nsummary");
  	TopicDaoImp td=new TopicDaoImp();
  	NewsDaoImp nd=new NewsDaoImp();
  	int id=Integer.parseInt(tname);
	int line=nd.add(id, ntitle, nauthor, ncontent, nsummary);
	String  message = line>0?"新增成功":"新增失败";
	out.print("<script>javascript:alert('"+message+"');location.href='news_add.jsp'</script>");
  %>
    
  </body>
</html>
