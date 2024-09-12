package com.yb.test;
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
import com.yb.mapper.FwxxMapper;

public class FwxxMapperTest {
	SqlSessionFactory sqlSessionFactory = null;
	@Before
	public void init() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	@Test
	public void listAllTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		List<Fwxx> listAll = mapper.listAll();
		System.out.println(listAll);
	}
	@Test
	public void addFwqxTest(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Fwxx fw=new Fwxx();
		fw.setFwid(1);
		fw.setFwxx("±ðÊû");
		int Result=mapper.addFwxx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void modifyFwxx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Fwxx fw=new Fwxx();
		fw.setFwid(1);
		fw.setFwxx("´ó±ðÊû");
		int Result=mapper.modifyFwxx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
	@Test
	public void removeFwxx(){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		Fwxx fw=new Fwxx();
		fw.setFwid(1);
		int Result=mapper.removeFwxx(fw);
		System.out.println(Result);
		sqlSession.commit();
		sqlSession.close();
	}
}
