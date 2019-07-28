package com.cc.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BaseDao {
	public SqlSessionFactory sqlSessionFactory = null;
	public BaseDao(){
		InputStream inputStream=null;
		try {
			inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
	}
}
