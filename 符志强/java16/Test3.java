package 作业;

import java.util.Scanner;

import java.util.Random;


public class Test3 {
	static MotoVehicle[] cars = new MotoVehicle[2];
	public static void main(String[] args) {
	
		Random s=new Random();
		int sj=s.nextInt();
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎来到汽车租赁公司");
		 String yn = null;
		do{
		System.out.print("请输入你要租赁的天数");
		int a=input.nextInt();
		System.out.print("请输入你要租赁汽车的类型：（1.轿车 2.客车   其他.卡车）");
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
        
		System.out.println("是否继续租车（y/n）");
        yn= input.next();
		}while(yn.equals("y"));
		System.out.println("您的订车的数量为：");
		System.out.println("车牌\t\t\t品牌");
        for(int i=0;i<cars.length;i++) {
            if(cars[i]!=null) {
                if(cars[i] instanceof  Car) {
                    Car car = (Car) cars[i];
                    System.out.println("湘："+car.getNo()+"\t\t"+car.brand);
                }else
                if(cars[i] instanceof  Bus) {
                	Bus bus = (Bus) cars[i];
                    System.out.println("\t湘："+bus.getNo()+"\t\t"+bus.brand);
                }else
                    if(cars[i] instanceof  Kache) {
                    	Kache kache = (Kache) cars[i];
                        System.out.println("\t湘："+kache.getNo()+"\t\t"+kache.brand);
                    }
            }
        }
	}
	public static void rentMutilMotoVechicle(MotoVehicle car) {
        //保存这台car---有多少台车就定义多大的数组
        for(int i=0;i<cars.length;i++) {
            if(cars[i]==null) {
                cars[i]=car;
                break;
            }
        }
    }
}
