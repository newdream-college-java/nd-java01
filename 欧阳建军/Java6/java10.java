import java.util.Scanner;
public class java10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统>客户信息管理>添加客户信息\n\n");
		int num;
		String birthday;
		int score;
		for(int i=1;i<=3;i++){
			System.out.print("请输入会员号(<4位整数>):");
			if(input.hasNextInt()==true){
				num=input.nextInt();
			}else{
				System.out.println("录入失败");
				break;
			}
			System.out.print("请输入会员生日(月/日<用两位数表示>):");
			if(input.hasNext()==true){
				birthday=input.next();
			}else{
				System.out.println("录入失败");
				break;
			}
			System.out.print("请输入会员积分");
			if(input.hasNextInt()==true){
				score=input.nextInt();
			}else{
				System.out.println("录入失败");
				break;
			}
			System.out.println("您录入的会员信息是："+num+"\t"+birthday+"\t"+score);
		}
	}
}