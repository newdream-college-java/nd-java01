package cn.song;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
* @author mo
* @version 2019年5月14日 上午8:42:39
* @description
*/
public class Test01 {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true"
			+ "&characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	private static String USERNAME="songhengda";
	private static String PASSWORD="123456";
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName(DRIVER);
			conn=DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("连接成功");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("连接失败");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("连接失败");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
