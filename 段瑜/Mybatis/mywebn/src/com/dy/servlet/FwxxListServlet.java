package com.dy.servlet;

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

import com.dy.entity.Fwxx;
import com.dy.entity.FwxxExample;
import com.dy.mapper.FwxxMapper;
import com.github.pagehelper.PageHelper;

public class FwxxListServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 311689750909577323L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//编码
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		//得到page页数
		String pageStr = request.getParameter("page");
		//加载配置文件得到sqlSessionFactory工厂
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//得到sqlSession调用查询方法
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		FwxxExample example=new FwxxExample();
		Integer page=1;
		if(pageStr!=null&&pageStr.trim().length()>0){
			page=Integer.parseInt(pageStr);
		}
		//加载分页插件
		PageHelper.startPage(page, 3);
		//得到返回集合
		List<Fwxx> selectByExample = mapper.selectByExample(example);
		
		//得到总页数
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
