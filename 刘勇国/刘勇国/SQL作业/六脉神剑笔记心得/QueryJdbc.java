

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
		//查询数据库
		//1.创建集合用于储存数据库中的数据
		List list = new ArrayList();
		//1.加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		//2.建流
		String url="jdbc:mysql://127.0.0.1:3306/java01?useUnicode=true&characterEncoding=utf8&useSSL=true";
		//连接数据库
		String username="root";
		String password="123456";
		Connection conn = DriverManager.getConnection(url,username,password);
		//3.创建Statement对象用于运输myeclipes的命令给mysql,mysql的数据反馈
		Statement st = conn.createStatement();
		//创建变量用于储存操作数据库的语句
		String sql = "select * from stu_info";
		//创建ResultSet集合用于储存从数据库查找到的数据
		ResultSet rs =st.executeQuery(sql);
		//n申明stu_info类赋值为null
		stu_info s1=null;
		//在stu_info表中操作时，默认操作的是第一行（字段名的那一行），所以要将光标下移一行
		while(rs.next()){	//next()函数表示下一个，返回boolean值，这里也就是说如果rs对象的下一行有那么while中的条件就成立为true
			//逐列取值
			int id =rs.getInt(1);//根据第一列取值  id变量储存rs表中的第一行的第一列的数据
			//但是一般不用下标取值，因为可能存在表的字段名顺序发生改变，并且数据类型相同，那么会造成得到的数据混乱的情况
			//因此一般用根据字段名得到值
			String name= rs.getString("name");	//根据字段名
			int age = rs.getInt("age");
			String address = rs.getString("address");
            Date birthday = rs.getDate("birthday");
            String hobbies = rs.getString("hobbies");
            s1= new stu_info(name, age, address, birthday, hobbies);
            //在stu_info类中的构造函数没有写id属性，并且这里以id字段为例根据下标得到数据所以要get/set函数
            //设置s1的id值
            s1.setId(id);
            //将s1的所有数据放入集合
            list.add(s1);
		}
		System.out.println(list);
		//关流
		st.close();
		conn.close();
		
		
	}

}
