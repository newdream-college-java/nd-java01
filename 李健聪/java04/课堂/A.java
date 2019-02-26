import java.util.Random;
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Random rd = new Random();
		int num =rd.nextInt();//随机产生整数
		System.out.println(num);
		int num1=rd.nextInt(235);//产生一个0-235的数字  想要11-234的随机数  就要每个数减去11
		System.out.println(num1-11);
	}
}