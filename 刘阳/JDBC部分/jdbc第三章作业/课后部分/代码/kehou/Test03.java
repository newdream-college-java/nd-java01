package kehou;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
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
				case 1:
					System.out.println("�����̵�>��ӹ���");
					System.out.print("�����빷�������֣�");
					String ggname=input.next();
					System.out.println("");
					System.out.print("�����빷����Ʒ�֣�");
					String ggstrain=input.next();
					System.out.println("");
					Connection conn =null;
					Statement st=null;
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        st = conn.createStatement();
			        String petSql="insert into dog (name,health,love,strain) values ('"+ggname+"',"+80+","+80+",'"+ggstrain+"');";
			        int result = st.executeUpdate(petSql);
			        if(result>0) {
			            System.out.println("�޸ĳ�����Ϣ�ɹ�");
			        }else {
			            System.out.println("�޸ĳ�����Ϣʧ��");
			        }
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
