package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			
			//����
			
			
			System.out.println(1);
			req.setCharacterEncoding("utf-8");
			PrintWriter out=resp.getWriter();
			//ȡֵ
			String name=req.getParameter("name");
			name =URLDecoder.decode(name,"utf-8");//urlת��
			if(name.equals("����")){
				out.print(false);
			}else{
				out.print(true);
			}
			//��dao
			
			//��ת
			//req.setAttribute("name",name);
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			doGet(req, resp);
		}
}
		
