package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.imp.NewsDaoImp;
import com.jspsmart.upload.File;
import com.jspsmart.upload.Files;
import com.jspsmart.upload.Request;
import com.jspsmart.upload.SmartUpload;

public class news_add_control extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
	  	SmartUpload su =null;
	  	String filePath=null;		
	  	try{	
		  	su=new SmartUpload();
		  	su.setCharset("utf-8");
			su.setAllowedFilesList("txt,png,jpg");
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

	}

}
