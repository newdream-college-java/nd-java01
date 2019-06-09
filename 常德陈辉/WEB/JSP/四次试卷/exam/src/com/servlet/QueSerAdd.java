package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.QuestionDao;
import com.dao.impl.QuestionDaoIImpl;
import com.entity.Question;

public class QueSerAdd extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//取值
		String question=request.getParameter("question");
		String questiona=request.getParameter("questionA");
		String questionb=request.getParameter("questionB");
		String questionc=request.getParameter("questionC");
		String questiond=request.getParameter("questionD");
		String subjectStr=request.getParameter("subject");
		String answer=request.getParameter("answer");
		//调dao
		
		int	subject=Integer.parseInt(subjectStr);
		Question qes=new Question();
		qes.setQuestion(question);
		qes.setQuestionA(questiona);
		qes.setQuestionB(questionb);
		qes.setQuestionC(questionc);
		qes.setQuestionD(questiond);
		qes.setSubject(subject);
		qes.setAnswer(answer);
		QuestionDao qd=new QuestionDaoIImpl();
		int result=qd.result(qes);
		PrintWriter out=response.getWriter();
		if(result>0){
			out.print("<script>if(confirm('试题添加成功，是否查询？')){location.href='QuestionServlet';}else{location.href='Que_add.jsp';}</script>");
		}else{
			out.print("<script>alert('添加失败');</script>");
		}
		
//		request.setAttribute("s", answer);
//		request.getRequestDispatcher("MyJsp.jsp").forward(request, response);
	}

}
