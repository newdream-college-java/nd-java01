import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a=0;
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		for(int i=1;i<4;i++){
			System.out.print("请输入会员号(<4位整数>)");
			if(input.hasNextInt()){
				for(;;){	
					
					if(!(a>=1000&a<10000)){
						a=input.nextInt();
						System.out.println("您的输入有错误，请重新输入");
						
					                                                                                                                       
					}
					else{
						break;
					}
				}
			}
			String b;
			System.out.println("请输入会员生日(月/日<用两位整数表示>)");
			b=input.next();
			System.out.println("请输入会员积分");
			int c=input.nextInt();
			System.out.println("您录入的会员信息是"+a+"\t"+b+"\t"+c);
		}
	}
}