package zuoye;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class dogtj {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String ename="root";
		String pwd="123";
		Connection conn=DriverManager.getConnection(url,ename,pwd);
		Statement st=conn.createStatement();
		System.out.println("请输入你的宠物名");
		String mz = input.next();
		System.out.println("请输入你的宠物的健康值");
		String jkz = input.next();
		String sql="UPDATE dog SET health = ? WHERE name=? ;";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(2, mz);
		ps.setString(1, jkz);
		int p = ps.executeUpdate();
		if(p>0) {
			System.out.println("修改成功");
		}else {
			System.out.println("修改失败");
		}
		st.close();
		conn.close();
	}

}
