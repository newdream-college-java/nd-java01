package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	public Connection conn=null;
	public PreparedStatement pst=null;
	public ResultSet rs=null;
	public void getconn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/handset";
			conn=DriverManager.getConnection(url,"root","123");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	public void closeconn(ResultSet rs,PreparedStatement pst,Connection conn) {
		// TODO Auto-generated method stub
		try {
			if(rs!=null){
			rs.close();
			}
			if(pst!=null){
				pst.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
