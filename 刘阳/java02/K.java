import java.util.Scanner;
public class K{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������һ������a:");
		int a =input.nextInt();
		System.out.print("������ڶ�������b:");
		int b =input.nextInt();
		System.out.println("����ǰa="+a+"\n"+"����ǰb="+b);
		int c=b;
		    b=a;
		    a=c;

		System.out.print("������a="+a+"\n"+"������b="+b);

	}

}