package com.cc;
/*
 * 1.使用输入的变量代替sql语句要改变的量
 * 2.使用Statement造船的方法执行的（executeUpdate方法）去执行。效率不是很高
 * 3.执行返回的定义为int类型
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void login() throws ClassNotFoundException, SQLException{
		Scanner input =new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=input.next();
		System.out.println("请输入密码：");
		String password=input.next();
		//1.加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2加载链接数据库
				//2.1添加地址
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				System.out.println(url);
				//2.2添加链接对象
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3创建船（编译）
				Statement st=conn.createStatement();
				String sql="select * from master where name='"+name+"' and password='"+password+"'";
				ResultSet rs=st.executeQuery(sql);
				
					int i=rs.getInt(1);
					
					if(i>0){
						System.out.println("登录成功");
					}else{
						System.out.println("登录失败");
					}
					
					st.close();
					conn.close();
		
	}
	public static void updateMaster() throws ClassNotFoundException, SQLException{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入修改的健康值的狗狗的名字：");
		String name=input.next();
		System.out.println("请输入修改的健康值：");
		int health=input.nextInt();
		//1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2加载链接数据库
		//2.1添加地址
		String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		//2.2添加链接对象
		Connection conn=DriverManager.getConnection(url, "root", "123456");
		//2.3创建船（编译）
		Statement st=conn.createStatement();
		String sql="update dog set health='"+health+"' where name='"+name+"';";
		int rs=st.executeUpdate(sql);
		if(rs>0){
			System.out.println("修改狗狗的健康值成功！");
		}else{
			System.out.println("修改狗狗的健康值失败！");
		}
		st.close();
		conn.close();
	}
	public static void insertMaster() throws ClassNotFoundException, SQLException{
		Scanner input=new Scanner(System.in);
		System.out.println("请输入主人的姓名：");
		String name=input.next();
		System.out.println("请输入主人的密码：");
		String password=input.next();
		System.out.println("请输入主人的元宝：");
		int monery=input.nextInt();
				//1.加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2加载链接数据库
				//2.1添加地址
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				System.out.println(url);
				//2.2添加链接对象
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3创建船（编译）
				Statement st=conn.createStatement();
				//2.4创建Sql语句
				String sql="insert into `master` values(null,'"+name+"','"+password+"',"+monery+");";
				//创建返回船
				int result=st.executeUpdate(sql);
				if(result>0){
					System.out.println("插入主人信息成功！");
				}else{
					System.out.println("插入主人信息失败！");
				}
				//3.关流
				st.close();
				conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner input=new Scanner(System.in);
		boolean goOn;
		do{
			goOn=true;
			System.out.println("============================欢迎访问宠物商店============================");
			System.out.println("1.添加宠物信息\t2.修改宠物信息\t3.查询宠物信息\t4.添加主人信息\t0.退出");
			System.out.print("请输入您的选择:");
				int num=input.nextInt();
				switch(num){
					case 2:
						System.out.println("宠物商店>修改宠物信息");
						updateMaster();
						break;
					case 4:
						System.out.println("宠物商店>添加主人");
						insertMaster();
						break;
					case 0:
						System.out.println("谢谢您的光临！再见");
						goOn=false;
						break;
					default:
						System.out.println("您的选择有误");
						break;
				}
		}while(goOn);
	
	}
}
