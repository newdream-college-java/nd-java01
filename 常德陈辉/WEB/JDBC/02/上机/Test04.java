package �ϻ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		String sql="select * from dog where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		System.out.println("������id��ֵ��");
			int value=input.nextInt();
			pst.setInt(1, value);
		ResultSet rs=pst.executeQuery();
		//System.out.println(rs);
		Dog dog=null;
		if(rs.next()){
			dog=new Dog();
			dog.setId(rs.getInt("id"));
			dog.setName(rs.getString("name"));
			dog.setStrain(rs.getString("strain"));
			System.out.println(dog);
		}
		rs.close();
		pst.close();
		conn.close();
		
	}
}
