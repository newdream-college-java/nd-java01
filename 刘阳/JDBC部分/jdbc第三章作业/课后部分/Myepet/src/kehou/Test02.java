package kehou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
					System.out.print("��������Ҫ�޸ĵ�ѧ��id��");
					String stuid=input.next();
					System.out.println("");
					System.out.print("�������޸ĺ�����֣�");
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
			            System.out.println("�޸���Ϣ�ɹ�");
			        }else {
			            System.out.println("�޸���Ϣʧ��");
			        }
			        st.close();
			        conn.close();			        	
		
	}
}
