package test;
import java.util.Scanner;
public class Rr {
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入姓名");
		Re gl=new Re();
		String name="admin1";
		String name1="admin2";
		String a="0";
		int b =0;
		int mima=111111;
		int mima2=22222;
		for(int i=1;i<3;i++){
			System.out.println("请输入姓名：");
			a =input.next();
			System.out.println("请输入密码：");
			b =input.nextInt();
			if(!a.equals("a.admin1")||!a.equals("a.admin2")){
				System.out.println("输入错误，没有权限");
			}else if(b!=11111||b!=22222){
				System.out.println("输入错误，没有权限");
			}else{
				System.out.println("用户名与正确，请进行更新");
			}
		}
		
	}
}
