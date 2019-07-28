package com.wx;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.wx.entity.Items;
import com.wx.mapper.ItemsMapper;

public class ItemsMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	@Test
	public void Test1() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			ItemsMapper mapper = session.getMapper(ItemsMapper.class);
			Items od = mapper.findOrderdetail(2);
			System.out.println(od);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
