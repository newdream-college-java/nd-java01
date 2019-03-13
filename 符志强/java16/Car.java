package 作业;

import java.util.Scanner;

public class Car extends MotoVehicle {
	private String type; /////型号

	public  Car(int no) {
		super(no);//   setNo(no);
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;	
	}
	public void calcRent(int days) {
		
		System.out.print("请输入你的汽车品牌：（1.宝马  其他.别克）");
		Scanner input=new Scanner(System.in);
		this.type=type;
		this.brand=brand;
		int a=input.nextInt();
		switch (a) {
		case 1:
				brand="宝马";
				System.out.println("您的品牌为："+brand+"车牌号为:湘"+getNo()+"\t费用为"+(days*500));
			break;
		default:
			System.out.println("请输入你的汽车品牌：（1.别克商务舱GL8  其他.别克林荫大道）");
			int b=input.nextInt();
			if (b==1) {
				brand="别克商务舱GL8";
				System.out.println("您的品牌为："+brand+"车牌号为：湘"+getNo()+"\t费用为"+(days*600));
			}else {
				brand="别克林荫大道";
				System.out.println("您的品牌为："+brand+"车牌号为：湘"+getNo()+"\t费用为"+(days*300));
			}
			break;
		}
	}
}
