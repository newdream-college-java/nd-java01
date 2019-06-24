package java11;
import java.util.Scanner;
public class Y3 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Y2 m=new Y2();
		int p =input.nextInt();
		for(int i=1;i<3;i++){
			System.out.println("请选择输入数字：");
			p =input.nextInt();
			System.out.println("请输入用户名");
			p =input.nextInt();
			System.out.println("请输入密码");
			System.out.println("@@您没有权限进入系统，请重新登录。@@");
		}
		
	}
}