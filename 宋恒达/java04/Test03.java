/**
**���̲μӼ������̴���
**�����õ�1�������μ���ʡ���ѧ��֯��1��������Ӫ
**�����õ�2�������������ձʼǱ�����һ��
**�����õ�3�����������ƶ�Ӳ��һ��
**���򣬲����κν���
**/
import java.util.Scanner;
public class Test03{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("���̻�ü������̴����ڼ���:");
		String a=input.next();
		switch(a){
			case "��1��":
				System.out.println("�μ���ʡ����ѧ��֯��1��������Ӫ");
				break;
			case "��2��":
				System.out.println("�������ձʼǱ�����һ̨");
				break;
			case "��3��":
				System.out.println("�����ƶ�Ӳ��һ��");
				break;
			default:
				System.out.println("�����κν���");
		}
	}
}