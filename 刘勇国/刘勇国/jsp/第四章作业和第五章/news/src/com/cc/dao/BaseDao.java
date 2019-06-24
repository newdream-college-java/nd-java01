package com.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
public class BaseDao {
	/*得到数据库连接（1.加载驱动；2.得到连接）*/
		public static Connection getConn(){
			Connection conn=null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://127.0.0.1:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf8&useSSL=true";
				conn=DriverManager.getConnection(url,"root","5942353");
			}catch(Exception e){
				e.printStackTrace();
			}
			return conn;
		}
    /*统一关闭资源的方法*/
		public static void closeConn(ResultSet rs,Connection conn,Statement st){
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(st!=null){
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			System.out.println(getConn());
		}
}
