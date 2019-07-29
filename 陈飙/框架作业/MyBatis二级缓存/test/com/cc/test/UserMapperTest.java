package com.cc.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.cb.entity.User;
import com.cb.mapper.UserMapper;

public class UserMapperTest {
	SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws IOException {
		// 4.创建会话工厂(工厂模式) sqlSessionFactory
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}

	// 测试二级缓存
	@Test
    public void testSecondLevelCache() {
        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession1.getMapper(UserMapper.class);
        //mybatis会将id=1的用户放入一级缓存：默认select  flushcache=false
       // User user = mapper.findALL(1);
       // System.out.println(user);
      
       // sqlSession1.close();//一级缓存失效
        
        System.out.println("");
        //第2次查询 id=1的用户信息：重新缓存
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 = mapper2.findALL(1);
        System.out.println(user2);
        
        User user3 = mapper2.findALL(1);
        System.out.println(user3);
        //sqlSession2.close();
        User user4 = mapper2.findALL(1);
        System.out.println(user4);
        sqlSession2.close();
    }
    

}
