package java16;

public class TestShape {
	public static void main(String[] args) {
		Shape square=new Square(3);
		Shape circle=new Circle(2);
		System.out.println(square.getArea());
		System.out.println(circle.getArea());
		Square sq=(Square)square; 
		System.out.println(sq.getArea());
	}
}
