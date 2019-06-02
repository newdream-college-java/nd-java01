package com.cc.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cc.entity.New;

public class BaseDao {
	//public Connection conn;
	//public PreparedStatement pst;
	//public ResultSet rs;
	//public int rs;
	//1.得到的数据库链接，加载驱动；
		public static Connection getConn(){
			Connection conn=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://127.0.0.1:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf8&useSSL=true";
				conn=DriverManager.getConnection(url,"root","123456");
			} catch (Exception e) {
				e.printStackTrace();
			}
			//return conn;//用于测出是否成功
			return conn;
			
		}
		//2.关闭统一资源
		public static void closeConn(ResultSet rs,Statement pst,Connection conn){
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pst!=null){
				try {
					pst.close();
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
			 BaseDao bd=new BaseDao();
			System.out.println(bd.getConn());
		}
}
