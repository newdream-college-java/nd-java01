package com.yb.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BaseDao {
	public static Connection getConn(){
		Properties prop = new Properties();
		InputStream is = BaseDao.class.getResourceAsStream("config.properties");
		try {
			prop.load(is);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String user=prop.getProperty("uname");
		String password=prop.getProperty("upwd");
		Connection conn=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally{
			try {
				is.close();
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	public void closeAll(ResultSet rs,Connection conn,Statement st){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
