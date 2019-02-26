import java.util.Scanner;
public class B03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入一个四位数整数：");
		int zs=input.nextInt();
		int g=zs%10;		
		int s=zs/10%10;		
		int b=zs/100%10;
		int q=zs/1000%10;
		System.out.print("个位："+g+"\n十位："+s+"\n百位："+b+"\n千位："+q);

	}



}
