
public class TestBusCar {

	public static void main(String[] args) {
		//=================����С����==================
		Car c1=new Car("��ASB250","GL8","���");
		c1.calcRent(11);
		Car c2=new Car("��BSB250","X6","����");
		c2.calcRent(9);
		Car c3=new Car("��BSB250","������","���");
		c3.calcRent(6);
		
		//==================���޴��ʿ==================
		
		Bus b1=new Bus("��BSB250",13,"����");
		b1.calcRent(20);
		Bus b2=new Bus("��BSB250",13,"��");
		b2.calcRent(10);
	}

}
