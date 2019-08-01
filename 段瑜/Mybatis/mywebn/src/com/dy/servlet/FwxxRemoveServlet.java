package com.dy.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dy.mapper.FwxxMapper;

public class FwxxRemoveServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		String fwidStr = request.getParameter("fwid");
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		int fwid=-1;
		if(fwidStr!=null&&fwidStr.trim().length()>0){
			fwid=Integer.parseInt(fwidStr);
		}
		int deleteByPrimaryKey = mapper.deleteByPrimaryKey(fwid);
		if(deleteByPrimaryKey>0){
			out.println("<script>alert('É¾³ý³É¹¦');location.href='FwxxListServlet'</script>");
			sqlSession.commit();
		}else{
			sqlSession.rollback();
			out.println("<script>alert('É¾³ýÊ§°Ü');history.go(-1)</script>");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
