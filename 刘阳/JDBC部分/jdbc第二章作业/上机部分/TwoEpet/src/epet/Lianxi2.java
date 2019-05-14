package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lianxi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================欢迎访问宠物商店================================");
		System.out.println("1.添加宠物信息2.修改宠物信息3.查询宠物信息4.添加主人信息0.退出");
		System.out.println("===========================================================================");
		Scanner input =new Scanner(System.in);
		boolean goOn;
		do {
			goOn=true;
			System.out.println("请输入您的选择：");
			int num=input.nextInt();
			switch(num) {
				case 3:
				try {
					List list = new ArrayList();
					Connection conn;
					PreparedStatement st;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        String Sql="select id,name,health,love from pet";
			        st = conn.prepareStatement(Sql);
			        ResultSet result = st.executeQuery();
			        Pet pet=null;
			        while(result.next()) {
			        	
			        	int id = result.getInt("id");
			        	String name= result.getString("name");
			        	int health = result.getInt("health");
			        	int love = result.getInt("love");
			        	pet=new Pet(id,name,health,love);
			        	list.add(pet);
			        }
			        System.out.println(list);
			        st.close();
			        conn.close();	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		        
				case 0:
					System.out.println("谢谢您的光临！再见");
					goOn=false;
					break;
				default:
					System.out.println("您的选择有误！");
			}		
		}while(goOn);		
	}

}
