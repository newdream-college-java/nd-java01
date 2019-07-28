package com.cc.test;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cc.entity.Test1;
import com.cc.mapper.Test1Mapper;
public class Test1MapperTest {
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
	public void addTest1Test() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Test1 fw=new Test1();
		fw.setNumber(5);
		Test1Mapper mapper = sqlSession.getMapper(Test1Mapper.class);		
		int addTest1 = mapper.save(fw);
		System.out.println(addTest1);
		System.out.println(fw.getOrderid());
		sqlSession.commit();
		sqlSession.close();
	}
	
}
