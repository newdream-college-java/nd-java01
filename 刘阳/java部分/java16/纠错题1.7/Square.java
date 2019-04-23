

class Square extends Shape{
	private double height=0;
	public Square (double height){
		this.height=height;
	}
	public double getArea(){
		return (this.height*this.height);
	}
}
