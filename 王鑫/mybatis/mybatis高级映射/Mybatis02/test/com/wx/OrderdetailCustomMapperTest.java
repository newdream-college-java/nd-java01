package com.wx;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.wx.entity.OrderdetailCustom;
import com.wx.mapper.OrderdetailCustomMapper;

public class OrderdetailCustomMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	/*
	 * @Test public void Test(){ SqlSession session=null; try{
	 * session=sqlSessionFactory.openSession(); OrderdetailMapper
	 * mapper=session.getMapper(OrderdetailMapper.class);
	 * List<Orderdetail>list=mapper.list(); System.out.println(list);
	 * 
	 * }finally{ session.close(); }
	 * 
	 * }
	 * 
	 * @Test public void insertTest(){ SqlSession session=null; try{
	 * session=sqlSessionFactory.openSession(); OrderdetailMapper
	 * mapper=session.getMapper(OrderdetailMapper.class); Orderdetail od=new
	 * Orderdetail(); od.setId(103); od.setItemsId(102); od.setItemsNum(103);
	 * od.setOrdersId(104); Integer result=mapper.insert(od);
	 * System.out.println(result); session.commit(); }finally{ session.close();
	 * } }
	 */

	@Test
	public void Test1() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			OrderdetailCustomMapper mapper = session.getMapper(OrderdetailCustomMapper.class);
			OrderdetailCustom list = mapper.findOrders(4);
			System.out.println(list);

		} finally {
			session.close();
		}

	}
}
