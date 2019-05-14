package cn.cc.dao;
/**
* @author mob
* @version 2019年5月13日 下午6:52:12
* @description 练习1作业
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&"
			+ "characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	private static String USERNAME="songhengda";
	private static String PASSWORD="123456";
	/**
	 * @description 获取数据库连接
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection() throws SQLException {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("连接失败");
		} 
		return conn;
	}
	/**
	 * 1.关闭结果集
	 * 2.关闭预处理
	 * 3.关闭连接
	 * @param conn
	 * @param st
	 * @param rs
	 */
	public static void closeAll(Connection conn,Statement st,ResultSet rs) {
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
			BaseDao.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
