/*1.实现封装思想，对重复的代码进行封装
 * 2.因为增加，删除，修改统一的调用方法为executeUpdate
 * 3.把它多改成一个executeUpdate(String sql,object[] objects)方法
 * 4.在这个方法里面还可以封装其他的重复的代码，发现链接 ，和关闭代码也是重复，所以也可以放在这个里面
 * 6.这个方法里面设置设置？占位符参数的数组对象Object（是列名对象）
 * 返回的对象是影响的行数。（在别的方法中调用 改方法的对象（传入参数后）也是int 的值 ）
 * 
 * */
package com.cc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test04 {
	public static int executeUpdate(String sql, Object[] objects)
			throws ClassNotFoundException, SQLException {
		//1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2添加链接对象
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		//3.造船
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//设置？占位符参数的数组对象Object（是列名对象）
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				pstmt.setObject(i + 1, objects[i]);
			}
		}
		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return result;
	}

	public static void saveDog() throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入狗狗的姓名：");
		String name = input.next();
		System.out.println("请输入狗狗的健康值：");
		int health = input.nextInt();
		System.out.println("请输入狗狗的亲密度：");
		int love = input.nextInt();
		System.out.println("请输入狗狗的真名：");
		String strain = input.next();
	
		String sql = "insert into dog(name,health,love,strain) values(?,?,?,?);";
	
		Object[] objects = { name, health, love, strain };
		
		int result1 = executeUpdate(sql, objects);
		if (result1 > 0) {
			System.out.println("插入狗狗信息成功！");
		} else {
			System.out.println("插入狗狗信息失败！");
		}
		

	
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
		
		String sql = "update dog set health=? where name=?;";
		Object[] objects = { health, name };
		int rs = executeUpdate(sql, objects);
		if (rs > 0) {
			System.out.println("修改狗狗的健康值成功！");
		} else {
			System.out.println("修改狗狗的健康值失败！");
		}

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
		
		String sql = "insert into `master` values(null,?,?,?);";
		Object[] objects = { name, password, monery };
		// 创建返回船
		int result = executeUpdate(sql, objects);
		if (result > 0) {
			System.out.println("插入主人信息成功！");
		} else {
			System.out.println("插入主人信息失败！");
		}
		// 3.关流

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
