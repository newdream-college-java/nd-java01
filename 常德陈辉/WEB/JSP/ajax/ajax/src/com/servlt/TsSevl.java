package com.servlt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProvinceDao;
import com.dao.ipml.ProvinceDaoImpl;
import com.entity.Province;

public class TsSevl extends HttpServlet {

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String word=request.getParameter("word");
		//System.out.println(word);
		ProvinceDao pd=new ProvinceDaoImpl();
		List<Province> list=pd.list(word);
		if(list.size()>0){
			//System.out.println(list);
			StringBuffer provinces=new StringBuffer();
			provinces.append("<provinces>");
			for(Province pv: list){
				provinces.append("<province>");
				provinces.append("<id>"+pv.getId()+"</id>");
				provinces.append("<name>"+pv.getProvince()+"</name>");
				provinces.append("</province>");
			}
			provinces.append("</provinces>");
			out.print(provinces.toString());
			System.out.println(provinces.toString());
		}
	}

}
