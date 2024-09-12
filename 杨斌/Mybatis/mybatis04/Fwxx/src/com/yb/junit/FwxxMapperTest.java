package com.yb.junit;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yb.entity.Fwxx;
import com.yb.entity.FwxxExample;
import com.yb.entity.FwxxExample.Criteria;
import com.yb.mapper.FwxxMapper;

public class FwxxMapperTest {
	SqlSessionFactory sqlSessionFactory =null;
	@Before
	public void init() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	//一级缓存
	@Test
	public void selectByPrimaryKeyTest() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Integer fwid=7;
		Fwxx selectByPrimaryKey = mapper.selectByPrimaryKey(fwid);
		System.out.println(selectByPrimaryKey);
		Fwxx selectByPrimaryKey02 = mapper.selectByPrimaryKey(fwid);
		System.out.println(selectByPrimaryKey02);
	}
	//二级缓存
		@Test
		public void selectByPrimaryKey02Test() {
			SqlSession sqlSession = sqlSessionFactory.openSession();			
			FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);			
			Integer fwid=7;
			Fwxx selectByPrimaryKey = mapper.selectByPrimaryKey(fwid);
			System.out.println(selectByPrimaryKey);
			sqlSession.close();
			
			SqlSession sqlSession01 = sqlSessionFactory.openSession();
			FwxxMapper mapper01 = sqlSession01.getMapper(FwxxMapper.class);
			Fwxx selectByPrimaryKey02 = mapper01.selectByPrimaryKey(fwid);
			System.out.println(selectByPrimaryKey02);
			sqlSession01.close();
		}
		//分布式缓存
		@Test
		public void selectByPrimaryKey03Test() {
			SqlSession sqlSession = sqlSessionFactory.openSession();			
			FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);			
			Integer fwid=7;
			Fwxx selectByPrimaryKey = mapper.selectByPrimaryKey(fwid);
			System.out.println(selectByPrimaryKey);
			sqlSession.close();
			System.out.println("");
			SqlSession sqlSession01 = sqlSessionFactory.openSession();
			FwxxMapper mapper01 = sqlSession01.getMapper(FwxxMapper.class);
			Fwxx selectByPrimaryKey02 = mapper01.selectByPrimaryKey(fwid);
			System.out.println(selectByPrimaryKey02);
			sqlSession01.close();
		}
		//高级查询
		@Test
		public void queryByCondition() {
			FwxxExample ex=new FwxxExample();
			Criteria crieria=ex.createCriteria();
			crieria.andFwxxLike("%别%").andShiEqualTo(2);
			Criteria crieria2=ex.createCriteria();
			crieria2.andFwidEqualTo(7);
			ex.or(crieria2);
			SqlSession sqlSession = sqlSessionFactory.openSession();			
			FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);	
			List<Fwxx> selectByExample = mapper.selectByExample(ex);
			System.out.println(selectByExample);
			
		}

}
