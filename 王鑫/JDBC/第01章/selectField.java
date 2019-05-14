package Demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectField {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.创建数据库连接
		String url = "jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSLL=true";
		String username = "root";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, username, password);
		//3.创建statement对象(造船)
		Statement st = conn.createStatement();
		//4.发送并执行sql语句(贸易)
		String sql = "select * from emp";
		ResultSet result = st.executeQuery(sql);
		while (result.next()) {
			System.out.println(result.getString("ename"));
		}
		//5.判断是否查询成功
		if(result!=null) {
            System.out.println("已成功返回数据信息");
        }else {
            System.out.println("数据信息不存在");
        }
		//6.关流
		st.close();
		conn.close();
	}
}
