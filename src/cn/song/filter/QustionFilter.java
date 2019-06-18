package cn.song.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.song.dao.ChepiaoProblemDao;
import cn.song.dao.UserDao;
import cn.song.dao.impl.ChepiaoProblemDaoImpl;
import cn.song.dao.impl.UserDaoImpl;

public class QustionFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		String phone = (String) session.getAttribute("phone");
		UserDao ud = new UserDaoImpl();
		int uId = ud.getUidByUphone(phone);
		// 做点改进
		ChepiaoProblemDao chepiaoList = new ChepiaoProblemDaoImpl();
		int i = chepiaoList.getAllCountByProblem(uId);
		System.out.println(i);
		int ye = 0;
		if (i % 4 > 0) {
			ye = i / 4 + 1;
		} else {
			ye = i / 4;
		}
		int i1 = chepiaoList.getCountByProblem(1, uId);
		int ye1 = 0;
		if (i1 % 4 > 0) {
			ye1 = i1 / 4 + 1;
		} else {
			ye1 = i1 / 4;
		}
		int i2 = chepiaoList.getCountByProblem(0, uId);
		int ye2 = 0;
		if (i2 % 4 > 0) {
			ye2 = i2 / 4 + 1;
		} else {
			ye2 = i2 / 4;
		}
		session.setAttribute("zongye", ye);
		session.setAttribute("zongtiao", i);
		session.setAttribute("fenye1", ye1);
		session.setAttribute("fentiao1", i1);
		session.setAttribute("fenye2", ye2);
		session.setAttribute("fentiao2", i2);
		session.setAttribute("uId", uId);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
