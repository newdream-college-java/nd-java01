package Zy10;
import java.util.Scanner;
public class Zy001 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Zy01 q=new Zy01();
		q.show();
		System.out.print("请输入用户名：");
		String c=input.next();
		System.out.print("请输入密码：");
		int s=input.nextInt();
		if(c.equals("admin1")&&s==q.b[0]){
			System.out.print("请输入新密码：");
			q.b[0]=input.nextInt();
			System.out.println("修改密码成功，您的密码为："+q.b[0]);
		}else if(c.equals("admint2")&&s==q.b[1]){
			System.out.print("请输入新密码：");
			q.b[1]=input.nextInt();
			System.out.println("修改密码成功，您的密码为："+q.b[1]);
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
	}
}
