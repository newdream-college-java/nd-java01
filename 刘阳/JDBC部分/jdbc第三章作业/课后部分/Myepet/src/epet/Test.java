package epet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void insertMaster() throws ClassNotFoundException, SQLException {
		System.out.println("================================欢迎访问宠物商店================================");
		System.out.println("1.添加宠物信息2.修改宠物信息3.查询宠物信息4.添加主人信息0.退出");
		System.out.println("===========================================================================");
		System.out.println("请输入您的选择：");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		if (num==4) {
			System.out.println("宠物商店>添加主人");
		}
		System.out.print("请输入主人的姓名：");
		String zrname=input.next();
		System.out.println("");
		System.out.print("请输入主人的密码：");
		String zrpassword=input.next();
		System.out.println("");
		System.out.print("请输入主人的元宝：");
		int yuanBao=input.nextInt();
		System.out.println("");
		
		Connection conn =null;
		Statement st=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
        conn = DriverManager.getConnection(url,"sa","sa");
        st = conn.createStatement();
        String maSql="insert into master (name,password,money) values ('"+zrname+"','"+zrpassword+"','"+yuanBao+"')";
//        st.execute(maSql);
        int result = st.executeUpdate(maSql);
        if(result>0) {
            System.out.println("插入主人信息成功");
        }else {
            System.out.println("插入主人信息失败");
        }
        //6.收尾工作(关链接，关statement对象)   原则：先开后关
        st.close();
        conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insertMaster();
	}

}
