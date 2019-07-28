package com.cc.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.core.config.Order;
import org.junit.Before;
import org.junit.Test;


import com.cc.entity.OrderCustomer;
import com.cc.entity.Orderdetail;
import com.cc.entity.Orders;
import com.cc.entity.User;

public class OrderCustomerMapperTest {

	SqlSessionFactory sqlSessionFactory =null;
    @Before
	public void init() throws IOException{
		//�����Ự����������ģʽ��sqlSessionFactory
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
    //ͨ����ordersʵ�����м����װ����user�����һ��һ��ѯ
    @Test
    public void chaxun() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //�൱�ڸ���UserMapper�ӿں�sqlӳ�� ����һ��UserMapperImpl������
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        Orders orders = OrderCustomerMapper.orderfind1(4);
        System.out.println(orders);
    }
    
    //ͨ����ordersʵ�����м����װ����orderdetail�����һ�Զ��ѯ
    @Test
    public void chaxun1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //�൱�ڸ���UserMapper�ӿں�sqlӳ�� ����һ��UserMapperImpl������
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        Orders orders = OrderCustomerMapper.orderfind2(3);
        System.out.println(orders.getOrderdetails());
        System.out.println(orders);
    }
    
    //ͨ����userʵ�����м����װ����orders
    //��ordersʵ�����м����װ����orderdetail
    //��orderdetailʵ�����м����װ����items����ɸ���һ�Զ��ѯ
    @Test
    public void chaxun2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //�൱�ڸ���UserMapper�ӿں�sqlӳ�� ����һ��UserMapperImpl������
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        User user = OrderCustomerMapper.findItem(1);
//        System.out.println(orders.getOrderdetails());;
//        System.out.println(orders);
	        for (Orders orders : user.getOrders()) {
				System.out.println(orders);
				for (Orderdetail orderdetail : orders.getOrderdetails()) {
					System.out.println(orderdetail);
					System.out.println(orderdetail.getItems());
				}
			}
		System.out.println(user);
		sqlSession.close();

    }
    
    //��Userʵ�����м����װ����items
    //��itemsʵ�����м����װ����user����ɸ���һ�Զ��ѯ
    @Test
    public void chaxun3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //�൱�ڸ���UserMapper�ӿں�sqlӳ�� ����һ��UserMapperImpl������
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        List<User> user = OrderCustomerMapper.querItemsByUserId();
//        System.out.println(orders.getOrderdetails());;
//        System.out.println(orders);
		System.out.println(user);
		sqlSession.close();

    }
    
 

}
