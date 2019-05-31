package cn.song.dao;
/**
* @author mo
* @version 2019年5月27日 上午11:38:59
* @description
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {
//	private static String driver="com.mysql.cj.jdbc.Driver";
//	private static String url="jdbc:mysql://localhost:3306/newsmanagersystem?"
//			+ "useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
//	private static String name="root";
//	private static String password="123456";
	public static Connection conn;
	public static PreparedStatement ps;
	public static ResultSet rs;
	public static void getConnection() throws ClassNotFoundException, SQLException {
		Context context=null;
		try {
			context = new InitialContext();
			DataSource dataSource=(DataSource) context.lookup("java:comp/env/jdbc/news");
			conn=dataSource.getConnection();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void closeAll() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(ps!=null) {
			try {
				ps.close();
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
}
