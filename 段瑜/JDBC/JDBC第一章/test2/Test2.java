package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("=============��ӭ���������̵�==============");
		System.out.println("1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ 4.���������Ϣ 0.�˳�");
		System.out.println("==========================================================");
		System.out.println("����������ѡ��");
		int a=input.nextInt();
		if(a==1) {
			Insert();
		}
	}
	public static void Insert() {
		Connection conn=null;
		PreparedStatement pst=null;
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.println("�����빷�����֣�");
			String name=input.next();
			System.out.println("�����빷��Ʒ��");
			String strain=input.next();
			String sql="insert into dog values(null,?,80,80,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2,strain);
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("��ӳ���ɹ�");
			}else {
				System.out.println("��ӳ���ʧ��");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
