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

import com.dy.entiy.User1;

public class User1MapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	SqlSession sqlSession=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void findAll(){
		sqlSession=sqlSessionFactory.openSession();
		User1Mapper user1Mapper=sqlSession.getMapper(User1Mapper.class);
		List<User1> user1=user1Mapper.findAll();
		System.out.println(user1);
	    sqlSession.commit();
	    sqlSession.close();
	}
	public void save(){
		sqlSession=sqlSessionFactory.openSession();
		User1Mapper user1Mapper=sqlSession.getMapper(User1Mapper.class);
		User1 user1=new User1();
		user1.setUname("Со±у");
		user1.setUpass("11111");
		int result=user1Mapper.saveUser1(user1);
	    sqlSession.commit();
	    sqlSession.close();
	}
	public void Upadte(){
		sqlSession=sqlSessionFactory.openSession();
		User1Mapper user1Mapper=sqlSession.getMapper(User1Mapper.class);
		User1 user1=new User1();
		user1.setUid(1);
		user1.setUname("Со±у");
		int result=user1Mapper.UpdateUser1(user1);
	    sqlSession.commit();
	    sqlSession.close();
	}
	@Test
	public void Delete(){
		sqlSession=sqlSessionFactory.openSession();
		User1Mapper user1Mapper=sqlSession.getMapper(User1Mapper.class);
		User1 user1=new User1();
		user1.setUid(3);
		int result=user1Mapper.DeleteUser1(user1);
	    sqlSession.commit();
	    sqlSession.close();
	}
}
