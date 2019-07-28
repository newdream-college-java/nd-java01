package com.wx;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.wx.entity.Items;
import com.wx.entity.Orderdetail;
import com.wx.entity.Orders;
import com.wx.entity.User;
import com.wx.mapper.OrderdetailMapper;
import com.wx.mapper.UserMapper;

public class UserMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	/*
	 * @Test public void Test() { SqlSession session = null; try { session =
	 * sqlSessionFactory.openSession(); OrderdetailMapper mapper = session
	 * .getMapper(OrderdetailMapper.class); List<Orderdetail> list =
	 * mapper.list(); System.out.println(list);
	 * 
	 * } finally { session.close(); }
	 * 
	 * }
	 */

	/*
	 * @Test public void insertTest() { SqlSession session = null; try { session
	 * = sqlSessionFactory.openSession(); UserMapper mapper =
	 * session.getMapper(UserMapper.class); User user = mapper.findItems(1);
	 * System.out.println(user); for (Orders orders : user.getOrders()) {
	 * System.out.println(orders); for (Orderdetail ordertail :
	 * orders.getOrderdetails()) { System.out.println(ordertail);
	 * System.out.println(ordertail.getItems()); } } //
	 * System.out.println(result); session.commit(); } finally {
	 * session.close(); } }
	 */
	//多对多
	@Test
	public void insertTest1() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			List<User> list = mapper.findALL();
			// System.out.println(list);
			for (User user : list) {
				System.out.println(user);
				for (Items items : user.getItems()) {
					System.out.println(items);
				}
			}
			// System.out.println(result);
			session.commit();
		} finally {
			session.close();
		}
	}
	
	////一对多 user---->orders订单
	@Test
	public void insertTest2() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			UserMapper mapper = session.getMapper(UserMapper.class);
			User or = mapper.findOrders(1);
			 System.out.println(or);
			session.commit();
		} finally {
			session.close();
		}
	}
}
