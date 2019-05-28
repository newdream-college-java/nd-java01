package biao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public static Connection ct(){
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/jsp4?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","123");
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;	
	}
	public void gl(ResultSet rs,PreparedStatement pst,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst!=null) {
			try {
				pst.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
	