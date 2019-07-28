package com.yb.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.yb.entity.Fwqx;
import com.yb.mapper.FwqxMapper;

public class FwqxMapperTest {
	SqlSessionFactory sqlSessionFactory = null;
	@Before
	public void init() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void listAllTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwqxMapper mapper = sqlSession.getMapper(FwqxMapper.class);
		List<Fwqx> listAll = mapper.listAll();
		System.out.println(listAll);
	}
	@Test
	public void addFwqxTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwqxMapper mapper = sqlSession.getMapper(FwqxMapper.class);
		Fwqx fw=new Fwqx();
		fw.setQxid(1);
		fw.setQx("11");
		int Result=mapper.addFwqx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void modifyFwqx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwqxMapper mapper = sqlSession.getMapper(FwqxMapper.class);
		Fwqx fw=new Fwqx();
		fw.setQxid(1);
		fw.setQx("Ð¡±ðÊû");
		int Result=mapper.modifyFwqx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void removeFwqx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwqxMapper mapper = sqlSession.getMapper(FwqxMapper.class);
		Fwqx fw=new Fwqx();
		fw.setQxid(1);
		int Result=mapper.removeFwqx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
}
