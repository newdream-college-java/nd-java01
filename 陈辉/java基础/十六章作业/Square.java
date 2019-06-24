package java16;

public class Square extends Shape {
	private double height=0;   //正方形边长
	public Square(double height){
		this.height=height;
	}
	public double getArea(){
		return(this.height*this.height);
	}
}
