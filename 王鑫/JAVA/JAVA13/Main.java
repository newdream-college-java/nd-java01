package Test2019_3_6_z13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\t��ʮ���µ���ҵ��ţ�����");
		System.out.println("\t\t1:CustmerBiz");
		System.out.println("\t\t2:Person");
		System.out.println("\t\t3:Students");
		System.out.println("\t\t4:Account");
		System.out.println("\t\t5:Dy");
		System.out.println("\t\t6:MathEmatical");
		System.out.println("\t\t7:counter");
		System.out.println("\t\t��ѡ��(0)");
		System.out.print("��������ţ�");
		int n = input.nextInt();
		switch(n){
			case 1:{
				CustmerBiz cb = new CustmerBiz();
				cb.insert();
				cb.show();
				break;
			}case 2:{
				System.out.println("--------��Ա��Ϣ--------");
				Person pe = new Person();
				pe.Person();
				break;
			}case 3:{
				Students stu = new Students();
				stu.insertStudents();
				stu.showStudents();
				stu.reviseStudents();
				break;	
			}case 4:{
				Account ac = new Account();
				do {
					System.out.println("1.��� 2.ȡ�� 0.�˳�");
					System.out.print("��ѡ������Ҫ�����ҵ��");
					n = input.nextInt();
					if (n==1) {
						System.out.print("���������");
						ac.ck(input.nextInt());						
					}else if (n==2) {
						System.out.println("������ȡ����");
						ac.qk(input.nextInt());	
					}else if (n!=0) {
						System.out.println("����������������룡��");
					}
				} while (n!=0);		
			}case 5:{
				System.out.print("�������У�");
				n = input.nextInt();
				System.out.print("�������ӡ���ַ���");
				String m = input.next();
				Dy dy = new Dy();
				dy.printTriangle(n,m);
				break;		
			}case 6:{
				MathEmatical me = new MathEmatical();
				System.out.print("��ѡ����Ҫ����Ķ�Ӧ�ı��(a-d,0����)��");
				String p = input.next();
				while (!p.equals("0")) {
					switch (p) {
					case "a"://����֮������ֵ
						System.out.print("�������һ��������");
						n=input.nextInt();
						System.out.print("������ڶ���������");
						int m= input.nextInt();
						System.out.println(n+" �� "+m+"֮�� "+me.a(n,m)+" ��� ");
						break;
					case "b"://�Ҹ�λ��
						System.out.print("������һ��������");
						n=input.nextInt();						
						System.out.println(me.b(n));
						break;
					case "c"://������
						System.out.print("������һ��������");
						n = input.nextInt();
						System.out.println(me.c(n));					;
						break;
					case "d"://1-n���ۼ�
						System.out.print("������һ��������");
						n = input.nextInt();
						System.out.println(me.d(n));
						break;
					}
					System.out.print("��ѡ����Ҫ����Ķ�Ӧ�ı��(a-d,0����)��");
					p = input.next();				
				}				
			}case 7:{
				System.out.print("�����������Ľ�");
				int money = input.nextInt();
				System.out.print("�������㻹�����ޣ�");
				int year = input.nextInt();
				Grant cou = new Grant(money, year);	
			}case 8:{
				//������
				String s = "a";
				while (!s.equals("n")) {
					System.out.print("�������һ���ߣ�");
					int i = input.nextInt();
					System.out.print("������ڶ����ߣ�");
					int j = input.nextInt();
					System.out.print("������������ߣ�");
					int k = input.nextInt();
					Triangle tri = new Triangle(i,j,k);	
					System.out.print("�����𣿣�y/n��:");
					s = input.next();
					while (!s.equals("n")&&!s.equals("y")) {
						System.out.print("����ȷ�����Ƿ������y/n����");
						s = input.next();
					}
				}
				System.out.println("ллʹ�ã�");
			}
		}
	}
}
