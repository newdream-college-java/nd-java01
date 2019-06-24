package com.cc.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
public class BaseDao {
	public  Connection conn=null;
	public PreparedStatement st=null;
	public ResultSet rs=null;
	public int result=-1;
	public void conn(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/newmanagersystem","root","ch123123");
		} catch (Exception e) {	
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	public void closeAll(ResultSet rs,Connection conn,Statement st){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		if(st!=null){
			try {
				st.close();
			} catch (SQLException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}		
	}
	public int add(int ntid, String ntitle, String nauthor, String filePath,
			String ncontent, String nsummary) {
		// TODO Auto-generated method stub
		return 0;
	}
}
