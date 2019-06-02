<%@page import="com.cc.entity.New"%>
<%@page import="com.cc.Dao.Impl.NewDaoImpl"%>
<%@page import="com.cc.Dao.NewDao"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="com.jspsmart.upload.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
request.setAttribute("basePath", basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'news_add_control03.jsp' starting page</title>
    
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
		request.setCharacterEncoding("utf-8");
		String filePath =null;
		//2.取值:

		//2.1文件
		SmartUpload su = null;
		try {
			//第1步：得到SmartUpload对象
			su = new SmartUpload();
			//第2步：初始化(设置编码，设置允许上传类型，设置上传文件的大小)

			su.setCharset("utf-8");
			su.setAllowedFilesList("txt,png,jpg");
			//第3步：初始化
			su.initialize(pageContext);
			//第4步：得到上传文件
			su.upload();
			//第5步：得到上传文件
			Files files = su.getFiles();
			/*for(int i=0;i<files.getCount();i++){
				File file = files.getFile(i);
				out.print(file.getFileName()+"<br/>");
			}*/
			File file = files.getFile(0);
			//Fi fileName=file.getFieldName();
			
			//第6步：得到上传到服务器的路径
			String rootPath = request.getRealPath("/");
			//拼接文件路径
			 filePath = rootPath + "upload/" + file.getFileName();
			
			out.print(filePath);
			//第7步：上传
			file.saveAs(filePath);
			out.print("oh yeah!!  上传文件成功！！！！");
		} catch (Exception e) {
			out.print("上传文件失败！！！"+"<br/>");
			out.print(e.getMessage());
			return;
		}

		//2.1 表单文本值
		//注意：不能使用request 而是要通过su来拿
		Request suRequest = su.getRequest();
		String nTitle = suRequest.getParameter("ntitle");
		String author=suRequest.getParameter("nauthor");
		String nsummary=suRequest.getParameter("nsummary");
		String ncontent=suRequest.getParameter("ncontent");
		
		//out.print(nTitle + "<br/>");
		//3.调dao（保存新闻的图片只要保存图片的路径）
		New ne=new New();
		ne.setNtitle(nTitle);
		ne.setNauthor(author);
		ne.setNpicpath(filePath);
		ne.setNsummary(nsummary);
		ne.setNcontent(ncontent);
		NewDao nd=new NewDaoImpl();
		int rs=nd.insertAll(ne);
		if(rs>0){
		String message = rs > 0 ? "新增主题成功" : "新增主题失败";
		out.print("<script>alert('" + message
				+ "');location.href='news/news_add.jsp';</script>");//这个地址为什么改变了
		}else{
			out.print("<script>alert('主题以存在');location.href='news_add.jsp';</script>");
		}
		//4.跳转
	%> <br>
  </body>
</html>
