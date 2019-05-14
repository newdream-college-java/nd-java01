package cn.song;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
* @author mo
* @version 2019年5月14日 上午8:56:18
* @description
*/
public class Test02 {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?"
			+ "useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	private static String USERNAME="songhengda";
	private static String PASSOWRD="123456";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Statement st=null;
		try {
			Class.forName(DRIVER);
			do {
				conn=DriverManager.getConnection(URL, USERNAME, PASSOWRD);
				conn.setAutoCommit(false);
				st=conn.createStatement();
				System.out.println("==========欢迎访问宠物商店==========");
				System.out.println("1.添加宠物信息 2.修改宠物信息 3.查询宠物信息 4.添加主人信息 0.退出");
				System.out.println("===================================");
				System.out.print("请输入您的选择：");
				int selectIndex=sc.nextInt();
				if(selectIndex==0) {
					break;
				}else if(selectIndex==1) {
					
				}else if(selectIndex==2){
					System.out.println("宠物商店>修改宠物");
					System.out.print("请输入需要修改健康值的狗狗的名字：");
					String name=sc.next();
					System.out.print("请输入修改后的健康值(1-100):");
					int health=sc.nextInt();
					String sql="update dog set health="+health+" where name='"+name+"';";
					int result=st.executeUpdate(sql);
					if(result>0) {
						conn.commit();
						System.out.println("修改狗狗健康值成功！");
					}else {
						conn.rollback();
						System.out.println("修改狗狗健康值失败（或许不存在此狗狗）！");
					}
				} else if(selectIndex==3) {
				
				}else if(selectIndex==4) {
					System.out.println("宠物商店>添加主人");
					System.out.print("请输入主人姓名：");
					String name=sc.next();
					System.out.print("请输入主人密码：");
					String password=sc.next();
					System.out.print("请输入主人元宝：");
					int money=sc.nextInt();
					
					String sql="insert into master values(null,'"+name+"','"+password+"',"+money+")";
					int result=st.executeUpdate(sql);
					if(result>0) {
						conn.commit();
						System.out.println("添加成功");
					}else {
						conn.rollback();
						System.out.println("添加失败");
					}
				}else {
					
				}
			}while(true);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
