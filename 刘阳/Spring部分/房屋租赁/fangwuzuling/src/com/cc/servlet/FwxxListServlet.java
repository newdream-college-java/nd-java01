package com.cc.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cc.entity.Fwxx;
import com.cc.entity.FwxxExample;
import com.cc.mapper.FwxxMapper;
import com.github.pagehelper.PageHelper;

public class FwxxListServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 311689750909577323L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		//�õ�pageҳ��
		String pageStr = request.getParameter("page");
		//���������ļ��õ�sqlSessionFactory����
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//�õ�sqlSession���ò�ѯ����
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		FwxxExample example=new FwxxExample();
		Integer page=1;
		if(pageStr!=null&&pageStr.trim().length()>0){
			page=Integer.parseInt(pageStr);
		}
		//���ط�ҳ���
		PageHelper.startPage(page, 3);
		//�õ����ؼ���
		List<Fwxx> selectByExample = mapper.selectByExample(example);
		
		//�õ���ҳ��
		int countBySelect = mapper.countBySelect();
		request.setAttribute("selectByExample", selectByExample);
		request.setAttribute("page", page);
		request.setAttribute("countBySelect", countBySelect);
		request.getRequestDispatcher("my.jsp").forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
