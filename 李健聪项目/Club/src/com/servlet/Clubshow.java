package com.servlet;

import implement.ClubDaoImplement;

import java.io.IOException;
import java.util.List;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Club;

import Dao.ClubDao;

public class Clubshow extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//1.编码问题
		resp.setContentType("text/html;charset=utf-8");
		//2取值
		
		
		//3调dao
		ClubDao cb=new ClubDaoImplement();
		Club club=new Club();
		List<Club> list=cb.select(club);
		
		//4转发
		req.setAttribute("list",list);
		req.getRequestDispatcher("NO1.jsp").forward(req,resp);
	}

	
}
