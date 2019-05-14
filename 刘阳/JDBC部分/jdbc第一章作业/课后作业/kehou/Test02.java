package kehou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
					System.out.print("请输入需要修改的学生id：");
					String stuid=input.next();
					System.out.println("");
					System.out.print("请输入修改后的名字：");
					String stuname=input.next();
					System.out.println("");
					Connection conn =null;
					Statement st=null;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        st = conn.createStatement();
			        String Sql="update student set name="+stuname+" where id='"+stuid+"';";
			        int result = st.executeUpdate(Sql);
			        if(result>0) {
			            System.out.println("修改信息成功");
			        }else {
			            System.out.println("修改信息失败");
			        }
			        st.close();
			        conn.close();			        	
		
	}
}
