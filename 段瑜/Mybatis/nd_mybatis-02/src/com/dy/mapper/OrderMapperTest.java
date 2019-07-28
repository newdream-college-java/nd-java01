package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Items;
import com.dy.entiy.OrderCustom;
import com.dy.entiy.OrderDetail;
import com.dy.entiy.Orders;

public class OrderMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	SqlSession sqlSession=null;
	@Test
	public void Select(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
			OrderCustom orderCustom=orderMapper.findAll(3);
			System.out.println(orderCustom);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Select2(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
			Orders orders=orderMapper.findAll2(3);
			System.out.println(orders);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void Selects(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
			Orders orders=orderMapper.findDetailById(3);
			List<OrderDetail> orderDetails=orders.getOrderDetail();
			System.out.println(orderDetails);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void OrdersfindItems(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
			Orders orders=orderMapper.OrdersfindItems(3);
			System.out.println(orders);
			sqlSession.commit();
		} finally {
			sqlSession.close();
		}
	}
	@Test
	public void OrdersAllItems(){
		try {
			sqlSession=sqlSessionFactory.openSession();
			OrderMapper orderMapper=sqlSession.getMapper(OrderMapper.class);
			List<Orders> orders=orderMapper.OrdersAllItems();
			for (Orders order:orders) {
				for (Items items:order.getItems()) {
		        	System.out.println(items);
					for(Orders ordersr:items.getOrders()){
						System.out.println(ordersr);
					}
				}
				}
			sqlSession.commit();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
	}
}
