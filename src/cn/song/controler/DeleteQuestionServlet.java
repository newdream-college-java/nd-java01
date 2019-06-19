package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ProblemDao;
import cn.song.dao.impl.ProblemDaoImpl;

public class DeleteQuestionServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String pId = req.getParameter("pId");
		String status = req.getParameter("status");
		int id = Integer.parseInt(pId);
		int statu = Integer.parseInt(status);
		ProblemDao pro = new ProblemDaoImpl();
		PrintWriter out = resp.getWriter();
		if (pro.deleteProblem(id, statu)) {
			out.print("<script>alert('删除成功')</script>");
			out.print("<script>location.href='questionAllListServlet'</script>");
		} else {
			out.print("<script>alert('删除失败')</script>");
			out.print("<script>location.href='questionAllListServlet'</script>");
		}

	}
}
