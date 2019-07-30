package test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import mapper.HcMapper;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;




import entity.Items;
import entity.OrderCustom;
import entity.Orders;
import entity.User;


public class orderIdMapperTest {
    SqlSessionFactory sqlSessionFactory =null;
    @Before
    public void init() throws IOException {
        // 4.创建会话工厂(工厂模式) sqlSessionFactory
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    //分布式缓存
    @Test
    public void testEhCache() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        HcMapper mapper = sqlSession1.getMapper(HcMapper.class);
        //mybatis会将id=1的用户放入一级缓存：默认select  flushcache=false
        Items user = mapper.hc(1);
        System.out.println(user);
        Items user2 = mapper.hc(10);
        System.out.println(user2);
        sqlSession1.close();//一级缓存失效
        
        System.out.println("");
        //第2次查询 id=1的用户信息：重新缓存
        HcMapper mapper2 = sqlSession2.getMapper(HcMapper.class);
        Items user3 = mapper2.hc(1);
        System.out.println(user3);
        
        Items user4 = mapper2.hc(10);
        System.out.println(user4);
        sqlSession2.close();
    }
    
  //本地一级缓存
    @Test
    public void hc(){
    	SqlSession openSession = sqlSessionFactory.openSession();
    	HcMapper mapper = openSession.getMapper(HcMapper.class);
    	Items list = mapper.hc(1);
    	System.out.println(list);
    	
    	Items list3 = new Items();
    	list3.setId(1);
    	list3.setName("台式机1号");
    	System.out.println(list3);
    	
    	Items list2 = mapper.hc(1);
    	System.out.println(list2);
    	openSession.close();
    }
    //本地二级缓存
    @Test
    public void hc2(){
    	SqlSession openSession1 = sqlSessionFactory.openSession();
    	SqlSession openSession2 = sqlSessionFactory.openSession();
    	HcMapper mapper = openSession1.getMapper(HcMapper.class);
    	Items list = mapper.hc(1);
    	System.out.println(list);
    	openSession1.close();
    	
    	System.out.println("---------------------++++");
    	
    	HcMapper mapper2 = openSession2.getMapper(HcMapper.class);
    	Items list2 = mapper2.hc(1);
    	System.out.println(list2);
    	openSession2.close();
    }
}   








