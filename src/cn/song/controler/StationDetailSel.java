package cn.song.controler;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.song.dao.StationDao;
import cn.song.dao.impl.StationDaoImpl;
import cn.song.entity.Station;




public class StationDetailSel extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//编码
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out=resp.getWriter();
		//取值
		String num=req.getParameter("id");//转码
		int id=Integer.parseInt(num);//转数字

		
		
		//调dao
		StationDao sd=new StationDaoImpl();
		Station sta=sd.station(id);	
		//跳转
		req.setAttribute("sta", sta);
		req.getRequestDispatcher("indexServlet").forward(req, resp);
	}
}
