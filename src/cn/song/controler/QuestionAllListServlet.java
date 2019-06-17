package cn.song.controler;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ChepiaoProblemDao;
import cn.song.dao.impl.ChepiaoProblemDaoImpl;

public class QuestionAllListServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String phone = (String) req.getSession().getAttribute("phone");
		//
		int cpage = 1;
		int pageSize = 4;
		ChepiaoProblemDao chepiaoList = new ChepiaoProblemDaoImpl();
//		if (curpage != null) {
//			cpage = Integer.parseInt(curpage);
//		}
		List chepiao = chepiaoList.getChepiaoProblem(cpage, pageSize, 1, 0);
		req.setAttribute("chepiao", chepiao);
		// System.out.print(request.getAttribute("news"));
		req.setAttribute("cpage", cpage);
		req.getRequestDispatcher("question-list.jsp").forward(req, resp);

	}
}
