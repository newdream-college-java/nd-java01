package com.java.java16;
import java.util.Random;
import java.util.Scanner;
public class Test2 {
	static Che[] arr=new Che[100];
		public static void main(String[] args) {	
			Scanner input=new Scanner(System.in);
			Random rd=new Random();
			String a=null;
			
			int sum=0;
			System.out.print("��������������");
			String name=input.next();
			System.out.print("��������������");
			int day=input.nextInt();
			do{
				int b=rd.nextInt(89999)+10000;
				System.out.print("����������(1���γ�      2���ͳ�    3������)");
				int lx=input.nextInt();
				if(lx==1){					
					Car car=new Car();
					car.setDay(day);
					System.out.print("������Ʒ��(1������      2�����)");				
					int brand=input.nextInt();				
					if(brand==1){
						car.setBrand("����");
						car.setXh("550i");
						car.setNumber("��A"+b);
						sum=sum+car.getDay()*500;
					}else if(brand==2){
						car.setBrand("���");
						System.out.print("�������ͺ�(1�������GL8   2��������)");
						int xh=input.nextInt();
						if(xh==1){
							car.setXh("�����GL8");
							car.setNumber("��A"+b);
							sum=sum+car.getDay()*600;
						}else if(xh==2){
							car.setXh("������");
							car.setNumber("��A"+b);
							sum=sum+car.getDay()*300;
						}
						
					}
					print1(car);
				}else if(lx==2){
					Bus bus=new Bus();
					bus.setDay(day);
					System.out.println("������Ʒ��(1����     2������)");				
					int brand=input.nextInt();				
					if(brand==1){
						bus.setBrand("��");
						System.out.println("�����복����λ��");
						int zw=input.nextInt();
						if(zw>16){
							bus.setZw(zw);
							bus.setNumber("��A"+b);
							sum=sum+bus.getDay()*1500;
						}else if(zw<=16){
							bus.setZw(zw);
							bus.setNumber("��A"+b);
							sum=sum+bus.getDay()*800;
						}
					}else if(brand==2){
						bus.setBrand("����");
						System.out.println("�����복����λ��");
						int zw=input.nextInt();
						if(zw>16){
							bus.setZw(zw);
							bus.setNumber("��A"+b);
							sum=sum+bus.getDay()*1500;
						}else if(zw<=16){
							bus.setZw(zw);
							bus.setNumber("��A"+b);
							sum=sum+bus.getDay()*800;
						}
						
					}
					print1(bus);
				}else if(lx==3){
					Lorry lorry=new Lorry();
					lorry.setDay(day);
					System.out.println("������Ʒ��(1�������ղ�     2���������)");				
					int brand=input.nextInt();				
					if(brand==1){
						lorry.setBrand("�����ղ� ");
						System.out.println("�����복�Ͷ�λ");
						int dun=input.nextInt();
						lorry.setDun(dun);
						lorry.setNumber("��A"+b);
						sum=sum+lorry.getDay()*50*dun;
					}else if(brand==2){
						lorry.setBrand("�����ղ� ");
						System.out.println("�����복�Ͷ�λ");
						int dun=input.nextInt();
						lorry.setDun(dun);
						lorry.setNumber("��A"+b);
						sum=sum+lorry.getDay()*50*dun;
						
					}
					print1(lorry);
				}
				System.out.println("�Ƿ��������(y/n)");
				a=input.next();
			}while(a.equals("y"));
			System.out.println("�����ƺ�\t\t����Ʒ��");
			for(int i=0;i<arr.length;i++) {
		        if(arr[i]!=null) {
			        if(arr[i] instanceof  Car) {
				        Car car = (Car) arr[i];
				        System.out.println(car.getNumber()+"\t\t"+car.getBrand());
				        
			        }else if(arr[i] instanceof Bus){
			        	Bus bus = (Bus) arr[i];
				        System.out.println(bus.getNumber()+"\t\t"+bus.getBrand());
			        }else if(arr[i] instanceof Lorry){
			        	Lorry lorry = (Lorry) arr[i];
				        System.out.println(lorry.getNumber()+"\t\t"+lorry.getBrand());
			        }
		        }
		    }
			System.out.println("\n\n�ͻ�����"+name+",����������"+day+"�������ܷ��ã�"+sum);
		}
		
	public static void print1(Che car){			
			for(int i=0;i<arr.length;i++){
				if(arr[i]==null){
					arr[i]=car;
					break;
				}
			}
	}
}

