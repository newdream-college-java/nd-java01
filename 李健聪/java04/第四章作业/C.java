import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("�������������");
		int sr=input.nextInt();
		switch(sr){
			case 1:
			System.out.println("��ϲ�㣬�㽫�μ���ʡ����ѧ��֯��һ��������Ӫ");
			break;
			case 2:
			System.out.println("��ϲ�㣬�㽫��û��ձʼǱ�����һ��");
			break;
			case 3:
			System.out.println("��ϲ�㣬�㽫�ƶ�Ӳ��һ��");
			break;
			default:
			System.out.println("��ϲ�㣬�㽫����ȥ����ѧϰ");
			
		}
		
	}
} 