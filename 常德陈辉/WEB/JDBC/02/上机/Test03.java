package �ϻ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static boolean login() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		Statement pst=conn.createStatement();
		String sql="select * from master where name='��' and password='34' or 1=1";
		ResultSet rs=pst.executeQuery(sql);
		boolean login=false;
		if(rs.next()){
			login=true;
//			System.out.println(rs.next());
		}
		rs.close();
		pst.close();
		conn.close();
		
		return login;
	}
	public static List getDog() throws Exception{
		List<Dog> list=new ArrayList<Dog>();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		String sql="select * from dog";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		Dog dog=null;
		while(rs.next()){
			dog=new Dog();
			dog.setId(rs.getInt("id"));
			dog.setName(rs.getString("name"));
			dog.setStrain(rs.getString("strain"));
			list.add(dog);
		}
		return list;
		
	}
	public static void main(String[] args) throws Exception  {
		boolean login=login();
		if(login){
			System.out.println("����ɹ�");
		}else{
			System.out.println("����ʧ��");
		}
		System.out.println("========================��ӭ���ʳ����========================");
		System.out.println("1,��ӳ�����Ϣ 2,�޸ĳ�����Ϣ 3,��ѯ������Ϣ 4,���������Ϣ 0,�˳�");
		System.out.println("=============================================================");
		System.out.println(getDog());
	}
}
