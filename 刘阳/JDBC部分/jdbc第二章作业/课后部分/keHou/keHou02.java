package keHou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class keHou02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {
					List list = new ArrayList();
					Connection conn;
					PreparedStatement st;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        String Sql="select * from student";
			        st = conn.prepareStatement(Sql);
			        ResultSet result = st.executeQuery();
			        Student stu=null;
			        while(result.next()) {
			        	
			        	int id = result.getInt("id");
			        	String name= result.getString("name");
			        	
			        	stu=new Student(id,name);
			        	list.add(stu);
			        }
		        	System.out.println(list.size());
			        st.close();
			        conn.close();	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	}

}
