package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.UserDao;
import cn.song.dao.impl.UserDaoImpl;

public class InfoPageUpdateEmailServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String phone = (String) req.getSession().getAttribute("phone");
		String mail = req.getParameter("mail");
		UserDao userDao = new UserDaoImpl();
		boolean rs = userDao.updateEmail(mail, phone);
		// 跳转
		PrintWriter out = resp.getWriter();
		if (rs) {
			out.print("<script>javascript:alert('修改成功');location.href='infoPageSelectServlet'</script>");
		} else {
			out.print("<script>javascript:alert('修改失败');location.href='infoPageSelectServlet'</script>");

		}
	}
}
