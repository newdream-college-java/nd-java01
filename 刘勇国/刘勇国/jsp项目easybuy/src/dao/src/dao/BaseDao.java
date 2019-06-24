package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class BaseDao {
		/*得到数据库连接（1.加载驱动；2.得到连接）*/
	    public static Connection getConn() {
	        Connection conn = null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            String url = "jdbc:mysql://127.0.0.1:3306/easybuy?useUnicode=true&characterEncoding=utf8&useSSL=true";
	            conn = DriverManager.getConnection(url, "root", "123456");
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return conn ;
	    }
	    /*统一关闭资源的方法*/
	    public static void closeConn(ResultSet rs,Statement pst,Connection conn) {
	    	//规避空指针异常,判断这些参数是否为空
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
	    //测试
	    public static void main(String[] args) {
			System.out.println(getConn());
		}
	}
