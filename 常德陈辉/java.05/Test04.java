/*ѭ���ʡ�������ֽ�ʲô����������ش���ǡ��������㡱���ͼ����ʣ�����������������ԭ���У�**�������ʵ�֡�*/
import java.util.Scanner;
public class Test04{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("���ʲô����?");
	String name=input.next();
	for(;name.equals("��������");){
		System.out.println("���ʲô����?");
		name=input.next();
		}
	System.out.print("ԭ��������ֽУ�**");
	}

}