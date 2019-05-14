package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Pet01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String username="sa";
		String password="sa";
		conn =DriverManager.getConnection(url,username,password);
		System.out.println("连接数据库成功！！！");
		conn.close();
		System.out.println("已关闭数据库连接");
	}

}
