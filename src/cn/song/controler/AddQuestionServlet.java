package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ProblemDao;
import cn.song.dao.impl.ProblemDaoImpl;

public class AddQuestionServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String pContent = req.getParameter("question");
		String pSupply = req.getParameter("desc");
		String code = req.getParameter("code");
		System.out.println(pContent + pSupply);
		int pTypeId = Integer.parseInt(code);
		int uId = (int) req.getSession().getAttribute("userid");
		ProblemDao proDao = new ProblemDaoImpl();
		boolean flag = false;
		flag = proDao.addProblem(pContent, pSupply, pTypeId, uId);
		PrintWriter out = resp.getWriter();
		if (flag) {
			out.print("<script>alert('添加成功')</script>");
			out.print("<script>location.href='questionAllListServlet'</script>");
		} else {
			out.print("<script>alert('添加失败')</script>");
			out.print("<script>location.href='questionAllListServlet'</script>");
		}

	}
}
