package �κ���ҵ;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Test03 {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		Statement st=conn.createStatement();
		String sql="insert into dog values(null,'�Ʒ�',80,80,'����Ȯ')";
		int result=st.executeUpdate(sql);
		if(result>0){
			System.out.println("��ӳɹ���");
		}
		st.close();
		conn.close();
	}

}
