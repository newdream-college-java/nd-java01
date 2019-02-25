import java.util.Scanner;
public class H{
	public static void main(String[] arge){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入3个整数：\t");
		int  a = input.nextInt();
		int  b = input.nextInt();
		int  c = input.nextInt();
		int temp;
		System.out.print("排序之前的值"+a+"\t"+b+"\t"+c);
		if(a<b){
			temp=a;
			a=b;
			b=temp;
		}if(a<c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b<c){
			temp=b;
			b=c;
			c=temp;
		}
		
		System.out.println("三个整数由大到小排序后"+a+"\t"+b+"\t"+c);
	}
}
  