package 作业;

import java.util.Scanner;

public class Kache extends MotoVehicle {
	private int dun;
	public Kache(int no) {
		super(no);
		
		
	}
	
	public void calcRent(int days) {
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你的汽车品牌：（1.东风  其他.重卡）");
		this.dun=dun;
		this.brand=brand;
		int a=input.nextInt();
		if(a==1){
			brand="东风";
			System.out.print("请输入你的卡车的吨数：");
			int dun=input.nextInt();
			System.out.println("您租的品牌为："+brand+" 车牌为：湘"+getNo()+"\t费用为"+(days*50*dun));
			
		}else{
			brand="重卡";
			System.out.print("请输入你的卡车的吨数：");
			dun=input.nextInt();
			System.out.println("您租的品牌为："+brand+"车牌为：湘"+getNo()+"/t费用为"+(days*50*dun));			
		}
	}
	
}
