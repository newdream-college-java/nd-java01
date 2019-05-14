import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Test01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("==================��ӭ���ʳ����̵�====================\n" +
				"1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ 4.���������Ϣ 0.�˳�");
		System.out.println("����������ѡ��");
		int choice =input.nextInt();
		
		if(choice==4){
			//���������Ϣ
			Master master=new Master();
			System.out.println("�����̵�>�������");
			System.out.println("��������������");
			String name=input.next();
			master.setName(name);
			System.out.println("���������˵�����");
			String password = input.next();
			master.setPassword(password);
			System.out.println("���������˵�Ԫ��");
			int money=input.nextInt();
			master.setMoney(money);
			int result=-1;
			Connection conn=null;
			PreparedStatement st=null;
			//1.��������
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//2.��������
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			try {
				//��������
				 conn=DriverManager.getConnection(url, "root", "123456");
				//3.����Statement�������ڴ���sql��䵽mysql���������Լ��õ�mysql����ִ�н��
				 //������ʹ��Ԥ�����ֹsqlע��
				 String sql = "INSERT into master(name,password,money) VALUES(?,?,?)";
				 	//��ռλ����ֵ
				 	st = conn.prepareStatement(sql);
		            st.setString(1,master.getName());
		            st.setString(2,master.getPassword());
		            st.setInt(3, master.getMoney());
				//4.ִ�е�sql���
			
				 result = st.executeUpdate();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				try {
					st.close();
					conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			//5.�ж�sql�������ݿ�Ĳ����Ƿ�ɹ�
			if(result>0){
				System.out.println("����������Ϣ�ɹ���");
			}else{
				System.out.println("���ʧ��");
			}
			
		}else if(choice==2){
			Dog dog =new Dog();
			System.out.println("�����̵�>�޸ĳ���");
			System.out.println("��������Ҫ�޸Ľ�����Ĺ���������");
			String dogName=input.next();
			dog.setDogName(dogName);
			System.out.println("�������޸ĺ�Ľ���ֵ(1-100)");
			int love=input.nextInt();
			int result=-1;
			boolean result2=false;
			Connection conn=null;
			PreparedStatement st=null;
			try {
				//1.��������
				Class.forName("com.mysql.jdbc.Driver");
				//2.��������
				String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				conn=DriverManager.getConnection(url,"root", "123456");
				//3.ʹ��prepareStatement����mysql����mysql���Լ����mysql��ִ�н��
				String sql="update pet set love=? where id=?";
				//�������ȴ���sql
				st=conn.prepareStatement(sql);
				//��ռλ����ֵ
				 st.setInt(1,10);
				 st.setInt(2,1);
				 //ִ��sql���Ľ��
				result= st.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//5.�ж����ִ�н��
				if(result>0){
					System.out.println("�޸Ĺ��ӵĽ���ֵ�ɹ�");
				}else{
					System.out.println("�޸�ʧ��");
				}
		}
		
	}
}
