import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class �ڶ�����ҵ��� {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("\t\t�������˵�¼");
		System.out.println("������������");
		String name=input.next();
		System.out.println("����������");
		String passWord =input.next();
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String sql=null;
		PreparedStatement pst= null;
		List list = null;
		boolean flag=false;
		int choice=-1;
		//��¼����
		Connection conn=null;
		Master ma=null;
		Dog d=null;
		ResultSet rs=null;
		ResultSet rs1=null;
		int result =-1;
		try {
			//1.��������
			Class.forName("com.mysql.jdbc.Driver");
			//2.��������
			conn=DriverManager.getConnection(url,"root","123456");
			sql="select * from master where name=? and password=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, passWord);
			rs=pst.executeQuery();
			if(rs.next()){
				ma=new Master();
				list =new ArrayList();
				System.out.println("��¼�ɹ�,��ӭ��");
				String name1 = rs.getString("name"); 
				ma.setName(name1);
				
				ma.setId(rs.getInt("id"));
				ma.setPassword(rs.getString("password"));
				ma.setMoney(rs.getInt("money"));
				list.add(ma);
				System.out.println(list);
				flag=true;
				rs.close();
				conn.close();
			}else{
				System.out.println("ʧ��");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(true){
			rs=null;
			//���list=null�ͻᱨ��ָ���쳣������Ϊʲô������������
			//list=null;
			//System.out.println(list.size());
			
			//���ü��ϵ�ֵ
		
			
			System.out.println("=======================��ӭ���ʳ����̵�=====================");
			System.out.println("1.��ӳ�����Ϣ 2.�޸ĳ�����Ϣ 3.��ѯ������Ϣ 0.�˳�");
			System.out.println("����������ѡ��");
			choice=input.nextInt();
			if(choice==3){
				System.out.println("�����̵�>��ѯ����");
				System.out.println("\t\t������Ϣ�б�");
				list.remove(0);
			try {
				//1.��������
				Class.forName("com.mysql.jdbc.Driver");
				//2.��������
				conn=DriverManager.getConnection(url,"root","123456");
				sql="select * from Dog";
				//����sql����
				pst=conn.prepareStatement(sql);
				rs1=pst.executeQuery();
				
				while(rs1.next()){
					d=new Dog();
					d.setDogName(rs1.getString("dogname"));
					d.setId(rs1.getInt("id"));
					d.setType(rs1.getString("dogtype"));
//					System.out.println(d);
					
				//������������յ��õ������ָ㲻����
				//��Ҫ�Ƴ�list�е�����	list.remove		
					list.add(d);
				}
				System.out.println(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}else if(choice==1){
				System.out.println("�������������");
				String dogname=input.next();
				System.out.println("��������������");
				String dogtype=input.next();
				try {
					//1.��������
					Class.forName("com.mysql.jdbc.Driver");
					//2.��������
					conn=DriverManager.getConnection(url, "root","123456");
					sql="insert into Dog values(null,?,?) ";
					pst=conn.prepareStatement(sql);
					pst.setString(1, dogname);
					pst.setString(2, dogtype);
					result=pst.executeUpdate();
					if(result>0){
						System.out.println("��ӳɹ�");
					}else{
						System.out.println("���ʧ��");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
}
