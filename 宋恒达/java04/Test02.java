/**
**����ȥ���ң������3�����£��ϰ�Ͳ����ң������3����5��������һ���ң������
**5�����Ͼ���2���ң�����Ҫ��������ӵ����������������������˼�����
**/
import java.util.Scanner;
public class Test02{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("��������ӵ�������:");
		int a=input.nextInt();
		switch(a/3){
			case 0:
				System.out.println("������");
				break;
			case 1:
				System.out.println("��һ����");
				break;
			default:
				System.out.println("��������"); 
		}	
	}
}