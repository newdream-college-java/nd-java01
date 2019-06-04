package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BaseDao {
		
		
		// TODO Auto-generated method stub
		public static Connection getConn(){
			Connection conn=null;
			//PreparedStatement pst=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				String url=("jdbc:mysql://127.0.0.1:3306/newsmanagersystem?useUnicode=true&characterEncoding=utf8&useSSL=true");
				String us=("root");
				String ps=("root");
				conn=DriverManager.getConnection(url,us,ps);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
		}
		public static void closeConn(ResultSet rs,Connection conn,Statement ps) {
			if(rs!=null) {
				try {
					rs.close();
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
			if(ps!=null) {
				try {
					ps.close();
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
	
