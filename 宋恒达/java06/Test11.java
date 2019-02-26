/**
**用户验证登录。验证次数最多3次
**/
import java.util.Scanner;
public class Test11{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入用户名：");
			String a=input.next();
			System.out.print("请输入密码：");
			String b=input.next();
			if((a.equals("jim"))&&(b.equals("123456"))){
				System.out.println("欢迎登录MyShopping系统!");
				break;
			}
			System.out.println("输入错误！您还有"+(3-i)+"次机会!");
			if(i==3){
				System.out.println();
				System.out.println("对不起，您3次均输入错误！");
			}
		}
	}
}