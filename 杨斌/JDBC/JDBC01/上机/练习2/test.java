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
			System.out.println("��������������:");
			String name=input.next();
			System.out.println("���������˵�����:");
			String ssss=input.next();
			System.out.println("���������˵�Ԫ��:");
			int yb=input.nextInt();
			String sql="insert into master(name,password,money) values("+"\""+name+"\""+","+"\""+ssss+"\""+","+yb+")";
			int result=st.executeUpdate(sql);
			if(result>0) {
				System.out.println("������Ϣ�ɹ�");
			}else{
				System.out.println("������Ϣʧ��");
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
			System.out.println("��������Ҫ�޸Ľ���ֵ�Ĺ�������:");
			String name=input.next();
			System.out.println("�������޸ĺ�Ľ���ֵ:");
			int hea=input.nextInt();
			String sql="update dog set health="+hea+" where name="+"\'"+name+"\'";
			System.out.println(sql);
			int result=st.executeUpdate(sql);
			if(result>0) {
				System.out.println("������Ϣ�ɹ�");
			}else{
				System.out.println("������Ϣʧ��");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
