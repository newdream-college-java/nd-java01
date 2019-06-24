package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class BaseDao {
	  /* 1,����������2.��ȡ���� */
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/test1?useUnicode=true&characterEncoding=utf8&useSSL=true";
            conn = DriverManager.getConnection(url, "root", "ch123123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /* 3,�ر���Դ */
    public static void closeConn(ResultSet rs, Statement pst, Connection conn) {
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
        System.out.println(getConn());
    }
}
