package com.cc.dao;

import java.util.Properties;

public class BaseDao {
	public static void getConnection()throws Exception{
		Properties prop = new Properties();
		prop.load(BaseDao.class.getResourceAsStream("/config.properties"));
		String DRIVERNAME = prop.getProperty("DRIVER");
		String URL = prop.getProperty("URL");
		String UNAME = prop.getProperty("UNAME");
		String UPWD = prop.getProperty("UPWD");
		System.out.println(DRIVERNAME);
		System.out.println(URL);
		System.out.println(UNAME);
		System.out.println(UPWD);
		
	}
	public static void main(String[] args) throws Exception {
		getConnection();
	}
}