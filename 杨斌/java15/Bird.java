
public class Bird extends Animal{
	private String color;
	public Bird(String color,String name,int age){
		this.color=color;
		setName(name);
		setAge(age);
	}
	public void info(){
		System.out.println("我是一只"+getColor()+"的"+getName()+"!\n"+"今年"+getAge()+"岁了！");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
