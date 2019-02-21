/**
**输入三个 int 型的数据，放入到 a,b,c 三个变量中去，使用条件结构与交换逻辑将 
**这三个变量中的值从小到大排列。 
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入三个整数");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int temp=-1;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(c+">"+b+">"+a);
	}
}