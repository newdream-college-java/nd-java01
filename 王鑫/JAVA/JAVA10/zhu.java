package Test2019_3_3_��ʮ��;

import java.util.Scanner;

public class zhu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		manager man = new manager();
		manager2 man2 = new manager2();
		man.show();
		man2.show();
		System.out.print("�˺ţ�");
		String name = input.next();
		System.out.print("���룺");
		String password = input.next();
		do {
			if (name.equals(man.name)) {
				System.out.print("�����������룺");
				man.password = input.next();
				System.out.print("�޸�����ɹ���������Ϊ��"+man.password);
				break;
			}else{
				System.out.println("�û��������벻ƥ�䣡����û�й���Ա��Ϣ��");
			}
			System.out.print("�˺ţ�");
			name = input.next();
			System.out.print("���룺");
			password = input.next();
		} while (true);
		
		
	}
}
