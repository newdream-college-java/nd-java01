package com.cc;
/*ע�������������or 1=1���������ǳ�����Ϊtrue�ģ�(������where�����һ��Ϊtrue������)
 * Ȼ���������ʱ���һ��1=1��
 * Ȼ��ʹ��statement�촬
 * ���صĲ�ѯ��������
 * ResultSet rs=st.executeQuery(sql);
			        rs.next();
					int i=rs.getInt(1);
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class login01 {
	public void login(String userName,String pwd) throws ClassNotFoundException, SQLException{
		/*Scanner input =new Scanner(System.in);
		System.out.println("������������");
		String name=input.next();
		System.out.println("���������룺");
		String password=input.next();*/
		//1.��������
				Class.forName("com.mysql.jdbc.Driver");
				//2�����������ݿ�
				//2.1��ӵ�ַ
				String url="jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				//System.out.println(url);
				//2.2������Ӷ���
				Connection conn=DriverManager.getConnection(url, "root", "123456");
				//2.3�����������룩
				//Statement st=conn.createStatement();
				//String sql = "select count(*) from master where name=? and password=?";
				//System.out.println(sql);
				String sql="select * from master where name='"+userName+"' and password='"+pwd+"'or 1=1;";
				// PreparedStatement pst = conn.prepareStatement(sql);
			        //���ռλ��
			      
				Statement st=conn.createStatement();
			      ResultSet rs=st.executeQuery(sql);
			        rs.next();
					int i=rs.getInt(1);
					
					if(i>0){
						System.out.println("��¼�ɹ�");
					}else{
						System.out.println("��¼ʧ��");
					}
					
					st.close();
					conn.close();
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		login lg=new login();
		Scanner input =new Scanner(System.in);
		System.out.println("������������");
		String userName=input.next();
		System.out.println("���������룺");
		String pwd=input.next();
		//lg.login("ͼ", "1");*/
		//new login().login("ͼ", "1");
		lg.login(userName, pwd);
	}
}
