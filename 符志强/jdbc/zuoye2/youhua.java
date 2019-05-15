package zuoye2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class youhua{
//	public static int executeUpdate(String sql,Object[] object) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
//		
//		String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
//		Connection conn=DriverManager.getConnection(url, "root", "123");
//
//		sql="update dog set name='zaq' where id=1";
//		
//		PreparedStatement pst=conn.prepareStatement(sql);
//		int zj=pst.executeUpdate(sql);
//		
//       
//		if(object!=null) {
//			for(int i=0;i<object.length;i++) {
//				pst.setObject(i+1, object[i]);
//			}
//		}
//		pst.close();
//		conn.close();
//		return zj;
//	}
	public static int executeUpdate(String sql,Object[] objects) throws Exception {//增删改
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url="jdbc:mysql://127.0.0.1:3306/jdbc1?useUnicode=true&characterEncoding=utf8&useSSL=true";
			conn=DriverManager.getConnection(url, "root", "123");
			st=conn.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0;i<objects.length;i++) {
					st.setObject(i+1, objects[i]);
				}
			}
			result=st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		st.close();
		conn.close();
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner input=new Scanner(System.in);
		System.out.println("============================欢迎访问宠物商店============================");
		System.out.println("1.添加宠物信息\t2.修改宠物信息\t3.删除宠物信息\t0.退出");
		System.out.println("请输入您的选择:");
		int num=input.nextInt();
		switch(num) {
	    case 1:
		String sql="insert into dog values(?,?,null)";	
    	System.out.println("请输入宠物名字:");
		String ename=input.next();
		System.out.println("请输入宠物的健康值:");
		int health=input.nextInt();
		Object[] objects= {ename,health};
		int resu=executeUpdate(sql,objects);
		if(resu>0) {
			System.out.println("插入宠物信息成功");
		}
		break;
		case 2:
			System.out.println("宠物商店>修改宠物信息");
	    	System.out.println("请输入需要修改健康值的宠物名字:");
			String ename01=input.next();
			System.out.println("请输入修改后的健康值（1-100）");
			int health01=input.nextInt();
			String sql01="update dog set health=? where name=?";					
			Object[] objects01= {health01,ename01};
			int resu01=executeUpdate(sql01,objects01);
			if(resu01>0) {
				System.out.println("修改宠物信息成功");
			}
			break;
		case 3:
			System.out.println("宠物商店>修改宠物信息");
	    	System.out.println("请输入需要删除健康值的宠物名字:");
			String ename02=input.next();
			System.out.println("请输入删除后的健康值（1-100）");
			int health02=input.nextInt();
			String sql02="delete from dog  where name=? and health=? ";					
			Object[] objects02= {ename02,health02};
			int resu02=executeUpdate(sql02,objects02);
			if(resu02!=0) {
				System.out.println("删除宠物信息成功");
			}
			break;
		case 0:
			
			break;

		default:
			System.out.println("您的选择有误");
			break;
		}
	}
}
