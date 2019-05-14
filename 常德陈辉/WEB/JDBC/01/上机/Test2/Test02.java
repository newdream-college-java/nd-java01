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
			System.out.println("========================欢迎访问宠物店========================");
			System.out.println("1,添加宠物信息 2,修改宠物信息 3,查询宠物信息 4,添加主人信息 0,退出");
			System.out.println("=============================================================");
			int num=input.nextInt();
			switch(num){
				case 1:
					System.out.println("添加宠物信息");
					System.out.println("请输入要添加狗狗的名字：");
					String name=input.next();
					System.out.println("请输入狗狗健康值：");
					int health=input.nextInt();
					System.out.println("请输入狗狗亲密度：");
					int love=input.nextInt();
					String sql="insert into dog values (null,'"+name+"',"+health+","+love+",null)";
					int result=st.executeUpdate(sql);
					if(result>0){
						System.out.println("添加宠物成功！");
					}else{
						System.out.println("添加宠物失败！");
					}
					break;
				case 2:
					System.out.println("修改宠物信息");
					System.out.println("请输入要修改狗狗的id：");
					int id=input.nextInt();
					System.out.println("请输入要修改狗狗的属性：");
					String typt=input.next();
					System.out.println(typt+"修改为:");
					String gai=input.next();
					String sql1="update dog set "+typt+"="+gai+" where id="+id;
					int result1=st.executeUpdate(sql1);
					if(result1>0){
						System.out.println("修改成功！");
					}else{
						System.out.println("失败！");
					}
					break;
				case 3:
					System.out.println("查询宠物信息");
					break;
				case 4:
					System.out.println("添加主人信息");
					System.out.println("请输入添加的姓名：");
					String name3=input.next();
					System.out.println("请输入添加的密码：");
					String password=input.next();
					System.out.println("请输入添加的元宝：");
					int money=input.nextInt();
					String sql3="insert into master values (null,'"+name3+"','"+password+"',"+money+")";
					int result3=st.executeUpdate(sql3);
					if(result3>0){
						System.out.println("插入成功！");
					}else{
						System.out.println("失败！");
					}
					break;
				case 0:
					System.out.println("谢谢光临");
					goOn=false;
					break;
				default:
					System.out.println("输入有误！");
					break;
			}
		}while(goOn);
		st.close();
		conn.close();
	}
}
