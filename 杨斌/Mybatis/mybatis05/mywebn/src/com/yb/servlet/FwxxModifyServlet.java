package com.yb.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.yb.entity.Fwxx;
import com.yb.mapper.FwxxMapper;

public class FwxxModifyServlet extends HttpServlet {

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
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String qxid = request.getParameter("qxid");
		String jdid = request.getParameter("jdid");
		String zj = request.getParameter("zj");
		String shi = request.getParameter("shi");
		String ting = request.getParameter("ting");
		String fwlx = request.getParameter("fwlx");
		String fwxx = request.getParameter("fwxx");
		System.out.println(title+jdid);
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Fwxx fw=new Fwxx();
		if(title!=null&&title.trim().length()>0){
			fw.setTitle(title);
		}
		if(qxid!=null&&qxid.trim().length()>0){
			fw.setQxid(Integer.parseInt(qxid));
		}
		if(jdid!=null&&jdid.trim().length()>0){
			fw.setJdid(Integer.parseInt(jdid));
		}
		if(zj!=null&&zj.trim().length()>0){
			fw.setZj(Long.parseLong(zj));
		}
		if(shi!=null&&shi.trim().length()>0){
			fw.setShi(Integer.parseInt(shi));
		}
		if(ting!=null&&ting.trim().length()>0){
			fw.setTing(Integer.parseInt(ting));
		}
		if(fwxx!=null&&fwlx.trim().length()>0){
			fw.setFwxx(fwxx);
		}
		Calendar calendar = Calendar.getInstance();
		Date time = calendar.getTime();
		fw.setDate(time);
		int selective = mapper.insertSelective(fw);
		if(selective>0){
			out.println("<script>alert('添加成功');location.href='FwxxListServlet'</script>");
			sqlSession.commit();
		}else{
			sqlSession.rollback();
			out.println("<script>alert('添加失败');history.go(-1)</script>");
		}
	}

}
