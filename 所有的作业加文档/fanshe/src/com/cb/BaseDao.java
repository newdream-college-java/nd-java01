package com.cb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	public Connection conn = null;
	public PreparedStatement pst = null;
	public ResultSet rs = null;

	// 创建连接
	public void getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn = DriverManager.getConnection(url, "root", "root");
			// 1.上下文对象
			/*
			 * Context ctx = new InitialContext(); // 2.从上下文中获取数据源(连接池)
			 * DataSource ds = (DataSource)
			 * ctx.lookup("java:comp/env/jdbc/news"); conn = ds.getConnection();
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 增删改
	public int update(String sql, Object... objs) {
		int result = -1;
		try {
			getConn();
			pst = conn.prepareStatement(sql);
			for (int i = 0; i < objs.length; i++) {
				pst.setObject((i + 1), objs[i]);
			}
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pst, conn);
		}
		return result;
	}

	// 关闭流
	public void closeConn(ResultSet rs, Statement pst, Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		BaseDao bd = new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
}
