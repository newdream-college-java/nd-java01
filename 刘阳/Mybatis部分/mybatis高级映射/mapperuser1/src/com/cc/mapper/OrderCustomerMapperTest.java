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
		//创建会话工厂（工厂模式）sqlSessionFactory
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
    //通过在orders实体类中加入封装属性user来完成一对一查询
    @Test
    public void chaxun() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        Orders orders = OrderCustomerMapper.orderfind1(4);
        System.out.println(orders);
    }
    
    //通过在orders实体类中加入封装属性orderdetail来完成一对多查询
    @Test
    public void chaxun1() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        Orders orders = OrderCustomerMapper.orderfind2(3);
        System.out.println(orders.getOrderdetails());
        System.out.println(orders);
    }
    
    //通过在user实体类中加入封装属性orders
    //在orders实体类中加入封装属性orderdetail
    //在orderdetail实体类中加入封装属性items来完成复杂一对多查询
    @Test
    public void chaxun2() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
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
    
    //在User实体类中加入封装属性items
    //在items实体类中加入封装属性user来完成复杂一对多查询
    @Test
    public void chaxun3() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        OrderCustomerMapper OrderCustomerMapper = sqlSession.getMapper(OrderCustomerMapper.class);
        List<User> user = OrderCustomerMapper.querItemsByUserId();
//        System.out.println(orders.getOrderdetails());;
//        System.out.println(orders);
		System.out.println(user);
		sqlSession.close();

    }
    
 

}
