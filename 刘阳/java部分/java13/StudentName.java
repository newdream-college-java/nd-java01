package zuoye;

import java.util.Scanner;

public class StudentName {
	String[] names=new String[5];
	String name;
	public void addname(){
		Scanner input=new Scanner(System.in);
		for(int i=0;i<names.length;i++){
			System.out.println("�������"+(i+1)+"��ѧ����������");
			names[i]=input.next();
		}
		System.out.println("************************************");
		System.out.println("\t\t�ͻ������б�\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
		System.out.println();
	}
	public void change(){
		Scanner input=new Scanner(System.in);
		int jilu=0;
		//��ʾ�����޸ĵ�����
		System.out.println("������Ҫ�޸ĵĿͻ�������");
		name=input.next();
		for(int i=0;i<names.length;i++){
			if(name.equals(names[i])){
				jilu=i;
			}
		}
		//��ʾ�����µĵ�����
		System.out.println("�������µĿͻ�������");
		String name01=input.next();
		names[jilu]=name01;
		System.out.println("************************************");
		System.out.println("\t\t�ͻ������б�\t\t");
		System.out.println("************************************\n");
		for(int i=0;i<names.length;i++){
			System.out.print(names[i]+"\t");
		}
	}
}
