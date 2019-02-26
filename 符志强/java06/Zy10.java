import java.util.Scanner;
public class Zy10{
	public static void main(String[] aegs){
		Scanner input=new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
		System.out.println("");
		
		for(int n=1;n<=3;n++){
			System.out.print("请输入会员号（<4位整数>）：");
			int s=input.nextInt();
				
			while(s>=1000&&s<=9999){	
					
				System.out.print("请输入会员生日（月<用两位整数表示>）：");
				int y=input.nextInt();	
				while(y>0&&y<=12){	
							
						break;
				}
				if(y<=0||y>12){
					break;	
				}
				System.out.print("请输入会员生日（日<用两位整数表示>）：");
				int r=input.nextInt();
				while(r>0&&r<=31){	
					break;
				}
				if(r<=0||r>31){
					break;	
				}
				System.out.print("请输入会员积分：");
				int jf=input.nextInt();
				System.out.println("您录入的会员信息是：");
				System.out.println(s+"\t"+y+"/"+r+"\t"+jf);
				break;
			}
			break;
		}
	}
}