import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class 第二章作业完成 {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		System.out.println("\t\t宠物主人登录");
		System.out.println("请输入姓名：");
		String name=input.next();
		System.out.println("请输入密码");
		String passWord =input.next();
		String url = "jdbc:mysql://127.0.0.1:3306/epet?useUnicode=true&characterEncoding=utf8&useSSL=true";
		String sql=null;
		PreparedStatement pst= null;
		List list = null;
		boolean flag=false;
		int choice=-1;
		//登录界面
		Connection conn=null;
		Master ma=null;
		Dog d=null;
		ResultSet rs=null;
		ResultSet rs1=null;
		int result =-1;
		try {
			//1.加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2.建立连接
			conn=DriverManager.getConnection(url,"root","123456");
			sql="select * from master where name=? and password=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1, name);
			pst.setString(2, passWord);
			rs=pst.executeQuery();
			if(rs.next()){
				ma=new Master();
				list =new ArrayList();
				System.out.println("登录成功,欢迎您");
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
				System.out.println("失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(true){
			rs=null;
			//如果list=null就会报空指针异常，但是为什么会出现这种情况
			//list=null;
			//System.out.println(list.size());
			
			//重置集合的值
		
			
			System.out.println("=======================欢迎访问宠物商店=====================");
			System.out.println("1.添加宠物信息 2.修改宠物信息 3.查询宠物信息 0.退出");
			System.out.println("请输入您的选择");
			choice=input.nextInt();
			if(choice==3){
				System.out.println("宠物商店>查询宠物");
				System.out.println("\t\t宠物信息列表");
				list.remove(0);
			try {
				//1.加载驱动
				Class.forName("com.mysql.jdbc.Driver");
				//2.建立连接
				conn=DriverManager.getConnection(url,"root","123456");
				sql="select * from Dog";
				//运送sql命令
				pst=conn.prepareStatement(sql);
				rs1=pst.executeQuery();
				
				while(rs1.next()){
					d=new Dog();
					d.setDogName(rs1.getString("dogname"));
					d.setId(rs1.getInt("id"));
					d.setType(rs1.getString("dogtype"));
//					System.out.println(d);
					
				//弱智又是这里，刚调好的现在又搞不清了
				//先要移除list中的数据	list.remove		
					list.add(d);
				}
				System.out.println(list);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}else if(choice==1){
				System.out.println("请输入宠物名字");
				String dogname=input.next();
				System.out.println("请输入宠物的类型");
				String dogtype=input.next();
				try {
					//1.加载驱动
					Class.forName("com.mysql.jdbc.Driver");
					//2.建立连接
					conn=DriverManager.getConnection(url, "root","123456");
					sql="insert into Dog values(null,?,?) ";
					pst=conn.prepareStatement(sql);
					pst.setString(1, dogname);
					pst.setString(2, dogtype);
					result=pst.executeUpdate();
					if(result>0){
						System.out.println("添加成功");
					}else{
						System.out.println("添加失败");
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
		
	}
}
