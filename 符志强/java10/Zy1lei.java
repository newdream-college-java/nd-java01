import java.util.Scanner;
public class Zy1lei {
	Scanner input=new Scanner(System.in);
	String name;
	String mima;
	public void show(){
		System.out.print("请输入用户名：");
		String b=input.next();
		System.out.print("请输入用户名密码：");
		String c=input.next();
		boolean g=false;
		while(g!=(true)){
			if(!b.equals("abc")||!c.equals("111111")){
				System.out.println("您的用户名或密码输入错误，请重新输入");
				System.out.print("请输入用户名：");
				b=input.next();
				System.out.print("请输入用户名密码：");
				c=input.next();
			}else{
				System.out.print("请输入你的新密码：");
				String x=input.next();
				System.out.println("更改成功，您新密码是："+x);
				g=true;
			}
		}
	}
}
