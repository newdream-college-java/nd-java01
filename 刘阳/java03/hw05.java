<<<<<<< HEAD
/*�������������������ִ�С��С�����������*/
import java.util.Scanner;
public class hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in );
=======
import java.util.Scanner;
public class hw05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in 

);
>>>>>>> parent of 5ba5fdf... 提交第4章的课件
		System.out.println("��������������");
		int a = input.nextInt();
		int b =input.nextInt();
		int c =input.nextInt();
<<<<<<< HEAD
		System.out.println("����֮ǰ����Ϊ��"+a+"\t"+b+"\t"+c);
		int tm;
		if(a>b){
			tm=a;
			a=b;
			b=tm;
		}
		if(a>c){
			tm=a;
			a=c;
			c=tm;
		}
		if(b>c){
			tm=b;
			b=c;
			c=tm;
		}
		System.out.print(a+"\t"+b+"\t"+c);
=======
		if(a>b&&b>c){
			System.out.print(c+"\t"+b+"\t"+a);
		}
		if(b>a&&a>c){
			System.out.print(c+"\t"+a+"\t"+b);
		}
		if(a>c&&c>b){
			System.out.print(b+"\t"+c+"\t"+a);
		}
		if(b>c&&c>a){
			System.out.print(a+"\t"+c+"\t"+b);
		}
		if(c>b&&b>a){
			System.out.print(a+"\t"+b+"\t"+c);
		}
		if(c>a&&a>b){
			System.out.print(b+"\t"+a+"\t"+c);
		}
>>>>>>> parent of 5ba5fdf... 提交第4章的课件
	}	
}