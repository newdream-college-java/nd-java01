
public class TestBusCar {

	public static void main(String[] args) {
		//=================租赁小汽车==================
		Car c1=new Car("湘ASB250","GL8","别克");
		c1.calcRent(11);
		Car c2=new Car("赣BSB250","X6","宝马");
		c2.calcRent(9);
		Car c3=new Car("黑BSB250","林荫大道","别克");
		c3.calcRent(6);
		
		//==================租赁大巴士==================
		
		Bus b1=new Bus("桂BSB250",13,"金龙");
		b1.calcRent(20);
		Bus b2=new Bus("琼BSB250",13,"金杯");
		b2.calcRent(10);
	}

}
