import java.util.Scanner;
public class E{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);//创建一个新的扫描仪，名字叫做input
		      	//int a=12345;	
			System.out.print("请输入一个五位整数");
			int a = input.nextInt();
				//个位
				int gw=a%10;
				int sw=a/10%10;
				int bw=a/100%10;
				int qw=a/1000%10;
				int ww=a/10000;
				System.out.println("个位"+gw);
				System.out.println("十位"+sw);
				System.out.println("百位"+bw);
				System.out.println("千位"+qw);
				System.out.println("万位"+ww);
	}
}
//import java.util.Scanner;