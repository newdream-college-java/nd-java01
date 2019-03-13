package java16;

public class Circle extends Shape{
	private double r=0;//Ô²µÄ°ë¾¶
	private final static double PI=3.14;//Ô²ÖÜÂÊ
	public Circle(double r){
		this.r=r;
	}
	public double getArea(){
		return PI*r*r;
	}
}
