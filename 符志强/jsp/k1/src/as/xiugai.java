package as;

import java.sql.*;
public class xiugai {
	public static void main(String[] args) {
			Connection conn=null;
   			Statement st=null;
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
			 try {
				st=conn.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
  			String sql="update stu_info set name='��' where id=2";
  			int r = 0;
			try {
				r = st.executeUpdate(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
  			if(r>0){
  				System.out.print("�޸ĳɹ�");
  			}else{
  				System.out.print("�޸�ʧ��");
  			}
  			try {
				st.close();
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
