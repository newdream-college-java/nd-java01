package cn.cc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*�õ����Ӻ͹ر����ӵĴ���*/
public class BaseDao {
	public static Connection getConnection() {
		Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
            conn = DriverManager.getConnection(url, "sa", "sa");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
	public static void closeAll(ResultSet rs, Statement pst, Connection conn) {
        // ԭ���ȿ���� �ȹؽ���� Ȼ���Ԥ������� ������������
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
    //����
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
	public void executeUpdate() {
		
	}
	
	
	
}
