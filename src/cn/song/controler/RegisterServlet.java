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
 * ×¢²áÏìÓ¦
 * @author mob
 *
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String phone = request.getParameter("phone");
		String pwd = request.getParameter("txt_password1");
		PrintWriter out = response.getWriter();
		if (phone != null && pwd != null && phone.trim().length() > 0 && pwd.trim().length() > 0) {
			User user=new User();
			user.setuPhone(phone);
			user.setuPwd(pwd);
			UserDao userDao = new UserDaoImpl();
			if(userDao.register(user)) {
				userDao.register(user);
				request.getSession().setAttribute("phone", phone);
				request.getSession().setAttribute("pwd", pwd);
				response.sendRedirect("register_sucess.jsp");
				return;
			}
		}
		out.print("<script>alert('×¢²áÊ§°Ü£¡');location.href='register.jsp';</script>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
