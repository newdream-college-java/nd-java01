/*1.ʵ�ַ�װ˼�룬���ظ��Ĵ�����з�װ
 * 2.��Ϊ���ӣ�ɾ�����޸�ͳһ�ĵ��÷���ΪexecuteUpdate
 * 3.������ĳ�һ��executeUpdate(String sql,object[] objects)����
 * 4.������������滹���Է�װ�������ظ��Ĵ��룬�������� ���͹رմ���Ҳ���ظ�������Ҳ���Է����������
 * 6.������������������ã�ռλ���������������Object������������
 * ���صĶ�����Ӱ������������ڱ�ķ����е��� �ķ����Ķ��󣨴��������Ҳ��int ��ֵ ��
 * 
 * */
package com.cc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test04 {
	public static int executeUpdate(String sql, Object[] objects)
			throws ClassNotFoundException, SQLException {
		//1.��������
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2������Ӷ���
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		//3.�촬
		PreparedStatement pstmt = conn.prepareStatement(sql);
		//���ã�ռλ���������������Object������������
		if (objects != null) {
			for (int i = 0; i < objects.length; i++) {
				pstmt.setObject(i + 1, objects[i]);
			}
		}
		int result = pstmt.executeUpdate();
		pstmt.close();
		conn.close();
		return result;
	}

	public static void saveDog() throws ClassNotFoundException, SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("�����빷����������");
		String name = input.next();
		System.out.println("�����빷���Ľ���ֵ��");
		int health = input.nextInt();
		System.out.println("�����빷�������ܶȣ�");
		int love = input.nextInt();
		System.out.println("�����빷����������");
		String strain = input.next();
	
		String sql = "insert into dog(name,health,love,strain) values(?,?,?,?);";
	
		Object[] objects = { name, health, love, strain };
		
		int result1 = executeUpdate(sql, objects);
		if (result1 > 0) {
			System.out.println("���빷����Ϣ�ɹ���");
		} else {
			System.out.println("���빷����Ϣʧ�ܣ�");
		}
		

	
	}

	public static void selectDog() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		// 2�����������ݿ�
		// 2.1��ӵ�ַ
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2������Ӷ���
		Connection conn = DriverManager.getConnection(url, "root", "123456");

		String sql = "select * from dog";
		PreparedStatement pst = conn.prepareStatement(sql);

		ResultSet rs = pst.executeQuery();
		int id;
		while (rs.next()) {

			id = rs.getInt("id");
			String name = rs.getString("name");
			String strain = rs.getString("strain");
			System.out.println(id + " " + name + " " + strain);
		}

		pst.close();
		conn.close();

	}

	public static boolean login(String name, String password)
			throws ClassNotFoundException, SQLException {
		/*
		 * Scanner input =new Scanner(System.in); System.out.println("������������");
		 * String name=input.next(); System.out.println("���������룺"); String
		 * password=input.next();
		 */
		// 1.��������
		Class.forName("com.mysql.jdbc.Driver");
		// 2�����������ݿ�
		// 2.1��ӵ�ַ
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		// 2.2������Ӷ���
		Connection conn = DriverManager.getConnection(url, "root", "123456");
		// 2.3�����������룩
		// Statement st=conn.createStatement();
		String sql = "select count(*) from master where name=? and password=? ";
		// String
		// sql="select * from master where name='"+name+"' and password='"+password+"'or 1=1;";
		PreparedStatement pst = conn.prepareStatement(sql);
		// ResultSet rs=pst.executeQuery();
		pst.setString(1, name);
		pst.setString(2, password);
		// rs.next();
		ResultSet rs = pst.executeQuery();
		rs.next();
		int i = rs.getInt(1);
		if (i > 0) {
			System.out.println("��¼�ɹ�");
		} else {
			System.out.println("��¼ʧ��");
		}

		pst.close();
		conn.close();
		return true;

	}

	public static void updateMaster() throws ClassNotFoundException,
			SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("�������޸ĵĽ���ֵ�Ĺ��������֣�");
		String name = input.next();
		System.out.println("�������޸ĵĽ���ֵ��");
		int health = input.nextInt();
		
		String sql = "update dog set health=? where name=?;";
		Object[] objects = { health, name };
		int rs = executeUpdate(sql, objects);
		if (rs > 0) {
			System.out.println("�޸Ĺ����Ľ���ֵ�ɹ���");
		} else {
			System.out.println("�޸Ĺ����Ľ���ֵʧ�ܣ�");
		}

	}

	public static void insertMaster() throws ClassNotFoundException,
			SQLException {
		Scanner input = new Scanner(System.in);
		System.out.println("���������˵�������");
		String name = input.next();
		System.out.println("���������˵����룺");
		String password = input.next();
		System.out.println("���������˵�Ԫ����");
		int monery = input.nextInt();
		
		String sql = "insert into `master` values(null,?,?,?);";
		Object[] objects = { name, password, monery };
		// �������ش�
		int result = executeUpdate(sql, objects);
		if (result > 0) {
			System.out.println("����������Ϣ�ɹ���");
		} else {
			System.out.println("����������Ϣʧ�ܣ�");
		}
		// 3.����

	}

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Scanner input = new Scanner(System.in);
		System.out.println("������������");
		String name = input.next();
		System.out.println("���������룺");
		String password = input.next();
		boolean isLogin = login(name, password);
		if (!isLogin) {
			System.out.println("�û�����������󣬵�¼ʧ�ܣ�");
		} else {
			System.out.println("��¼�ɹ�����ӭ��");
			boolean goOn;
			do {
				goOn = true;
				System.out
						.println("============================��ӭ���ʳ����̵�============================");
				System.out
						.println("1.��ӳ�����Ϣ\t2.�޸ĳ�����Ϣ\t3.��ѯ������Ϣ\t4.���������Ϣ\t0.�˳�");
				System.out.print("����������ѡ��:");
				int num = input.nextInt();
				switch (num) {
				case 1:
					System.out.println("�����̵�>��ӳ�����Ϣ");
					saveDog();
					break;
				case 2:
					System.out.println("�����̵�>�޸ĳ�����Ϣ");
					updateMaster();
					break;
				case 3:
					System.out.println("�����̵�>��ѯ����");
					selectDog();
					break;
				case 4:
					System.out.println("�����̵�>�������");
					insertMaster();
					break;
				case 0:
					System.out.println("лл���Ĺ��٣��ټ�");
					goOn = false;
					break;
				default:
					System.out.println("����ѡ������");
					break;
				}
			} while (goOn);

		}

	}
}
