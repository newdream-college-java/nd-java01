/*
创建类AddCust录入会员信息，包括会员号，生日和积分判断录入的会员号是否合法（必须为4位整数）
*/
import java.util.Scanner;

public class AddCust{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入用户会员名：");
		int numb = input.nextInt(),jf ;
		System.out.print("请输入用户生日：");
		String birthday = input.next();
		System.out.print("请输入用户积分：");
		jf =  input.nextInt();
		if(numb/1000!=0){
			System.out.print("会员号："+numb+"\n生日："+birthday+"\n积分："+jf);
		}else{
			System.out.println("请输入4位数字会员号");
			System.exit(-1);
		}
	}
}