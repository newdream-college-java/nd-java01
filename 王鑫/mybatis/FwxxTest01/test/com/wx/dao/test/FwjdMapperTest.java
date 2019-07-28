package com.wx.dao.test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.wx.dao.entity.Fwjd;
import com.yb.mapper.FwjdMapper;

public class FwjdMapperTest {
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
	public void listAllTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwjdMapper mapper = sqlSession.getMapper(FwjdMapper.class);
		List<Fwjd> listAll = mapper.listAll();
		System.out.println(listAll);
		sqlSession.close();
	}
	@Test
	public void addFwidTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwjd fw=new Fwjd();
		fw.setJd("4");
		fw.setJdid(4);
		FwjdMapper mapper = sqlSession.getMapper(FwjdMapper.class);		
		int addFwid = mapper.addFwid(fw);
		System.out.println(addFwid);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void modifyFwjdTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Fwjd fw=new Fwjd();
		fw.setJd("4");
		fw.setJdid(3);
		FwjdMapper mapper = sqlSession.getMapper(FwjdMapper.class);		
		int updateFw = mapper.modifyFwjd(fw);
		System.out.println(updateFw);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void removeFwjd() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int id=2;
		FwjdMapper mapper = sqlSession.getMapper(FwjdMapper.class);		
		int removeFwjd = mapper.removeFwjd(id);
		System.out.println(removeFwjd);
		sqlSession.commit();
		sqlSession.close();
	}
		
	

}
