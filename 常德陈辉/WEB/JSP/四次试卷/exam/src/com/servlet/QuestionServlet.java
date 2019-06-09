package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.QuestionDao;
import com.dao.impl.QuestionDaoIImpl;
import com.entity.Question;

public class QuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//���
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//ȡֵ
		String stValue=request.getParameter("keMuId");
		Integer value=null;
		if(stValue!=null&&stValue.trim().length()>0){
			value=Integer.parseInt(stValue);
		}
		//dao
		QuestionDao qd=new QuestionDaoIImpl();
		List<Question> list=qd.list(value);
		request.setAttribute("list", list);
		//ת��
		request.getRequestDispatcher("ShowSelectQues.jsp").forward(request, response);
	}

}
