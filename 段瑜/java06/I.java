import java.util.Scanner;
public class I{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		int i=1;
		while(i<=3){
			System.out.println("请输入会员号（4位整数）：");
			int sum=input.nextInt();
			if(sum<10000){
			System.out.println("请输入会员生日（月/日（两位整数表示））：");
			String a=input.next();
			System.out.println("请输入会员积分：");
			int sum1=input.nextInt();
			System.out.println("您录入的会员信息是："+sum+"\t"+a+"\t"+sum1);
			}else{
				System.out.println("录入失败！");
				continue;
			}
			i++;
		}
		System.out.println("录入结束！");
	}
}