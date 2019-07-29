package com.ch.test;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ch.entity.Items;
import com.ch.entity.Test1;
import com.ch.entity.User;
import com.ch.mapper.UserMapper;


public class UserTest {
	SqlSessionFactory sqlSessionFactory =null;
    @Before
    public void init() throws IOException {
        // 4.创建会话工厂(工厂模式) sqlSessionFactory
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }
    //查询所有的user数据
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
  //查询所有的items数据
    @Test
    public void find(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Items> items = userMapper.find();
        System.out.println(items);
    }
    //根据id改user数据
    @Test
    public void modify(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setAddress("长沙");
        user.setId(1);
        int modify = userMapper.modify(user);
        System.out.println(modify);
        sqlSession.commit();
        sqlSession.close();
    }
    //添加user数据并查看id
    @Test
    public void insert(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user=new User();
        user.setUsername("辉哥");
        user.setAddress("长沙");
        int result = userMapper.insert(user);
        System.out.println(result);
        System.out.println(user.getId());
        sqlSession.commit();
        sqlSession.close();
    }
    //添加test1的数据并查看字符串id
    @Test
    public void insertTest1(){
    	SqlSession sqlSession = sqlSessionFactory.openSession();
        //相当于根据UserMapper接口和sql映射 创建一个UserMapperImpl代理类
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        Test1 test=new Test1();
        test.setNumber(12);
        int test1 = userMapper.insertTest1(test);
        System.out.println(test1);
        System.out.println(test.getOrderid());
        sqlSession.commit();
        sqlSession.close();
    }
}


