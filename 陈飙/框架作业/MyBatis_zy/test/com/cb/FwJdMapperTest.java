package com.cb;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cb.entity.FwJd;
import com.cb.mapper.FwJdMapper;


public class FwJdMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws Exception {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void listTest() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			FwJdMapper mapper = session.getMapper(FwJdMapper.class);
			// FwUser fm = new FwUser();
			FwJd fd=new FwJd();
			fd.setJdid(1);
			fd.setJd("∫√»À");
			fd.setQxid(101);
			int result = mapper.insertFw(fd);
			System.out.println(result);
			session.commit();
		} finally {
			session.close();
		}

	}
}
