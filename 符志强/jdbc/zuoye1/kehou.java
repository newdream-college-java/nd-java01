package zuoye;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class kehou {
	/*选择题
	 * 1.D
	 * 2.C
	 * 3.C
	 * 4.A
	 * 5.D
	 * 首先建一个source folder 命名为lib 然后将jar包放在lib里面然后add build path 
	 * */
	public static void selectstudent() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "123");

		String sql="update student set name='aa' where id=2";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		int zj=pst.executeUpdate();
		
       
		if(zj>0) {
			System.out.println("更改成功");
		}else {
			System.out.println("更改失败");
		}
		pst.close();
		conn.close();
	}
	public static void main(String[] args) throws Exception {
		selectstudent();
	}
}
