package epet;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void insertMaster() throws ClassNotFoundException, SQLException {
		System.out.println("================================��ӭ���ʳ����̵�================================");
		System.out.println("1.��ӳ�����Ϣ2.�޸ĳ�����Ϣ3.��ѯ������Ϣ4.���������Ϣ0.�˳�");
		System.out.println("===========================================================================");
		System.out.println("����������ѡ��");
		Scanner input =new Scanner(System.in);
		int num=input.nextInt();
		if (num==4) {
			System.out.println("�����̵�>�������");
		}
		System.out.print("���������˵�������");
		String zrname=input.next();
		System.out.println("");
		System.out.print("���������˵����룺");
		String zrpassword=input.next();
		System.out.println("");
		System.out.print("���������˵�Ԫ����");
		int yuanBao=input.nextInt();
		System.out.println("");
		
		Connection conn =null;
		Statement st=null;
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
        conn = DriverManager.getConnection(url,"sa","sa");
        st = conn.createStatement();
        String maSql="insert into master (name,password,money) values ('"+zrname+"','"+zrpassword+"','"+yuanBao+"')";
//        st.execute(maSql);
        int result = st.executeUpdate(maSql);
        if(result>0) {
            System.out.println("����������Ϣ�ɹ�");
        }else {
            System.out.println("����������Ϣʧ��");
        }
        //6.��β����(�����ӣ���statement����)   ԭ���ȿ����
        st.close();
        conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		insertMaster();
	}

}
