package dao;

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
    public  void getConn() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/sj?useUnicode=true&characterEncoding=utf8&useSSL=true";
            conn = DriverManager.getConnection(url, "root", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void closeConn(ResultSet rs,Statement pst,Connection conn) {
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
