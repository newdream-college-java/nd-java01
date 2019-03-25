package 第15章继承2抽象类抽象方法;

import java.util.Random;
import java.util.Scanner;

public class TestMotoVehicle {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎您来到汽车租赁公司！");
		System.out.print("请输入要租赁的天数");
		int days=input.nextInt();
		System.out.print("请输入要租赁的汽车品牌1.轿车2.客车:");
		int choice = input.nextInt();
		if(choice==1){
			Car c1 = new Car();
			c1.setNo("京BK"+random.nextInt(9000)+1000);
			c1.days=days;
			c1.choiceBrand();
		}else{
			Bus b1= new Bus();
			b1.setNo("京BK"+random.nextInt(10000));
			b1.days=days;
			b1.choiceBusType();
		}
	}
}
