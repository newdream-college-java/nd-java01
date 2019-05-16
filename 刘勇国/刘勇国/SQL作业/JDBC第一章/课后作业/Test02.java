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
			System.out.println("请输入用户名");
			String uName=input.next();
			System.out.println("请输入密码：");
			String uPassword=input.next();
			// 查询数据库
			// 1.创建集合用于储存数据库中的数据
			List list = new ArrayList();
			// 1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 2.建流
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			// 连接数据库
			String username = "root";
			String password = "123456";
			Connection conn = DriverManager.getConnection(url, username, password);
			// 3.创建Statement对象用于运输myeclipes的命令给mysql,mysql的数据反馈	
			// 创建变量用于储存操作数据库的语句
			String sql = "select * from master where name=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, uName);
			pst.setString(2, uPassword);
			// 创建ResultSet集合用于储存从数据库查找到的数据
			
			
			ResultSet rs = pst.executeQuery();
			// n申明stu_info类赋值为null
			Master s1 = null;
			// 在stu_info表中操作时，默认操作的是第一行（字段名的那一行），所以要将光标下移一行
			if (rs.next()) { // next()函数表示下一个，返回boolean值，这里也就是说如果rs对象的下一行有那么while中的条件就成立为true
				// 逐列取值
				String name = rs.getString("name"); // 根据字段名
				String password1=rs.getString("password");
				int id =rs.getInt("id");
				int money =rs.getInt("money");
				
				s1 = new Master();
				
				// 在stu_info类中的构造函数没有写id属性，并且这里以id字段为例根据下标得到数据所以要get/set函数
				// 设置s1的id值
				s1.setName(name);
				s1.setPassword(password1);
				s1.setId(id);
				s1.setMoney(money);
				// 将s1的所有数据放入集合
				list.add(s1);
				System.out.println("登录成功");
				System.out.println(list);
			}else{
				System.out.println("登录失败");
			}
			
			
			// 关流
			pst.close();
			conn.close();

		}

	
}
