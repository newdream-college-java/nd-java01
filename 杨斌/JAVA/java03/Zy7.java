import java.util.Scanner;
import java.util.Random;
public class Zy7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("请输入四位会员号：");
		int a=input.nextInt();
		int bw=a/100%10;
		int b=rd.nextInt(10);		
		if (bw==b){
			System.out.print(a+"号客户是幸运客户，获得精美Mp3一个。");

		}else{
			System.out.print(a+"号客户，谢谢您的支持");
		}

	}
	



}