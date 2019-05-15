package com.cc;
/*注入就是条件后面or 1=1条件（就是成立的为true的）(就是在where后面加一个为true的条件)
 * 然后在输出的时候加一个1=1；
 * 然后使用statement造船
 * 返回的查询集还是用
 * ResultSet rs=st.executeQuery(sql);
			        rs.next();
					int i=rs.getInt(1);
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login01 {
	public void login(String userName,String pwd) throws ClassNotFoundException, SQLException{
		/*Scanner input =new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name=input.next();
		System.out.println("请输入密码：");
		String password=input.next();*/
		//1.加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2加载链接数据库
				//2.1添加地址
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				//System.out.println(url);
				//2.2添加链接对象
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3创建船（编译）
				//Statement st=conn.createStatement();
				//String sql = "select count(*) from master where name=? and password=?";
				//System.out.println(sql);
				String sql="select * from master where name='"+userName+"' and password='"+pwd+"'or 1=1;";
				// PreparedStatement pst = conn.prepareStatement(sql);
			        //填充占位符
			      
				Statement st=conn.createStatement();
			      ResultSet rs=st.executeQuery(sql);
			        rs.next();
					int i=rs.getInt(1);
					
					if(i>0){
						System.out.println("登录成功");
					}else{
						System.out.println("登录失败");
					}
					
					st.close();
					conn.close();
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		login lg=new login();
		Scanner input =new Scanner(System.in);
		System.out.println("请输入姓名：");
		String userName=input.next();
		System.out.println("请输入密码：");
		String pwd=input.next();
		//lg.login("图", "1");*/
		//new login().login("图", "1");
		lg.login(userName, pwd);
	}
}
