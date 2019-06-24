package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CheckUserServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("asd");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("uname");
		uname=URLDecoder.decode(uname,"utf-8");
		
		if (uname.equals("ถþนท")) {
			//System.out.println(uname);
			out.print(false);
		}else{
			out.print(true);
		}
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {

		doPost(req, resp);
}
}
