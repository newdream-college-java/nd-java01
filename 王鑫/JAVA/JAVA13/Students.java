package Test2019_3_6_z13;

import java.util.Scanner;

public class Students {
	String[] name = new String[5];
	public void insertStudents(){
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < name.length; i++) {
			System.out.print("������ͻ�������");
			name[i] = input.next();
		}
	}
	public void showStudents(){
		System.out.println("*********************");
		System.out.println("\t�ͻ������б�");
		System.out.println("*********************");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i]+"\t");
		}
	}
	public void reviseStudents(){
		Scanner input = new Scanner(System.in);
		System.out.print("\n������Ҫ�޸ĵĿͻ�������");
		String s = input.next();
		for (int i = 0; i < name.length; i++) {
			if (s.equals(name[i])) {
				System.out.print("�������µĿͻ�������");
				name[i]=input.next()																																								;
				break;
			}
			if (i+1==name.length) {
				System.out.println("δ�ҵ�"+s+"���û�������");
				System.out.println("������������Ҫ�޸ĵĿͻ�������");
				s = input.next();
				i=-1;
			}
		}
		System.out.println("*****�޸Ľ��*****");
		System.out.println("�ҵ����޸ĳɹ�");
		showStudents();
	}
}
