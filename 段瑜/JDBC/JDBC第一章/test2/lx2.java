package test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class lx2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try {
			boolean goOn=false;
			do {
			System.out.println("=======================��ӭ���ʳ����̵�=======================");
			System.out.println("1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.���ʳ�����Ϣ 4.���������Ϣ 0.�˳�");
			int a=input.nextInt();
			switch (a){
					case 1:
						System.out.println("�����̵�>��ӳ�����Ϣ");
						insterDog();
						break;
					case 2:
						System.out.println("�����̵�>�޸ĳ�����Ϣ");
						break;
					case 3:
						System.out.println("�����̵�>���ʳ�����Ϣ");
						break;
					case 4:
						System.out.println("�����̵�>���������Ϣ");
						insterMaster();
						break;
					case 0:
						System.out.println("лл���Ĺ��٣��ټ�");
						goOn=false;
						break;
					default:
						System.out.println("����ѡ������!");
						break;
						
			}
			}while(goOn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}
	public static void insterDog() {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		Scanner input=new Scanner(System.in);
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.print("��ӳ���������");
			String name=input.next();
			System.out.print("��ӳ��｡��ֵ��");
			int health=input.nextInt();
			String sql="update dog set health=? where name=?";
			pst=conn.prepareStatement(sql);
			pst.setString(2,name);
			pst.setInt(1,health);
			result=pst.executeUpdate();
			if(result!=0) {			
				System.out.println("�������ݳɹ�");
			}else {
				System.out.println("��������ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
	public static void insterMaster() {
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		Scanner input=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url,"root","z382698.");
			System.out.print("���������˵�������");
			String name=input.next();
			System.out.println("���������˵����룺");
			String pass=input.next();
			System.out.println("���������˵�Ԫ��");
			int money=input.nextInt();
			String sql="insert into master(name,mpassword,mmoney) values(?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,name);
			pst.setString(2,pass);
			pst.setInt(3,money);
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("�������ݳɹ�");
			}else {
				System.out.println("��������ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
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
