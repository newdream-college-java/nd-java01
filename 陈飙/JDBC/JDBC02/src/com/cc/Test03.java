/*使用PreparedStatement解决漏洞
 * 使用？占位符代替变值。
 * 1.使用PreparedStatement代替statement
 * 2.result要在setString传入参数之前会保错没定义参数值
 * 3.boolean返回值更输入的定义不冲突在方法的参数可以使用输入的参数代替里面出入的参数
 * *
 * 查询结果的时候不一定要使用实体类添加的方法
 * 1.只有添加一个while循环
 * 2.执行结果集的对象 中的get方法（"对应的列名"）就能得到表中的值
 * 3.然后用输出语句输出
 * 4.前面的类型也可以写在循环外面
 * 
 * 
 */
package com.cc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {
	public static void saveDog() throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入g狗狗的姓名：");
		String name = input.next();
		System.out.println("请输入狗狗的健康值：");
		int health = input.nextInt();
		System.out.println("请输入狗狗的亲密度：");
		int love = input.nextInt();
		System.out.println("请输入狗狗的真名：");
		String strain = input.next();
		// 1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2加载链接数据库
		// 2.1添加地址
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		// 2.3创建船（编译）
		// Statement st = conn.createStatement();
		// 2.4创建Sql语句
		String sql = "insert into dog(name,health,love,strain) values(?,?,?,?);";
		// 创建返回船
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, name);
		pst.setInt(2, health);
		pst.setInt(3, love);
		pst.setString(4, strain);
		int result = pst.executeUpdate();
		if (result > 0) {
			System.out.println("插入主人信息成功！");
		} else {
			System.out.println("插入主人信息失败！");
		}
		// 3.关流
		pst.close();
		conn.close();
	}

	public static void selectDog() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		// 2加载链接数据库
		// 2.1添加地址
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");

		String sql = "select * from dog";
		PreparedStatement pst = conn.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		int id;
		while (rs.next()) {

			id = rs.getInt("id");
			String name = rs.getString("name");
			String strain = rs.getString("strain");
			System.out.println(id + " " + name + " " + strain);
		}

		pst.close();
		conn.close();

	}

	public static boolean login(String name, String password)
			throws ClassNotFoundException, SQLException {
		/*
		 * Scanner input =new Scanner(System.in); System.out.println("请输入姓名：");
		 * String name=input.next(); System.out.println("请输入密码："); String
		 * password=input.next();
		 */
		// 1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2加载链接数据库
		// 2.1添加地址
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		// 2.3创建船（编译）
		// Statement st=conn.createStatement();
		String sql = "select count(*) from master where name=? and password=? ";
		// String
		// sql="select * from master where name='"+name+"' and password='"+password+"'or 1=1;";
		PreparedStatement pst = conn.prepareStatement(sql);
		// ResultSet rs=pst.executeQuery();
		pst.setString(1, name);
		pst.setString(2, password);
		// rs.next();
		ResultSet rs = pst.executeQuery();
		rs.next();
		int i = rs.getInt(1);
		if (i > 0) {
			System.out.println("登录成功");
		} else {
			System.out.println("登录失败");
		}

		pst.close();
		conn.close();
		return true;

	}

	public static void updateMaster() throws ClassNotFoundException,
			SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入修改的健康值的狗狗的名字：");
		String name = input.next();
		System.out.println("请输入修改的健康值：");
		int health = input.nextInt();
		// 1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2加载链接数据库
		// 2.1添加地址
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		// 2.3创建船（编译）
		Statement st = conn.createStatement();
		String sql = "update dog set health='" + health + "' where name='"
				+ name + "';";
		int rs = st.executeUpdate(sql);
		if (rs > 0) {
			System.out.println("修改狗狗的健康值成功！");
		} else {
			System.out.println("修改狗狗的健康值失败！");
		}
		st.close();
		conn.close();
	}

	public static void insertMaster() throws ClassNotFoundException,
			SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入主人的姓名：");
		String name = input.next();
		System.out.println("请输入主人的密码：");
		String password = input.next();
		System.out.println("请输入主人的元宝：");
		int monery = input.nextInt();
		// 1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 2加载链接数据库
		// 2.1添加地址
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		// 2.3创建船（编译）
		Statement st = conn.createStatement();
		// 2.4创建Sql语句
		String sql = "insert into `master` values(null,'" + name + "','"
				+ password + "'," + monery + ");";
		// 创建返回船
		int result = st.executeUpdate(sql);
		if (result > 0) {
			System.out.println("插入主人信息成功！");
		} else {
			System.out.println("插入主人信息失败！");
		}
		// 3.关流
		st.close();
		conn.close();
	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = input.next();
		System.out.println("请输入密码：");
		String password = input.next();
		boolean isLogin = login(name, password);
		if (!isLogin) {
			System.out.println("用户名或密码错误，登录失败！");
		} else {
			System.out.println("登录成功，欢迎你");
			boolean goOn;
			do {
				goOn = true;
				System.out
						.println("============================欢迎访问宠物商店============================");
				System.out
						.println("1.添加宠物信息\t2.修改宠物信息\t3.查询宠物信息\t4.添加主人信息\t0.退出");
				System.out.print("请输入您的选择:");
				int num = input.nextInt();
				switch (num) {
				case 1:
					System.out.println("宠物商店>添加宠物信息");
					saveDog();
					break;
				case 2:
					System.out.println("宠物商店>修改宠物信息");
					updateMaster();
					break;
				case 3:
					System.out.println("宠物商店>查询宠物");
					selectDog();
					break;
				case 4:
					System.out.println("宠物商店>添加主人");
					insertMaster();
					break;
				case 0:
					System.out.println("谢谢您的光临！再见");
					goOn = false;
					break;
				default:
					System.out.println("您的选择有误");
					break;
				}
			} while (goOn);

		}

	}
}
