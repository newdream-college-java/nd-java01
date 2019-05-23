package as;

import java.sql.*;
import java.util.*;
public class chakan {
	public static void main(String[] args) throws Exception {
			List list=new ArrayList();
			Class.forName("com.mysql.jdbc.Driver");
   			String url="jdbc:mysql://127.0.0.1:3306/nd_sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
   			Connection conn =DriverManager.getConnection(url,"root","123");
  			String sql="select * from stu_info";
  			PreparedStatement ps=conn.prepareStatement(sql);
  			ResultSet r = ps.executeQuery();
			while(r.next()){
				int id=r.getInt("id");
				String name=r.getString("name");
				int age=r.getInt("age");
				String birthday=r.getString("birthday");
				Stu_info s=new Stu_info(id,name,age,birthday);
				list.add(s);
			}
				System.out.println(list);
				ps.close();
				conn.close();
	}

}
