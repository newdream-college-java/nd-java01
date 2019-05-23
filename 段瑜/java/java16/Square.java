package Õý·½ÐÎ;

public class Square extends Shape{
	private double height=0;

	public Square(double height){
		this.height=height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (this.height*this.height);
	}
}
