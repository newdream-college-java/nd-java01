package �������ϵͳ;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
	static MotoVehicle[] cars = new MotoVehicle[100];
	 public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			Random rd=new Random();		
	        String answer = null;
	        int moneys=0;
	        int no;
	        System.out.println("���������޶�����");
	        int day=input.nextInt();
	        do {
	            System.out.print("������Ҫ���޵��������ͣ�1.���� 2.�ͳ� 3.��������");
	            int a=input.nextInt();
	    		no=rd.nextInt(9000)+1000;
	    		switch(a){
	    			case 1:
	    				Car car=new Car();
	    				System.out.print("������Ҫ���޵��������ͣ�1.���� 2.��ˣ���"); 
	    				car.setNo("��A.A"+no);
	    				a=input.nextInt();
	    				switch(a){
	    					case 1:
	    						System.out.println("��������ĳ��ƺ��ǣ�"+car.getNo());
	    						car.setType("����550i");
	    						car.setMoney(500);
	    						break;
	    					case 2:
	    						System.out.print("������γ����ͺ�2�������GL8 3��������:");
	    						a=input.nextInt();
	    						switch(a){
	    							case 2:
	    								System.out.println("��������ĳ��ƺ��ǣ�"+car.getNo());
	    								car.setType("�����GL8");
	    								car.setMoney(600);
	    								break;
	    							case 3:
	    								System.out.println("��������ĳ��ƺ��ǣ�"+car.getNo());
	    								car.setType("������");
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
	    				bus.setNo("��A.C"+no);
	    				System.out.print("������Ҫ���޵��������ͣ�1.�� 2.��������");
	    				a=input.nextInt();
	    				switch(a){
	    					case 1:   						    						
	    						System.out.println("��������ĳ��ƺ��ǣ�"+bus.getNo());	
	    						bus.setMoney(800);
	    						bus.setSeatCount("С��16���Ľ���");
	    						break;
	    					case 2:    						
	    						System.out.println("��������ĳ��ƺ��ǣ�"+bus.getNo());	
	    						bus.setMoney(1500);
	    						bus.setSeatCount("����16���Ľ�");
	    						break;
	    					default:
	    						break;
	    				}
	    				bus.calcRent(day);
	    				moneys=bus.getMoney()*day+moneys;
	    				rentMutilMotoVechicle(bus);
	    				break;
	    			case 3:
	    				Freight f=new Freight();
	    				f.setNo("��A.C"+no);
	    				System.out.print("������Ҫ���޵��������ͣ�1.����30�ֵĶ����ղ� 2.����70�ֵĸ����");
	    				a=input.nextInt();
	    				switch(a){
	    					case 1:
	    						System.out.println("��������ĳ��ƺ��ǣ�"+f.getNo());
	    						f.setMoney(30*50);
	    						f.setWeight("����30�ֵĶ����ղ�");
	    						break;
	    					case 2:
	    						System.out.println("��������ĳ��ƺ��ǣ�"+f.getNo());
	    						f.setMoney(70*50);
	    						f.setWeight("����70�ֵĸ���");
	    						break;
	    					default:
	    						break;
	    				}
	    				f.calcRent(day);
	    				moneys=f.getMoney()*day+moneys;
	    				rentMutilMotoVechicle(f);
	    				break;
	    			default:
	    				break;
	    		}
	    		System.out.println("�Ƿ�����⳵��y/n��");
	            answer= input.next();
	        }while(answer.equals("y"));
	        System.out.println("���Ķ���������Ϊ��");
	        for(int i=0;i<cars.length;i++) {
	            if(cars[i]!=null) {
	                if(cars[i] instanceof  Car) {
	                	Car car = (Car) cars[i];
	                    System.out.println("Ʒ��"+car.getType()+"\t\t����"+car.getNo());
	                }else if(cars[i] instanceof Bus){
			        	Bus bus = (Bus) cars[i];
				        System.out.println(bus.getSeatCount()+"\t\t"+bus.getNo());
			        }else if(cars[i] instanceof Freight){
			        	Freight f=(Freight) cars[i];
			        	System.out.println(f.getWeight()+"\t\t"+f.getNo());
			        }
	            }
	        } 
	        System.out.println("�����޳������ܼ۸�Ϊ��"+moneys);
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
