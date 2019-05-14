

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class QueryJdbc {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//��ѯ���ݿ�
		//1.�����������ڴ������ݿ��е�����
		List list = new ArrayList();
		//1.��������
		Class.forName("com.mysql.jdbc.Driver");
		//2.����
		String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";
		//�������ݿ�
		String username="root";
		String password="123456";
		Connection conn = DriverManager.getConnection(url,username,password);
		//3.����Statement������������myeclipes�������mysql,mysql�����ݷ���
		Statement st = conn.createStatement();
		//�����������ڴ���������ݿ�����
		String sql = "select * from stu_info";
		//����ResultSet�������ڴ�������ݿ���ҵ�������
		ResultSet rs =st.executeQuery(sql);
		//n����stu_info�ำֵΪnull
		stu_info s1=null;
		//��stu_info���в���ʱ��Ĭ�ϲ������ǵ�һ�У��ֶ�������һ�У�������Ҫ���������һ��
		while(rs.next()){	//next()������ʾ��һ��������booleanֵ������Ҳ����˵���rs�������һ������ôwhile�е������ͳ���Ϊtrue
			//����ȡֵ
			int id =rs.getInt(1);//���ݵ�һ��ȡֵ  id��������rs���еĵ�һ�еĵ�һ�е�����
			//����һ�㲻���±�ȡֵ����Ϊ���ܴ��ڱ���ֶ���˳�����ı䣬��������������ͬ����ô����ɵõ������ݻ��ҵ����
			//���һ���ø����ֶ����õ�ֵ
			String name= rs.getString("name");	//�����ֶ���
			int age = rs.getInt("age");
			String address = rs.getString("address");
            Date birthday = rs.getDate("birthday");
            String hobbies = rs.getString("hobbies");
            s1= new stu_info(name, age, address, birthday, hobbies);
            //��stu_info���еĹ��캯��û��дid���ԣ�����������id�ֶ�Ϊ�������±�õ���������Ҫget/set����
            //����s1��idֵ
            s1.setId(id);
            //��s1���������ݷ��뼯��
            list.add(s1);
		}
		System.out.println(list);
		//����
		st.close();
		conn.close();
		
		
	}

}
