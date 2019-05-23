package entity;

public class Marri {
	private String name;
	private int status;
	private int age;
	public Marri(){
		
	}
	public Marri(String name,int status,int age){
		this.name=name;
		this.status=status;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Marri [age=" + age + ", name=" + name + ", status=" + status
				+ "]";
	}
	
	
}
