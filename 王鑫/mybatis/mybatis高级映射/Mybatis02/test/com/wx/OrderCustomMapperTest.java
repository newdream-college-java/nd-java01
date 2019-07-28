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
import com.wx.entity.OrdersCustom;
import com.wx.mapper.OrderCustomMapper;
import com.wx.mapper.OrderMapper;

public class OrderCustomMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	/*
	 * @Test public void Test() { SqlSession session = null; try { session =
	 * sqlSessionFactory.openSession(); OrderCustomMapper mapper = session
	 * .getMapper(OrderCustomMapper.class); // mapper =
	 * session.getMapper(OrderCustomMapper.class); // OrdersCustom or= new
	 * OrdersCustom(); OrdersCustom or = mapper.findUser(3);
	 * System.out.println(or);
	 * 
	 * } finally { session.close(); }
	 * 
	 * }
	 */

	/*
	 * @Test public void Test2() { SqlSession session = null; try { session =
	 * sqlSessionFactory.openSession(); OrderMapper mapper =
	 * session.getMapper(OrderMapper.class); // mapper =
	 * session.getMapper(OrderCustomMapper.class); // OrdersCustom or= new
	 * OrdersCustom(); Orders or = mapper.findId(3); System.out.println(or);
	 * 
	 * } finally { session.close(); }
	 * 
	 * }
	 */

	/*
	 * @Test public void Test3() { SqlSession session = null; try { session =
	 * sqlSessionFactory.openSession(); OrderMapper mapper =
	 * session.getMapper(OrderMapper.class); // mapper =
	 * session.getMapper(OrderCustomMapper.class); // OrdersCustom or= new
	 * OrdersCustom(); Orders or = mapper.findByDatetail(4);
	 * System.out.println(or);
	 * 
	 * } finally { session.close(); } }
	 */
	/*@Test
	public void Test4() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			// mapper = session.getMapper(OrderCustomMapper.class);
			// OrdersCustom or= new OrdersCustom();
			Orders or = mapper.findItems(3);
			// System.out.println(or);
			for (Orderdetail orderdetail : or.getOrderdetails()) {
				// System.out.println(orderdetail);
				System.out.println(orderdetail.getItems());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}*/
	
	@Test
	public void Test5() {
		SqlSession session = null;
		try {
			session = sqlSessionFactory.openSession();
			OrderMapper mapper = session.getMapper(OrderMapper.class);
			// mapper = session.getMapper(OrderCustomMapper.class);
			// OrdersCustom or= new OrdersCustom();
			List<Orders>list = mapper.findAllItems();
			//System.out.println(list);
			for (Orders orders: list) {
				//System.out.println(orders);
				for(Items items:orders.getItems()){
					System.out.println(items);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
