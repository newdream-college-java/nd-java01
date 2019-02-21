/**
**创建类 AddCust 录入会员信息,包括会员号、生日和积分判断录入的会员号是否合法(必须为 4 位整数) 
**/
import java.util.Scanner;
public class AddCust{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=-1;
		System.out.print("请输入会员号（4位整数）：");
		if(input.hasNextInt()){
			num=input.nextInt();
		}else{
			System.out.println("输入会员号不合法");
			System.exit(-1);
		}
		System.out.print("请输入会员生日（月/日）:");
		String birth=input.next();
		System.out.print("请输入积分:");
		int score=input.nextInt();
		System.out.println("已录入的会员信息是：");
		System.out.println(num+"\t"+birth+"\t"+1000);
	}
}