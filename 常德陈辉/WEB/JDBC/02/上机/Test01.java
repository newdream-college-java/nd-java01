package 上机;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01 {
	public static boolean login() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		Statement pst=conn.createStatement();
		String sql="select * from master where name='你' and password='34' or 1=1";
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
	public static void main(String[] args) throws Exception  {
		boolean login=login();
		if(login){
			System.out.println("登入成功");
		}else{
			System.out.println("登入失败");
		}
		
	}
}
