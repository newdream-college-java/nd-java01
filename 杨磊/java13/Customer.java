//1�ͻ���/ѧ����
package com.newderam.yl;

import java.util.Scanner;

public class Customer {
		String[] name = new String[999999];
		//���
		public void add(){
			Scanner input = new Scanner(System.in);
			boolean flag = false;
			String b=" ";
			int l = 0;
			do{
				for(int i=0;i<name.length;i++){
					if(name[i]==null){
						System.out.println("������ͻ������֣�");
						String a = input.next();
						name[i] = a;
						flag = true;
						System.out.println("��ӿͻ��ɹ���");
						break;
					}
					if(!flag){
						System.out.println("��ӿͻ�ʧ�ܣ�");
					}
				}
				System.out.println("������������������y��");
				b = input.next();
				l++;
			}while(b.equals("y")&&l<name.length);	
		}
		
		//��ʾ
		public void display(){
			int l=0;
			System.out.println("\t\t�ͻ������б�\n\n");
			for(int i=0;i<name.length;i++){
				if(name[i]!=null){
					System.out.print(name[i]+"\t");
					l++;
				}
				if(l%4==0){
					System.out.println();
				}
			}
			System.out.println();
		}
		public void revise(){
			Scanner input = new Scanner(System.in);
			boolean flag = false;
			System.out.print("������Ҫ�޸ĵĿͻ�����:");
			String name1 = input.next();
			System.out.print("�������޸ĺ�Ŀͻ�����:");
			String name2 = input.next();
			
			
			
			for(int i=0;i<name.length;i++){
				if(name[i]!=null&&name[i].equals(name1)){
					name[i]=name2;
					flag = true;
					System.out.println("�ҵ����޸ĳɹ���");
					break;
					
				}
			}
				
			
			
			if(!flag){
				System.out.println("������˼��û����˸Ĳ��ˣ�");
			}
			
		}
		
}
