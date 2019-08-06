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

import com.dy.entiy.Fwqx;


public class FwqxMapperTest {
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
			FwqxMapper fwqxMapper=sqlSession.getMapper(FwqxMapper.class);
			List<Fwqx> fwqx = fwqxMapper.findAll();
			System.out.println(fwqx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Insert(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwqxMapper fwqxMapper=sqlSession.getMapper(FwqxMapper.class);
			Fwqx fwqx=new Fwqx();
			fwqx.setQx("±±¾©");		
			int result=fwqxMapper.SaveFwqx(fwqx);
			System.out.println(fwqx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Update(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwqxMapper fwqxMapper=sqlSession.getMapper(FwqxMapper.class);
			Fwqx fwqx=new Fwqx();
			fwqx.setQx("³¤É³");
			fwqx.setQxid(1);
			int result=fwqxMapper.UpdateFwqx(fwqx);
			System.out.println(fwqx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Delete(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			FwqxMapper fwqxMapper=sqlSession.getMapper(FwqxMapper.class);
			Fwqx fwqx=new Fwqx();
			fwqx.setQxid(1);
			int result=fwqxMapper.DeleteFwqx(fwqx);
			System.out.println(fwqx);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
}
