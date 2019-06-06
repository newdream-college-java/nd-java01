package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.String;

import dao.impl.HandSetDaoImpl;
import entity.HandSet;

public class ParticularsServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		java.lang.String id=request.getParameter("id");
		int id1=Integer.parseInt(id);
		HandSetDaoImpl hd=new HandSetDaoImpl();
		List<HandSet> list=hd.list(id1);
		request.setAttribute("list", list);
		request.getRequestDispatcher("particulars.jsp").forward(request, response);
	}

}
