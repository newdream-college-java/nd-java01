import java.util.*;
public class work10{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);	
		for(int i = 1;i<=3;i++){
			System.out.println("请输入会员号（<4位整数>）：");
			int a = input.nextInt();
			System.out.print("请输入会员生日（月/日<用两位整数表示>）：");
			String b = input.next();
			System.out.print("请输入会员积分：");
			int c = input.nextInt();
			if(a>=1000&&a<=9999){
				System.out.println("您录入的会员信息是：");
				System.out.print(a+"  "+b+" "+c);
			}else{
				System.out.print("您的会员号错误！");
			
			}
		}
	}
}