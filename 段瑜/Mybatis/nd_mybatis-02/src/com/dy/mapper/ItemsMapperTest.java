package com.dy.mapper;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.dy.entiy.Items;



public class ItemsMapperTest {
	SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void init() throws IOException{
		InputStream inputStream=Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void imtesAll(){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
		List<Items> items = itemsMapper.imtesAll();
		System.out.println(items);
		sqlSession.commit();
        sqlSession.close();
	}
	@Test
	public void UpdateItems(){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
		Items items=new Items();
		items.setId(2);
		items.setName("虚拟机");
		int result = itemsMapper.modifyItems(items);
		sqlSession.commit();
        sqlSession.close();
	}
	@Test
	public void saveItems(){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
		Items items=new Items();
		items.setName("虚拟机");
		items.setPrice((float) 60000);
		items.setDetail("该电脑质量非常好！！！！");
		items.setCreatetime(new Date());
		int result=itemsMapper.saveItems(items);
		System.out.println(items.getId());
		sqlSession.commit();
        sqlSession.close();
	}
	@Test
	public void delete(){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
		Items items=new Items();
		items.setId(4);
		int result = itemsMapper.DeleteItems(items);
		sqlSession.commit();
        sqlSession.close();
	}
	@Test
	public void ItemsfindDetail(){
		SqlSession sqlSession=null;
		try {
			sqlSession=sqlSessionFactory.openSession();
			ItemsMapper itemsMapper=sqlSession.getMapper(ItemsMapper.class);
			Items items=itemsMapper.ItemsfindDetail(2);
			System.out.println(items);
			sqlSession.commit();
		}finally{
			sqlSession.close();
		}
		
	}
}
