package cn.song.controler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.StationDao;
import cn.song.dao.impl.StationDaoImpl;
import cn.song.entity.Station;

public class IndexServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 编码
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		// 直接resp req 不拿数据直接传东西过去
		// 调dao
		StationDao sta = new StationDaoImpl();
		List<Station> list = new ArrayList<Station>();
		List<Station> list_newstation = new ArrayList<Station>();
		list = sta.getStation();
		int i = 1;
		for (Station station : list) {
			if (i <= 5) {
				list_newstation.add(station);
				i++;
			}
		}
		// 跳转
		req.setAttribute("list_newstation", list_newstation);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
