package servler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.MembersinfoDaoImpl;
import entity.Membersinfo;

public class EditMembersInfoServlet extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
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
		String uid=request.getParameter("id");
		int id=-1;
		if (uid!=null||uid.trim().length()>0) {
			id=Integer.parseInt(uid);
		}
		if (id>0) {
			MembersinfoDaoImpl mb=new MembersinfoDaoImpl();
			List<Membersinfo> list=mb.findById(id);
			System.out.println(list);
			request.setAttribute("list", list);
			request.getRequestDispatcher("edit_membersinfo.jsp").forward(request, response);
		}
		
	}

}
