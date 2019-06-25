package com.yb.servlet;

import java.io.IOException;




import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.entity.ParentChildTheme;

public class SearchServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5233452367835745944L;
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�ı���
		
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
		//ȡֵ
		
		String name=request.getParameter("name");
		//��Dao
		
		ParentChildThemeDaoImpl pctdi=new ParentChildThemeDaoImpl();
		ParentChildTheme parentChildThemeName=pctdi.parentChildThemeName(name);
		
		//��ֵ
		request.setAttribute("name", name);
		
		//����������ת��ҳ
		if(parentChildThemeName.getPcnpcttId()==1){		
			request.getRequestDispatcher("ParentChildThemeActivityShowServlet").forward(request, response);
		}else if(parentChildThemeName.getPcnpcttId()==2){
			request.getRequestDispatcher("ParentChildThemeTravelServlet").forward(request, response);
		}else if(parentChildThemeName.getPcnpcttId()==3){
			request.getRequestDispatcher("ParentChildThemeTicketingShowServlet").forward(request, response);
		}else{
			out.print("<script>javascript:alert('�����������ݣ�����������');history.go(-1)</script>");
		}
		
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
