package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.QuestionDao;
import dao.impl.QuestionDaoImpl;
import entity.Question;

public class ListQuesServlet extends HttpServlet {

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
		//HttpServletResponse hsrp=(HttpServletResponse) response;
		//PrintWriter out=hsrp.getWriter();
		String x= request.getParameter("xl");
	
		QuestionDao qd=new QuestionDaoImpl();
		Integer lb=null;
		if (x!=null&x.trim().length()>0) {
			lb=Integer.parseInt(x);
			List<Question> list=qd.list(lb);
			request.setAttribute("list", list);
		}
		if(lb<0){
			Integer xyl=null;
			List<Question> list=qd.list(xyl);
			request.setAttribute("list", list);
		}
		request.getRequestDispatcher("show_questions.jsp").forward(request, response);
	}

}
