package BaseDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.org.apache.regexp.internal.recompile;



public class BaseDao {
	public static Connection conn=null;
	public PreparedStatement pst = null;
	public ResultSet rs=null;
	public void getConn(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/nd_sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void doseAll(ResultSet rs, Statement pst,Connection conn) {
		if(rs!=null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(pst!=null) {
			try {
				pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	}
	
}
