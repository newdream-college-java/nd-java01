package com.cb;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cb.entity.FwJd;
import com.cb.entity.FwLx;
import com.cb.mapper.FwJdMapper;
import com.cb.mapper.FwLxMapper;

public class FwLxMapperTest {
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
			FwLxMapper mapper = session.getMapper(FwLxMapper.class);
			// FwUser fm = new FwUser();
			FwLx fd = new FwLx();
			fd.setLxid(1);
			fd.setFwlx("ªµ»À");
			int result = mapper.updateFW(fd);
			System.out.println(result);
			session.commit();
		} finally {
			session.close();
		}

	}
}
