package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import com.dy.entiy.OrderDetail;

public class OrderdetailMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void init() throws IOException{
		  InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
	       sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	 @Test
	    public void DetaMapOrders() { 
		 SqlSession sqlSession=null;
	        try {
	        	sqlSession = sqlSessionFactory.openSession();	
	        	OrderdetailMapper orderdetailMapper = sqlSession.getMapper(OrderdetailMapper.class);
	        	OrderDetail orderDetail=orderdetailMapper.DetaMapOrders(2);
		        System.out.println(orderDetail);
		        sqlSession.commit();
			} finally{
				 sqlSession.close();
			}
	    }
}
