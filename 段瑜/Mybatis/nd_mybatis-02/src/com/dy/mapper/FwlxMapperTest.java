package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Fwlx;

public class FwlxMapperTest {
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
			FwlxMapper fwlxMapper=sqlSession.getMapper(FwlxMapper.class);
			List<Fwlx> fwlx = fwlxMapper.findAll();
			System.out.println(fwlx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Insert(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwlxMapper fwlxMapper=sqlSession.getMapper(FwlxMapper.class);
			Fwlx fwlx=new Fwlx();
			fwlx.setFwlx("Éµ×Ó");			
			int result=fwlxMapper.SaveFwlx(fwlx);
			System.out.println(fwlx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Update(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwlxMapper fwlxMapper=sqlSession.getMapper(FwlxMapper.class);
			Fwlx fwlx=new Fwlx();
			fwlx.setFwlx("¶þ¹·");
			fwlx.setLxid(1);
			int result=fwlxMapper.UpdateFwlx(fwlx);
			System.out.println(fwlx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Delete(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwlxMapper fwlxMapper=sqlSession.getMapper(FwlxMapper.class);
			Fwlx fwlx=new Fwlx();
			fwlx.setLxid(2);
			int result=fwlxMapper.DeleteFwlx(fwlx);
			System.out.println(fwlx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	
}
