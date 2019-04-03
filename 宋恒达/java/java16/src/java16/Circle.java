package java16;

public class Circle extends Shape{
	private double r=0;
	private static final double PI=3.14;
	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		return (PI*r*r);
	}

}
