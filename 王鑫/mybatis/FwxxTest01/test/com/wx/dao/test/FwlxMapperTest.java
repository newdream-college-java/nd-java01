package com.wx.dao.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.wx.dao.entity.Fwlx;
import com.yb.mapper.FwlxMapper;

public class FwlxMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void init(){
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	@Test
	public void listAllTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwlxMapper mapper = sqlSession.getMapper(FwlxMapper.class);
		List<Fwlx> listAll = mapper.listAll();
		System.out.println(listAll);
		sqlSession.close();
	}
	@Test
	public void addFwlxTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwlxMapper mapper = sqlSession.getMapper(FwlxMapper.class);
		Fwlx fw=new Fwlx();
		fw.setLxid(1);
		fw.setFwlx("别墅");
		int Result=mapper.addFwlx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void modifyFwlx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwlxMapper mapper = sqlSession.getMapper(FwlxMapper.class);
		Fwlx fw=new Fwlx();
		fw.setLxid(1);
		fw.setFwlx("小别墅");
		int Result=mapper.modifyFwlx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void removeFwlx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwlxMapper mapper = sqlSession.getMapper(FwlxMapper.class);
		int id=1;
		int Result=mapper.removeFwlx(id);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	
}
