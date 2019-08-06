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

import com.dy.entiy.Fwjd;

public class FwjdMapperTest {
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
			FwjdMapper fwjdMapper=sqlSession.getMapper(FwjdMapper.class);
			List<Fwjd> fwjd = fwjdMapper.findAll();
			System.out.println(fwjd);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Insert(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwjdMapper fwjdMapper=sqlSession.getMapper(FwjdMapper.class);
			Fwjd fwjd=new Fwjd();
			fwjd.setJd("Ñî±ó");
			fwjd.setQxid(5);
			int result=fwjdMapper.SaveFwjd(fwjd);
			System.out.println(fwjd);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Update(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwjdMapper fwjdMapper=sqlSession.getMapper(FwjdMapper.class);
			Fwjd fwjd=new Fwjd();
			fwjd.setJd("Éµ¹·");
			fwjd.setJdid(1);
			int result=fwjdMapper.UpdateFwjd(fwjd);
			System.out.println(fwjd);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Delete(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwjdMapper fwjdMapper=sqlSession.getMapper(FwjdMapper.class);
			Fwjd fwjd=new Fwjd();
			fwjd.setJdid(4);
			int result=fwjdMapper.DeleteFwjd(fwjd);
			System.out.println(fwjd);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
