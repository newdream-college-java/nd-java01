package ��ҵ;

import java.util.Scanner;

public class Gustomer {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		GustomerBiz a=new GustomerBiz();
		String yn;
		int i=0;
		do{
			System.out.println("�����"+(i+1)+"��ѧ����������");
			String name=input.next();
			a.show(name);
			System.out.print("�Ƿ����¼�루y/n����");
			a.yn=input.next();
			i++;
		}while(a.yn.equals("y")&&i<a.names.length);
		a.show1();
	}

}
