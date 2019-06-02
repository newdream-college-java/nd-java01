
<%@page import="com.jspsmart.upload.*"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path;
	request.setAttribute("basePath", basePath);//一定要改
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>news_add_control02.jsp01</title>


</head>

<body>
	<%
		//1.编码
		request.setCharacterEncoding("utf-8");
		//2.取值
		//2.1文件
		SmartUpload su = null;
		//第一步：得到SmartUpload对象
		try {
			su = new SmartUpload();

			//第二步：初始化
			su.setCharset("utf-8");//不写这在那边设置提交格式会报空指针
			su.setAllowedFilesList("txt,png,jpg");
			//第三步：初始化
			su.initialize(pageContext);//为什么填这个？

			//第四步：得到上传文件
			su.upload();//这个是你上传的到的名字

			//第五步：得到上传文件
			Files files = su.getFiles();

			File file = files.getFile(0);

			//第六步:得到上传到服务器的路径
			String rootPath = request.getRealPath("/");
			//out.print(rootPath);
			//拼接文件路径
			String filePath = rootPath + "upload/" + file.getFileName();//这个名字不能打错，不然就死亡了
			out.print("<br/>" + filePath);

			//第7步：上传
			file.saveAs(filePath);
			out.print("上传成功！");
		} catch (Exception e) {
			out.print("上传文件失败！！！" + "<br/>");
			out.print(e.getMessage());
			return;
		}
		//3.调用bao
		//4.跳转
	%><br>
</body>
</html>
