package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.UserDao;
import cn.song.dao.impl.UserDaoImpl;
import cn.song.entity.User;

public class InfoPageUpdateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// 取值
		String uNickname = req.getParameter("uNickname");
		String uBirthday = req.getParameter("uBirthday");
		String uGender = req.getParameter("uGender");
		String uName = req.getParameter("uName");
		String uPhone = (String) req.getSession().getAttribute("phone");
		User user = new User();
		user.setuNickname(uNickname);
		user.setuBirthday(uBirthday);
		user.setuSex(uGender);
		user.setuName(uName);
		user.setuPhone(uPhone);
		// 调dao
		UserDao userDao = new UserDaoImpl();
		boolean rs = userDao.update(user);
		// 跳转
		PrintWriter out = resp.getWriter();
		if (rs) {
			out.print("<script>javascript:alert('修改成功');location.href='infoPageSelectServlet'</script>");
		} else {
			out.print("<script>javascript:alert('修改失败');location.href='infoPageSelectServlet'</script>");

		}

	}
}
