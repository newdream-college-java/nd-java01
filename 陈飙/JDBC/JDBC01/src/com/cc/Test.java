package com.cc;
/*
 * 1.ʹ������ı�������sql���Ҫ�ı����
 * 2.ʹ��Statement�촬�ķ���ִ�еģ�executeUpdate������ȥִ�С�Ч�ʲ��Ǻܸ�
 * 3.ִ�з��صĶ���Ϊint����
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void login() throws ClassNotFoundException, SQLException{
		Scanner input =new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		System.out.println("���������룺");
		String password=input.next();
		//1.��������
				Class.forName("com.mysql.jdbc.Driver");
				//2�����������ݿ�
				//2.1��ӵ�ַ
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				System.out.println(url);
				//2.2������Ӷ���
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3�����������룩
				Statement st=conn.createStatement();
				String sql="select * from master where name='"+name+"' and password='"+password+"'";
				ResultSet rs=st.executeQuery(sql);
				
					int i=rs.getInt(1);
					
					if(i>0){
						System.out.println("��¼�ɹ�");
					}else{
						System.out.println("��¼ʧ��");
					}
					
					st.close();
					conn.close();
		
	}
	public static void updateMaster() throws ClassNotFoundException, SQLException{
		Scanner input=new Scanner(System.in);
		System.out.println("�������޸ĵĽ���ֵ�Ĺ��������֣�");
		String name=input.next();
		System.out.println("�������޸ĵĽ���ֵ��");
		int health=input.nextInt();
		//1.��������
		Class.forName("com.mysql.jdbc.Driver");
		//2�����������ݿ�
		//2.1��ӵ�ַ
		String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		System.out.println(url);
		//2.2������Ӷ���
		Connection conn=DriverManager.getConnection(url, "root", "123456");
		//2.3�����������룩
		Statement st=conn.createStatement();
		String sql="update dog set health='"+health+"' where name='"+name+"';";
		int rs=st.executeUpdate(sql);
		if(rs>0){
			System.out.println("�޸Ĺ����Ľ���ֵ�ɹ���");
		}else{
			System.out.println("�޸Ĺ����Ľ���ֵʧ�ܣ�");
		}
		st.close();
		conn.close();
	}
	public static void insertMaster() throws ClassNotFoundException, SQLException{
		Scanner input=new Scanner(System.in);
		System.out.println("���������˵�������");
		String name=input.next();
		System.out.println("���������˵����룺");
		String password=input.next();
		System.out.println("���������˵�Ԫ����");
		int monery=input.nextInt();
				//1.��������
				Class.forName("com.mysql.jdbc.Driver");
				//2�����������ݿ�
				//2.1��ӵ�ַ
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				System.out.println(url);
				//2.2������Ӷ���
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3�����������룩
				Statement st=conn.createStatement();
				//2.4����Sql���
				String sql="insert into `master` values(null,'"+name+"','"+password+"',"+monery+");";
				//�������ش�
				int result=st.executeUpdate(sql);
				if(result>0){
					System.out.println("����������Ϣ�ɹ���");
				}else{
					System.out.println("����������Ϣʧ�ܣ�");
				}
				//3.����
				st.close();
				conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner input=new Scanner(System.in);
		boolean goOn;
		do{
			goOn=true;
			System.out.println("============================��ӭ���ʳ����̵�============================");
			System.out.println("1.��ӳ�����Ϣ\t2.�޸ĳ�����Ϣ\t3.��ѯ������Ϣ\t4.���������Ϣ\t0.�˳�");
			System.out.print("����������ѡ��:");
				int num=input.nextInt();
				switch(num){
					case 2:
						System.out.println("�����̵�>�޸ĳ�����Ϣ");
						updateMaster();
						break;
					case 4:
						System.out.println("�����̵�>�������");
						insertMaster();
						break;
					case 0:
						System.out.println("лл���Ĺ��٣��ټ�");
						goOn=false;
						break;
					default:
						System.out.println("����ѡ������");
						break;
				}
		}while(goOn);
	
	}
}
