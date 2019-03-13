package Test03;

import java.util.Scanner;

public class Dongf extends MotoVehicle{

	@Override
	public void shuchu() {
		// TODO Auto-generated method stub
		setNo("粤APU3285");
		setFy(50);
		setBrand("东风");
		System.out.println("您以成功租凭汽车牌号是："+getNo()+"汽车品牌是："+getBrand());
	}

}
