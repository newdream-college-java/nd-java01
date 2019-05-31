<%@page import="com.jspsmart.upload.SmartUploadException"%>
<%@page import="com.jspsmart.upload.Request"%>
<%@page import="com.jspsmart.upload.SmartUpload"%>
<%@page import="cn.song.dao.impl.NewsDaoImpl"%>
<%@page import="cn.song.dao.NewsDao"%>
<%@page import="cn.song.entity.News"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		SmartUpload smartUpload=new SmartUpload();
		Request request1=smartUpload.getRequest();
		//文件上传
		String npicpath=null;
		try{
			
		}catch(SmartUploadException e){
			
		}
		int ntid=Integer.parseInt(request1.getParameter("ntid"));
		String ntitle=request1.getParameter("ntitle");
		String nauthor=request1.getParameter("nauthor");
		String nsummary=request1.getParameter("nsummary");
		String ncontent=request1.getParameter("ncontent");
		String nmodifydate=null;
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String ncreatedate=simpleDateFormat.format(new Date()).toString();
		News news=new News();
		news.setNtid(ntid);
		news.setNtitle(ntitle);
		news.setNcontent(ncontent);
		news.setNcreatedate(ncreatedate);
		news.setNmodifydate(nmodifydate);
		news.setNpicpath(npicpath);
		news.setNsummary(nsummary);
		news.setNauthor(nauthor);
		NewsDao newsDao=new NewsDaoImpl();
		String message=null;
		if(newsDao.addNews(news)){
			message="添加成功！！";
		}else{
			message="添加失败！！";
		}
		out.print("<script>alert('"+message+"');location.href='news_add.jsp';</script>");
	%>
</body>
</html>