package ��ҵ;

import java.util.Scanner;

public class Test3Biz {
	public static void main(String[] args){
		GustomerBiz a=new GustomerBiz();
		Scanner input=new Scanner(System.in);
		for(int i=0;i<a.names.length;i++){
			System.out.println("�����"+(i+1)+"��ѧ����������");
			String name=input.next();
			a.show(name);
		}
		a.show1();
		System.out.println();
		System.out.print("��������Ҫ�޸ĵ�ѧ��������");
		String name1=input.next();
		System.out.print("�������µ�ѧ��������");
		String name2=input.next();
		for (int i = 0; i < a.names.length; i++) {
			System.out.println("*******�޸Ľ��************");
			if(a.names[i].equals(name1)){
				a.names[i]=name2;
				System.out.println("�ҵ������޸ĳɹ�");
				System.out.println("*************************");
				break;
			}else{
				System.out.println("δ�ҵ��޸�ʧ��");
				System.out.println("*************************");
			}
		}
		System.out.println();
		a.show1();
		
	}
}
