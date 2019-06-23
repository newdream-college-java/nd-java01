package com.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDao {
	public static Connection conn = null;
	public PreparedStatement pst = null;
	public ResultSet rs = null;
	/*得到数据库连接（1.加载驱动；2.得到连接）*/
    public static  Connection getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
        		//Context ctx = new InitialContext();
        		//DataSource ds= (DataSource) ctx.lookup("java:comp/env/java/news");
        		//conn = ds.getConnection();
            conn = DriverManager.getConnection(url, "root", "5942353");
        } catch (Exception e) {
            e.printStackTrace();
        }
		return conn;
    }
    /*统一关闭资源的方法*/
    public static  void closeConn(ResultSet rs,Statement pst,Connection conn) {
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
  
}
