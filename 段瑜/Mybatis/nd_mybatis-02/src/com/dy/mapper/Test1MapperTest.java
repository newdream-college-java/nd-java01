package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Test1;

public class Test1MapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	SqlSession sqlSession=null;
	@Test
	public void saves(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
			Test1 test1=new Test1();
			test1.setNumber(11);
			int result=test1Mapper.save(test1);
			sqlSession.commit();
			System.out.println(test1.getOrderid());
		} finally{
			sqlSession.close();
		}		
	}
	public void select(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			Test1Mapper test1Mapper=sqlSession.getMapper(Test1Mapper.class);
			Test1 test1=new Test1();
			test1.setNumber(11);
			int result=test1Mapper.save(test1);
			sqlSession.commit();
			System.out.println(test1.getOrderid());
		} finally{
			sqlSession.close();
		}		
	}
}
