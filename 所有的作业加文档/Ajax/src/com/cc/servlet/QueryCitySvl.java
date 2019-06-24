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
		// 1.����
		// html :text/html xml: text/xml excel: text/

		resp.setContentType("text/xml;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// 2.ȡֵ
		String pid = req.getParameter("pid");
		System.out.println("����dopost�ɹ�  pid====" + pid);
		// 3.��dao
		// ��ѯ���ݿ� ����ʡ�ݵ�idֵ��ѯ�����еĸ�ʡ�ݵ���
		// 1.�����ݿ��ȡ�����е�ʡ����Ϣ
		List<City> list = null;
		if (pid != null && pid.equals("1")) {
			list = Arrays.asList(new City[] { new City(1, "��ɳ��"),
					new City(2, "������") });

		} else {
			list = Arrays.asList(new City[] { new City(1, "�人��"),
					new City(2, "�����") });
		}
		// 4.������Ӧ
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
