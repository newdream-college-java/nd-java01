/*输入一个四位数的整数，要求编程将这个四位数的个位，十位，百位，千位分别输出。*/
import java.util.Scanner;
public class Af{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个四位整数:");
		int a=input.nextInt();
		int g,s,b,q;
		g=a%10;
		s=a/10%10;
		b=a/100%10;
		q=a/1000%10;
		System.out.print("个位为:"+g+"\n十位为:"+s+"\n百位为:"+b+"\n千位为:"+q);
	}
}