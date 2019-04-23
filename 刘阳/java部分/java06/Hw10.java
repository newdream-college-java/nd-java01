import java.util.Scanner;
public class Hw10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号<4位整数>:");
			int a=input.nextInt();
			if(a<1000||a>9999){
				System.out.print("录入失败！");
				System.exit(-1);
			}
			System.out.print("请输入会员生日(月/日<用两位整数表示>)");
			int b=input.nextInt();
			if(b<1||b>12){
				System.out.print("录入失败！");
				System.exit(-1);
			}
			int c=input.nextInt();
			if(c<1||c>31){
				System.out.print("录入失败！");
				System.exit(-1);
			}
			System.out.print("请输入会员积分:");
			int d=input.nextInt();
			System.out.println("您录入的会员信息是:");
			System.out.println(a+"\t"+b+"/"+c+"\t"+d);
		}
		System.out.println();
		System.out.println("程序结束!");
	}
}