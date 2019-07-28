package com.cb;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cb.entity.FwUser;
import com.cb.mapper.FwUserMapper;

public class FwUserMapperTest {
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
			FwUserMapper mapper = session.getMapper(FwUserMapper.class);
			//FwUser fm = new FwUser();

			List<FwUser> list = mapper.list();
			System.out.println(list);
		} finally {
			session.close();
		}

	}
}
