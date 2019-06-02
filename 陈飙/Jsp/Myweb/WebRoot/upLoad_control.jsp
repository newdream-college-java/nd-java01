<%@page import="com.jspsmart.upload.*"%>

<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("basePath", basePath);
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>upLoad_control.jsp</title>



</head>

<body>
	<%
		//1.编码
		request.setCharacterEncoding("utf-8");
		int i = 0;
		//2.取值
		//2.1取文件
		SmartUpload su = null;
		try {
			//1.得到文件
			su = new SmartUpload();
			//第2步：初始化(设置编码，设置允许上传类型，设置上传文件的大小)
			su.setCharset("utf-8");
			su.setAllowedFilesList("png,jpg,gif");
			//3.初始化（没次重新提交要初始化）
			su.initialize(pageContext);
			//第4步：得到上传文件
			su.upload();
			//out.print(su.upload());
			//第5步：得到上传文件
			Files files = su.getFiles();
			File file = null;
			
			for (; i < files.getCount(); i++) {
				file = files.getFile(i);
				out.print(file.getFieldName() + "<br/>");
				String rootPath = request.getRealPath("/");
				String filePath = rootPath + "upload/" + file.getFileName();
				out.print("<br/>" + filePath);
				file.saveAs(filePath);
				//out.print("上传" + i + "成功");
			}
			//out.print(files);
			//File file = files.getFile(0);//得到第一个；
			//out.print(file);
			//第6步：得到上传到服务器的路径
			//String rootPath = request.getRealPath("/");
			//拼接文件路径
			//String filePath = rootPath + "upload/" + file.getFileName();
			//out.print("<br/>"+filePath);
			//第7步：上传
			//file.saveAs(filePath);
			out.print( "<br/>"+"上传"+(i)+"成功");
		} catch (Exception e) {
			out.print("上次失败！！！+" + "<br/>");
			out.print(e.getMessage());
			return;
		}
		//2.2表单文本值
		//注意：不能使用request而是通过su来拿
		Request suRequest=su.getRequest();
		String nTile=suRequest.getParameter("userName");
		out.print(nTile+"上传"+(i)+"成功");
		//3.掉dao
		//4.跳转
	%><br>
</body>
</html>
