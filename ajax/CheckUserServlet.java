package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.dao.AjaxDao;
import com.cc.dao.impl.AjaxIplm;
import com.cc.entity.Ajax;

public class CheckUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
			doGet(req, resp);
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//����
		System.out.println("1");
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		//ȡֵ
		String name=req.getParameter("name");
		name=URLDecoder.decode(name,"utf-8");//urlת��
		System.out.println(name);
		//��dao
		Ajax aja=new Ajax();
		AjaxDao ad=new AjaxIplm();
		int list=ad.list(name);
		//boolean flag=false;
		if(list>0){
			out.print(true);
		}else{
			out.print(false);
		}
		//out.print("������ְ�");
		//��ת
		//req.setAttribute("list",list);
	}
	
}
