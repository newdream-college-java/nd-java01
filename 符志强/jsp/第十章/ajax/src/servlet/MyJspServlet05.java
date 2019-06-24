package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyJspServlet05 extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("uname");
		String pwd=request.getParameter("pwd");
		uname=URLDecoder.decode(uname,"utf-8");
		
		if (uname.equals("ถþนท")&&pwd.equals("123")) {
			System.out.println(uname);
			System.out.println("11111");
			out.print(false);
		}else{
			out.print(true);
		}

	}

}
