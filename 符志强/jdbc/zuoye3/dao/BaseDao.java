package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @ClassName: BaseDao       * @Description: 封装dao的公共代码（加载驱动，得到数据库连接，关闭连接）     
 *             * @author 新梦想IT学院.陈超     * @date 2019年5月13日       *   
 */
public class BaseDao {
    /* 1,加载驱动，获取连接 */
    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/t1?useUnicode=true&characterEncoding=utf8&useSSL=true";
            conn = DriverManager.getConnection(url, "root", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /* 3,关闭资源 */
    public static void closeConn(ResultSet rs, Statement pst, Connection conn) {
        // 原则：先开后关 先关结果集 然后关预处理对象 最后关数据连接
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
    //2.测试
    public static void main(String[] args) {
        System.out.println(getConn());
    }
}
