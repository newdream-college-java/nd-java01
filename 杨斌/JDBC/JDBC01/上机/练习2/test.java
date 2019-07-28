package jdbc01;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class test {
	public static void insertMaster(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String user="root";
		String password="1997";
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st = null;
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("请输入主人姓名:");
			String name=input.next();
			System.out.println("请输入主人的密码:");
			String ssss=input.next();
			System.out.println("请输入主人的元宝:");
			int yb=input.nextInt();
			String sql="insert into master(name,password,money) values("+"\""+name+"\""+","+"\""+ssss+"\""+","+yb+")";
			int result=st.executeUpdate(sql);
			if(result>0) {
				System.out.println("插入信息成功");
			}else{
				System.out.println("插入信息失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void updateMaster() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String user="root";
		String password="1997";
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Statement st = null;
		try {
			st = cn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Scanner input=new Scanner(System.in);
			System.out.println("请输入需要修改健康值的狗狗名字:");
			String name=input.next();
			System.out.println("请输入修改后的健康值:");
			int hea=input.nextInt();
			String sql="update dog set health="+hea+" where name="+"\'"+name+"\'";
			System.out.println(sql);
			int result=st.executeUpdate(sql);
			if(result>0) {
				System.out.println("插入信息成功");
			}else{
				System.out.println("插入信息失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
