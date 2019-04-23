

public class TestShape {

	public static void main(String[] args) {
		Shape square = new Square(3);
		Shape circle=new Circle(2);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		//下面的强制转化应该是要把父类引用转化成square的子类引用，但是却把兄弟类circle的对象放到了那里
		//修改Square sq=(Square)circle;
		Square sq=(Square) square;
		System.out.println(sq.getArea());
	}

}
