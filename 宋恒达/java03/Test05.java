/**
**�������� int �͵����ݣ����뵽 a,b,c ����������ȥ��ʹ�������ṹ�뽻���߼��� 
**�����������е�ֵ��С�������С� 
**/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������");
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int temp=-1;
		if(a>b){
			temp=a;
			a=b;
			b=temp;
		}
		if(a>c){
			temp=a;
			a=c;
			c=temp;
		}
		if(b>c){
			temp=b;
			b=c;
			c=temp;
		}
		System.out.println(c+">"+b+">"+a);
	}
}