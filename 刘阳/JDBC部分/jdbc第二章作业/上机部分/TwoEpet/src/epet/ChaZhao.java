package epet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ChaZhao {

	public static void login(String name,String password) {
		
		Connection conn =null;
		PreparedStatement st=null;
		ResultSet rs= null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
	        conn = DriverManager.getConnection(url,"sa","sa");
			String sql="select * from master where name=? and password=?";
			st=conn.prepareStatement(sql);
			st.setString(1,name);
            st.setString(2,password);
            rs=st.executeQuery(); 
            if(rs.next()) {
            	System.out.println("��½�ɹ�����ӭ����");
            	System.out.println("================================��ӭ���ʳ����̵�================================");
        		System.out.println("1.��ӳ�����Ϣ2.�޸ĳ�����Ϣ3.��ѯ������Ϣ4.���������Ϣ0.�˳�");
        		System.out.println("===========================================================================");
        		System.out.println("����������ѡ��");
            }else {
            	System.out.println("��½ʧ�ܣ����������룡");
            	System.out.println("�û�����������󣬵�½ʧ�ܣ�");
            }
            st.close();
	        conn.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("\t\t�������˵�¼");
		System.out.print("������������");
		System.out.println();
		String username=input.next();
		System.out.print("���������룺");
		System.out.println();
		String userpsw=input.next();
		
		login(username, userpsw);
	}
	
}
