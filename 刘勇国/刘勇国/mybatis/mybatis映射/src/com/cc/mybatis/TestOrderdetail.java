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
		//1.Ҫ�õ�statement������Ҫ�õ�sqlSession�Ự(�����û���)
        //2.sqlSession�Ự����sqlSession�Ự������������(����ģʽ)
        
        //��1�����õ�sqlSession�Ự����sqlSessionFactory
    	//��һ��������˼��:��ȡmybatis-config.xml�����ļ����������ļ���ϵͳ������һ�����������ļ�����Ĺ���
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        //�ڶ������:�õ�����Ҫ��Ĺ�����,new���������
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //��2�����õ�sqlSession�Ự
        //sqlSession�Ự��sqlSession�Ự��������,��һ���Ѿ���Ҫ��õ����Լ�����Ĺ���,���ڵõ�sqlSession�Ự
        SqlSession session = sqlSessionFactory.openSession();
        //��3����ͨ���Ựִ��sql���
        
        
        //��ѯ����
//        List<Orderdetail> Orderdetail = session.selectList("newdream.findAllOrderdetail");
//        System.out.println(Orderdetail);
      //  ��4�����رջỰ
      
        
         Orderdetail orderdetail = session.selectOne("newdream.findOrdertetailById",1);
        //����id������
         System.out.println(orderdetail);
        session.close();
	}
	
}
