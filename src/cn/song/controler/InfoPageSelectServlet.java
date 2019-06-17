package cn.song.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.UserDao;
import cn.song.dao.impl.UserDaoImpl;
import cn.song.entity.User;

public class InfoPageSelectServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String phone = (String) req.getSession().getAttribute("phone");
		UserDao userdao = new UserDaoImpl();
		User user = userdao.select(phone);
		req.setAttribute("user", user);
		req.getRequestDispatcher("info-page.jsp").forward(req, resp);
	}
}
