import java.util.Scanner;
public class E{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ����λ��");
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		int e=a/1000;
		System.out.println("��λ��"+b+"\nʮλ��"+c+"\n��λ��"+d+"\nǧλ��"+e);
}
}