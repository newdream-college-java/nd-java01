 package com.cc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.entity.City;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class QueryCitySvl extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 1.编码
		// html :text/html xml: text/xml excel: text/

		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.取值
		String pid = req.getParameter("pid");
		System.out.println("调用dopost成功  pid====" + pid);
		// 3.掉dao
		// 查询数据库 根据省份的id值查询出所有的该省份的市
		// 1.从数据库获取了所有的省份信息
		List<City> list = null;
		if (pid != null && pid.equals("1")) {
			list = Arrays.asList(new City[] { new City(1, "长沙市"),
					new City(2, "常德市") });

		} else {
			list = Arrays.asList(new City[] { new City(1, "武汉市"),
					new City(2, "武昌市") });
		}
		// 4.发送响应
		StringBuffer citys = new StringBuffer();
		citys.append("<citys>");
		for (City city : list) {
			citys.append("<city>");
			citys.append("<id>" + city.getCid() + "</id>");
			citys.append("<name>" + city.getName() + "</name>");
			citys.append("</city>");
		}
		   citys.append("</citys>");
		   System.out.println(citys.toString());
		   out.print(citys.toString());
	}
}
