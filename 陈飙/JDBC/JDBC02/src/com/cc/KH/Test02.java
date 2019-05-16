package com.KH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		List list = new ArrayList();
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			System.out.println(url);
			// 2.2添加链接对象
			conn = DriverManager.getConnection(url, "root", "123456");

			String sql = "select * from Student";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			int id;
			while (rs.next()) {

				id = rs.getInt("id");
				String name = rs.getString("name");
				// new 实体表类 把获得的数据放在里面 
				Student stu = new Student(id, name);
				list.add(stu);

			}
			System.out.println(list);

			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
