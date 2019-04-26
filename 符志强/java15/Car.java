package 作业;

import java.util.Scanner;

public class Car extends MotoVehicle {
	private String type; /////型号

	public  Car(int no) {
		super(no);//   setNo(no);
		
		
	}
	public void calcRent(int days) {
		
		System.out.println("请输入你的汽车品牌：（1.宝马  其他.别克）");
		Scanner input=new Scanner(System.in);
		this.type=type;
		int a=input.nextInt();
		switch (a) {
		case 1:
				System.out.println("您的车牌号为"+getNo()+"\n费用为"+(days*500));
			break;
		default:
			System.out.println("请输入你的汽车品牌：（1.商务舱GL8  其他.林荫大道）");
			int b=input.nextInt();
			if (b==1) {
				System.out.println("您的车牌号为：湘"+getNo()+"\n费用为"+(days*600));
			}else {
				System.out.println("您的车牌号为：湘"+getNo()+"\n费用为"+(days*300));
			}
			break;
		}
	}
}
