//ѭ��Ҫ�ʡ�������ֽ�ʲô����������ش𡰲������㡱���ͼ����ʣ�����������������ԭ���У�**�������ʵ�֡�

import java.util.Scanner;
public class D{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("������ֽ�ʲô?");
		String name = input.next();
		while(name.equals("��������")){
		System.out.println("������ֽ�ʲô?");
		name = input.next();
		}
		System.out.print("ԭ��������ֽ�"+name);
	}
}