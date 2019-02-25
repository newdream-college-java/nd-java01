import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int d,c=input.nextInt();	
		System.out.println("排序之前的值："+a+"\t"+b+"\t"+c);
		//使用if结构重复比较三次
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(a>c){
			d=a;
			a=c;
			c=d;
		}
		if(b>c){
			d=b;
			b=c;
			c=d;
		}
		System.out.println("排序之后的值："+a+"\t"+b+"\t"+c);
}
}