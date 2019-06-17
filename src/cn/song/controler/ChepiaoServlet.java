package cn.song.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.ChepiaoProblemDao;
import cn.song.dao.StationDao;
import cn.song.dao.impl.ChepiaoProblemDaoImpl;
import cn.song.dao.impl.StationDaoImpl;
import cn.song.entity.Station;
import cn.song.vo.ChepiaoProblem;

public class ChepiaoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 新开通车站部分代码开始
		StationDao sta = new StationDaoImpl();
		List<Station> list = new ArrayList<Station>();
		List<Station> list1 = new ArrayList<Station>();
		List<Station> list2 = new ArrayList<Station>();
		list = sta.getStation();
		int i = 1;
		for (Station station : list) {
			if (i <= 2) {
				list1.add(station);
				i++;
			} else if (i > 2 && i <= 4) {
				list2.add(station);
				i++;
			} else {

			}
		}
		req.setAttribute("list1", list1);
		req.setAttribute("list2", list2);
		// 新开通车站部分代码结束
		// 问题列表开始
		ChepiaoProblemDao chepiaoProblem = new ChepiaoProblemDaoImpl();
		List<ChepiaoProblem> chepiaoProblemList = new ArrayList<ChepiaoProblem>();
		chepiaoProblemList = chepiaoProblem.getChepiaoProblem(1, 5);
		req.setAttribute("chepiaoProblemList", chepiaoProblemList);
		req.getRequestDispatcher("che-piao.jsp").forward(req, resp);
	}
}
