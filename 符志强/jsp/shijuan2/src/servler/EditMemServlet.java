package servler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.MembersinfoDaoImpl;
import entity.Membersinfo;

public class EditMemServlet extends HttpServlet {

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
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String uname=request.getParameter("uname");
		String usex=request.getParameter("usex");
		String uage=request.getParameter("uage");
		String udizhi=request.getParameter("udizhi");
		String uemail=request.getParameter("uemail");
		MembersinfoDaoImpl mb=new MembersinfoDaoImpl();
		Membersinfo mem=new Membersinfo();
								System.out.println(id);
		int uid=Integer.parseInt(id);
		int age=Integer.parseInt(uage);
		mem.setId(uid);
		mem.setUage(age);
		mem.setUdizhi(udizhi);
		mem.setUemail(uemail);
		mem.setUname(uname);
		mem.setUsex(usex);
		int update=mb.update(mem);
								System.out.println(update);
		if (update>0) {
			response.sendRedirect("ListMembersinfoServlet");
		}
	}

}
