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
	public void getConnection() throws NamingException, SQLException {
		Context context=new InitialContext();
		DataSource dataSource=(DataSource) context.lookup("java:comp/env/jdbc/book_car_ticket");
		conn=dataSource.getConnection();
	}
	
}
