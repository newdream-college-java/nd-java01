package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ProblemDao;
import cn.song.dao.impl.ProblemDaoImpl;

public class ModifyServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// 取值
		String question = req.getParameter("question");
		String supply = req.getParameter("desc");
		int pid = Integer.parseInt(req.getParameter("problemid"));
		// 调dao
		ProblemDao pd = new ProblemDaoImpl();
		int result = pd.modifyAsk(question, supply, pid);
		PrintWriter out = resp.getWriter();
		if (result == 1) {
			out.print("<script>javascript:alert('修改成功！！');location.href='questionAllListServlet'</script>");
		} else {
			out.print("<script>javascript:alert('修改失败！！');history.go(-1)</script>");
		}
	}
}
