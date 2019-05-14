package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ChaZhao {

	public static void login(String name,String password) {
		
		Connection conn =null;
		PreparedStatement st=null;
		ResultSet rs= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
	        conn = DriverManager.getConnection(url,"sa","sa");
			String sql="select * from master where name=? and password=?";
			st=conn.prepareStatement(sql);
			st.setString(1,name);
            st.setString(2,password);
            rs=st.executeQuery(); 
            if(rs.next()) {
            	System.out.println("登陆成功，欢迎您！");
            	System.out.println("================================欢迎访问宠物商店================================");
        		System.out.println("1.添加宠物信息2.修改宠物信息3.查询宠物信息4.添加主人信息0.退出");
        		System.out.println("===========================================================================");
        		System.out.println("请输入您的选择：");
            }else {
            	System.out.println("登陆失败，请重新输入！");
            	System.out.println("用户名或密码错误，登陆失败！");
            }
            st.close();
	        conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t宠物主人登录");
		System.out.print("请输入姓名：");
		System.out.println();
		String username=input.next();
		System.out.print("请输入密码：");
		System.out.println();
		String userpsw=input.next();
		
		login(username, userpsw);
	}
	
}
