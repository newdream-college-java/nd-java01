package zuoye2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class Dog {
	public static void selectDog() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "123");

		String sql="select * from dog";
		
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet zj=pst.executeQuery(sql);
		
       
		if(zj!=null) {
			System.out.println("      宠物信息");
			System.out.println("编号  名字  健康值");

			while(zj.next()) {
				
				int id=zj.getInt("id");
				String name=zj.getString("name");
				int health=zj.getInt("health");
				System.out.println(id+"  "+name+"  "+health);
			}
		}else {
			System.out.println("查询失败");
		}
		pst.close();
		conn.close();
	}
	public static void main(String[] args) throws Exception {
		selectDog();
	}
}
