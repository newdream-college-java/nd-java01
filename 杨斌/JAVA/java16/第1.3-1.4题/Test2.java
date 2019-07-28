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
			System.out.print("请输入您的姓名");
			String name=input.next();
			System.out.print("请输入租赁天数");
			int day=input.nextInt();
			do{
				int b=rd.nextInt(89999)+10000;
				System.out.print("请输入类型(1、轿车      2、客车    3、卡车)");
				int lx=input.nextInt();
				if(lx==1){					
					Car car=new Car();
					car.setDay(day);
					System.out.print("请输入品牌(1、宝马      2、别克)");				
					int brand=input.nextInt();				
					if(brand==1){
						car.setBrand("宝马");
						car.setXh("550i");
						car.setNumber("湘A"+b);
						sum=sum+car.getDay()*500;
					}else if(brand==2){
						car.setBrand("别克");
						System.out.print("请输入型号(1、商务舱GL8   2、林荫大道)");
						int xh=input.nextInt();
						if(xh==1){
							car.setXh("商务舱GL8");
							car.setNumber("湘A"+b);
							sum=sum+car.getDay()*600;
						}else if(xh==2){
							car.setXh("林荫大道");
							car.setNumber("湘A"+b);
							sum=sum+car.getDay()*300;
						}
						
					}
					print1(car);
				}else if(lx==2){
					Bus bus=new Bus();
					bus.setDay(day);
					System.out.println("请输入品牌(1、金杯     2、金龙)");				
					int brand=input.nextInt();				
					if(brand==1){
						bus.setBrand("金杯");
						System.out.println("请输入车型座位数");
						int zw=input.nextInt();
						if(zw>16){
							bus.setZw(zw);
							bus.setNumber("湘A"+b);
							sum=sum+bus.getDay()*1500;
						}else if(zw<=16){
							bus.setZw(zw);
							bus.setNumber("湘A"+b);
							sum=sum+bus.getDay()*800;
						}
					}else if(brand==2){
						bus.setBrand("金龙");
						System.out.println("请输入车型座位数");
						int zw=input.nextInt();
						if(zw>16){
							bus.setZw(zw);
							bus.setNumber("湘A"+b);
							sum=sum+bus.getDay()*1500;
						}else if(zw<=16){
							bus.setZw(zw);
							bus.setNumber("湘A"+b);
							sum=sum+bus.getDay()*800;
						}
						
					}
					print1(bus);
				}else if(lx==3){
					Lorry lorry=new Lorry();
					lorry.setDay(day);
					System.out.println("请输入品牌(1、东风日产     2、东风风神)");				
					int brand=input.nextInt();				
					if(brand==1){
						lorry.setBrand("东风日产 ");
						System.out.println("请输入车型吨位");
						int dun=input.nextInt();
						lorry.setDun(dun);
						lorry.setNumber("湘A"+b);
						sum=sum+lorry.getDay()*50*dun;
					}else if(brand==2){
						lorry.setBrand("东风日产 ");
						System.out.println("请输入车型吨位");
						int dun=input.nextInt();
						lorry.setDun(dun);
						lorry.setNumber("湘A"+b);
						sum=sum+lorry.getDay()*50*dun;
						
					}
					print1(lorry);
				}
				System.out.println("是否继续租赁(y/n)");
				a=input.next();
			}while(a.equals("y"));
			System.out.println("汽车牌号\t\t汽车品牌");
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
			System.out.println("\n\n客户名："+name+",租赁天数："+day+"，租赁总费用："+sum);
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

