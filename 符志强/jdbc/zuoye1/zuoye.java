package zuoye1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class zuoye {
	public static void main(String[] args) throws Exception{
		hhh();
	}
	public static void hhh() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String ename="root";
		String pwd="123";
		Connection conn=DriverManager.getConnection(url,ename,pwd);
		System.out.println(conn);
		if(conn!=null) {
			System.out.println("连接成功");
		}else {
			System.out.println("连接失败");
		}
		conn.close();
		System.out.println("关闭连接");
	}
}
