//����һ��������������n��Сʱ������n��Сʱ���ڶ���������ٸ�Сʱ����������
//25����ô�����1����1��Сʱ��
import java.util.Scanner;
public class L{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("������Сʱ��");
		int a=input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.println(a+"��Сʱ����"+b+"��"+c+"��Сʱ");
	}
}