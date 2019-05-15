package zuoye2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class kehou2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "123");
		String sql="select * from student";
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs=pst.executeQuery();
		if(rs!=null) {
			while(rs.next()) {
				int id=rs.getInt("id");
				String name=rs.getString("name");
				System.out.println(id+" "+name);
			}
		}else {
			System.out.println("查询失败");
		}
		pst.close();
		conn.close();
	}

}
