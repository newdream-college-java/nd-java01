package Test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Statement;

public class Test02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner input=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&charcterEncoding=utf8&useSSL=true";
		Connection conn=DriverManager.getConnection(url,"root","chenhui");
		//System.out.println(conn);
		Statement st = (Statement) conn.createStatement();
		boolean goOn;
		do{
			goOn=true;
			System.out.println("========================��ӭ���ʳ����========================");
			System.out.println("1,��ӳ�����Ϣ 2,�޸ĳ�����Ϣ 3,��ѯ������Ϣ 4,���������Ϣ 0,�˳�");
			System.out.println("=============================================================");
			int num=input.nextInt();
			switch(num){
				case 1:
					System.out.println("��ӳ�����Ϣ");
					System.out.println("������Ҫ��ӹ��������֣�");
					String name=input.next();
					System.out.println("�����빷������ֵ��");
					int health=input.nextInt();
					System.out.println("�����빷�����ܶȣ�");
					int love=input.nextInt();
					String sql="insert into dog values (null,'"+name+"',"+health+","+love+",null)";
					int result=st.executeUpdate(sql);
					if(result>0){
						System.out.println("��ӳ���ɹ���");
					}else{
						System.out.println("��ӳ���ʧ�ܣ�");
					}
					break;
				case 2:
					System.out.println("�޸ĳ�����Ϣ");
					System.out.println("������Ҫ�޸Ĺ�����id��");
					int id=input.nextInt();
					System.out.println("������Ҫ�޸Ĺ��������ԣ�");
					String typt=input.next();
					System.out.println(typt+"�޸�Ϊ:");
					String gai=input.next();
					String sql1="update dog set "+typt+"="+gai+" where id="+id;
					int result1=st.executeUpdate(sql1);
					if(result1>0){
						System.out.println("�޸ĳɹ���");
					}else{
						System.out.println("ʧ�ܣ�");
					}
					break;
				case 3:
					System.out.println("��ѯ������Ϣ");
					break;
				case 4:
					System.out.println("���������Ϣ");
					System.out.println("��������ӵ�������");
					String name3=input.next();
					System.out.println("��������ӵ����룺");
					String password=input.next();
					System.out.println("��������ӵ�Ԫ����");
					int money=input.nextInt();
					String sql3="insert into master values (null,'"+name3+"','"+password+"',"+money+")";
					int result3=st.executeUpdate(sql3);
					if(result3>0){
						System.out.println("����ɹ���");
					}else{
						System.out.println("ʧ�ܣ�");
					}
					break;
				case 0:
					System.out.println("лл����");
					goOn=false;
					break;
				default:
					System.out.println("��������");
					break;
			}
		}while(goOn);
		st.close();
		conn.close();
	}
}
