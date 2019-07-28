package com.cb;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cb.entity.FwQx;
import com.cb.entity.FwUser;
import com.cb.mapper.FwQxMapper;
import com.cb.mapper.FwUserMapper;

public class FwQxMapperTest {
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
			FwQxMapper mapper = session.getMapper(FwQxMapper.class);
			FwQx fm = new FwQx();
			fm.setQxid(1);
			int result = mapper.deleteFw(fm);
			System.out.println(result);
			session.commit();
		} finally {
			session.close();
		}

	}
}
