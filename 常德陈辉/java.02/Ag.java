/*�����������������뵽��������a��b�У���̽�a��b�е�ֵ�����������*/
import java.util.Scanner;
public class Ag{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������������ֵa=");
		int a=input.nextInt();
		System.out.print("������������ֵb=");
		int b=input.nextInt();
		System.out.println("����ǰa="+a+"\tb="+b);
		int c;
		c=a;
		a=b;
		b=c;
		System.out.print("������");
		System.out.print("a="+a+"\tb="+b);
	}
}