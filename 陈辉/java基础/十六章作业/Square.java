package java16;

public class Square extends Shape {
	private double height=0;   //�����α߳�
	public Square(double height){
		this.height=height;
	}
	public double getArea(){
		return(this.height*this.height);
	}
}
