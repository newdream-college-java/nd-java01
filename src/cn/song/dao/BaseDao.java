package cn.song.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BaseDao {
	public Connection conn;
	public PreparedStatement pst;
	public ResultSet rs;
	/**
	 * 数据源连接数据库
	 * @throws NamingException
	 * @throws SQLException
	 */
	public void getConnection() throws NamingException, SQLException {
		Context context=new InitialContext();
		DataSource dataSource=(DataSource) context.lookup("java:comp/env/jdbc/book_car_ticket");
		conn=dataSource.getConnection();
	}
	/**
	 * 数据库关流
	 */
	public void closeAll() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(pst!=null) {
			try {
				pst.close();
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
	/**
	 * 增删改统一
	 */
	public boolean update(String sql,String...strings) {
		int result=-1;
		try {
			getConnection();
			pst=conn.prepareStatement(sql);
			for(int i=0;i<strings.length;i++) {
				pst.setObject(i+1, strings[i]);
			}
			result=pst.executeUpdate();
			if(result>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll();
		}
		return false;
	}
}
