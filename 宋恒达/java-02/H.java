//��������С��������a��b�У����ʵ��a��b�����е�ֵ�Ľ���
//������a��b�е�ֵ
import java.util.Scanner;
public class H{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��С��a");
		double a=input.nextDouble();
		System.out.println("������һ��С��b");
		double b=input.nextDouble();
		double c=a;
		a=b;
		b=c;
		System.out.println("a��b������a��ֵΪ"+a+",b��ֵΪ"+b);		
	}
}