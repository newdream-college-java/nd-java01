import java.util.Scanner;
public class A{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("������һ����λ��������");
	int a = input.nextInt();
	int b =a%10;
	int c =a/10%10;
	int d =a/100%10;
	int e =a/1000%10;
	System.out.println("�������ĸ�λʮλ��λǧλ�ֱ�Ϊ");
	System.out.println("��λ"+b+"\tʮλ"+c+"\t��λ"+d+"\tǧλ"+e);
	}
}