package ��ʮ������ҵ;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	Scanner input=new Scanner(System.in);
	public Student(){
		String[] student=new String[5];
		for(int i=0;i<5;i++){
			System.out.print("������ͻ�����:");
			student[i]=input.next();
		}
		System.out.println("***********************");
		System.out.println("\t�ͻ������б�");
		System.out.println("***********************");
		System.out.println(Arrays.toString(student)+"\n");
		System.out.println("������Ҫ�޸ĵĿͻ�������");
		String b=input.next();
		for(int i=0;i<student.length;i++){
			if(b.equals(student[i])){
				System.out.println("�������µĿͻ���������");
				String c=input.next();
				student[i]=c;
				System.out.println("�ҵ����޸ĳɹ�");
			}
		}
		System.out.println("***********************");
		System.out.println("\t�ͻ������б�");
		System.out.println("***********************");
		System.out.println(Arrays.toString(student)+"\n");
	}
}
