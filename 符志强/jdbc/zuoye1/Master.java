package zuoye1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Master {

	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String ename="root";
		String pwd="123";
		Connection conn=DriverManager.getConnection(url,ename,pwd);
		Statement st=conn.createStatement();
		System.out.println("请输入主人的名字");
		String mz = input.next();
		System.out.println("请输入主人的密码");
		String mm = input.next();
		System.out.println("请输入主人的元宝数量");
		int yb = input.nextInt();
		String sql="insert into master VALUES(null,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, mz);
		ps.setString(2, mm);
		ps.setInt(3, yb);
		int p = ps.executeUpdate();
		if(p>0) {
			System.out.println("添加成功");
		}else {
			System.out.println("添加失败");
		}
		st.close();
		conn.close();
	}

}
