package cn.two.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class BaseDao {
	public static Connection getConn() {
		Connection conn=null;
		PreparedStatement pst=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;
	}
	public static void doseAll(ResultSet rs, Statement pst, Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(pst!=null) {
			try {
				pst.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
