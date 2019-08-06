package com.dy.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dy.entity.Fwxx;
import com.dy.mapper.FwxxMapper;


public class FwxxListByIdServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7163931501434759915L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		String fwidStr = request.getParameter("fwid");
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Integer fwid=-1;
		if(fwidStr!=null&&fwidStr.trim().length()>0){
			fwid=Integer.parseInt(fwidStr);
		}
		if(fwid>0){
			Fwxx selectByPrimaryKey = mapper.selectByPrimaryKey(fwid);
			request.setAttribute("selectByPrimaryKey", selectByPrimaryKey);
			request.getRequestDispatcher("modify.jsp").forward(request, response);
		}

	}

}
