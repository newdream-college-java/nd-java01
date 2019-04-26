package 作业;

import java.util.Scanner;
import java.util.Random;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Random s=new Random();
		int sj=s.nextInt();
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司");
		System.out.print("请输入你要租赁的天数");
		int a=input.nextInt();
		System.out.print("请输入你要租赁汽车的类型：（1.轿车  其他.客车）");
		int b=input.nextInt();
		switch (b) {
		case 1:
			
			Car c1=new Car(sj);
			c1.calcRent(a);
			break;
		default:
			Bus	b1=new Bus(sj);
			b1.calcRent(a);
			break;
		}
		
	}

}
