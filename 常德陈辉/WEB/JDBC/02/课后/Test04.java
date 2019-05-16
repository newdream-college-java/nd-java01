package ¿Îºó;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		Statement st=conn.createStatement();
		String sql="select count(*) from student";
		ResultSet rs=st.executeQuery(sql);
		rs.next();
		int sum=rs.getInt("count(*)");
		if(sum%30==0){
			System.out.println(sum/30);
		}else{
			System.out.println(sum/30+1);
		}
		rs.close();
		st.close();
		conn.close();
	}

}
