package cn.song.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ProblemDao;
import cn.song.dao.impl.ProblemDaoImpl;
import cn.song.vo.ChepiaoProblem;

public class QuestioningServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pId = req.getParameter("pId");
		int id = Integer.parseInt(pId);
		ProblemDao chepiaodao = new ProblemDaoImpl();
		ChepiaoProblem chepiaoProblem = chepiaodao.getChepiaoProblem(id);
		req.setAttribute("chepiaoProblem", chepiaoProblem);
		req.getRequestDispatcher("questioning.jsp").forward(req, resp);

	}
}
