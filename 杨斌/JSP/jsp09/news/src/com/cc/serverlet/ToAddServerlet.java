package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ToAddServerlet implements Servlet{

	@Override
	public void destroy() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		res.setContentType("text/html;charset=utf-8");
		HttpServletResponse resp=(HttpServletResponse) res;
		PrintWriter out=res.getWriter();
		  out.write("\r\n");
	      out.write("\r\n");
	      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
	      out.write("<html>\r\n");
	      out.write("  <head>\r\n");
	      out.write("    <title>My JSP 'toInsert.jsp' starting page</title>\r\n");
	      out.write("    \r\n");
	      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
	      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
	      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
	      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
	      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
	      out.write("\t<!--\r\n");
	      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
	      out.write("\t-->\r\n");
	      out.write("\r\n");
	      out.write("  </head>\r\n");
	      out.write("  \r\n");
	      out.write("  <body>\r\n");
	      out.write("    <form action=\"DoAddServerlet\" method=\"post\">\r\n");
	      out.write("    \t�����ţ�<input type=\"text\" name=\"ntid\" /><br/>\r\n");
	      out.write("    \t���ű��⣺<input type=\"text\" name=\"ntitle\"/><br/>\r\n");
	      out.write("    \t�������ߣ�<input type=\"text\" name=\"nauthor\"/><br/>\r\n");
	      out.write("    \tͼƬ��ַ��<input type=\"text\" name=\"filePath\"/><br/>\r\n");
	      out.write("    \t�������ݣ�<input type=\"text\" name=\"ncontent\"/><br/>\r\n");
	      out.write("    \t����ժҪ��<input type=\"text\" name=\"nsummary\"/><br/>\r\n");
	      out.write("    \t<input type=\"submit\" value=\"�ύ\"/>\r\n");
	      out.write("    </form>\r\n");
	      out.write("  </body>\r\n");
	      out.write("</html>\r\n");
		
	}

}
