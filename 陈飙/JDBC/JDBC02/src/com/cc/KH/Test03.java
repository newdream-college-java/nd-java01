package com.KH;
/*:若本表的学生记录数达到了 140 行，现准备在网页上以分页的 形式 查询学生信息，每一页显示 30 名学生的信息。求分页的总页数?请使用 PreparedStatement 和 ResultSet 查询出结果。
 * 利用分页原来查出所有的总数
 * 然后利用函数算出
 * 1.利用math函数的ceil方法。
 * 2.为什么用到ceil方法，因为第3页不一定慢，因此还是要取到30页，所以要向上去整
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
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

			String sql = "select count(*)pagesum from Student limit 0,30";
			pst = conn.prepareStatement(sql);

			rs = pst.executeQuery();
			int id = 0;
			while (rs.next()) {

				id = rs.getInt("pagesum");
				//String name = rs.getString("name");
				// new 实体表类 把获得的数据放在里面 
				//Student stu = new Student(id, name);
				//list.add(stu);

			}
			System.out.println("分页的总数为："+Math.ceil(id)/30.0);

			pst.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
