import java.util.Scanner;
public  class Bus extends MotoVehicle{
	public void show(){
		Scanner input =new Scanner(System.in);
			System.out.println("请输入要租凭的汽车型号（1、<=16座》2、>16座");
			int zw=input.nextInt();
			if(zw==1){
				setXh(800);
			}else if(zw==2){
				setXh(1500);
			}else {
				System.out.println("输入错误");
			}
	}
	
}
