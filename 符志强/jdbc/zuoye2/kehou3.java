package zuoye2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class kehou3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "123");
		String sql="select count(*) from student";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		rs.next();
		int z=rs.getInt(1);
		int fys=z/30+1;
		if(rs!=null) {
			System.out.println("分页数为："+fys);
		}
		pst.close();
		conn.close();
	}

}
