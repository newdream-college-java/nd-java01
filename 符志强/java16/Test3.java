package ��ҵ;

import java.util.Scanner;

import java.util.Random;


public class Test3 {
	static MotoVehicle[] cars = new MotoVehicle[2];
	public static void main(String[] args) {
	
		Random s=new Random();
		int sj=s.nextInt();
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������޹�˾");
		 String yn = null;
		do{
		System.out.print("��������Ҫ���޵�����");
		int a=input.nextInt();
		System.out.print("��������Ҫ�������������ͣ���1.�γ� 2.�ͳ�   ����.������");
		int b=input.nextInt();
		switch (b) {
		case 1:
			
			Car c1=new Car(sj);
			c1.calcRent(a);
			rentMutilMotoVechicle(c1);
			break;
		case 2:
			Bus	b1=new Bus(sj);
			b1.calcRent(a);
			rentMutilMotoVechicle(b1);
			break;
		default:
			Kache k1=new Kache(sj);
			k1.calcRent(a);
			rentMutilMotoVechicle(k1);
			break;
		}
        
		System.out.println("�Ƿ�����⳵��y/n��");
        yn= input.next();
		}while(yn.equals("y"));
		System.out.println("���Ķ���������Ϊ��");
		System.out.println("����\t\t\tƷ��");
        for(int i=0;i<cars.length;i++) {
            if(cars[i]!=null) {
                if(cars[i] instanceof  Car) {
                    Car car = (Car) cars[i];
                    System.out.println("�棺"+car.getNo()+"\t\t"+car.brand);
                }else
                if(cars[i] instanceof  Bus) {
                	Bus bus = (Bus) cars[i];
                    System.out.println("\t�棺"+bus.getNo()+"\t\t"+bus.brand);
                }else
                    if(cars[i] instanceof  Kache) {
                    	Kache kache = (Kache) cars[i];
                        System.out.println("\t�棺"+kache.getNo()+"\t\t"+kache.brand);
                    }
            }
        }
	}
	public static void rentMutilMotoVechicle(MotoVehicle car) {
        //������̨car---�ж���̨���Ͷ����������
        for(int i=0;i<cars.length;i++) {
            if(cars[i]==null) {
                cars[i]=car;
                break;
            }
        }
    }
}
