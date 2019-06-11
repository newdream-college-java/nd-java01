package servler;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import dao.impl.MembersinfoDaoImpl;
import entity.Membersinfo;

public class ListMembersinfoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		MembersinfoDaoImpl mb=new MembersinfoDaoImpl();
		List<Membersinfo> list=mb.list(null);
		//System.out.println(list);
		if (list!=null) {
			request.setAttribute("list", list);
			request.getRequestDispatcher("list_membersinfo.jsp").forward(request, response);
		} else {
			out.print("listÎª¿Õ");
		}
		
	}

}
