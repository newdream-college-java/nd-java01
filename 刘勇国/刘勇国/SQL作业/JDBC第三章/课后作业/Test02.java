import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test02 {

		public static void main(String[] args) throws ClassNotFoundException,
				SQLException {
			Scanner input =new Scanner(System.in);
			System.out.println("�������û���");
			String uName=input.next();
			System.out.println("���������룺");
			String uPassword=input.next();
			// ��ѯ���ݿ�
			// 1.�����������ڴ������ݿ��е�����
			List list = new ArrayList();
			// 1.��������
			Class.forName("com.mysql.jdbc.Driver");
			// 2.����
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			// �������ݿ�
			String username = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, username, password);
			// 3.����Statement������������myeclipes�������mysql,mysql�����ݷ���	
			// �����������ڴ���������ݿ�����
			String sql = "select * from master where name=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, uName);
			pst.setString(2, uPassword);
			// ����ResultSet�������ڴ�������ݿ���ҵ�������
			
			
			ResultSet rs = pst.executeQuery();
			// n����stu_info�ำֵΪnull
			Master s1 = null;
			// ��stu_info���в���ʱ��Ĭ�ϲ������ǵ�һ�У��ֶ�������һ�У�������Ҫ���������һ��
			if (rs.next()) { // next()������ʾ��һ��������booleanֵ������Ҳ����˵���rs�������һ������ôwhile�е������ͳ���Ϊtrue
				// ����ȡֵ
				String name = rs.getString("name"); // �����ֶ���
				String password1=rs.getString("password");
				int id =rs.getInt("id");
				int money =rs.getInt("money");
				
				s1 = new Master();
				
				// ��stu_info���еĹ��캯��û��дid���ԣ�����������id�ֶ�Ϊ�������±�õ���������Ҫget/set����
				// ����s1��idֵ
				s1.setName(name);
				s1.setPassword(password1);
				s1.setId(id);
				s1.setMoney(money);
				// ��s1���������ݷ��뼯��
				list.add(s1);
				System.out.println("��¼�ɹ�");
				System.out.println(list);
			}else{
				System.out.println("��¼ʧ��");
			}
			
			
			// ����
			pst.close();
			conn.close();

		}

	
}
