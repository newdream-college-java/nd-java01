/*
scanner.hasnextint() 的输出为 boolean。
如果下一个token是integer，输出true，否者false。
boolean a = scanner.hasnextint();
if(a){//下个input是数字

}else{//下个input不是数字
}

*/
import java.util.Scanner;
public class java08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的会员号(4位整数)，生日，积分");
		String birthday ;
		int score;
		if(input.hasNextInt()==true){
			/*if(input.nextInt<10000&&input.nextInt>999){
				System.out.println("你的会员号合法");
			}else{
				System.out.println("你输入的会员号不合法");
			}
			*/
			int num = input.nextInt();
			if(num>999&&num<10000){
				System.out.println("会员号输入合法，请继续输入生日，积分");
				birthday=input.next();
				score = input.nextInt();
				System.out.println("会员号："+num+"\t"+"生日："+birthday+"积分："+score);
			}else{
				System.out.println("会员号输入不合法，程序结束");
				System.exit(-1);//此语句结束程序
			}

		}else{
			System.out.println("会员号输入有误，程序结束");
			System.exit(-1);//此语句结束程序
		}
	}
}