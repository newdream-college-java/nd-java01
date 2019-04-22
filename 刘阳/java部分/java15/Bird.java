
public class Bird extends Animal{
	private String color="红";
	public Bird(String strain,int age){
		setStrain(strain);
		setAge(age);
	}
	public void info(){
		System.out.println("我是一只"+color+"色的"+getStrain()+"！\n今年"+getAge()+"岁了！");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
