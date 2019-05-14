package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class lx2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
			boolean goOn=false;
			do {
			System.out.println("=======================欢迎访问宠物商店=======================");
			System.out.println("1.添加宠物信息 2.修改宠物信息 3.访问宠物信息 4.添加主任信息 0.退出");
			int a=input.nextInt();
			switch (a){
					case 1:
						System.out.println("宠物商店>添加宠物信息");
						insterDog();
						break;
					case 2:
						System.out.println("宠物商店>修改宠物信息");
						break;
					case 3:
						System.out.println("宠物商店>访问宠物信息");
						break;
					case 4:
						System.out.println("宠物商店>添加主人信息");
						insterMaster();
						break;
					case 0:
						System.out.println("谢谢您的光临，再见");
						goOn=false;
						break;
					default:
						System.out.println("您的选择有误!");
						break;
						
			}
			}while(goOn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	public static void insterDog() {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		Scanner input=new Scanner(System.in);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.print("添加宠物姓名：");
			String name=input.next();
			System.out.print("添加宠物健康值：");
			int health=input.nextInt();
			String sql="update dog set health=? where name=?";
			pst=conn.prepareStatement(sql);
			pst.setString(2,name);
			pst.setInt(1,health);
			result=pst.executeUpdate();
			if(result!=0) {			
				System.out.println("插入数据成功");
			}else {
				System.out.println("插入数据失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void insterMaster() {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.print("请输入主人的姓名：");
			String name=input.next();
			System.out.println("请输入主人的密码：");
			String pass=input.next();
			System.out.println("请输入主人的元宝");
			int money=input.nextInt();
			String sql="insert into master(name,mpassword,mmoney) values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2,pass);
			pst.setInt(3,money);
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("插入数据成功");
			}else {
				System.out.println("插入数据失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
