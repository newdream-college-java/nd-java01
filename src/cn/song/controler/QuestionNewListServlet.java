package cn.song.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.song.dao.ChepiaoProblemDao;
import cn.song.dao.impl.ChepiaoProblemDaoImpl;
import cn.song.vo.ChepiaoProblem;

public class QuestionNewListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		HttpSession session = req.getSession();
		String curpage = req.getParameter("curpage");
		int ye = (int) session.getAttribute("fenye2");
		int uId = (int) session.getAttribute("uId");
		int cpage = 1;
		int pageSize = 4;

		if (curpage != null) {
			cpage = Integer.parseInt(curpage);
			if (cpage < 1) {
				cpage = 1;
			}
			if (cpage > ye) {
				cpage = ye;
			}
		}

		List<ChepiaoProblem> chepiao = new ArrayList<ChepiaoProblem>();
		ChepiaoProblemDao chepiaoList = new ChepiaoProblemDaoImpl();
		chepiao = chepiaoList.getChepiaoProblem(cpage, pageSize, 1, uId);
		req.setAttribute("chepiao", chepiao);
		req.setAttribute("cpage", cpage);
		req.setAttribute("cS", 3);
		req.getRequestDispatcher("question-list.jsp").forward(req, resp);

	}
}
