package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc {
	// 登录
	public static void main(String[] args) throws Exception {
		new Jdbc().login("二狗子", "123");
	}

	public void login(String userName, String pwd) throws Exception {
		long currentTime1 = System.currentTimeMillis();
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/homewok03?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn = DriverManager.getConnection(url, "root", "5942353");
		Statement st = conn.createStatement();
		for (int i = 0; i < 100; i++) {
			String sql = "insert into ta values(null,'狗" + i + "',12)";
			int re = st.executeUpdate(sql);
		}
		long currentTime2 = System.currentTimeMillis();
		System.out.println(currentTime2 - currentTime1);
		st.close();
		conn.close();
		// 二
		long currentTime3 = System.currentTimeMillis();
		Class.forName("com.mysql.jdbc.Driver");
		String url1 = "jdbc:mysql://127.0.0.1:3306/homewok03?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn1 = DriverManager.getConnection(url1, "root", "5942353");
		Statement st1 = conn1.createStatement();
		for (int i = 0; i < 1000; i++) {
			String sql1 = "insert into ta values(null,'狗" + i + "',12)";
			st1.addBatch(sql1);// 车
		}
		int re1[] = st1.executeBatch();
		if (re1.length >= 1000) {
			System.out.println("添加1000条数据成功！！！");
		}
		long currentTime4 = System.currentTimeMillis();
		System.out.println(currentTime4 - currentTime3);
		st1.close();
		conn1.close();
	}
}