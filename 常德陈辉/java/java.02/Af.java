/*����һ����λ����������Ҫ���̽������λ���ĸ�λ��ʮλ����λ��ǧλ�ֱ������*/
import java.util.Scanner;
public class Af{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ����λ����:");
		int a=input.nextInt();
		int g,s,b,q;
		g=a%10;
		s=a/10%10;
		b=a/100%10;
		q=a/1000%10;
		System.out.print("��λΪ:"+g+"\nʮλΪ:"+s+"\n��λΪ:"+b+"\nǧλΪ:"+q);
	}
}