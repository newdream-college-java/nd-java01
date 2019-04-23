

class Circle extends Shape{
	private double r=0;
	private final static double PI=3.14;//Ô²ÖÜÂÊ
	public Circle(double r){
		this.r=r;
	}
	public double getArea(){
		return PI*r*r;
	}
}
