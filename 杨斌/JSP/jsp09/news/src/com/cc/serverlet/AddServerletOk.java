package com.cc.serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddServerletOk implements Servlet{
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
		PrintWriter out=res.getWriter();
		int result=(Integer)req.getAttribute("result");
		if(result>0){
			out.write("<script>alert('��ӳɹ�');location.href=ToAddServerlet</script>");
		}else{
			out.write("<script>alert('���ʧ��');location.href=ToAddServerlet</script>");
		}		
	}

}
