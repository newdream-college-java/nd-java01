import java.util.Scanner;
import java.util.Random;
public class C{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Random rd=new Random();
		System.out.println("请输入4位会员号");
		int a=rd.nextInt(10);
		int mun=input.nextInt();
		int b=mun/100%10;
		if(b==a){
			System.out.println(mun+"号客户是幸运客户，获得精美MP3一个");
		}else{
			System.out.println("很遗憾没有中奖");
		}
		System.out.println("幸运数字是："+a);
		
}
}