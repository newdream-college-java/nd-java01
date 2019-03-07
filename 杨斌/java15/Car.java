import java.util.Scanner;
public class  Car extends MotoVehicle {
	public void show(){
		Scanner input =new Scanner(System.in);
		System.out.println("请输入要租凭的汽车品牌（1、宝马2、别克");
		int a=input.nextInt();
		if(a==1){
			setXh(500);
		}else if(a==2){
			System.out.println("请输入要租凭的型号（1、商务舱GL82、林荫大道");
			int b=input.nextInt();
			if(b==1){
				setXh(600);
			}else if(b==2){
				setXh(300);
			}else {
				System.out.println("输入错误");
			}
		}else {
			System.out.println("输入错误");
		}
		System.out.println("分配给你的车牌号：京BK5543");
		System.out.println("顾客您好！您需要支付的费用是"+getFy());
		}
}
