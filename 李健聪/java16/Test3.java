package ʮ������ҵ;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		int b;
		String name;
		int sum=0;
		String c;
		Scanner input=new Scanner(System.in);
		Moto[] car=new Moto[2];
		
		
		for(int i=0;i<car.length;i++){
			System.out.println("��ӭ�����⳵ϵͳ");
			System.out.println("��������������");
			name=input.next();
			System.out.println(name+"������ѡ����Ҫ���õĳ���  1.�γ�  2.���");
			int a=input.nextInt();
			if(a==1){
				System.out.println("��ѡ����Ҫ���޵�Ʒ��  1.���  2.����");
				b=input.nextInt();
				if(b==1){
					System.out.println("��ѡ����Ҫ����ͺ�  1.������  2.GT8");
					c=input.next();
					Moto car1=new Car("��B68866", "���", c);
					System.out.println("��������Ҫ�������");
					car1.Ts(input.nextInt());
					sum+=0;
					if(car[i]==null){
						car[i]=car1;
					}
					
				}else if(b==2){
					System.out.println("��ѡ����Ҫ����ͺ� 3.������ϵ");
					c=input.next();
					Moto car1=new Car("��B6996", "����", c);
					System.out.println("��������Ҫ�������");
					car1.Ts(input.nextInt());
					sum+=0;
					if(car[i]==null){
						car[i]=car1;
					}
					
				}
			}else if(a==2){
				System.out.println("��������ĳ�������");
				int seatCount=input.nextInt();
				Moto car1=new Bus("��A88888","���",seatCount);
				System.out.println("��������Ҫ���޵�����");
				car1.Ts(input.nextInt());
				
				if(car[i]==null){
					car[i]=car1;
				}
			}
			
			if(i<1){
				System.out.println("���ʻ�Ҫ�����⳵��(y/n)");
				String n=input.next();
				if(n.equals("y")){
					continue;
				}else if(n.equals("n")){
					break;
				}
			}
			
		}
			for(int i=0;i<car.length;i++){
				System.out.println(car[i]+"�ܽ��Ϊ"+sum);
			}
		
		
		
	}
}
