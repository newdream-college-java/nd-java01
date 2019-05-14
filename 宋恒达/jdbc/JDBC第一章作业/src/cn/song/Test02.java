package cn.song;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
* @author mo
* @version 2019��5��14�� ����8:56:18
* @description
*/
public class Test02 {
	private static String DRIVER="com.mysql.cj.jdbc.Driver";
	private static String URL="jdbc:mysql://127.0.0.1:3306/epet?"
			+ "useUnicode=true&characterEncoding=utf8&serverTimezone=GMT&useSSL=true";
	private static String USERNAME="songhengda";
	private static String PASSOWRD="123456";
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		Statement st=null;
		try {
			Class.forName(DRIVER);
			do {
				conn=DriverManager.getConnection(URL, USERNAME, PASSOWRD);
				conn.setAutoCommit(false);
				st=conn.createStatement();
				System.out.println("==========��ӭ���ʳ����̵�==========");
				System.out.println("1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ 4.���������Ϣ 0.�˳�");
				System.out.println("===================================");
				System.out.print("����������ѡ��");
				int selectIndex=sc.nextInt();
				if(selectIndex==0) {
					break;
				}else if(selectIndex==1) {
					
				}else if(selectIndex==2){
					System.out.println("�����̵�>�޸ĳ���");
					System.out.print("��������Ҫ�޸Ľ���ֵ�Ĺ��������֣�");
					String name=sc.next();
					System.out.print("�������޸ĺ�Ľ���ֵ(1-100):");
					int health=sc.nextInt();
					String sql="update dog set health="+health+" where name='"+name+"';";
					int result=st.executeUpdate(sql);
					if(result>0) {
						conn.commit();
						System.out.println("�޸Ĺ�������ֵ�ɹ���");
					}else {
						conn.rollback();
						System.out.println("�޸Ĺ�������ֵʧ�ܣ��������ڴ˹�������");
					}
				} else if(selectIndex==3) {
				
				}else if(selectIndex==4) {
					System.out.println("�����̵�>�������");
					System.out.print("����������������");
					String name=sc.next();
					System.out.print("�������������룺");
					String password=sc.next();
					System.out.print("����������Ԫ����");
					int money=sc.nextInt();
					
					String sql="insert into master values(null,'"+name+"','"+password+"',"+money+")";
					int result=st.executeUpdate(sql);
					if(result>0) {
						conn.commit();
						System.out.println("��ӳɹ�");
					}else {
						conn.rollback();
						System.out.println("���ʧ��");
					}
				}else {
					
				}
			}while(true);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(st!=null) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
