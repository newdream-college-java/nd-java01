/*��������С��������a,b�У����ʵ��a��b�����е�ֵ������������a��b�е�ֵ��double*/
import java.util.Scanner;
public class AD{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		//��ʾdouble
		System.out.print("��������ֵa=");
		double a=input.nextDouble();
		System.out.print("��������ֵb=");
		double b=input.nextDouble();
		System.out.println("����ǰa="+a+"\tb="+b);
		double c;
		c=a;
		a=b;
		b=c;
		System.out.print("������");
		System.out.println("a="+a+"\tb="+b);
		
	}

}