package 作业;

import java.util.Scanner;

public class Bus extends MotoVehicle {
	private int zuowei;
	public Bus(int no) {
		super(no);
		
		
	}
	
	public void calcRent(int days) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的汽车品牌：（1.金杯  其他.金龙）");
		this.zuowei=zuowei;
		int a=input.nextInt();
		if(a==1){
				System.out.println("请输入你的客车搭载人数：（1.<=16  其他.>16）");
				int zuowei=input.nextInt();
				if (zuowei==1) {
					System.out.println("您的车牌为：湘"+getNo()+"\n费用为"+(days*800));
				}else {
					System.out.println("您的车牌为：湘"+getNo()+"\n费用为"+(days*1500));
				}
		}else{
			System.out.println("请输入你的客车搭载人数：（1.<=16  其他.>16）");
			zuowei=input.nextInt();
			if (zuowei==1) {
				System.out.println("您租的车为：金龙  车牌为：湘"+getNo()+",16坐以下的车，天数为"+days+"费用为"+(days*800));
			}else {
				System.out.println("您租的车为：金龙  车牌为：湘"+getNo()+",16坐以上的车，天数为"+days+"费用为"+(days*1500));
			}
		}
	}
	
}
