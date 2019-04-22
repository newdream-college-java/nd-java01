package Test03;

import java.util.Scanner;

public class Car extends MotoVehicle {
	Scanner input=new Scanner(System.in);
	public void shuchu(){
		System.out.print("请输入要租凭的客车品牌(1,金杯 2，金龙）：");
		int a=input.nextInt();
		if(a==1){
			System.out.print("请输入客车座位数1，<=16座 2，>16座");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setBrand("金杯");
				setNo("京BK5533");
				System.out.println("您以成功租凭汽车牌号是："+getNo()+"汽车品牌是："+getBrand());
			}else{
				setFy(1500);
				setBrand("金杯");
				setNo("京BK5522");
				System.out.println("您以成功租凭汽车牌号是："+getNo()+"汽车品牌是："+getBrand());
			}	
		}else{
			System.out.print("请输入客车座位数1，<=16座 2，>16座");
			int b=input.nextInt();
			if(b==1){
				setFy(800);
				setBrand("金龙");
				setNo("京BK5511");
				System.out.println("您以成功租凭汽车牌号是："+getNo()+"汽车品牌是："+getBrand());
			}else{
				setFy(1500);
				setBrand("金龙");
				setNo("京BK5588");
				System.out.println("您以成功租凭汽车牌号是："+getNo()+"汽车品牌是："+getBrand());
			}
		}
	}
}
