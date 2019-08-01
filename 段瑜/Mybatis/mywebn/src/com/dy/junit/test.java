package com.dy.junit;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import com.dy.entity.Fwxx;
import com.dy.entity.FwxxExample;
import com.dy.mapper.FwxxMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class test {
	@Test
	public void testMbg()  throws Exception{		
		  List<String> warnings = new ArrayList<String>();
		   boolean overwrite = true;
		   File configFile = new File("MBG.xml");
		   ConfigurationParser cp = new ConfigurationParser(warnings);
		   Configuration config = cp.parseConfiguration(configFile);
		   DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		   MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		   myBatisGenerator.generate(null);
	}
	@Test
	public void testSelect() throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		FwxxMapper mapper = sqlSession.getMapper(FwxxMapper.class);
		FwxxExample example=new FwxxExample();
		PageHelper.startPage(1, 3);
		
		List<Fwxx> selectByExample = mapper.selectByExample(example);
		System.out.println(((Page)selectByExample));
	}
}
