package 十六章作业;

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
			System.out.println("欢迎来到租车系统");
			System.out.println("请输入您的姓名");
			name=input.next();
			System.out.println(name+"您好请选择您要租用的车型  1.轿车  2.大巴");
			int a=input.nextInt();
			if(a==1){
				System.out.println("请选择你要租赁的品牌  1.别克  2.宝马");
				b=input.nextInt();
				if(b==1){
					System.out.println("请选择您要租的型号  1.林荫大道  2.GT8");
					c=input.next();
					Moto car1=new Car("京B68866", "别克", c);
					System.out.println("请输入您要租的天数");
					car1.Ts(input.nextInt());
					sum+=0;
					if(car[i]==null){
						car[i]=car1;
					}
					
				}else if(b==2){
					System.out.println("请选择您要租的型号 3.宝马三系");
					c=input.next();
					Moto car1=new Car("京B6996", "宝马", c);
					System.out.println("请输入您要租的天数");
					car1.Ts(input.nextInt());
					sum+=0;
					if(car[i]==null){
						car[i]=car1;
					}
					
				}
			}else if(a==2){
				System.out.println("请输入你的乘坐人数");
				int seatCount=input.nextInt();
				Moto car1=new Bus("湘A88888","大巴",seatCount);
				System.out.println("请输入你要租赁的天数");
				car1.Ts(input.nextInt());
				
				if(car[i]==null){
					car[i]=car1;
				}
			}
			
			if(i<1){
				System.out.println("请问还要继续租车吗(y/n)");
				String n=input.next();
				if(n.equals("y")){
					continue;
				}else if(n.equals("n")){
					break;
				}
			}
			
		}
			for(int i=0;i<car.length;i++){
				System.out.println(car[i]+"总金额为"+sum);
			}
		
		
		
	}
}
