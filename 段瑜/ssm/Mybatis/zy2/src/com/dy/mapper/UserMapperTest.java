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

import com.dy.entity.User;

public class UserMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	SqlSession sqlSession=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-comfig.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	//每次查询刷新一级缓存
	@Test
	public void selectByExample(){
		sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> user=userMapper.selectByExample();
		System.out.println(user);
		List<User> user1=userMapper.selectByExample();
		System.out.println(user1);
		sqlSession.close();
	}
	//开启一级缓存
	@Test
	public void UserfindAll(){
		sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> user=userMapper.UserfindAll();
		System.out.println(user);
		List<User> user1=userMapper.UserfindAll();
		System.out.println(user1);
		sqlSession.close();
	}
	//
	@Test
	public void selectByExample1(){
		sqlSession=sqlSessionFactory.openSession();
		SqlSession sqlSession1=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> user=userMapper.UserfindAll();
		System.out.println(user);
		sqlSession.close();
		
		UserMapper userMapper1=sqlSession1.getMapper(UserMapper.class);
		List<User> user1=userMapper1.UserfindAll();
		System.out.println(user1);
		sqlSession.close();
	}
	@Test
	public void selectByExample2(){
		sqlSession=sqlSessionFactory.openSession();
		UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
		List<User> user=userMapper.UserfindAll();
		System.out.println(user);
		List<User> user1=userMapper.UserfindAll();
		System.out.println(user1);
		sqlSession.close();
	
	}
}
