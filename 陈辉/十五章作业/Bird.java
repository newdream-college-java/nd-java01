package java15;

public class Bird extends Animal{
	private String color;
	public Bird(String color,String name,int age){
		this.color=color;
		setName(name);
		setAge(age);
	}
	public void info(){
		System.out.println("��ɫ"+getColor()+"����"+getName()+"!\n"+"����"+getAge()+"��");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}