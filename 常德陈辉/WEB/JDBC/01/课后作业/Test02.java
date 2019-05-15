package 课后作业;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test02 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		String sql="update student set name=? where id=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setString(1,"中皇");
		pst.setInt(2, 1);
		int result=pst.executeUpdate();
		if(result>0){
			System.out.println("姓名修改成功");
		}
		pst.close();
		conn.close();
	}
}
