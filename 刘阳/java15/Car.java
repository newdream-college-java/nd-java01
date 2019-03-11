
public class Car extends MotoVehicle{
	//车型
	private String type;
	public Car(final String no,final String type,final String brand){
		//this.no=no;
		//方式一：setNo(no);
		//方式二：
		super(no);
		this.type=type;
		setBrand(brand);
	}
	public void calcRent(int days){
		if(this.type.equals("GL8")){
			System.out.println("您租的车为：GL8，天数为："+days+"天，费用为："+(days*600));
		}else if(this.type.equals("X6")){
			System.out.println("您租的车为：X6，天数为："+days+"天，费用为："+(days*500));
		}else if(this.type.equals("林荫大道")){
			System.out.println("您租的车为：林荫大道，天数为："+days+"天，费用为："+(days*300));
		}
	}
}
