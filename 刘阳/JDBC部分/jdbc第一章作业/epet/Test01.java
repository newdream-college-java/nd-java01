package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception {
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
				case 2:
					System.out.println("宠物商店>添加主人");
					System.out.print("请输入需要修改健康值的狗狗的名字：");
					String ggname=input.next();
					System.out.println("");
					System.out.print("请输入修改后的健康值(1~100)：");
					String gghealth=input.next();
					System.out.println("");
					Connection conn =null;
					Statement st=null;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        st = conn.createStatement();
			        String petSql="update dog set health="+gghealth+" where name='"+ggname+"';";
			        int result = st.executeUpdate(petSql);
			        if(result>0) {
			            System.out.println("修改宠物信息成功");
			        }else {
			            System.out.println("修改宠物信息失败");
			        }
			        st.close();
			        conn.close();			        
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
