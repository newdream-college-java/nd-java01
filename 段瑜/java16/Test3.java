package 汽车租借系统;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
	static MotoVehicle[] cars = new MotoVehicle[100];
	
	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Random rd=new Random();		
        String answer = null;
        int moneys=0;
        int no;
        System.out.println("请输入租赁多少天");
        int day=input.nextInt();
        do {
            System.out.print("请输入要租赁的汽车类型（1.汽车 2.客车 3.货车）：");
            int a=input.nextInt();
    		no=rd.nextInt(9000)+1000;
    		switch(a){
    			case 1:
    				Car car=new Car();
    				System.out.print("请输入要租赁的汽车类型（1.宝马 2.别克）："); 
    				car.setNo("湘A.A"+no);
    				a=input.nextInt();
    				switch(a){
    					case 1:
    						System.out.println("分配给您的车牌号是："+car.getNo());
    						car.setType("宝马550i");
    						car.setMoney(500);
    						break;
    					case 2:
    						System.out.print("请输入轿车的型号2、商务舱GL8 3、林荫大道:");
    						a=input.nextInt();
    						switch(a){
    							case 2:
    								System.out.println("分配给您的车牌号是："+car.getNo());
    								car.setType("商务舱GL8");
    								car.setMoney(600);
    								break;
    							case 3:
    								System.out.println("分配给您的车牌号是："+car.getNo());
    								car.setType("林荫大道");
    								car.setMoney(300);
    								break;
    							default:
    								break;
    						}  
    					default:
							break;
    				}
    				car.calcRent(day);
    				moneys=car.getMoney()*day+moneys;
    				rentMutilMotoVechicle(car);
    				break;
    			case 2:
    				Bus	bus=new Bus();
    				bus.setNo("湘A.C"+no);
    				System.out.print("请输入要租赁的汽车类型（1.金杯 2.金龙）：");
    				a=input.nextInt();
    				switch(a){
    					case 1:   						    						
    						System.out.println("分配给您的车牌号是："+bus.getNo());	
    						bus.setMoney(800);
    						bus.setSeatCount("小于16座的金龙");
    						break;
    					case 2:    						
    						System.out.println("分配给您的车牌号是："+bus.getNo());	
    						bus.setMoney(1500);
    						bus.setSeatCount("大于16座的金杯");
    						break;
    					default:
    						break;
    				}
    				bus.calcRent(day);
    				moneys=bus.getMoney()*day+moneys;
    				rentMutilMotoVechicle(bus);
    				break;   			
    			default:
    				break;
    		}
    		System.out.println("是否继续租车（y/n）");
            answer= input.next();
        }while(answer.equals("y"));
        System.out.println("您的订车的数量为：");
        for(int i=0;i<cars.length;i++) {
            if(cars[i]!=null) {
                if(cars[i] instanceof  Car) {
                	Car car = (Car) cars[i];
                    System.out.println("品牌"+car.getType()+"\t\t车牌"+car.getNo());
                }else if(cars[i] instanceof Bus){
		        	Bus bus = (Bus) cars[i];
			        System.out.println(bus.getSeatCount()+"\t\t"+bus.getNo());
		        }
            }
        } 
        System.out.println("您租赁车辆的总价格为："+moneys);
	 }
	 
	 private static int getType() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void rentMutilMotoVechicle(MotoVehicle car) {
	        for(int i=0;i<cars.length;i++) {
	            if(cars[i]==null) {
	                cars[i]=car;
	                break;
	            }
	        }
	    }
}
