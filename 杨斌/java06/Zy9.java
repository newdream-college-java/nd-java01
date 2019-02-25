import java.util.Scanner;
public class Zy9{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Myshopping管理系统>客户信息管理>添加客户信息");
		for(int i=1;i<=3;i++){
			System.out.println("请输入会员号（4位整数）");
			int a=input.nextInt();
			System.out.println("请输入会员生日（月/日<用两位整数表示>）");
			String b=input.next();
			System.out.println("请输入会员积分");
			int c=input.nextInt();
			System.out.println("您录入的会员信息是："+a+"\t"+b+"\t"+c);		
		}
		System.out.print("程序结束！");
	}
		
}