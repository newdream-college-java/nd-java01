package Test2019_3_8_z14;

import java.util.Scanner;

public class PetShop_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��ӭ����������꣡");
		System.out.print("������Ҫ������������֣�");
		String name = input.next();
		String pz  = null;
		System.out.print("��ѡ��Ҫ������������ͣ�1.���� 2.��� 3.�� ");
		int lx = input.nextInt();
		if (lx==1) {
			System.out.print("�����빷����Ʒ�֣���1.��������������Ȯ 2.����ѩ����");
			pz = input.nextInt()==1?"��������������Ȯ":"����ѩ����";
			Dog_1 dog = new Dog_1();
			dog.print(name, pz);
		}else {
			System.out.print("����������Ʒ�֣���1.����� 2.��������죩");
			pz = input.nextInt()==1?"�����":"���������";
			Dog_1 dog = new Dog_1();
			dog.print(name, pz);
		}
	}
}
