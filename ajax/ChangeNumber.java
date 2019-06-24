package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ChangeNumber extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charser=utf-8");
			
			PrintWriter out = resp.getWriter();
//			String number=req.getParameter("number");
//			number=URLDecoder.decode(number,"utf-8");
			
			//System.out.println(req.getParameter("number"));
			String num=req.getParameter("number");
			int num1=Integer.parseInt(num);
			//out.print(req.getParameter("number"));
			//int num=Integer.parseInt(number);
			//System.out.println(num);
			if(num1>0){
				out.print(true);
			}else{
				out.print(false);
			}
		}
}























































