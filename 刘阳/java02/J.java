import java.util.Scanner;
public class J{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("������һ����λ��������");
	int a = input.nextInt();
	//��λ��
	int gw=a%10;
	//ʮλ��
	int sw=a/10%10;
	//��λ��
	int bw=a/100%10;
	//ǧλ��
	int qw=a/1000%10;
	System.out.print("��λ����"+gw+"\n"+"ʮλ����"+sw+"\n"+"��λ����"+bw+"\n"+"ǧλ����"+qw);


	}




}