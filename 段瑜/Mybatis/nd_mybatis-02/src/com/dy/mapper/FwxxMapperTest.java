package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Fwxx;



public class FwxxMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	SqlSession sqlSession=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void select(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwxxMapper fwxxMapper=sqlSession.getMapper(FwxxMapper.class);
			List<Fwxx> fwxx = fwxxMapper.findAll();
			System.out.println(fwxx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Insert(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwxxMapper fwxxMapper=sqlSession.getMapper(FwxxMapper.class);
			Fwxx fwxx=new Fwxx();
			fwxx.setDate(new Date());
			fwxx.setShi(3);
			int result=fwxxMapper.SaveFwxx(fwxx);
			System.out.println(fwxx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Update(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwxxMapper fwxxMapper=sqlSession.getMapper(FwxxMapper.class);
			Fwxx fwxx=new Fwxx();
			fwxx.setShi(6);
			fwxx.setFwid(1);
			int result=fwxxMapper.UpdateFwxx(fwxx);
			System.out.println(fwxx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Delete(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwxxMapper fwxxMapper=sqlSession.getMapper(FwxxMapper.class);
			Fwxx fwxx=new Fwxx();
			fwxx.setFwid(2);
			int result=fwxxMapper.DeleteFwxx(fwxx);
			System.out.println(fwxx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
