package java15;

public class Bird extends Animal{
	private String color;
	
	public Bird() {
		// TODO Auto-generated constructor stub
	}

	public Bird(String color,int age) {
		this.color = color;
		setAge(age);
		setStrain("��");
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
		System.out.println("����һֻ"+getColor()+"��"+getStrain());
		System.out.println("����"+getAge()+"���ˣ�");
	}
}
