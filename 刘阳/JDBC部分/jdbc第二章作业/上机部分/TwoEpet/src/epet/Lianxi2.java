package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lianxi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================��ӭ���ʳ����̵�================================");
		System.out.println("1.��ӳ�����Ϣ2.�޸ĳ�����Ϣ3.��ѯ������Ϣ4.���������Ϣ0.�˳�");
		System.out.println("===========================================================================");
		Scanner input =new Scanner(System.in);
		boolean goOn;
		do {
			goOn=true;
			System.out.println("����������ѡ��");
			int num=input.nextInt();
			switch(num) {
				case 3:
				try {
					List list = new ArrayList();
					Connection conn;
					PreparedStatement st;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        String Sql="select id,name,health,love from pet";
			        st = conn.prepareStatement(Sql);
			        ResultSet result = st.executeQuery();
			        Pet pet=null;
			        while(result.next()) {
			        	
			        	int id = result.getInt("id");
			        	String name= result.getString("name");
			        	int health = result.getInt("health");
			        	int love = result.getInt("love");
			        	pet=new Pet(id,name,health,love);
			        	list.add(pet);
			        }
			        System.out.println(list);
			        st.close();
			        conn.close();	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		        
				case 0:
					System.out.println("лл���Ĺ��٣��ټ�");
					goOn=false;
					break;
				default:
					System.out.println("����ѡ������");
			}		
		}while(goOn);		
	}

}
