//��������������������������a��b�У���̽�a��b�е�ֵ���н����������
import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ������a");
		int a=input.nextInt();
		System.out.println("������һ������b");
		int b=input.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("a��bֵ������a��ֵΪ"+a+"��b��ֵΪ"+b);
	}
}