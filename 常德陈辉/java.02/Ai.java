/*����һ����λ�����ֱ���뵽3�������У���̽������������з�ֵ�������������������123���������뵽a��b��c����ȥ��������a��b��c��ֵ��Ҫ�����231*/
import java.util.Scanner;
public class Ai{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.print("������һ����λ��");
	int n=input.nextInt();
	int a,b,c,d;
	a=n/100%10;
	b=n/10%10;
	c=n%10;
	d=a;
	a=b;
	b=c;
	c=d;
	System.out.print("������"+a+b+c);
	}

}