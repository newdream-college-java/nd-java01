package ��15�¼̳���ҵ____2��������;

import java.util.Scanner;



public class TestMotoVehicle {
	Scanner input = new Scanner(System.in);
	MotoVehicle[] arr = new MotoVehicle[2];

	int days;//��Ϊ���� MotoVehicle �ǳ�����
	//Bus bus=new Bus(busBrand, seats, price, days);//�����ﶨ��Ϊ��Ա����
	//Car car = new Car(0, 0, null);//�����ﶨ��Ϊ��Ա����,�����޷������������顣
	
	public void initial(){
		String answer;
		System.out.println("��ӭ�����������޹�˾\n��ѡ������ģʽ��1.����һ����\t2.���޶�������");
		int choice = input.nextInt();
		if(choice==1){
			//����һ����
			//setDays();
			System.out.println("������Ҫ���޵�����");
			days=input.nextInt();
			//choiceMotoType();
			System.out.println("������Ҫ���޵��������ͣ�1.�γ�\t2.�ͳ�\t3.������");
			choice =input.nextInt();
			if(choice==1){
				//�γ�����
				//choiceCarBrand();
				System.out.println("������Ҫ���޵�����Ʒ�ƣ�1.����\t2.��ˣ�");
				choice=input.nextInt();
				if(choice==1){
					//����Ǳ���ֱ�ӵ��ù��췽����������
					Car car = new Car(500, days, "����");
					car.calculateRent();
					car.show();
					car.setBrand("����");
				}else{
					//���
					//ѡ���˵��ͺţ�������д����ֱ��ִ��
					System.out.println("������γ����ͺţ�2.�����GL8\t3.��������");
					int choiceBieKe=input.nextInt();
					if(choiceBieKe==2){
						Car car =new Car(600, days, "��������GL8");
						car.calculateRent();
						car.show();
						car.setBrand("��������GL8");
					}else{
						Car car =new Car(300, days, "���������");
						car.calculateRent();
						car.show();
						car.setBrand("���������");
					}
				}
			}else if(choice==2){
				//�ͳ�����
				//choiceBusBrand();
				System.out.println("������Ҫ�������������ͣ�1.��<=16��\t2.����>16����");
				int choiceBusBrand = input.nextInt();
				if(choiceBusBrand==1){
					//��<=16��
					Bus bus=new Bus("��", "<=16��", 800, days);
					bus.calculateRent();
					bus.setBrand("��");
					bus.show();
				}else{
					Bus bus=new Bus("����", ">16��", 1600, days);
					bus.calculateRent();
					bus.show();
					bus.setBrand("����");
				}
			}else{
				//����
				System.out.println("������Ҫ���ػ��������(��)");
				int weight=input.nextInt();
				Truck truck = new Truck("����", 50,weight,days);
				truck.calculateRent();
				truck.show();
				truck.setBrand("����");
			}
		}else{
			//����һ�������������������int[] arr = new int[2]
			MotoVehicle[] arr=new MotoVehicle[2];
			do{
				//setDays();
				System.out.println("������Ҫ���޵�����");
				days=input.nextInt();
				//choiceMotoType();		
				System.out.println("������Ҫ���޵��������ͣ�1.�γ�\t2.�ͳ�\t3.������");
				choice =input.nextInt();
				if(choice==1){
					//�γ�����choiceCarBrand();
					System.out.println("������Ҫ���޵�����Ʒ�ƣ�1.����\t2.��ˣ�");
					choice=input.nextInt();
					if(choice==1){
						//����Ǳ���ֱ�ӵ��ù��췽����������
						Car car = new Car(500, days, "����");
						car.calculateRent();
						car.show();
						car.setBrand("����");
						addMotoVichle(car);
					}else{
						//���
						//ѡ���˵��ͺţ�������д����ֱ��ִ��
						System.out.println("������γ����ͺţ�2.�����GL8\t3.��������");
						int choiceBieKe=input.nextInt();
						if(choiceBieKe==2){
							Car car =new Car(600, days, "��������GL8");
							car.calculateRent();
							car.show();
							car.setBrand("��������GL8");
							addMotoVichle(car);
						}else{
							Car car =new Car(300, days, "���������");
							car.calculateRent();
							car.show();
							car.setBrand("���������");
							addMotoVichle(car);
						}
					}
				}else if(choice==2){
					//�ͳ�����choiceBusBrand();
					System.out.println("������Ҫ�������������ͣ�1.��<=16��\t2.����>16����");
					int choiceBusBrand = input.nextInt();
					if(choiceBusBrand==1){
						//��<=16��
						Bus bus=new Bus("��", "<=16��", 800, days);
						bus.calculateRent();
						bus.setBrand("��");
						bus.show();
						addMotoVichle(bus);
					}else{
						Bus bus=new Bus("����", ">16��", 1600, days);
						bus.calculateRent();
						bus.show();
						bus.setBrand("����");
						addMotoVichle(bus);
					}
				}else{
					System.out.println("������Ҫ���ػ��������(��)");
					int weight=input.nextInt();
					Truck truck = new Truck("����", 50,weight,days);
					truck.calculateRent();
					truck.show();
					truck.setBrand("����");
					addMotoVichle(truck);
				}
				System.out.println("Ҫ�����⳵�𣿣�y/n��");
				answer=input.next();
			}while(answer.equals("y"));
			//for(int i=0;i<arr.length;i++){
				//System.out.println(arr[i].getNumber()+"\t\t"+arr[i].getBrand());
		//	}
				showMotos();
				showSumPay();
		}
	}
	public void showSumPay(){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].getMoney()!=0){
				sum+=arr[i].getMoney();
			}
		}
		System.out.println("������Ҫ֧��"+sum);
	}
	public void addMotoVichle(MotoVehicle m){
		// int[] arr = new int[5]
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null){
				arr[i]=m;
				break;
				//����������ж�һ�Σ���д��
			}
		}
	}
	public void showMotos(){
		System.out.println("����Ʒ��\t\t���ƺ�");
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null){
				System.out.println(arr[i].getBrand()+"\t\t"+arr[i].getNumber());
			}
		}
	}

}
