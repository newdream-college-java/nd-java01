package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception {
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
				case 2:
					System.out.println("�����̵�>�������");
					System.out.print("��������Ҫ�޸Ľ���ֵ�Ĺ��������֣�");
					String ggname=input.next();
					System.out.println("");
					System.out.print("�������޸ĺ�Ľ���ֵ(1~100)��");
					String gghealth=input.next();
					System.out.println("");
					Connection conn =null;
					Statement st=null;
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			        conn = DriverManager.getConnection(url,"sa","sa");
			        st = conn.createStatement();
			        String petSql="update dog set health="+gghealth+" where name='"+ggname+"';";
			        int result = st.executeUpdate(petSql);
			        if(result>0) {
			            System.out.println("�޸ĳ�����Ϣ�ɹ�");
			        }else {
			            System.out.println("�޸ĳ�����Ϣʧ��");
			        }
			        st.close();
			        conn.close();			        
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
