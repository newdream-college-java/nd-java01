import java.util.Random;
import java.util.Scanner;
public class A{
	public static void main(String[] args){
		Random rd = new Random();
		int num =rd.nextInt();//�����������
		System.out.println(num);
		int num1=rd.nextInt(235);//����һ��0-235������  ��Ҫ11-234�������  ��Ҫÿ������ȥ11
		System.out.println(num1-11);
	}
}