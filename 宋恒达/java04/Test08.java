/**
**	���ʵ�������������֧��+��-��*��/���ӿ���̨����2���������������������
**/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner	input=new Scanner(System.in);
		System.out.println("1.\t+");
		System.out.println("2.\t-");
		System.out.println("3.\t*");
		System.out.println("3.\t/");
		System.out.println();
		System.out.print("��ѡ����Ҫִ�еĲ���������ǰ������֣�\t");
		int a=input.nextInt();
		System.out.println("����������������");
		double b=input.nextDouble();
		double c=input.nextDouble();
		switch(a){
			case 1:
				System.out.println(b+" + "+c+" = "+(b+c));
				break;
			case 2:
				System.out.println(b+" - "+c+" = "+(b-c));
				break;
			case 3:
				System.out.println(b+" * "+c+" = "+(b*c));
				break;
			case 4:
				System.out.println(b+" / "+c+" = "+(b/c));
				break;
			default:
				System.out.println("�޷����д�����");
		}
	}
}