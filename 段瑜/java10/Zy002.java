package Zy10;
import java.util.Scanner;
public class Zy002 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		Zy02 a=new Zy02();
		System.out.println("积分：");
		a.sum=input.nextInt();
		System.out.println("卡类型：");
		a.name=input.next();
		a.show();
	}
}
