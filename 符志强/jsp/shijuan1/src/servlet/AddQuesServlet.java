package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.QuestionDaoImpl;
import entity.Question;

public class AddQuesServlet extends HttpServlet {

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
		String question=request.getParameter("question");
		String questiona=request.getParameter("questiona");
		String questionb=request.getParameter("questionb");
		String questionc=request.getParameter("questionc");
		String questiond=request.getParameter("questiond");
		String subjec=request.getParameter("subject");
		String answer=request.getParameter("answer");
		Question qt=new Question();
		qt.setQuestion(question);
		qt.setAnswer(answer);
		qt.setQuestionA(questiona);
		qt.setQuestionB(questionb);
		qt.setQuestionC(questionc);
		qt.setQuestionD(questiond);
		int subject=Integer.parseInt(subjec);
		qt.setSubject(subject);
		QuestionDaoImpl qd=new QuestionDaoImpl();
		int result = qd.add(qt);
		System.out.println(result);
		if(result>0) {
	           out.print("<script>if(confirm('试题添加成功，是否查询？')){location.href='show_questions.jsp'}else{history.go(-1)}</script>");
	       }else {
	           
	           out.print("<script>alert('添加失败');history.go(-1);</script>");
	       }
	}

}
