package com.cc.mybatis;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cc.entity.Items;
import com.cc.entity.Orderdetail;



public class TestOrderdetail {
	public static void main(String[] args) throws IOException {
		//1.要得到statement必须先要得到sqlSession会话(区分用户的)
        //2.sqlSession会话是由sqlSession会话工厂来创建的(工厂模式)
        
        //第1步：得到sqlSession会话工厂sqlSessionFactory
    	//第一句代码的意思是:读取mybatis-config.xml配置文件根据配置文件由系统创建出一个符合配置文件定义的工厂
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //第二句代码:得到符合要求的工厂后,new出这个工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //第2步：得到sqlSession会话
        //sqlSession会话由sqlSession会话工厂创建,第一步已经按要求得到了自己定义的工厂,现在得到sqlSession会话
        SqlSession session = sqlSessionFactory.openSession();
        //第3步：通过会话执行sql语句
        
        
        //查询所有
//        List<Orderdetail> Orderdetail = session.selectList("newdream.findAllOrderdetail");
//        System.out.println(Orderdetail);
      //  第4步：关闭会话
      
        
         Orderdetail orderdetail = session.selectOne("newdream.findOrdertetailById",1);
        //按照id差数据
         System.out.println(orderdetail);
        session.close();
	}
	
}
