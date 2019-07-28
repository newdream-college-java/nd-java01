package cn.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	private static String Driver="com.mysql.jdbc.Driver";
	private static String url="jdbc:mysql://localhost:3306/test";
	private static String user="root";
	private static String pass="1997";
	public static String getDriver() {
		return Driver;
	}
	public void setDriver(String driver) {
		Driver = driver;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public static Connection getConnection() {
		Connection conn=null;
		try {
			Class.forName(Driver);
			conn=DriverManager.getConnection(url,user,pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;		
	}
	public static void doseAll(ResultSet rs,Connection conn,Statement st) {
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
		if(st!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
