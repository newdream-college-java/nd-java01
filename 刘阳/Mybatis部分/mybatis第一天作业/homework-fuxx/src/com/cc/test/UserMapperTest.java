package com.cc.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cc.entity.User;
import com.cc.mapper.UserMapper;

public class UserMapperTest {
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
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		List<User> listAll = mapper.listAll();
		System.out.println(listAll);
		sqlSession.close();
	}
	@Test
	public void addUserTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User fw=new User();
		fw.setUname("强哥");
		int Result=mapper.addUser(fw);
		System.out.println(Result);
		System.out.println(fw.getUid());
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void modifyUser(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User fw=new User();
		fw.setUid(1);
		fw.setUname("辉哥");
		int Result=mapper.modifyUser(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void removeUser(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		UserMapper mapper = sqlSession.getMapper(UserMapper.class);
		User fw=new User();
		fw.setUid(1);
		int Result=mapper.removeUser(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	
}
