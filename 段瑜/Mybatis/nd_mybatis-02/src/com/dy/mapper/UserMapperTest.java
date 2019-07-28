package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Items;
import com.dy.entiy.OrderDetail;
import com.dy.entiy.Orders;
import com.dy.entiy.User;

public class UserMapperTest {
	 SqlSessionFactory sqlSessionFactory =null;
	    @Before
	    public void init() throws IOException {
	        // 4.创建会话工厂(工厂模式) sqlSessionFactory
	        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	    }
	    @Test
	    public void findAll() {
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
	        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	        List<User> users = userMapper.findAll();
	        System.out.println(users);
	        sqlSession.commit();
	        sqlSession.close();
	    }
	    @Test
	    public void addUser() {
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
	        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	        User user=new User();
	        user.setAddress("湖南长沙");
	        user.setBirthday(new Date());
	        user.setSex("男");
	        user.setUsername("杨斌");
	        int result=userMapper.addUser(user);
	        sqlSession.commit();
	        sqlSession.close();
	    }
	    @Test
	    public void DeleteUser() {
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
	        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	        User user=new User();
	        user.setId(16);
	        int result=userMapper.DeleteUser(user);	
	        sqlSession.commit();
	        sqlSession.close();
	    }
	    @Test
	    public void UpadteUser() {
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
	        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	        User user=new User();
	        user.setUsername("杨斌");
	        user.setId(1);
	        int result=userMapper.DeleteUser(user);	
	        sqlSession.commit();
	        sqlSession.close();
	    }
	    @Test
	    public void Select() {
	        SqlSession sqlSession = sqlSessionFactory.openSession();
	        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	        User user=userMapper.findUserAll(1)	; 
	        for (Orders order:user.getOrders()) {	    	  
	    	   for (OrderDetail orderDetail:order.getOrderDetail()) {				
	    		   System.out.println(orderDetail.getItems());
	    	   }
	    	}
	        sqlSession.commit();
	        sqlSession.close();	    
	    }
	    SqlSession sqlSession =null;
	    @Test
	    public void d() {       
	        try {
	        	sqlSession = sqlSessionFactory.openSession();	
		        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		        User user=userMapper.selectUserItems();
		        for (Items items:user.getItems()) {
		        	System.out.println(items);
					for(User users:items.getUser()){
						System.out.println(users);
					}
				}
		        sqlSession.commit();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				 sqlSession.close();
			}
	    }
	    @Test
	    public void UserMapOrders() {       
	        try {
	        	sqlSession = sqlSessionFactory.openSession();	
		        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		        User user=userMapper.UserMapOrder(1);
		        System.out.println(user);
		        for (Orders orders:user.getOrders()) {
		        	System.out.println(orders);
				}
		        sqlSession.commit();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				 sqlSession.close();
			}
	    }
	    
}
