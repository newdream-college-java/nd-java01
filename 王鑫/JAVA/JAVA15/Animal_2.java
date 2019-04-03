package Tast2019_3_11_z15;

public abstract class Animal_2 {
	private String color;
	private String name;
	private int age;
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}

	abstract public void info();
}