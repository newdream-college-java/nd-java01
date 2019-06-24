package cn.song.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.song.dao.ProblemDao;
import cn.song.dao.ProblemTypeDao;
import cn.song.dao.impl.ProblemDaoImpl;
import cn.song.dao.impl.ProblemTypeDaoImpl;
import cn.song.entity.ProblemType;

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
		int uId = (int) session.getAttribute("userid");
		// 做点改进
		ProblemDao chepiaoList = new ProblemDaoImpl();
		int i = chepiaoList.getAllCountByProblem(uId);
		ProblemTypeDao problemTypeDao = new ProblemTypeDaoImpl();
		List<ProblemType> proTypelist = problemTypeDao.selectProblemType();
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
		session.setAttribute("proTypelist", proTypelist);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
