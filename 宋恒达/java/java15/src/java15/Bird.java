package java15;

public class Bird extends Animal{
	private String color;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String color,int age) {
		this.color = color;
		setAge(age);
		setStrain("鸟");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("我是一只"+getColor()+"的"+getStrain());
		System.out.println("今年"+getAge()+"岁了！");
	}
}
