package �κ�;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Test02 {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		 String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charactercoding=utf8&useSSL";
		 Connection conn=DriverManager.getConnection(url,"root","chenhui");
		 //System.out.println(conn);
		 String sql="insert into student values(null,?)";
		 PreparedStatement pst=conn.prepareStatement(sql);
		 pst.setString(1, "����");
		 int result=pst.executeUpdate();
		 if(result>0){
			 System.out.println("��ӳɹ���");
		 }
		 Statement rs=conn.createStatement();
		 String name="С��";
		 String sql1="insert into student values(null,'"+name+"')";
		 for(int i=0;i<150;i++){
			 int result1=rs.executeUpdate(sql1);
			 if(result1>0){
				 System.out.println("��ӳɹ���"+i);
			 }
		 }
		 pst.close();
		 conn.close();
	}

}
