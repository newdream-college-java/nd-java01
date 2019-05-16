package ¿Îºó;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test03 {

	public static void main(String[] args) throws Exception {
		List<Student> list=new ArrayList<Student>();
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		Statement st=conn.createStatement();
		String sql="select * from student";
		ResultSet rs=st.executeQuery(sql);
		Student student=null;
		while(rs.next()){
			student=new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			System.out.println(student);
		}
		PreparedStatement pst=conn.prepareStatement(sql);
		ResultSet rs1=pst.executeQuery();
		Student student1=null;
		while(rs1.next()){
			student1=new Student();
			student1.setId(rs1.getInt("id"));
			student1.setName(rs1.getString("name"));
			list.add(student1);
		}
		System.out.println(list);
		pst.close();
		rs.close();
		st.close();
		conn.close();
	}

}
