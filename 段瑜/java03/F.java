import java.util.Scanner;
public class F{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入会员号：");
		int mun=input.nextInt();
		System.out.println("请输入生日号：");
		int mun1=input.nextInt();
		System.out.println("请输入积分：");
		int mun2=input.nextInt();
		if(mun>=1000&&mun<10000){
			System.out.println("会员号是："+mun);
			System.out.println("生日号是："+mun1);
			System.out.println("积分号是："+mun2);
		}else{
			System.out.println("会员号必须是4位数");
		}
	}
}