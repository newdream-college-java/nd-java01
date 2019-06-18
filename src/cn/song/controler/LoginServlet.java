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

/**
 * 登录响应
 * 
 * @author mob
 *
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String phone = req.getParameter("username");
		String pwd = req.getParameter("password");
		String url = req.getParameter("url-request");
		PrintWriter out = resp.getWriter();
		if (phone != null && pwd != null && phone.trim().length() > 0 && pwd.trim().length() > 0) {
			User user = new User();
			user.setuPhone(phone);
			user.setuPwd(pwd);
			UserDao userDao = new UserDaoImpl();
			if (userDao.login(user)) {
				req.setAttribute("userid", userDao.selectIdByPhone(phone));
				req.getSession().setAttribute("phone", phone);
				req.getSession().setAttribute("pwd", pwd);
				resp.sendRedirect("indexServlet");
				return;
			}
			out.print("<script>alert('登录失败');location.href='indexServlet';</script>");
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
