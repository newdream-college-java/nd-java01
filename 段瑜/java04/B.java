import java.util.Scanner;
public class B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("老板我需要买：");
		int sum=input.nextInt();
		int a=1,b=2,c;
		if(sum>=3&&sum<=5){
			c=sum+a;
			System.out.println("老板送桃子1个，最后买到："+c);
		}else if(sum>5){
			c=sum+b;
			System.out.println("老板送桃子2个，最后买到："+c);
		}else {
			System.out.println("老板不送桃子");
			}	
	}
}