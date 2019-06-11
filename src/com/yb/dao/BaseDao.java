package com.yb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {
	public Connection conn=null;
	public PreparedStatement st=null;
	public ResultSet rs=null;
	
	
	//建立连接
//	public void getConn(){
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/parentchildnetwork","root","1997");
//		} catch (Exception e) {	
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
//	}
//	
	//关闭连接
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
	public void text(){
		try {
			Context ctx=new InitialContext();
			DataSource ds=(DataSource) ctx.lookup("java:comp/env/jdbcNews");
			conn= ds.getConnection(); 
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	
	
}
