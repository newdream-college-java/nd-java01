/*����һ��������������n��Сʱ������n��Сʱ���ڶ���������ٸ�Сʱ����������25����ô�����1����1��Сʱ��*/
import java.util.Scanner;
public class Ah{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������һ������:");
		int a=input.nextInt();
		int b,c;
		b=a/24;
		c=a%24;
		System.out.print(b+"����"+c+"��Сʱ");
	}
}