package cn.song.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �˳���¼��Ӧ
 * 
 * @author mob
 *
 */
public class LoginOutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String phone = req.getSession().getAttribute("phone").toString();
		String pwd = req.getSession().getAttribute("pwd").toString();
		if (phone != null && pwd != null && phone.trim().length() > 0 && pwd.trim().length() > 0) {
			req.getSession().removeAttribute("phone");
			req.getSession().removeAttribute("pwd");
			resp.sendRedirect("indexServlet");
			return;
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
