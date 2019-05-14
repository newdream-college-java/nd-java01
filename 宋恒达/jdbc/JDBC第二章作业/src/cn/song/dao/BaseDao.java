package cn.song.dao;
/**
* @author mo
* @version 2019年5月14日 下午6:47:34
* @description
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String USERNAME="songhengda";
	private static String PASSWORD="123456";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&"
			+ "characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	public static Connection getConnection() throws SQLException {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	public static void release(Connection conn,Statement st,ResultSet rs) {
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
		Connection conn=null;
		try {
			conn=BaseDao.getConnection();
			System.out.println("连接成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
		}
	}
}
