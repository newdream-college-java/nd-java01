package com.cc.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.cc.entity.Items;
import com.cc.entity.Test1;


public class Test2 {
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
	        List<Items> items = session.selectList("newdream.findAllItems");
	        System.out.println(items);
	      //  ��4�����رջỰ
	        
	        
	        //��idɾ��
//	        int item2 =session.delete("newdream.deleteById", 5);
//	        System.out.println(item2);
//	        session.close();
	        
	        //���
//	        Items i =new Items();
//	        i.setName("lyg");
//	        int item3 =session.insert("newdream.addItems",i );
//	        System.out.println(i.getId());
//	        session.commit();
//	        session.close();
//	        

	        
	        //���Է�����������
//	        Test1 i =new Test1();
//	        i.setNumber(22);
//	        int r=session.insert("newdream.save",i);
//	        System.out.println(i.getOrderid());
//	        session.commit();
//	      
//	        session.close();
	        
	        
//	        //��id��������
//	       Items i =new Items();
//	       i.setDetail("111");
//	       i.setName("lyg");
//	       i.setId(9);
//	        int r =session.update("newdream.updateById", i);
//	        session.commit();
	       
	    }
}
