package zuoye;
import java.util.Scanner;
public class Admin {
	String name;
	int mm;
	public void show(){
		System.out.println("姓名:"+name+"，密码:"+mm);
	}
	public void gm(){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String a=input.next();
		System.out.print("请输入密码:");
		int b=input.nextInt();
		if(a.equals(name)&&b==mm){		
			System.out.println("请输入新密码:");
			int c=input.nextInt();
			mm=c;
			System.out.println("修改成功，您的新密码为："+mm);
		
		}else{
			System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
		}
	}
}
