
public class Bird extends Animal{
	private String color="��";
	public Bird(String strain,int age){
		setStrain(strain);
		setAge(age);
	}
	public void info(){
		System.out.println("����һֻ"+color+"ɫ��"+getStrain()+"��\n����"+getAge()+"���ˣ�");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
