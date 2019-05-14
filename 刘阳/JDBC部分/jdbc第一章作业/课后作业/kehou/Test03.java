package kehou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
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
				case 1:
					System.out.println("宠物商店>添加狗狗");
					System.out.print("请输入狗狗的名字：");
					String ggname=input.next();
					System.out.println("");
					System.out.print("请输入狗狗的品种：");
					String ggstrain=input.next();
					System.out.println("");
					Connection conn =null;
					Statement st=null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        st = conn.createStatement();
			        String petSql="insert into dog (name,health,love,strain) values ('"+ggname+"',"+80+","+80+",'"+ggstrain+"');";
			        int result = st.executeUpdate(petSql);
			        if(result>0) {
			            System.out.println("修改宠物信息成功");
			        }else {
			            System.out.println("修改宠物信息失败");
			        }
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
