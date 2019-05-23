package as;

import java.sql.*;
import java.util.*;
public class chaxun {
	public static void main(String[] args) {
			List list=new ArrayList();
			Connection conn=null;
   			PreparedStatement ps=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
   			String url="jdbc:mysql://127.0.0.1:3306/nd_sys?useUnicode=true&characterEncoding=utf8&useSSL=true";
			try {
				conn =DriverManager.getConnection(url,"root","123");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			String sql="select * from stu_info";
  			ResultSet r = null;
			try {
				ps=conn.prepareStatement(sql);
				r = ps.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			Stu_info s=null;
  			try {
				while(r.next()){
					int id=r.getInt("id");
					String name=r.getString("name");
					int age=r.getInt("age");
					String birthday=r.getString("birthday");
					s=new Stu_info(id,name,age,birthday);
					list.add(s);
				}
				System.out.println(list);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
  			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
