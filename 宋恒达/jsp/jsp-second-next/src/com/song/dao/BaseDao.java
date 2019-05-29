package com.song.dao;
/**
* @author mo
* @version 2019年5月23日 下午2:18:12
* @description
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/nd_sys?useUnicode=true&characterEncoding=utf8"
			+ "&serverTimezone=GMT&useSSL=true";
	private static String NAME="songhengda";
	private static String PASSWORD="123456";
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		Connection conn=null;
		Class.forName(DRIVER);
		conn=DriverManager.getConnection(URL, NAME, PASSWORD);
		return conn;
	}
	public static void closeAll(Connection conn,Statement st,ResultSet rs){
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println(getConnection());
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
