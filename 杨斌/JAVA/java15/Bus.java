import java.util.Scanner;
public  class Bus extends MotoVehicle{
	public void show(){
		Scanner input =new Scanner(System.in);
			System.out.println("������Ҫ��ƾ�������ͺţ�1��<=16����2��>16��");
			int zw=input.nextInt();
			if(zw==1){
				setXh(800);
			}else if(zw==2){
				setXh(1500);
			}else {
				System.out.println("�������");
			}
	}
	
}
