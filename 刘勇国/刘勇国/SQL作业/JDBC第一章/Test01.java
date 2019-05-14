import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Test01 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("==================欢迎访问宠物商店====================\n" +
				"1.添加宠物信息 2.修改宠物信息 3.查询宠物信息 4.添加主人信息 0.退出");
		System.out.println("请输入您的选择：");
		int choice =input.nextInt();
		
		if(choice==4){
			//添加主人信息
			Master master=new Master();
			System.out.println("宠物商店>添加主人");
			System.out.println("请输入主人姓名");
			String name=input.next();
			master.setName(name);
			System.out.println("请输入主人的密码");
			String password = input.next();
			master.setPassword(password);
			System.out.println("请输入主人的元宝");
			int money=input.nextInt();
			master.setMoney(money);
			int result=-1;
			Connection conn=null;
			PreparedStatement st=null;
			//1.加载驱动
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//2.建立连接
			String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
			try {
				//建立连接
				 conn=DriverManager.getConnection(url, "root", "123456");
				//3.创建Statement对象用于传送sql语句到mysql服务器，以及得到mysql语句的执行结果
				 //在这里使用预处理防止sql注入
				 String sql = "INSERT into master(name,password,money) VALUES(?,?,?)";
				 	//给占位符赋值
				 	st = conn.prepareStatement(sql);
		            st.setString(1,master.getName());
		            st.setString(2,master.getPassword());
		            st.setInt(3, master.getMoney());
				//4.执行的sql语句
			
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
			//5.判断sql语句对数据库的操作是否成功
			if(result>0){
				System.out.println("插入主人信息成功！");
			}else{
				System.out.println("添加失败");
			}
			
		}else if(choice==2){
			Dog dog =new Dog();
			System.out.println("宠物商店>修改宠物");
			System.out.println("请输入需要修改健康真的狗狗的名字");
			String dogName=input.next();
			dog.setDogName(dogName);
			System.out.println("请输入修改后的健康值(1-100)");
			int love=input.nextInt();
			int result=-1;
			boolean result2=false;
			Connection conn=null;
			PreparedStatement st=null;
			try {
				//1.加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2.建立连接
				String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
				conn=DriverManager.getConnection(url,"root", "123456");
				//3.使用prepareStatement传输mysql语句给mysql，以及获得mysql的执行结果
				String sql="update pet set love=? where id=?";
				//把命名先传给sql
				st=conn.prepareStatement(sql);
				//给占位符赋值
				 st.setInt(1,10);
				 st.setInt(2,1);
				 //执行sql语句的结果
				result= st.executeUpdate();
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//5.判断语句执行结果
				if(result>0){
					System.out.println("修改狗子的健康值成功");
				}else{
					System.out.println("修改失败");
				}
		}
		
	}
}
